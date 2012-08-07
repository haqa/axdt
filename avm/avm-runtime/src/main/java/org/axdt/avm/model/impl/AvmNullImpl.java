/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.avm.model.impl;

import org.axdt.avm.AvmEPackage;
import org.axdt.avm.model.AvmNull;
import org.axdt.avm.model.AvmType;
import org.axdt.avm.naming.AvmQualifiedName;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Null</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AvmNullImpl extends MinimalEObjectImpl.Container implements AvmNull {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int flags = 0;
	
	protected final AvmQualifiedName qname;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected AvmNullImpl() {
		super();
		qname = (AvmQualifiedName)AvmQualifiedName.create("Null");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AvmEPackage.Literals.AVM_NULL;
	}

	public boolean isDynamic() {
		return false;
	}

	public boolean isFinal() {
		return true;
	}

	public boolean isInterface() {
		return false;
	}

	public boolean isClass() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AvmType calculateCommonType(AvmType other) {
		if (other == null)
			return null;
		return other;
	}

	public String getQualifier() {
		return null;
	}

	public String getName() {
		return qname.getFirstSegment();
	}

	public String getCanonicalName() {
		return qname.getFirstSegment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AvmQualifiedName getQualifiedName() {
		return qname;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		return obj instanceof AvmNull;
	}
} //AvmNullImpl
