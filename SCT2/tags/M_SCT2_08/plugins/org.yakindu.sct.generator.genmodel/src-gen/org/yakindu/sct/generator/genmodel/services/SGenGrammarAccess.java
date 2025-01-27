/*
* generated by Xtext
*/

package org.yakindu.sct.generator.genmodel.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class SGenGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class GeneratorModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "GeneratorModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGeneratorModelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cForKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cGeneratorIdAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cGeneratorIdQIDParserRuleCall_2_0 = (RuleCall)cGeneratorIdAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cEntriesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cEntriesGeneratorEntryParserRuleCall_4_0 = (RuleCall)cEntriesAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		/// **
		// * @author Andreas Muelder
		// * / GeneratorModel returns gen::GeneratorModel:
		//	"GeneratorModel" "for" generatorId=QID "{" entries+=GeneratorEntry+ "}";
		public ParserRule getRule() { return rule; }

		//"GeneratorModel" "for" generatorId=QID "{" entries+=GeneratorEntry+ "}"
		public Group getGroup() { return cGroup; }

		//"GeneratorModel"
		public Keyword getGeneratorModelKeyword_0() { return cGeneratorModelKeyword_0; }

		//"for"
		public Keyword getForKeyword_1() { return cForKeyword_1; }

		//generatorId=QID
		public Assignment getGeneratorIdAssignment_2() { return cGeneratorIdAssignment_2; }

		//QID
		public RuleCall getGeneratorIdQIDParserRuleCall_2_0() { return cGeneratorIdQIDParserRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//entries+=GeneratorEntry+
		public Assignment getEntriesAssignment_4() { return cEntriesAssignment_4; }

		//GeneratorEntry
		public RuleCall getEntriesGeneratorEntryParserRuleCall_4_0() { return cEntriesGeneratorEntryParserRuleCall_4_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class GeneratorEntryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "GeneratorEntry");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStatechartKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cStatechartAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cStatechartStatechartCrossReference_1_0 = (CrossReference)cStatechartAssignment_1.eContents().get(0);
		private final RuleCall cStatechartStatechartIDTerminalRuleCall_1_0_1 = (RuleCall)cStatechartStatechartCrossReference_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cFeaturesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cFeaturesFeatureConfigurationParserRuleCall_3_0 = (RuleCall)cFeaturesAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//GeneratorEntry returns gen::GeneratorEntry:
		//	"statechart" statechart=[sct::Statechart] "{" features+=FeatureConfiguration* "}";
		public ParserRule getRule() { return rule; }

		//"statechart" statechart=[sct::Statechart] "{" features+=FeatureConfiguration* "}"
		public Group getGroup() { return cGroup; }

		//"statechart"
		public Keyword getStatechartKeyword_0() { return cStatechartKeyword_0; }

		//statechart=[sct::Statechart]
		public Assignment getStatechartAssignment_1() { return cStatechartAssignment_1; }

		//[sct::Statechart]
		public CrossReference getStatechartStatechartCrossReference_1_0() { return cStatechartStatechartCrossReference_1_0; }

		//ID
		public RuleCall getStatechartStatechartIDTerminalRuleCall_1_0_1() { return cStatechartStatechartIDTerminalRuleCall_1_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//features+=FeatureConfiguration*
		public Assignment getFeaturesAssignment_3() { return cFeaturesAssignment_3; }

		//FeatureConfiguration
		public RuleCall getFeaturesFeatureConfigurationParserRuleCall_3_0() { return cFeaturesFeatureConfigurationParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class FeatureConfigurationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FeatureConfiguration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFeatureConfigurationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cFeatureKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cTypeFeatureTypeCrossReference_2_0 = (CrossReference)cTypeAssignment_2.eContents().get(0);
		private final RuleCall cTypeFeatureTypeIDTerminalRuleCall_2_0_1 = (RuleCall)cTypeFeatureTypeCrossReference_2_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cParameterValuesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cParameterValuesFeatureParameterValueParserRuleCall_4_0 = (RuleCall)cParameterValuesAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//FeatureConfiguration returns gen::FeatureConfiguration:
		//	{gen::FeatureConfiguration} "feature" type=[gen::FeatureType] "{" parameterValues+=FeatureParameterValue+ "}";
		public ParserRule getRule() { return rule; }

		//{gen::FeatureConfiguration} "feature" type=[gen::FeatureType] "{" parameterValues+=FeatureParameterValue+ "}"
		public Group getGroup() { return cGroup; }

		//{gen::FeatureConfiguration}
		public Action getFeatureConfigurationAction_0() { return cFeatureConfigurationAction_0; }

		//"feature"
		public Keyword getFeatureKeyword_1() { return cFeatureKeyword_1; }

		//type=[gen::FeatureType]
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//[gen::FeatureType]
		public CrossReference getTypeFeatureTypeCrossReference_2_0() { return cTypeFeatureTypeCrossReference_2_0; }

		//ID
		public RuleCall getTypeFeatureTypeIDTerminalRuleCall_2_0_1() { return cTypeFeatureTypeIDTerminalRuleCall_2_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//parameterValues+=FeatureParameterValue+
		public Assignment getParameterValuesAssignment_4() { return cParameterValuesAssignment_4; }

		//FeatureParameterValue
		public RuleCall getParameterValuesFeatureParameterValueParserRuleCall_4_0() { return cParameterValuesFeatureParameterValueParserRuleCall_4_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class FeatureParameterValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FeatureParameterValue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFeatureParameterValueAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cParameterAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cParameterFeatureParameterCrossReference_1_0 = (CrossReference)cParameterAssignment_1.eContents().get(0);
		private final RuleCall cParameterFeatureParameterIDTerminalRuleCall_1_0_1 = (RuleCall)cParameterFeatureParameterCrossReference_1_0.eContents().get(1);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValueSTRINGTerminalRuleCall_3_0 = (RuleCall)cValueAssignment_3.eContents().get(0);
		
		//FeatureParameterValue returns gen::FeatureParameterValue:
		//	{gen::FeatureParameterValue} parameter=[gen::FeatureParameter] "=" value=STRING;
		public ParserRule getRule() { return rule; }

		//{gen::FeatureParameterValue} parameter=[gen::FeatureParameter] "=" value=STRING
		public Group getGroup() { return cGroup; }

		//{gen::FeatureParameterValue}
		public Action getFeatureParameterValueAction_0() { return cFeatureParameterValueAction_0; }

		//parameter=[gen::FeatureParameter]
		public Assignment getParameterAssignment_1() { return cParameterAssignment_1; }

		//[gen::FeatureParameter]
		public CrossReference getParameterFeatureParameterCrossReference_1_0() { return cParameterFeatureParameterCrossReference_1_0; }

		//ID
		public RuleCall getParameterFeatureParameterIDTerminalRuleCall_1_0_1() { return cParameterFeatureParameterIDTerminalRuleCall_1_0_1; }

		//"="
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }

		//value=STRING
		public Assignment getValueAssignment_3() { return cValueAssignment_3; }

		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_3_0() { return cValueSTRINGTerminalRuleCall_3_0; }
	}

	public class QIDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QID");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_1_0 = (Alternatives)cGroup_1.eContents().get(0);
		private final Keyword cColonColonKeyword_1_0_0 = (Keyword)cAlternatives_1_0.eContents().get(0);
		private final Keyword cFullStopKeyword_1_0_1 = (Keyword)cAlternatives_1_0.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QID:
		//	ID (("::" | ".") ID)*;
		public ParserRule getRule() { return rule; }

		//ID (("::" | ".") ID)*
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//(("::" | ".") ID)*
		public Group getGroup_1() { return cGroup_1; }

		//"::" | "."
		public Alternatives getAlternatives_1_0() { return cAlternatives_1_0; }

		//"::"
		public Keyword getColonColonKeyword_1_0_0() { return cColonColonKeyword_1_0_0; }

		//"."
		public Keyword getFullStopKeyword_1_0_1() { return cFullStopKeyword_1_0_1; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	
	
	private GeneratorModelElements pGeneratorModel;
	private GeneratorEntryElements pGeneratorEntry;
	private FeatureConfigurationElements pFeatureConfiguration;
	private FeatureParameterValueElements pFeatureParameterValue;
	private QIDElements pQID;
	
	private final GrammarProvider grammarProvider;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public SGenGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammarProvider = grammarProvider;
		this.gaTerminals = gaTerminals;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	/// **
	// * @author Andreas Muelder
	// * / GeneratorModel returns gen::GeneratorModel:
	//	"GeneratorModel" "for" generatorId=QID "{" entries+=GeneratorEntry+ "}";
	public GeneratorModelElements getGeneratorModelAccess() {
		return (pGeneratorModel != null) ? pGeneratorModel : (pGeneratorModel = new GeneratorModelElements());
	}
	
	public ParserRule getGeneratorModelRule() {
		return getGeneratorModelAccess().getRule();
	}

	//GeneratorEntry returns gen::GeneratorEntry:
	//	"statechart" statechart=[sct::Statechart] "{" features+=FeatureConfiguration* "}";
	public GeneratorEntryElements getGeneratorEntryAccess() {
		return (pGeneratorEntry != null) ? pGeneratorEntry : (pGeneratorEntry = new GeneratorEntryElements());
	}
	
	public ParserRule getGeneratorEntryRule() {
		return getGeneratorEntryAccess().getRule();
	}

	//FeatureConfiguration returns gen::FeatureConfiguration:
	//	{gen::FeatureConfiguration} "feature" type=[gen::FeatureType] "{" parameterValues+=FeatureParameterValue+ "}";
	public FeatureConfigurationElements getFeatureConfigurationAccess() {
		return (pFeatureConfiguration != null) ? pFeatureConfiguration : (pFeatureConfiguration = new FeatureConfigurationElements());
	}
	
	public ParserRule getFeatureConfigurationRule() {
		return getFeatureConfigurationAccess().getRule();
	}

	//FeatureParameterValue returns gen::FeatureParameterValue:
	//	{gen::FeatureParameterValue} parameter=[gen::FeatureParameter] "=" value=STRING;
	public FeatureParameterValueElements getFeatureParameterValueAccess() {
		return (pFeatureParameterValue != null) ? pFeatureParameterValue : (pFeatureParameterValue = new FeatureParameterValueElements());
	}
	
	public ParserRule getFeatureParameterValueRule() {
		return getFeatureParameterValueAccess().getRule();
	}

	//QID:
	//	ID (("::" | ".") ID)*;
	public QIDElements getQIDAccess() {
		return (pQID != null) ? pQID : (pQID = new QIDElements());
	}
	
	public ParserRule getQIDRule() {
		return getQIDAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
