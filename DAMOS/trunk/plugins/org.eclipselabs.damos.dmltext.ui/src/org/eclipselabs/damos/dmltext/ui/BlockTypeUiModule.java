/****************************************************************************
 * Copyright (c) 2008, 2011 Andreas Unger and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Andreas Unger - initial API and implementation 
 ****************************************************************************/

package org.eclipselabs.damos.dmltext.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.autoedit.AbstractEditStrategyProvider;
import org.eclipse.xtext.ui.editor.contentassist.antlr.IContentAssistParser;
import org.eclipselabs.damos.dmltext.ui.contentassist.antlr.BlockTypeContentAssistParser;
import org.eclipselabs.damos.mscript.ui.autoedit.MscriptAutoEditStrategyProvider;

/**
 * @author Andreas Unger
 *
 */
public class BlockTypeUiModule extends DMLTextUiModule {

	/**
	 * @param plugin
	 */
	public BlockTypeUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	/* (non-Javadoc)
	 * @see org.eclipselabs.damos.dmltext.ui.AbstractDMLTextUiModule#bindIContentAssistParser()
	 */
	@Override
	public Class<? extends IContentAssistParser> bindIContentAssistParser() {
		return BlockTypeContentAssistParser.class;
	}
	
	@Override
	public Class<? extends AbstractEditStrategyProvider> bindAbstractEditStrategyProvider() {
		return MscriptAutoEditStrategyProvider.class;
	}	
	
}
