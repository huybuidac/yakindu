/**
 * Copyright (c) 2011 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * 	committers of YAKINDU - initial API and implementation
 * 
 */
package org.yakindu.sct.model.stext.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.yakindu.base.expressions.expressions.Expression;
import org.yakindu.base.types.Boolean;
import org.yakindu.base.types.Type;
import org.yakindu.sct.model.sgraph.Scope;
import org.yakindu.sct.model.stext.stext.EventRaisingExpression;
import org.yakindu.sct.model.stext.stext.VariableDefinition;
import org.yakindu.sct.model.stext.test.util.AbstractSTextTest;
import org.yakindu.sct.model.stext.test.util.STextInjectorProvider;
import org.yakindu.sct.model.stext.test.util.STextTestScopeProvider;

import com.google.inject.Inject;

import de.itemis.xtext.typesystem.ITypesystem;
import de.itemis.xtext.typesystem.trace.TypeCalculationTrace;

/**
 * @author andreas muelder - Initial contribution and API
 * @author axel terfloth - additional tests
 * 
 */
@RunWith(XtextRunner.class)
@InjectWith(STextInjectorProvider.class)
public class TypeInferrerTest extends AbstractSTextTest {

	@Rule
	public ExpectedException exception = ExpectedException.none();
	@Inject
	public ITypesystem typeSystem;
	private ListBasedMessageAcceptor acceptor;

	// Unary
	@Test
	public void testNumericalUnaryExpressionSuccess() {
		// int
		assertTrue(isIntegerType(inferType("1")));
		assertTrue(isIntegerType(inferType("0x0F")));
		assertTrue(isIntegerType(inferType("-1")));
		assertTrue(isIntegerType(inferType("0")));
		assertTrue(isIntegerType(inferType("intVar")));
		// real
		assertTrue(isRealType(inferType("1.0")));
		assertTrue(isRealType(inferType("-1.0")));
		assertTrue(isRealType(inferType("0.0")));
		assertTrue(isRealType(inferType("realVar")));
		// string
		assertTrue(isStringType(inferType("'42'")));
		assertTrue(isStringType(inferType("stringVar")));
		// boolean
		assertTrue(isBooleanType(inferType("true")));
		assertTrue(isBooleanType(inferType("false")));
		assertTrue(isBooleanType(inferType("boolVar")));
		assertTrue(isBooleanType(inferType("boolEvent")));
		// tilde
		assertTrue(isIntegerType(inferType(" ~3")));
	}

	@Test
	public void testNumericalUnaryExpressionFailure() {
		expectIssue(inferType("~true"), "Operator '~' may only be applied on integer types, not on boolean.");
		expectIssue(inferType("~9.0"), "Operator '~' may only be applied on integer types, not on real.");
		expectIssue(inferType("~stringVar"),
				"Operator '~' may only be applied on integer types, not on string.");
	}

	// AddSubtract
	@Test
	public void testNumericalAddSubtractExpression() {
		// add
		assertTrue(isIntegerType(inferType("1+2", internalScope())));
		assertTrue(isIntegerType(inferType("1 + 2")));
		assertTrue(isIntegerType(inferType("1 + 0x0F")));
		assertTrue(isIntegerType(inferType("0x0F + 0x0F")));
		assertTrue(isIntegerType(inferType("intVar + 0x0F")));
		assertTrue(isIntegerType(inferType("intVar + 2")));
		assertTrue(isRealType(inferType("1.1 + 2")));
		assertTrue(isRealType(inferType("2 + 1.0")));
		assertTrue(isRealType(inferType("1 + 2 + 3.0")));
		// subtract
		assertTrue(isIntegerType(inferType("1 - 2")));
		assertTrue(isIntegerType(inferType("0x0F - 2")));
		assertTrue(isIntegerType(inferType("0x0F - 0x0F")));
		assertTrue(isIntegerType(inferType("0x0F- intVar")));
		assertTrue(isIntegerType(inferType("intVar - 2")));
		assertTrue(isRealType(inferType("1.0 - 2")));
		assertTrue(isRealType(inferType("2 - 1.0")));
		assertTrue(isRealType(inferType("realVar - 1.0")));
		assertTrue(isRealType(inferType("1 - 2 - 3.0")));
	}

