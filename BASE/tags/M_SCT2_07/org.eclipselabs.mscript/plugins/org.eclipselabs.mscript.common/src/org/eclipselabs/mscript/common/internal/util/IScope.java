/****************************************************************************
 * Copyright (c) 2008, 2010 Andreas Unger and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Andreas Unger - initial API and implementation 
 ****************************************************************************/

package org.eclipselabs.mscript.common.internal.util;

import java.util.Collection;

/**
 * @author Andreas Unger
 *
 * @noextend
 * @noimplement
 */
public interface IScope<T, K, E> {
	
	T getOuterScope();
	
	Collection<E> getAll();
	E get(K key);
	
	E findInEnclosingScopes(K key);
	
	void add(K key, E element);
	
}
