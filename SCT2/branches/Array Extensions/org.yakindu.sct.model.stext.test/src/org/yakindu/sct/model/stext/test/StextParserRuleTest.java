/**
 * Copyright (c) 2012 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	itemis AG - initial API and implementation
 * 
 */
package org.yakindu.sct.model.stext.test;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.yakindu.base.expressions.expressions.Expression;
import org.yakindu.base.expressions.expressions.FeatureCall;
import org.yakindu.base.expressions.expressions.PrimitiveValueExpression;
import org.yakindu.sct.model.stext.stext.DefaultTrigger;
import org.yakindu.sct.model.stext.stext.EventDefinition;
import org.yakindu.sct.model.stext.stext.EventValueReferenceExpression;
import org.yakindu.sct.model.stext.stext.InterfaceScope;
import org.yakindu.sct.model.stext.stext.InternalScope;
import org.yakindu.sct.model.stext.stext.LocalReaction;
import org.yakindu.sct.model.stext.stext.OperationDefinition;
import org.yakindu.sct.model.stext.stext.ReactionEffect;
import org.yakindu.sct.model.stext.stext.ReactionTrigger;
import org.yakindu.sct.model.stext.stext.TransitionReaction;
import org.yakindu.sct.model.stext.stext.VariableDefinition;
import org.yakindu.sct.model.stext.test.util.AbstractSTextTest;
import org.yakindu.sct.model.stext.test.util.STextInjectorProvider;

/**
 * @author andreas muelder - Initial contribution and API
 * 
 */
@RunWith(XtextRunner.class)
@InjectWith(STextInjectorProvider.class)
public class StextParserRuleTest extends AbstractSTextTest {

	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Test
	public void testBoolLiteral() {
		String rule = PrimitiveValueExpression.class.getSimpleName();
		parseExpression("true", rule);
		parseExpression("false", rule);
		parseExpression("yes", rule);
		parseExpression("no", rule);
	}

	@Test
	public void testIntLiteral() {
		String rule = PrimitiveValueExpression.class.getSimpleName();
		parseExpression("0", rule);
		parseExpression("4", rule);
		parseExpression("42", rule);
	}

	@Test
	public void testHexLiteral() {
		String rule = PrimitiveValueExpression.class.getSimpleName();
		parseExpression("0xFFB5C5", rule);
		parseExpression("0XFFB5C5", rule);
	}

	@Test
	public void testRealLiteral() {
		String rule = PrimitiveValueExpression.class.getSimpleName();
		parseExpression("0.2f", rule);
		parseExpression("0.2F", rule);
		parseExpression("0.2d", rule);
		parseExpression("0.2D", rule);
	}

	@Test
	public void testStringLiteral() {
		String rule = PrimitiveValueExpression.class.getSimpleName();
		parseExpression("'Hello World'", rule);
		parseExpression("\"Hello World\"", rule);
		parseExpression("''", rule);
	}

	@Test
	public void testNullLiteral() {
		String rule = PrimitiveValueExpression.class.getSimpleName();
		parseExpression("null", rule);
	}

	/**
	 * VariableDefinition: {VariableDefinition} 'var' ((readonly?='readonly')? &
	 * (external?='external')?) name=ID ':' type=[types::Type|FQN] ('='
	 * initialValue=Expression)?;
	 */
	@Test
	public void testVariableDefinition() {
		String rule = VariableDefinition.class.getSimpleName();
		parseExpression("var MyVar : integer", rule);
		parseExpression("var MyVar : integer = 97", rule);
		parseExpression("var readonly MyVar : integer", rule);
		parseExpression("var external MyVar : integer", rule);
		parseExpression("var readonly external MyVar : integer", rule);
		parseExpression("var external readonly MyVar : integer", rule);
		parseExpression("var MyVar : integer = 3 * 3", rule);
		parseExpression("var MyVar : string = null", rule);
	}

	/**
	 * EventDefinition: (direction=Direction)? 'event' name=ID (':'
	 * type=[types::Type|FQN])? (derivation=EventDerivation)?;
	 */
	@Test
	public void testEventDefinition() {
		String rule = EventDefinition.class.getSimpleName();
		parseExpression("event event1", rule);
		parseExpression("event event1 : integer", rule);
		parseExpression("local event event1 : boolean", rule);
		parseExpression("in event event1 : integer", rule);
		parseExpression("out event event1 : integer", rule);
		parseExpression("event event1 : integer", rule);
		parseExpression("event event1 : string", rule);

	}