	@Test
	public void testNumericalAddSubtractExpressionFailure() {
		// add
		expectIssue(inferType("true + 5"),
				"Operator '+' may only be applied on numeric types, not on boolean.");
		expectIssue(inferType("false + 5"),
				"Operator '+' may only be applied on numeric types, not on boolean.");
		expectIssue(inferType("5 + false"),
				"Operator '+' may only be applied on numeric types, not on boolean.");
		expectIssue(inferType("true + (3 * 5)"),
				"Operator '+' may only be applied on numeric types, not on boolean.");
		expectIssue(inferType("(3 * 5) + true"),
				"Operator '+' may only be applied on numeric types, not on boolean.");
		expectIssue(inferType("3.0 +  true"),
				"Operator '+' may only be applied on numeric types, not on boolean.");
		expectIssue(inferType("3.0 + 'string'"),
				"Operator '+' may only be applied on numeric types, not on string.");
		expectIssue(inferType("intVar + 'string'"),
				"Operator '+' may only be applied on numeric types, not on string.");
		// subtract
		expectIssue(inferType("true - 5"),
				"Operator '-' may only be applied on numeric types, not on boolean.");
		expectIssue(inferType("false - 5"),
				"Operator '-' may only be applied on numeric types, not on boolean.");
		expectIssue(inferType("5 - false"),
				"Operator '-' may only be applied on numeric types, not on boolean.");
		expectIssue(inferType("true - (3 * 5)"),
				"Operator '-' may only be applied on numeric types, not on boolean.");
		expectIssue(inferType("(3 * 5) - true"),
				"Operator '-' may only be applied on numeric types, not on boolean.");
		expectIssue(inferType("3.0 -  true"),
				"Operator '-' may only be applied on numeric types, not on boolean.");
		expectIssue(inferType("3.0 -  'string'"),
				"Operator '-' may only be applied on numeric types, not on string.");
		expectIssue(inferType("intVar - 'string'"),
				"Operator '-' may only be applied on numeric types, not on string.");
	}

	// multiply
	@Test
	public void testMultiplyDivideExpressionSuccess() {
		// multiply
		// integer
		assertTrue(isIntegerType(inferType("1 * 2")));
		assertTrue(isIntegerType(inferType("1 * 0x0F")));
		assertTrue(isIntegerType(inferType("0x0F * intVar")));
		// real
		assertTrue(isRealType(inferType("intVar * realVar")));
		assertTrue(isRealType(inferType("1.0 * 2")));
		assertTrue(isRealType(inferType("2 * 1.0")));
		assertTrue(isRealType(inferType("1 * 2 * 3.0")));

		// divide
		// integer
		assertTrue(isIntegerType(inferType("1 / 2")));
		assertTrue(isIntegerType(inferType("1 / intVar")));
		assertTrue(isIntegerType(inferType("1 / 0x0F")));
		assertTrue(isIntegerType(inferType("0x0F / 0x0F")));
		assertTrue(isIntegerType(inferType("intVar / 0x0F")));
		// real
		assertTrue(isRealType(inferType("1.0 / 2")));
		assertTrue(isRealType(inferType("2 / 1.0")));
		assertTrue(isRealType(inferType("1 / 2 / 3.0")));

		// modulo
		// integer
		assertTrue(isIntegerType(inferType("1 % 2")));
		assertTrue(isIntegerType(inferType("1 % 0x0F")));
		assertTrue(isIntegerType(inferType("0x0F % 0x0F")));
		assertTrue(isIntegerType(inferType("intVar % 0x0F")));
		// real
		assertTrue(isRealType(inferType("1.0 % 2")));
		assertTrue(isRealType(inferType("2 % 1.0")));
		assertTrue(isRealType(inferType("2 % realVar")));
		assertTrue(isRealType(inferType("1 % 2 % 3.0")));
	}

	@Test
	public void testMultiplyDivideExpressionFailure() {
		// multiply
		expectIssue(inferType("true * 5"),
				"Operator '*' may only be applied on numeric types, not on boolean.");
		expectIssue(inferType("5 * false"),
				"Operator '*' may only be applied on numeric types, not on boolean.");
		expectIssue(inferType("true * (3 - 5)"),
				"Operator '*' may only be applied on numeric types, not on boolean.");
		expectIssue(inferType("(3 + 5) * true"),
				"Operator '*' may only be applied on numeric types, not on boolean.");
		expectIssue(inferType("3.0 *  true"),
				"Operator '*' may only be applied on numeric types, not on boolean.");
		expectIssue(inferType("3.0 *  'string'"),
				"Operator '*' may only be applied on numeric types, not on string.");
		expectIssue(inferType("realVar *  'string'"),
				"Operator '*' may only be applied on numeric types, not on string.");
		// divide
		expectIssue(inferType("true / 5"),
				"Operator '/' may only be applied on numeric types, not on boolean.");
		expectIssue(inferType("false / 5"),
				"Operator '/' may only be applied on numeric types, not on boolean.");
		expectIssue(inferType("5 / false"),
				"Operator '/' may only be applied on numeric types, not on boolean.");
		expectIssue(inferType("true / (3 - 5)"),
				"Operator '/' may only be applied on numeric types, not on boolean.");
		expectIssue(inferType("(3 + 5) / true"),
				"Operator '/' may only be applied on numeric types, not on boolean.");
		expectIssue(inferType("3.0 /  true"),
				"Operator '/' may only be applied on numeric types, not on boolean.");
		expectIssue(inferType("3.0 /  'string'"),
				"Operator '/' may only be applied on numeric types, not on string.");
		// mod
		expectIssue(inferType("true % 5"),
				"Operator '%' may only be applied on numeric types, not on boolean.");
		expectIssue(inferType("false % 5"),
				"Operator '%' may only be applied on numeric types, not on boolean.");
		expectIssue(inferType("5 % false"),
				"Operator '%' may only be applied on numeric types, not on boolean.");
		expectIssue(inferType("true % (3 - 5)"),
				"Operator '%' may only be applied on numeric types, not on boolean.");
		expectIssue(inferType("(3 + 5) % true"),
				"Operator '%' may only be applied on numeric types, not on boolean.");
		expectIssue(inferType("3.0 % true"),
				"Operator '%' may only be applied on numeric types, not on boolean.");
		expectIssue(inferType("3.0 % 'string'"),
				"Operator '%' may only be applied on numeric types, not on string.");
	}

