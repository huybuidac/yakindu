/*
 * generated by Xtext
 */
package org.eclipselabs.mscript.language.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MscriptExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return org.eclipselabs.mscript.language.ui.internal.MscriptActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return org.eclipselabs.mscript.language.ui.internal.MscriptActivator.getInstance().getInjector("org.eclipselabs.mscript.language.Mscript");
	}
	
}
