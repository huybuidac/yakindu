/**
 * Copyright (c) 2013 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * 	committers of YAKINDU - initial API and implementation
 * 
 */
package org.yakindu.sct.simulation.core.sexec.container

import com.google.inject.Inject
import de.itemis.xtext.typesystem.ITypesystem
import java.util.List
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.yakindu.base.types.Boolean
import org.yakindu.base.types.Integer
import org.yakindu.base.types.Package
import org.yakindu.base.types.Real
import org.yakindu.base.types.Type
import org.yakindu.base.types.TypesFactory
import org.yakindu.sct.model.sexec.ExecutionFlow
import org.yakindu.sct.model.sexec.TimeEvent
import org.yakindu.sct.model.sgraph.Declaration
import org.yakindu.sct.model.sgraph.ImportDeclaration
import org.yakindu.sct.model.sgraph.Scope
import org.yakindu.sct.model.stext.stext.EventDefinition
import org.yakindu.sct.model.stext.stext.ImportScope
import org.yakindu.sct.model.stext.stext.InterfaceScope
import org.yakindu.sct.model.stext.stext.InternalScope
import org.yakindu.sct.model.stext.stext.OperationDefinition
import org.yakindu.sct.model.stext.stext.VariableDefinition
import org.yakindu.sct.simulation.core.sruntime.CompositeSlot
import org.yakindu.sct.simulation.core.sruntime.EventDirection
import org.yakindu.sct.simulation.core.sruntime.ExecutionContext
import org.yakindu.sct.simulation.core.sruntime.ExecutionSlot
import org.yakindu.sct.simulation.core.sruntime.impl.CompositeSlotImpl
import org.yakindu.sct.simulation.core.sruntime.impl.ExecutionEventImpl
import org.yakindu.sct.simulation.core.sruntime.impl.ExecutionVariableImpl

/**
 * 
 * @author andreas muelder - Initial contribution and API
 * 
 */
class DefaultExecutionContextInitializer implements IExecutionContextInitializer {

	@Inject extension IQualifiedNameProvider

	override initialize(ExecutionContext context, ExecutionFlow flow) {
		flow.scopes.forEach[context.slots += transform]
	}

	def dispatch ExecutionSlot create composite : createImportSlot() transform(ImportScope scope) {

		// retrieve namespaces from variable names and create corresponding composite slots
		for (Declaration decl : scope.declarations.filter(ImportDeclaration).map[declaration]) {
			val pkg = EcoreUtil2.getContainerOfType(decl, Package)
			if (pkg != null) {
				val namespace = pkg.name
				val declName = decl.name
				val slot = composite.slots.getSlotFor(namespace)
				val declarationSlot = decl.transform
				declarationSlot.setFqName(namespace + "." + declName)
				declarationSlot.setName(declName)

				// only add imported variables/events when they have not yet been imported
				if (!slot.slots.exists[fqName == declarationSlot.fqName]) {
					slot.slots += declarationSlot
				}
			} else {
				composite.slots += decl.transform
			}
		}
	}

	/**
	 * Create only one root slot for imports independently on how many ImportScopes exist
	 */
	def CompositeSlot create slot : new CompositeSlotImpl() createImportSlot() {
		slot.name = "imports"
	}

	def getSlotFor(List<ExecutionSlot> slots, String name) {
		val existingSlot = slots.findFirst[it.name == name]
		if (existingSlot != null && existingSlot instanceof CompositeSlot) {
			existingSlot as CompositeSlot
		} else {
			val newSlot = new CompositeSlotImpl()
			newSlot.name = name
			slots += newSlot
			newSlot
		}
	}

	def dispatch ExecutionSlot create new CompositeSlotImpl() transform(InternalScope scope) {
		it.name = "internal"
		scope.declarations.forEach[decl|it.slots += decl.transform]
	}

	def dispatch ExecutionSlot create new CompositeSlotImpl() transform(Scope scope) {
		it.name = "time events"
		scope.declarations.forEach[decl|it.slots += decl.transform]
	}

	def dispatch ExecutionSlot create new CompositeSlotImpl() transform(InterfaceScope scope) {
		if(scope.name != null) it.name = scope.name else it.name = "default"
		scope.declarations.forEach[decl|it.slots += decl.transform]
	}

	def dispatch ExecutionSlot create new ExecutionVariableImpl() transform(VariableDefinition variable) {
		it.name = variable.fullyQualifiedName.lastSegment
		it.fqName = variable.fullyQualifiedName.toString
		it.type = variable.type
		it.value = it.type.initialValue
	}

	def dispatch ExecutionSlot create new ExecutionEventImpl() transform(EventDefinition event) {
		it.name = event.fullyQualifiedName.lastSegment
		it.fqName = event.fullyQualifiedName.toString
		it.type = event.type
		it.value = it.type.initialValue
		it.direction = EventDirection.get(event.direction.value)
	}

	def dispatch ExecutionSlot create new ExecutionVariableImpl() transform(OperationDefinition op) {
		it.name = op.fullyQualifiedName.lastSegment
		it.fqName = op.fullyQualifiedName.toString
		it.type = op.type
		it.value = it.type.initialValue
	}

	def dispatch ExecutionSlot create new ExecutionEventImpl() transform(TimeEvent event) {
		it.name = event.fullyQualifiedName.lastSegment
		it.fqName = event.fullyQualifiedName.toString
		it.type = TypesFactory.eINSTANCE.createInteger
		it.value = it.type.initialValue
	}
	//TODO: Move to TS
	def initialValue(Type it) {
		switch (it) {
			Boolean: false
			Integer: 0
			Real: 0.0d
			org.yakindu.base.types.String: ""
			default: null
		}
	}

}
