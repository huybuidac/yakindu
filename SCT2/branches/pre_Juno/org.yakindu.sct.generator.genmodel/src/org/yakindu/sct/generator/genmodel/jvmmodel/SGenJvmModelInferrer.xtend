package org.yakindu.sct.generator.genmodel.jvmmodel
 
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.emf.ecore.EObject
import java.util.List
import com.google.inject.Inject
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor

/** 
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. 
 * Other Xtend models link against the JVM model rather than the source model. The JVM
 * model elements should be associated with their source element by means of the
 * {@link IJvmModelAssociator}.</p>     
 */
class SGenJvmModelInferrer implements IJvmModelInferrer {

	@Inject
	IJvmModelAssociator jvmModelAssociator
//FIXME
//   	override List<? extends JvmDeclaredType> inferJvmModel(EObject sourceObject) {
//   		return newArrayList();
//   	}

	override infer(EObject e, IJvmDeclaredTypeAcceptor acceptor, boolean preIndexingPhase) {
		return
		//throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
}