	// LogicalAndExpression
	@Test
	public void testLogicalAndExpressionSuccess() {
		assertTrue(isBooleanType(inferType("true && false")));
		assertTrue(isBooleanType(inferType("true && boolVar")));
		assertTrue(isBooleanType(inferType("boolEvent && valueof(boolEvent)")));
		assertTrue(isBooleanType(inferType("boolEvent && intEvent"))); // intEvent
																		// is a
																		// shortcut
																		// for
																		// isRaised(intEvent),
																		// thus
																		// of
																		// boolean
																		// type
		assertTrue(isBooleanType(inferType("boolEvent && boolEvent")));
	}

	@Test
	public void testLogicalAndExpressionFailure() {
		expectIssue(inferType("true && 5"),
				"Logical operator '&&' may only be applied on boolean types, not on boolean and integer.");
		expectIssue(inferType("5 && false"),
				"Logical operator '&&' may only be applied on boolean types, not on integer and boolean.");
		expectIssue(inferType("3.0 &&  true"),
				"Logical operator '&&' may only be applied on boolean types, not on real and boolean.");
		expectIssue(inferType("5 && boolEvent"),
				"Logical operator '&&' may only be applied on boolean types, not on integer and boolean.");
		expectIssue(inferType("5 && 'string'"),
				"Logical operator '&&' may only be applied on boolean types, not on integer and string.");
		expectIssue(inferType("5 && 1.2"),
				"Logical operator '&&' may only be applied on boolean types, not on integer and real.");
	}

	// LogicalOrExpression
	@Test
	public void testLogicalOrExpressionSuccess() {
		assertTrue(isBooleanType(inferType("true || false")));
		assertTrue(isBooleanType(inferType("true || boolVar")));
		assertTrue(isBooleanType(inferType("boolEvent || valueof(boolEvent)")));
		assertTrue(isBooleanType(inferType("boolEvent || intEvent"))); // intEvent
																		// is a
																		// shortcut
																		// for
																		// isRaised(intEvent),
																		// thus
																		// of
																		// boolean
																		// type
		assertTrue(isBooleanType(inferType("boolEvent || boolEvent")));
	}

	@Test
	public void testLogicalOrExpressionFailure() {
		expectIssue(inferType("false || 5"),
				"Logical operator '||' may only be applied on boolean types, not on boolean and integer.");
		expectIssue(inferType("5 || true"),
				"Logical operator '||' may only be applied on boolean types, not on integer and boolean.");
		expectIssue(inferType("3.0 ||  true"),
				"Logical operator '||' may only be applied on boolean types, not on real and boolean.");
		expectIssue(inferType("5 || boolEvent"),
				"Logical operator '||' may only be applied on boolean types, not on integer and boolean.");
		expectIssue(inferType("5 || 'string'"),
				"Logical operator '||' may only be applied on boolean types, not on integer and string.");
		expectIssue(inferType("5 || 1.2"),
				"Logical operator '||' may only be applied on boolean types, not on integer and real.");
	}

	// LogicalNotExpression
	@Test
	public void testLogicalNotExpressionSuccess() {
		assertTrue(isBooleanType(inferType("!true")));
		assertTrue(isBooleanType(inferType("!boolVar")));
		assertTrue(isBooleanType(inferType("!valueof(boolEvent)")));
		assertTrue(isBooleanType(inferType("!intEvent"))); // intEvent is a
															// shortcut for
															// isRaised(intEvent),
															// thus of boolean
															// type
		assertTrue(isBooleanType(inferType("!boolEvent")));
	}

	@Test
	public void testLogicalNotExpressionFailure() {
		expectIssue(inferType("!3"), "Operator '!' may only be applied on boolean types, not on integer.");
		expectIssue(inferType("!1.2"), "Operator '!' may only be applied on boolean types, not on real.");
		expectIssue(inferType("!'Test'"), "Operator '!' may only be applied on boolean types, not on string.");
	}

