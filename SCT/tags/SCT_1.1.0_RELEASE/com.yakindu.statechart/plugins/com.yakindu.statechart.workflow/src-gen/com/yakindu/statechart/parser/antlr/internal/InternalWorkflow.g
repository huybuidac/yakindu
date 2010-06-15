/*
* generated by Xtext
*/
grammar InternalWorkflow;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package com.yakindu.statechart.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package com.yakindu.statechart.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import com.yakindu.statechart.services.WorkflowGrammarAccess;

}

@parser::members {
 
 	private WorkflowGrammarAccess grammarAccess;
 	
    public InternalWorkflowParser(TokenStream input, IAstFactory factory, WorkflowGrammarAccess grammarAccess) {
        this(input);
        this.factory = factory;
        registerRules(grammarAccess.getGrammar());
        this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected InputStream getTokenFile() {
    	ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("com/yakindu/statechart/parser/antlr/internal/InternalWorkflow.tokens");
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Workflow";	
   	} 
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleWorkflow
entryRuleWorkflow returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getWorkflowRule(), currentNode); }
	 iv_ruleWorkflow=ruleWorkflow 
	 { $current=$iv_ruleWorkflow.current; } 
	 EOF 
;

// Rule Workflow
ruleWorkflow returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getWorkflowAccess().getModelsModelParserRuleCall_0_0(), currentNode); 
	    }
	    lv_models_0=ruleModel 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getWorkflowRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		add($current, "models", lv_models_0, "Model", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)+(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getWorkflowAccess().getTargetTargetParserRuleCall_1_0(), currentNode); 
	    }
	    lv_target_1=ruleTarget 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getWorkflowRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "target", lv_target_1, "Target", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getWorkflowAccess().getPlatformTargetPlatformParserRuleCall_2_0(), currentNode); 
	    }
	    lv_platform_2=ruleTargetPlatform 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getWorkflowRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "platform", lv_platform_2, "TargetPlatform", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
));





// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
('modelFile' 
    {
        createLeafNode(grammarAccess.getModelAccess().getModelFileKeyword_0(), null); 
    }
(	
	
	    lv_model_1=	RULE_STRING
	{
		createLeafNode(grammarAccess.getModelAccess().getModelSTRINGTerminalRuleCall_1_0(), "model"); 
	}
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "model", lv_model_1, "STRING", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }
	
));





// Entry rule entryRuleTarget
entryRuleTarget returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getTargetRule(), currentNode); }
	 iv_ruleTarget=ruleTarget 
	 { $current=$iv_ruleTarget.current; } 
	 EOF 
;

// Rule Target
ruleTarget returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
('targetDir' 
    {
        createLeafNode(grammarAccess.getTargetAccess().getTargetDirKeyword_0(), null); 
    }
(	
	
	    lv_target_1=	RULE_STRING
	{
		createLeafNode(grammarAccess.getTargetAccess().getTargetSTRINGTerminalRuleCall_1_0(), "target"); 
	}
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getTargetRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "target", lv_target_1, "STRING", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }
	
));





// Entry rule entryRuleTargetPlatform
entryRuleTargetPlatform returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getTargetPlatformRule(), currentNode); }
	 iv_ruleTargetPlatform=ruleTargetPlatform 
	 { $current=$iv_ruleTargetPlatform.current; } 
	 EOF 
;

// Rule TargetPlatform
ruleTargetPlatform returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
('targetPlatform' 
    {
        createLeafNode(grammarAccess.getTargetPlatformAccess().getTargetPlatformKeyword_0(), null); 
    }
(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getTargetPlatformAccess().getTargetplatformPlatformParserRuleCall_1_0(), currentNode); 
	    }
	    lv_targetplatform_1=rulePlatform 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getTargetPlatformRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "targetplatform", lv_targetplatform_1, "Platform", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)(	
	
	    lv_defensive_2='defensive' 
    {
        createLeafNode(grammarAccess.getTargetPlatformAccess().getDefensiveDefensiveKeyword_2_0(), "defensive"); 
    }

 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getTargetPlatformRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "defensive", true, "defensive", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }
	
)?);





// Entry rule entryRulePlatform
entryRulePlatform returns [String current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getPlatformRule(), currentNode); } 
	 iv_rulePlatform=rulePlatform 
	 { $current=$iv_rulePlatform.current.getText(); }  
	 EOF 
;

// Rule Platform
rulePlatform returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
	    lastConsumedNode = currentNode;
	    lastConsumedDatatypeToken = $current;
    }:
(
	kw='c' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getPlatformAccess().getCKeyword_0(), null); 
    }

    |
	kw='java' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getPlatformAccess().getJavaKeyword_1(), null); 
    }

    |
	kw='javame' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getPlatformAccess().getJavameKeyword_2(), null); 
    }

    |
	kw='lejos' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getPlatformAccess().getLejosKeyword_3(), null); 
    }
)
    ;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


