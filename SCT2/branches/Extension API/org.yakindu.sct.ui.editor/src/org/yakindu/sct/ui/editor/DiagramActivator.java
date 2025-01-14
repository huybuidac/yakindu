/**
 * Copyright (c) 2010 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * 	committers of YAKINDU - initial API and implementation
 * 
 */
package org.yakindu.sct.ui.editor;

import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.yakindu.sct.ui.editor.module.SCTModule;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * 
 * @author andreas muelder
 * 
 */
public class DiagramActivator extends AbstractUIPlugin {

	public static final String PLUGIN_ID = "org.yakindu.sct.ui.editor";

	private Injector injector;

	public static final PreferencesHint DIAGRAM_PREFERENCES_HINT = new PreferencesHint(
			PLUGIN_ID);

	private static DiagramActivator plugin;

	public DiagramActivator() {
		injector = Guice.createInjector(new SCTModule());
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		PreferencesHint.registerPreferenceStore(DIAGRAM_PREFERENCES_HINT,
				getPreferenceStore());
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	public static DiagramActivator getDefault() {
		return plugin;
	}

	public Injector getInjector() {
		return injector;
	}

}