	// LogicalRelation
	@Test
	public void testLogicalRelationExpressionSuccess() {
		// smaller
		assertTrue(isBooleanType(inferType("5 < 3")));
		assertTrue(isBooleanType(inferType("5.0 < 3")));
		assertTrue(isBooleanType(inferType("5.0 < intVar")));
		assertTrue(isBooleanType(inferType("5.0 < valueof(intEvent)")));
		// smallerEqual
		assertTrue(isBooleanType(inferType("5 <= 3")));
		assertTrue(isBooleanType(inferType("5.0 <= 3")));
		assertTrue(isBooleanType(inferType("5.0 <= intVar")));
		assertTrue(isBooleanType(inferType("5.0 <= valueof(intEvent)")));
		// greater
		assertTrue(isBooleanType(inferType("5 > 3")));
		assertTrue(isBooleanType(inferType("5.0 > 3")));
		assertTrue(isBooleanType(inferType("5.0 > intVar")));
		assertTrue(isBooleanType(inferType("5.0 > valueof(intEvent)")));
		// greaterEqual
		assertTrue(isBooleanType(inferType("5 >= 3")));
		assertTrue(isBooleanType(inferType("5.0 >= 3")));
		assertTrue(isBooleanType(inferType("5.0 >= intVar")));
		assertTrue(isBooleanType(inferType("5.0 >= valueof(intEvent)")));
		// equal
		assertTrue(isBooleanType(inferType("5 == 3")));
		assertTrue(isBooleanType(inferType("'string' == 'string'")));
		assertTrue(isBooleanType(inferType("5.0 == 3")));
		assertTrue(isBooleanType(inferType("true == boolVar")));
		assertTrue(isBooleanType(inferType("true == boolEvent")));
		assertTrue(isBooleanType(inferType("true == valueof(boolEvent)")));
		// not equal
		assertTrue(isBooleanType(inferType("5 != 3")));
		assertTrue(isBooleanType(inferType("'string' != 'string'")));
		assertTrue(isBooleanType(inferType("5.0 != 3")));
		assertTrue(isBooleanType(inferType("true != boolVar")));
		assertTrue(isBooleanType(inferType("true != boolEvent")));
		assertTrue(isBooleanType(inferType("true != valueof(boolEvent)")));

	}

	@Test
	public void testLogicalRelationExpressionFailure() {
		// smaller
		expectIssue(inferType("3.0 < true"),
				"Comparison operator '<' may only be applied on compatible types, not on real and boolean.");
		expectIssue(inferType("'string' < 5"),
				"Comparison operator '<' may only be applied on compatible types, not on string and integer.");
		expectIssue(inferType("1.0 < false"),
				"Comparison operator '<' may only be applied on compatible types, not on real and boolean.");
		expectIssue(inferType("1.0 < boolEvent"),
				"Comparison operator '<' may only be applied on compatible types, not on real and boolean.");
		expectIssue(
				// intEvent is a shortcut for isRaised(intEvent), thus of
				// boolean type
				inferType("5 < intEvent"),
				"Comparison operator '<' may only be applied on compatible types, not on integer and boolean.");
		// smallerEqual
		expectIssue(inferType("3.0 <= true"),
				"Comparison operator '<=' may only be applied on compatible types, not on real and boolean.");
		expectIssue(inferType("'string' <= 5"),
				"Comparison operator '<=' may only be applied on compatible types, not on string and integer.");
		expectIssue(inferType("1.0 <= false"),
				"Comparison operator '<=' may only be applied on compatible types, not on real and boolean.");
		expectIssue(inferType("1.0 <= boolEvent"),
				"Comparison operator '<=' may only be applied on compatible types, not on real and boolean.");
		expectIssue(
				// intEvent is a shortcut for isRaised(intEvent), thus of
				// boolean type
				inferType("5 <= intEvent"),
				"Comparison operator '<=' may only be applied on compatible types, not on integer and boolean.");
		// greater
		expectIssue(inferType("3.0 > true"),
				"Comparison operator '>' may only be applied on compatible types, not on real and boolean.");
		expectIssue(inferType("'string' > 5"),
				"Comparison operator '>' may only be applied on compatible types, not on string and integer.");
		expectIssue(inferType("1.0 > false"),
				"Comparison operator '>' may only be applied on compatible types, not on real and boolean.");
		expectIssue(
				// intEvent is a shortcut for isRaised(intEvent), thus of
				// boolean type
				inferType("5 <= intEvent"),
				"Comparison operator '<=' may only be applied on compatible types, not on integer and boolean.");
		// greaterEqual
		expectIssue(inferType("3.0 >= true"),
				"Comparison operator '>=' may only be applied on compatible types, not on real and boolean.");
		expectIssue(inferType("'string' >= 5"),
				"Comparison operator '>=' may only be applied on compatible types, not on string and integer.");
		expectIssue(inferType("1.0 >= false"),
				"Comparison operator '>=' may only be applied on compatible types, not on real and boolean.");
		expectIssue(
				// intEvent is a shortcut for isRaised(intEvent), thus of
				// boolean type
				inferType("5 >= intEvent"),
				"Comparison operator '>=' may only be applied on compatible types, not on integer and boolean.");
		// equal
		expectIssue(inferType("3.0 == true"),
				"Comparison operator '==' may only be applied on compatible types, not on real and boolean.");
		expectIssue(inferType("'string' == 5"),
				"Comparison operator '==' may only be applied on compatible types, not on string and integer.");
		expectIssue(inferType("1.0 == false"),
				"Comparison operator '==' may only be applied on compatible types, not on real and boolean.");
		expectIssue(
				// intEvent is a shortcut for isRaised(intEvent), thus of
				// boolean type
				inferType("5 == intEvent"),
				"Comparison operator '==' may only be applied on compatible types, not on integer and boolean.");
		// not equal
		expectIssue(inferType("3.0 != true"),
				"Comparison operator '!=' may only be applied on compatible types, not on real and boolean.");
		expectIssue(inferType("'string' != 5"),
				"Comparison operator '!=' may only be applied on compatible types, not on string and integer.");
		expectIssue(inferType("1.0 != false"),
				"Comparison operator '!=' may only be applied on compatible types, not on real and boolean.");
		expectIssue(inferType("intVar != 'string'"),
				"Comparison operator '!=' may only be applied on compatible types, not on integer and string.");
		expectIssue(
				// intEvent is a shortcut for isRaised(intEvent), thus of
				// boolean type
				inferType("5 != intEvent"),
				"Comparison operator '!=' may only be applied on compatible types, not on integer and boolean.");
	}

