/****************************************************************************
 * Copyright (c) 2008, 2009 Andreas Unger and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Andreas Unger - initial API and implementation 
 ****************************************************************************/

package org.eclipselabs.damos.diagram.ui.internal.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.swt.graphics.GC;

/**
 * @author Andreas Unger
 *
 */
public class PropertySectionUtil {

	public static int calculateMinimumLabelWidth(GC gc) {
		return gc.textExtent("XXXXXXXXXXXXXXXXXXXXXX").x;
	}

	public static int calculateStandardLabelWidth(GC gc, String[] labels, int minimumLabelWidth) {
		int standardLabelWidth = minimumLabelWidth;
		int indent = gc.textExtent("XX").x; //$NON-NLS-1$
		for (int i = 0; i < labels.length; i++) {
			int width = gc.textExtent(labels[i]).x;
			if (width + indent > standardLabelWidth) {
				standardLabelWidth = width + indent;
			}
		}
		gc.dispose();
		return standardLabelWidth;
	}
	
	public static String formatName(String name) {
		return format(capName(name), ' ');
	}
	
	/* 
	 * The methods capName(String), format(String, separator), and parseName(String, char)
	 * have been copied from org.eclipse.emf.edit.provider.ReflectiveItemProvider
	 */
	
	/*
	 * <copyright> 
	 *
	 * Copyright (c) 2002-2007 IBM Corporation and others.
	 * All rights reserved.   This program and the accompanying materials
	 * are made available under the terms of the Eclipse Public License v1.0
	 * which accompanies this distribution, and is available at
	 * http://www.eclipse.org/legal/epl-v10.html
	 * 
	 * Contributors: 
	 *   IBM - Initial API and implementation
	 *
	 * </copyright>
	 *
	 * $Id: ReflectiveItemProvider.java,v 1.22 2008/05/25 17:27:40 emerks Exp $
	 */

	private static String capName(String name) {
		return name.length() == 0 ? name : name.substring(0, 1).toUpperCase() + name.substring(1);
	}

	private static String format(String name, char separator) {
		StringBuffer result = new StringBuffer();

		for (Iterator<String> i = parseName(name, '_').iterator(); i.hasNext();) {
			String component = i.next();
			result.append(component);
			if (i.hasNext() && component.length() > 1) {
				result.append(separator);
			}
		}
		return result.toString();
	}

	private static List<String> parseName(String sourceName, char sourceSeparator) {
		List<String> result = new ArrayList<String>();
		StringBuffer currentWord = new StringBuffer();

		int length = sourceName.length();
		boolean lastIsLower = false;

		for (int index = 0; index < length; index++) {
			char curChar = sourceName.charAt(index);
			if (Character.isUpperCase(curChar) || (!lastIsLower && Character.isDigit(curChar)) || curChar == sourceSeparator) {
				if (lastIsLower || curChar == sourceSeparator) {
					result.add(currentWord.toString());
					currentWord = new StringBuffer();
				}
				lastIsLower = false;
			} else {
				if (!lastIsLower) {
					int currentWordLength = currentWord.length();
					if (currentWordLength > 1) {
						char lastChar = currentWord.charAt(--currentWordLength);
						currentWord.setLength(currentWordLength);
						result.add(currentWord.toString());
						currentWord = new StringBuffer();
						currentWord.append(lastChar);
					}
				}
				lastIsLower = true;
			}
			if (curChar != sourceSeparator) {
				currentWord.append(curChar);
			}
		}

		result.add(currentWord.toString());
		return result;
	}

}
