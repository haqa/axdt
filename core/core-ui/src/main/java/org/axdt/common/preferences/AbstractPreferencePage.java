/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.common.preferences;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IWorkbench;

/**
 * @author mb0
 *
 */
public abstract class AbstractPreferencePage extends AbstractFieldEditorPage implements
		IAxdtPreferencePage {

	/**
	 * only when used as property page
	 */
	private IAdaptable element;

	public AbstractPreferencePage(PrefPage page) {
		super(page);
	}

	public AbstractPreferencePage(AbstractPreferences pref) {
		this(pref, AbstractPreferences.PAGE_DEFAULT);
	}

	public AbstractPreferencePage(AbstractPreferences pref, String pageKey) {
		this(pref.getPage(pageKey));
	}

	protected IPreferenceStore retrievePreferenceStore(AbstractPreferences prefs) {
		return prefs.getStore();
	}

	public void init(IWorkbench workbench) {
		setPreferenceStore(retrievePreferenceStore(page.getPreferences()));
	}

	/**
	 * only when used as property page
	 * @see org.eclipse.ui.IWorkbenchPropertyPage#getElement()
	 */
	public IAdaptable getElement() {
		return element;
	}

	@Override
	protected boolean isExcluded(PrefGroup group) {
		return 0 != (group.getFlags() & IAxdtPreferences.EXCLUDE_IN_PREFERENCE);
	}

	/**
	 * only when used as property page
	 * @see org.eclipse.ui.IWorkbenchPropertyPage#setElement(org.eclipse.core.runtime.IAdaptable)
	 */
	public void setElement(IAdaptable element) {
		this.element = element;
		setPreferenceStore(retrievePreferenceStore(page.getPreferences()));
	}
}