	@Test
	public void testAssignmentExpressionSuccess() {
		// assignment without operator
		// integer
		assertTrue(isIntegerType(inferType("intVar = 5 * 3")));
		assertTrue(isIntegerType(inferType("intVar = 0x0F * 3")));
		assertTrue(isIntegerType(inferType("intVar = intVar * 0x0F")));
		assertTrue(isIntegerType(inferType("ABC.intVar = 42")));
		// boolean
		assertTrue(isBooleanType(inferType("boolVar = true || false")));
		assertTrue(isBooleanType(inferType("boolVar = boolEvent")));
		// string
		assertTrue(isStringType(inferType("stringVar = 'string'")));
		// real
		assertTrue(isRealType(inferType("realVar = 2.0 - 7")));

		// assignment with operator
		assertTrue(isIntegerType(inferType("intVar += 2")));
		assertTrue(isIntegerType(inferType("intVar -= 7")));
		assertTrue(isIntegerType(inferType("intVar *= 25")));
		assertTrue(isIntegerType(inferType("intVar /= 2")));
		assertTrue(isIntegerType(inferType("intVar %= 5")));

		// bitwise
		assertTrue(isIntegerType(inferType("intVar &= 12")));
		assertTrue(isIntegerType(inferType("intVar |= 25")));
		assertTrue(isIntegerType(inferType("intVar ^=  6")));
		assertTrue(isIntegerType(inferType("intVar <<= 215")));
		assertTrue(isIntegerType(inferType("intVar >>= 215")));
	}

	@Test
	public void testAssignmentExpressionFailure() {
		// integer and real
		expectIssue(inferType("intVar += 2.0"),
				"Assignment operator '+=' may only be applied on compatible types, not on integer and real.");
		expectIssue(inferType("intVar -= 2.0"),
				"Assignment operator '-=' may only be applied on compatible types, not on integer and real.");
		expectIssue(inferType("intVar /= 2.0"),
				"Assignment operator '/=' may only be applied on compatible types, not on integer and real.");
		expectIssue(inferType("intVar *= 2.0"),
				"Assignment operator '*=' may only be applied on compatible types, not on integer and real.");
		expectIssue(inferType("intVar = true"),
				"Assignment operator '=' may only be applied on compatible types, not on integer and boolean.");
		// integer and boolean
		expectIssue(inferType("intVar = boolVar"),
				"Assignment operator '=' may only be applied on compatible types, not on integer and boolean.");
		expectIssue(inferType("intVar &= boolVar"),
				"Bitwise operator '&=' may only be applied on integer types, not on integer and boolean.");
		expectIssue(inferType("intVar |= boolVar"),
				"Bitwise operator '|=' may only be applied on integer types, not on integer and boolean.");
		expectIssue(inferType("intVar ^= boolVar"),
				"Bitwise operator '^=' may only be applied on integer types, not on integer and boolean.");
		expectIssue(inferType("intVar >>= boolVar"),
				"Bitwise operator '>>=' may only be applied on integer types, not on integer and boolean.");
		expectIssue(inferType("intVar <<= boolVar"),
				"Bitwise operator '<<=' may only be applied on integer types, not on integer and boolean.");
		// integer and string
		expectIssue(inferType("intVar &= 'string'"),
				"Bitwise operator '&=' may only be applied on integer types, not on integer and string.");
		expectIssue(inferType("intVar |= 'string'"),
				"Bitwise operator '|=' may only be applied on integer types, not on integer and string.");
		expectIssue(inferType("intVar ^= 'string'"),
				"Bitwise operator '^=' may only be applied on integer types, not on integer and string.");
		expectIssue(inferType("intVar >>= 'string'"),
				"Bitwise operator '>>=' may only be applied on integer types, not on integer and string.");
		expectIssue(inferType("intVar <<= 'string'"),
				"Bitwise operator '<<=' may only be applied on integer types, not on integer and string.");
	}

	/**
	 * the {@link STextTestScopeProvider} adds a dummy state named 'chart.r1.A'
	 * to the Scope.
	 */
	@Test
	public void testActiveStateReferenceExpressionSuccess() throws Exception {
		assertTrue(isBooleanType(inferType("active(chart.r1.A)")));
		assertTrue(isBooleanType(inferType("!active(chart.r1.A)")));
		assertTrue(isBooleanType(inferType("true || active(chart.r1.A)")));
		assertTrue(isBooleanType(inferType("active(chart.r1.A) && false")));
		assertTrue(isBooleanType(inferType("boolVar = active(chart.r1.A)")));
	}

