/*
* generated by Xtext
*/
package org.eclipselabs.damos.codegen.c.cgenmodel.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class CGenModelAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/eclipselabs/damos/codegen/c/cgenmodel/parser/antlr/internal/InternalCGenModel.tokens");
	}
}