	/**
	 * OperationDefinition: {OperationDefinition} 'operation' name=ID '('
	 * (parameters+=Parameter (',' parameters+=Parameter)*)? ')' (':'
	 * type=[types::Type|FQN])?;
	 */
	@Test
	public void testOperationDefinition() {
		String rule = OperationDefinition.class.getSimpleName();
		parseExpression("operation myOpp()", rule);
		parseExpression("operation myOpp() : boolean", rule);
		parseExpression("operation myOpp(param1: integer)", rule);
		parseExpression("operation myOpp(param1 : boolean) : integer", rule);
		parseExpression("operation myOpp(param1 : boolean, param2 : real) : integer", rule);
		parseExpression("operation myOpp(param1 : real, param2 : real) : integer", rule);
	}

	/**
	 * {ReactionTrigger} ((triggers+=EventSpec ("," triggers+=EventSpec)* (=>
	 * '[' guardExpression=Expression ']')?) | ('[' guardExpression=Expression
	 * ']'));
	 */
	@Test
	public void testReactionTrigger() {
		String rule = ReactionTrigger.class.getSimpleName();
		// Internal Scope
		parseExpression("intEvent", internalScope(), rule);
		parseExpression("after 10 s", rule);
		parseExpression("after 10 ms", rule);
		parseExpression("after 10 us", rule);
		parseExpression("after 10 ns", rule);
		parseExpression("every 10 ns", rule);
		parseExpression("entry", rule);
		parseExpression("exit", rule);
		parseExpression("oncycle", rule);
		parseExpression("always", rule);
		parseExpression("intEvent, after 10s", internalScope(), rule);
		parseExpression("intEvent, after 10s, every 10 ms", internalScope(), rule);
		parseExpression("intEvent, after 10s [false == true]", internalScope(), rule);
		parseExpression("intEvent, after 10s ['' != null]", internalScope(), rule);
		parseExpression("intEvent, after 10s [5  > 10]", internalScope(), rule);
		parseExpression("ABC.intEvent", interfaceScope(), rule);
	}

	/**
	 * DefaultTrigger returns sgraph::Trigger: {DefaultTrigger} ('default' |
	 * 'else') ;
	 */
	@Test
	public void testDefaultTrigger() {
		String rule = DefaultTrigger.class.getSimpleName();
		// Internal Scope
		parseExpression("default", rule);
		parseExpression("else", rule);
	}

	/**
	 * ReactionEffect returns sgraph::Effect: {ReactionEffect}
	 * actions+=(Expression | EventRaisingExpression) (=> ';'
	 * actions+=(Expression|EventRaisingExpression) )* ; // (';')?;
	 */
	@Test
	public void testReactionEffect() {
		String rule = ReactionEffect.class.getSimpleName();
		parseExpression("raise intEvent", internalScope(), rule);
		parseExpression("intVar = 5", internalScope(), rule);
		parseExpression("voidOp()", internalScope(), rule);
		parseExpression("intVar = intOp()", internalScope(), rule);

		parseExpression("raise ABC.intEvent : 5", interfaceScope(), rule);
		parseExpression("ABC.paramOp()", interfaceScope(), rule);
		parseExpression("ABC.paramOp(5,false)", interfaceScope(), rule);
		parseExpression("ABC.paramOp(null)", interfaceScope(), rule);
		parseExpression("ABC.paramOp(); raise ABC.voidEvent ", interfaceScope(), rule);
	}

	@Test
	@Ignore("Disabled entry / exit points for release")
	public void testReactionProperties() {
//		 String rule = ReactionProperties.class.getSimpleName();
//		 parseExpression("> ABC.EntryPoint", interfaceScope(), rule);
//		 parseExpression("ABC.ExitPoint >", interfaceScope(), rule);
	}

	/**
	 * LocalReaction: (trigger=ReactionTrigger) =>('/' effect=ReactionEffect)
	 * ('#' properties=ReactionProperties)?;
	 */
	@Test
	public void tesLocalReaction() {
		String rule = LocalReaction.class.getSimpleName();
		parseExpression("entry [ABC.intVar > 10] / raise ABC.intEvent", interfaceScope(), rule);
	}

	/**
	 * TransitionReaction: {TransitionReaction} (trigger=ReactionTrigger)? ('/'
	 * effect=ReactionEffect)? ('#' properties=ReactionProperties)?;
	 */
	@Test
	public void testTransitionReaction() {
		String rule = TransitionReaction.class.getSimpleName();
		parseExpression("after 10 s / raise ABC.intEvent", interfaceScope(), rule);
		parseExpression("[1==1] / intVar += 5", internalScope(), rule);
	}

	/**
	 * {InterfaceScope} 'interface' (name=ID)? ':'
	 * (declarations+=(EventDeclarartion | VariableDeclaration |
	 * OperationDeclaration | Entrypoint | Exitpoint))*;
	 */
	@Test
	public void testInterfaceScope() {
		String rule = InterfaceScope.class.getSimpleName();
		parseExpression("interface :", rule);
		parseExpression("interface ABC:", rule);
		parseExpression("interface : in event Event1", rule);
		parseExpression("interface ABC : var myVar : integer", rule);
		parseExpression("interface : operation myOpp()", rule);
	}