	@Test
	public void testActiveStateReferenceExpressionFailure() throws Exception {
		expectIssue(inferType("active(chart.r1.A) + 1"),
				"Operator '+' may only be applied on numeric types, not on boolean and integer.");
		expectIssue(inferType("active(chart.r1.A) - 1"),
				"Operator '-' may only be applied on numeric types, not on boolean and integer.");
		expectIssue(inferType("active(chart.r1.A) * 1"),
				"Operator '*' may only be applied on numeric types, not on boolean and integer.");
		expectIssue(inferType("active(chart.r1.A) / 1"),
				"Operator '/' may only be applied on numeric types, not on boolean and integer.");
		expectIssue(inferType("active(chart.r1.A) % true"),
				"Operator '%' may only be applied on numeric types, not on boolean and boolean.");
		expectIssue(inferType("active(chart.r1.A) && intVar"),
				"Logical operator '&&' may only be applied on boolean types, not on boolean and integer.");
		expectIssue(inferType("active(chart.r1.A) || stringVar"),
				"Logical operator '||' may only be applied on boolean types, not on boolean and string.");
		expectIssue(inferType("active(chart.r1.A) || !stringVar"),
				"Logical operator '!' may only be applied on boolean types, not on string.");
	}

	// bitwise
	@Test
	public void testBitwiseXorExpressionSuccess() {
		assertTrue(isIntegerType(inferType(" 5 ^ 3")));
	}

	@Test
	public void testBitwiseXorExpressionFailure() {
		expectIssue(inferType("5 ^ true"),
				"Bitwise operator '^' may only be applied on integer types, not on integer and boolean.");
		expectIssue(inferType("5 ^ 1.0"),
				"Bitwise operator '^' may only be applied on integer types, not on integer and real.");
		expectIssue(inferType("5 ^ 'stringVar'"),
				"Bitwise operator '^' may only be applied on integer types, not on integer and string.");
	}

	@Test
	public void testBitwiseOrExpressionSuccess() {
		assertTrue(isIntegerType(inferType(" 5 | 3")));
	}

	@Test
	public void testBitwiseOrExpressionFailure() {
		expectIssue(inferType("5 | true"),
				"Bitwise operator '|' may only be applied on integer types, not on integer and boolean.");
		expectIssue(inferType("5 | 1.0"),
				"Bitwise operator '|' may only be applied on integer types, not on integer and real.");
		expectIssue(inferType("5 | 'stringVar'"),
				"Bitwise operator '|' may only be applied on integer types, not on integer and string.");
	}

	@Test
	public void testBitwiseAndExpressionSuccess() {
		assertTrue(isIntegerType(inferType(" 5 & 3")));
	}

	@Test
	public void testBitwiseAndExpressionFailure() {
		expectIssue(inferType("5 & true"),
				"Bitwise operator '&' may only be applied on integer types, not on integer and boolean.");
		expectIssue(inferType("5 & 1.0"),
				"Bitwise operator '&' may only be applied on integer types, not on integer and real.");
		expectIssue(inferType("5 & 'stringVar'"),
				"Bitwise operator '&' may only be applied on integer types, not on integer and string.");
	}

	@Test
	public void testShiftExpressionSuccess() {
		assertTrue(isIntegerType(inferType("3 << 2")));
		assertTrue(isIntegerType(inferType("5 >> 2")));
		assertTrue(isIntegerType(inferType("intVar << 4")));
		assertTrue(isIntegerType(inferType("intVar >> 4")));
	}

	@Test
	public void testShiftExpressionFailure() {
		expectIssue(inferType("5 << true"),
				"Operator '<<' may only be applied on integer types, not on boolean.");
		expectIssue(inferType("5 << 7.0"),
				"Operator '<<' may only be applied on integer types, not on real.");
		expectIssue(inferType("5 << stringVar"),
				"Operator '<<' may only be applied on integer types, not on string.");

		expectIssue(inferType("5 >> true"),
				"Operator '>>' may only be applied on integer types, not on boolean.");
		expectIssue(inferType("5 >> 7.0"),
				"Operator '>>' may only be applied on integer types, not on real.");
		expectIssue(inferType("5 >> stringVar"),
				"Operator '>>' may only be applied on integer types, not on string.");
	}

	@Test
	// No Expression in SText.xtext
	public void testComplexExpressionsSuccess() {
		assertTrue(isBooleanType(inferType("((((3 * intVar) + 5) % 2) > 97) || false")));
		assertTrue(isBooleanType(inferType("!true != boolVar && (3 > (realVar * 5 + 3))")));
		assertTrue(isIntegerType(inferType("3 * 3 + 7 / (3 * intVar % 8)")));
	}

