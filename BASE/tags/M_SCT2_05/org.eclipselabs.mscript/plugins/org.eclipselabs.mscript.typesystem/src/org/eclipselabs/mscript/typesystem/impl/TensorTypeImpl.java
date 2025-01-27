/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.mscript.typesystem.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipselabs.mscript.typesystem.DataType;
import org.eclipselabs.mscript.typesystem.NumericType;
import org.eclipselabs.mscript.typesystem.OperatorKind;
import org.eclipselabs.mscript.typesystem.TensorType;
import org.eclipselabs.mscript.typesystem.TypeSystemPackage;
import org.eclipselabs.mscript.typesystem.internal.operations.TensorTypeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tensor Type Specifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.mscript.typesystem.impl.TensorTypeImpl#isVector <em>Vector</em>}</li>
 *   <li>{@link org.eclipselabs.mscript.typesystem.impl.TensorTypeImpl#isMatrix <em>Matrix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TensorTypeImpl extends ArrayTypeImpl implements TensorType {
	/**
	 * The default value of the '{@link #isVector() <em>Vector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVector()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VECTOR_EDEFAULT = false;
	/**
	 * The default value of the '{@link #isMatrix() <em>Matrix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMatrix()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MATRIX_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TensorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypeSystemPackage.Literals.TENSOR_TYPE;
	}

	/* (non-Javadoc)
	 * @see org.eclipselabs.mscript.typesystem.impl.ArrayTypeImpl#getElementType()
	 */
	@Override
	public NumericType getElementType() {
		return (NumericType) super.getElementType();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.mscript.typesystem.impl.ArrayTypeImpl#evaluate(org.eclipselabs.mscript.typesystem.OperatorKind, org.eclipselabs.mscript.typesystem.DataType)
	 */
	@Override
	public DataType evaluate(OperatorKind operator, DataType other) {
		return TensorTypeOperations.evaluate(this, operator, other);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isVector() {
		return getDimensions().size() == 1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isMatrix() {
		return getDimensions().size() == 2;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypeSystemPackage.TENSOR_TYPE__VECTOR:
				return isVector();
			case TypeSystemPackage.TENSOR_TYPE__MATRIX:
				return isMatrix();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TypeSystemPackage.TENSOR_TYPE__VECTOR:
				return isVector() != VECTOR_EDEFAULT;
			case TypeSystemPackage.TENSOR_TYPE__MATRIX:
				return isMatrix() != MATRIX_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //TensorTypeSpecifierImpl
