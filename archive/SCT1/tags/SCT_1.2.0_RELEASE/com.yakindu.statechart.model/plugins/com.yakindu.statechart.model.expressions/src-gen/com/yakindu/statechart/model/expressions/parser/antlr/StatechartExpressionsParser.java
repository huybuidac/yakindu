/*
* generated by Xtext
*/
package com.yakindu.statechart.model.expressions.parser.antlr;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.ParseException;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

import com.google.inject.Inject;

import com.yakindu.statechart.model.expressions.services.StatechartExpressionsGrammarAccess;

public class StatechartExpressionsParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private StatechartExpressionsGrammarAccess grammarAccess;
	
	@Override
	protected IParseResult parse(String ruleName, CharStream in) {
		TokenSource tokenSource = createLexer(in);
		XtextTokenStream tokenStream = createTokenStream(tokenSource);
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
		com.yakindu.statechart.model.expressions.parser.antlr.internal.InternalStatechartExpressionsParser parser = createParser(tokenStream);
		parser.setTokenTypeMap(getTokenDefProvider().getTokenDefMap());
		parser.setSyntaxErrorProvider(getSyntaxErrorProvider());
		parser.setUnorderedGroupHelper(getUnorderedGroupHelper().get());
		try {
			if(ruleName != null)
				return parser.parse(ruleName);
			return parser.parse();
		} catch (Exception re) {
			throw new ParseException(re.getMessage(),re);
		}
	}
	
	protected com.yakindu.statechart.model.expressions.parser.antlr.internal.InternalStatechartExpressionsParser createParser(XtextTokenStream stream) {
		return new com.yakindu.statechart.model.expressions.parser.antlr.internal.InternalStatechartExpressionsParser(stream, getElementFactory(), getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Expression";
	}
	
	public StatechartExpressionsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(StatechartExpressionsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