	@Test
	public void testEventRaisingExpressionSuccess() {
		// TODO: Is this correct or should a result of a raise expression be
		// void?
		assertTrue(isIntegerType(inferType("raise intEvent : 42", EventRaisingExpression.class.getSimpleName())));
		assertTrue(isBooleanType(inferType("raise boolEvent : boolVar", EventRaisingExpression.class.getSimpleName())));
		assertTrue(isRealType(inferType("raise realEvent : 2.0 - 3.0", EventRaisingExpression.class.getSimpleName())));
		assertTrue(isStringType(inferType("raise stringEvent : 'string'", EventRaisingExpression.class.getSimpleName())));
		assertTrue(isVoidType(inferType("raise voidEvent", EventRaisingExpression.class.getSimpleName())));
		assertTrue(isIntegerType(inferType("raise ABC.intEvent : 42", EventRaisingExpression.class.getSimpleName())));
	}

	@Test
	public void testEventRaisingExpressionFailure() {
		expectIssue(inferType("raise intEvent : true", EventRaisingExpression.class.getSimpleName()),
				"Cannot assign a value of type boolean to an event of type integer.");
		expectIssue(inferType("raise intEvent : boolVar", EventRaisingExpression.class.getSimpleName()),
				"Cannot assign a value of type boolean to an event of type integer.");
		expectIssue(inferType("raise stringEvent", EventRaisingExpression.class.getSimpleName()),
				"Need to assign a value to an event of type string.");
		expectIssue(inferType("raise intEvent : true", EventRaisingExpression.class.getSimpleName()),
				"Cannot assign a value of type boolean to an event of type integer.");
		expectIssue(inferType("raise ABC.intEvent", EventRaisingExpression.class.getSimpleName()),
				"Need to assign a value to an event of type integer.");
	}

	@Test
	public void testEventIsRaisedSuccess() {
		assertTrue(isBooleanType(inferType("boolVar = intEvent", internalScope())));
		assertTrue(isBooleanType(inferType("ABC.boolVar = ABC.intEvent", interfaceScope())));
	}

	@Test
	// VariableDefinition is a statement, not an expression
	public void testVariableDefinitionSuccess() {
		assertTrue(isBooleanType(inferType("var boolVar : boolean = !true", VariableDefinition.class.getSimpleName())));
		assertTrue(isIntegerType(inferType("var intVar : integer = 5", VariableDefinition.class.getSimpleName())));
		assertTrue(isRealType(inferType("var realVar : real = 0.5", VariableDefinition.class.getSimpleName())));
		assertTrue(isRealType(inferType("var realVar : real = 5", VariableDefinition.class.getSimpleName()))); // coercion
		assertTrue(isStringType(inferType("var stringVar : string = 'test'", VariableDefinition.class.getSimpleName())));
	}

	@Test
	// VariableDefinition is a statement, not an expression
	public void testVariableDefinitionFailure() {
		expectIssue(inferType("var boolVar : boolean = 5", VariableDefinition.class.getSimpleName(), interfaceScope()),
				"Cannot assign a value of type integer to a variable of type boolean.");
		expectIssue(
				inferType("var boolVar : boolean = 0.5", VariableDefinition.class.getSimpleName(), interfaceScope()),
				"Cannot assign a value of type real to a variable of type boolean.");
		expectIssue(
				inferType("var boolVar : boolean = 'text'", VariableDefinition.class.getSimpleName(), interfaceScope()),
				"Cannot assign a value of type string to a variable of type boolean.");

		expectIssue(
				inferType("var intVar : integer = true", VariableDefinition.class.getSimpleName(), interfaceScope()),
				"Cannot assign a value of type boolean to a variable of type integer.");
		expectIssue(
				inferType("var intVar : integer = 0.5", VariableDefinition.class.getSimpleName(), interfaceScope()),
				"Cannot assign a value of type real to a variable of type integer.");
		expectIssue(
				inferType("var intVar : integer = 'text'", VariableDefinition.class.getSimpleName(), interfaceScope()),
				"Cannot assign a value of type string to a variable of type integer.");

		expectIssue(inferType("var realVar : real = true", VariableDefinition.class.getSimpleName(), interfaceScope()),
				"Cannot assign a value of type boolean to a variable of type real.");
		expectIssue(
				inferType("var realVar : real = 'text'", VariableDefinition.class.getSimpleName(), interfaceScope()),
				"Cannot assign a value of type string to a variable of type real.");

		expectIssue(
				inferType("var stringVar : string = true", VariableDefinition.class.getSimpleName(), interfaceScope()),
				"Cannot assign a value of type boolean to a variable of type string.");
		expectIssue(
				inferType("var stringVar : string = 5", VariableDefinition.class.getSimpleName(), interfaceScope()),
				"Cannot assign a value of type integer to a variable of type string.");
		expectIssue(
				inferType("var stringVar : string = 0.5", VariableDefinition.class.getSimpleName(), interfaceScope()),
				"Cannot assign a value of type real to a variable of type string.");
	}