	/**
	 * InternalScope : {InternalScope} 'internal' ':'
	 * (declarations+=(EventDeclarartion | VariableDeclaration |
	 * OperationDeclaration | LocalReaction))*;
	 */
	@Test
	public void testInternalScope() {
		String rule = InternalScope.class.getSimpleName();
		parseExpression("internal :", rule);
		parseExpression("internal : event voidEvent", rule);
		parseExpression("internal : var intVar : integer", rule);
		parseExpression("internal : operation voidOp()", rule);
		parseExpression("internal : every 10 ms / raise intEvent", internalScope(), rule);
	}

	/**
	 * StateScope returns sgraph::Scope: {SimpleScope}
	 * (declarations+=(LocalReaction | Entrypoint | Exitpoint))*;
	 */
	@Test
	public void testStateScope() {

	}
	

	@Test
	public void testArrayAccess() {
		String ruleFeatureCall = FeatureCall.class.getSimpleName();
		String ruleExpression = Expression.class.getSimpleName();
		String ruleReactionEffect = ReactionEffect.class.getSimpleName();
		String ruleVariableDefinition = VariableDefinition.class.getSimpleName();
		String ruleReactionTrigger = ReactionTrigger.class.getSimpleName();
		String ruleEventValueReferenceExpression = EventValueReferenceExpression.class.getSimpleName();
		
		parseExpression("intArrayVar[0]", internalScope(), ruleFeatureCall);
		parseExpression("ABC.intArrayVar[0]", interfaceScope(), ruleFeatureCall);
		parseExpression("intArrayVar[0][0]", internalScope(), ruleFeatureCall);
		parseExpression("intArrayVar[0][1][2]", internalScope(), ruleFeatureCall);
		parseExpression("intArrayVar[intVar]", internalScope(), ruleFeatureCall);
		parseExpression("intArrayVar[intVar][intVar]", internalScope(), ruleFeatureCall);
		parseExpression("intArrayVar[intVar*2+1][intVar*5-2]", internalScope(), ruleFeatureCall);
		
		parseExpression("intArrayVar['key1']", internalScope(), ruleFeatureCall);
		parseExpression("intArrayVar['key1']['key2']", internalScope(), ruleFeatureCall);
		
		parseExpression("5 * intArrayVar[0] + 1", internalScope(), ruleExpression);
		parseExpression("intOp(intArrayVar[0])", internalScope(), ruleFeatureCall);
		parseExpression("ABC.paramOp(intArrayVar[0])", ruleReactionEffect,interfaceScope(), internalScope());
		parseExpression("raise ABC.intEvent : intArrayVar[0]",ruleReactionEffect,interfaceScope(), internalScope());
		parseExpression("raise ABC.intEvent [intArrayVar[0] ==1]",ruleReactionEffect,interfaceScope(), internalScope());		
		parseExpression("var MyVar : integer = intArrayVar[0]", ruleVariableDefinition, internalScope());
		parseExpression("after intArrayVar[0] s", ruleReactionTrigger, internalScope());
		parseExpression("valueof(intArrayVar[0])", ruleEventValueReferenceExpression,internalScope());
	}
	
//	@Test
//	public void testArrayInitialization() {
//		String ruleVariableDefinition = VariableDefinition.class.getSimpleName();
//		
//		parseExpression("var intArrayVar:integer[5]", internalScope(), ruleVariableDefinition);
//		parseExpression("var realArrayVar:real[5]= {0.0,1.0,2.0,3.0,4.0}", internalScope(), ruleVariableDefinition);
//		parseExpression("var boolArrayVar:boolean[2]= {true,false}", internalScope(), ruleVariableDefinition);
//		parseExpression("var stringArrayVar:string[5]= {'s1','s2','s3','s4','s5'}", internalScope(), ruleVariableDefinition);
//		
//		parseExpression("var intArrayVar:integer[5] = {0,1,2,3,4}", internalScope(), ruleVariableDefinition);
//		parseExpression("var intArrayVar:integer[2][5] = { {0,1,2,3,4}, {5,6,7,8,9} }", internalScope(), ruleVariableDefinition);
//		parseExpression("var intArrayVar:integer[3][5][2] = {  { {0,1,2,3,4}, {5,6,7,8,9}, {10,11,12,13,14} }, { {15,16,17,18,19}, {20,21,22,23,24}, {25,26,27,28,30} }  }", internalScope(), ruleVariableDefinition);
//	}

}