	// PrimitiveValueExpression
	@Test
	public void testValueOfSuccess() {
		assertTrue(isIntegerType(inferType("valueof(intEvent)")));
		assertTrue(isBooleanType(inferType("valueof(boolEvent)")));
		assertTrue(isRealType(inferType("valueof(realEvent)")));
		assertTrue(isStringType(inferType("valueof(stringEvent)")));
		assertTrue(isVoidType(inferType("valueof(voidEvent)")));
		assertTrue(isIntegerType(inferType("valueof(ABC.intEvent)")));
	}

	@Test
	public void testOperationSuccess() {
		assertTrue(isIntegerType(inferType("intVar = intOp()")));
	}

	@Test
	public void testOperationFailure() {
		expectIssue(inferType("boolVar = intOp()"),
				"Assignment operator '=' may only be applied on compatible types, not on boolean and integer.");
	}

	@Test
	public void testParenthesizedExpression() {
		assertTrue(isBooleanType(inferType("( true || false )")));
		assertTrue(isIntegerType(inferType("( 5 )")));
		assertTrue(isRealType(inferType("( 7.5 / 1.2 )")));
		assertTrue(isStringType(inferType("( 'abc' )")));
	}

	@Test
	public void testTypeCastExpressionSuccess() {
		assertTrue(isBooleanType(inferType("( true as boolean)")));
		assertTrue(isIntegerType(inferType("( 7.5 as integer )")));
		assertTrue(isRealType(inferType(" 7 as real ")));
		assertTrue(isStringType(inferType("( 'abc' as string )")));
	}

	@Test
	public void testTypeCastExpressionFailure() {
		expectIssue(inferType("true as integer"), "Cannot cast from boolean to integer.");
		expectIssue(inferType("true as string"), "Cannot cast from boolean to string.");
		expectIssue(inferType("5 as string"), "Cannot cast from integer to string.");
		expectIssue(inferType("5.5 as string"), "Cannot cast from real to string.");
	}

	@Test
	public void testTernaryExpression() {
		assertTrue(isIntegerType(inferType("(1<2) ? 4 : 5")));
		assertTrue(isBooleanType(inferType("(true) ? false : true")));

		expectIssue(inferType("(true) ? 4 : false"),
				"Cannot compute a type union for the given types: integer, boolean");
	}

	protected Type inferType(String expression) {
		return inferType(expression, super.internalScope(), super.interfaceScope());
	}

	protected Type inferType(String expression, String parserRule) {
		return inferType(expression, parserRule, super.internalScope(), super.interfaceScope());
	}

	protected Type inferType(String expression, Scope... scopes) {
		return inferType(expression, Expression.class.getSimpleName(), scopes);
	}

	protected Type inferType(String expression, String parserRule, Scope... scopes) {
		EObject parseResult = super.parseExpression(expression, parserRule, scopes);
		assertNotNull(parseResult);
		TypeCalculationTrace trace = new TypeCalculationTrace();
		acceptor = new ListBasedMessageAcceptor();
		typeSystem.checkTypesystemConstraints(parseResult, acceptor);
		EObject typeof = typeSystem.typeof(parseResult, trace);
		System.out.println(trace);
		System.out.println(acceptor.getErrors());
		return (Type) typeof;
	}

	private boolean isVoidType(Type type) {
		return type instanceof org.yakindu.base.types.Void;
	}

	private boolean isIntegerType(Type type) {
		return type instanceof org.yakindu.base.types.Integer;
	}

	private boolean isRealType(Type type) {
		return type instanceof org.yakindu.base.types.Real;
	}

	private boolean isBooleanType(Type type) {
		return type instanceof Boolean;
	}

	private boolean isStringType(Type type) {
		return type instanceof org.yakindu.base.types.String;
	}

	private void expectIssue(Type type, String message) {
		assertTrue(acceptor.getErrors().size() >= 1);
		for (String string : acceptor.getErrors()) {
			if(string.equals(message))
				return;
		}
		fail("Expected " + message + " but was " + acceptor.getErrors());
	}

	public class ListBasedMessageAcceptor implements ValidationMessageAcceptor {

		List<String> errors = new ArrayList<String>();
		List<String> warnings = new ArrayList<String>();

		public List<String> getErrors() {
			return errors;
		}

		public void setErrors(List<String> errors) {
			this.errors = errors;
		}

		public List<String> getWarnings() {
			return warnings;
		}

		public void setWarnings(List<String> warnings) {
			this.warnings = warnings;
		}

		public void acceptError(String message, EObject object, EStructuralFeature feature, int index, String code,
				String... issueData) {
			errors.add(message);
		}

		public void acceptError(String message, EObject object, int offset, int length, String code,
				String... issueData) {
			errors.add(message);

		}

		public void acceptWarning(String message, EObject object, EStructuralFeature feature, int index, String code,
				String... issueData) {
			warnings.add(message);
		}

		public void acceptWarning(String message, EObject object, int offset, int length, String code,
				String... issueData) {
			warnings.add(message);
		}

		public void acceptInfo(String message, EObject object, EStructuralFeature feature, int index, String code,
				String... issueData) {
		}

		public void acceptInfo(String message, EObject object, int offset, int length, String code, String... issueData) {
		}

	}

}
