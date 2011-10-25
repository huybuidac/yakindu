/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.damos.mscript;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipselabs.damos.mscript.MscriptFactory
 * @model kind="package"
 * @generated
 */
public interface MscriptPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mscript";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipselabs.org/damos/mscript/Mscript";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mscript";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MscriptPackage eINSTANCE = org.eclipselabs.damos.mscript.impl.MscriptPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.ModuleImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 0;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DEFINITIONS = 0;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.DefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.DefinitionImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getDefinition()
	 * @generated
	 */
	int DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.DataTypeDefinitionImpl <em>Data Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.DataTypeDefinitionImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getDataTypeDefinition()
	 * @generated
	 */
	int DATA_TYPE_DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DEFINITION__NAME = DEFINITION__NAME;

	/**
	 * The number of structural features of the '<em>Data Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DEFINITION_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.EnumerationDefinitionImpl <em>Enumeration Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.EnumerationDefinitionImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getEnumerationDefinition()
	 * @generated
	 */
	int ENUMERATION_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_DEFINITION__NAME = DATA_TYPE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Literal Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_DEFINITION__LITERAL_DECLARATIONS = DATA_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_DEFINITION_FEATURE_COUNT = DATA_TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.EnumerationLiteralDeclarationImpl <em>Enumeration Literal Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.EnumerationLiteralDeclarationImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getEnumerationLiteralDeclaration()
	 * @generated
	 */
	int ENUMERATION_LITERAL_DECLARATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_DECLARATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Enumeration Literal Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_DECLARATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.TypedefDeclarationImpl <em>Typedef Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.TypedefDeclarationImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getTypedefDeclaration()
	 * @generated
	 */
	int TYPEDEF_DECLARATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_DECLARATION__NAME = DATA_TYPE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Type Specifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_DECLARATION__TYPE_SPECIFIER = DATA_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Typedef Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_DECLARATION_FEATURE_COUNT = DATA_TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.StructDefinitionImpl <em>Struct Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.StructDefinitionImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getStructDefinition()
	 * @generated
	 */
	int STRUCT_DEFINITION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DEFINITION__NAME = DATA_TYPE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Member Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DEFINITION__MEMBER_DECLARATIONS = DATA_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Struct Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_DEFINITION_FEATURE_COUNT = DATA_TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.StructMemberDeclarationImpl <em>Struct Member Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.StructMemberDeclarationImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getStructMemberDeclaration()
	 * @generated
	 */
	int STRUCT_MEMBER_DECLARATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_MEMBER_DECLARATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type Specifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_MEMBER_DECLARATION__TYPE_SPECIFIER = 1;

	/**
	 * The number of structural features of the '<em>Struct Member Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_MEMBER_DECLARATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.FunctionDefinitionImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getFunctionDefinition()
	 * @generated
	 */
	int FUNCTION_DEFINITION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__NAME = DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__KIND = DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Template Parameter Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__TEMPLATE_PARAMETER_DECLARATIONS = DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Parameter Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__INPUT_PARAMETER_DECLARATIONS = DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output Parameter Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__OUTPUT_PARAMETER_DECLARATIONS = DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Checks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__CHECKS = DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Assertions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__ASSERTIONS = DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Function Object Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__FUNCTION_OBJECT_DECLARATIONS = DEFINITION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>State Variable Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__STATE_VARIABLE_DECLARATIONS = DEFINITION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Equations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__EQUATIONS = DEFINITION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Function Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.CheckImpl <em>Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.CheckImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getCheck()
	 * @generated
	 */
	int CHECK = 9;

	/**
	 * The feature id for the '<em><b>Function</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__FUNCTION = 0;

	/**
	 * The feature id for the '<em><b>Template Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__TEMPLATE_ARGUMENTS = 1;

	/**
	 * The feature id for the '<em><b>Input Parameter Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__INPUT_PARAMETER_TYPES = 2;

	/**
	 * The feature id for the '<em><b>Output Parameter Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__OUTPUT_PARAMETER_TYPES = 3;

	/**
	 * The number of structural features of the '<em>Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.CallableElementImpl <em>Callable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.CallableElementImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getCallableElement()
	 * @generated
	 */
	int CALLABLE_ELEMENT = 10;

	/**
	 * The number of structural features of the '<em>Callable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.ParameterDeclarationImpl <em>Parameter Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.ParameterDeclarationImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getParameterDeclaration()
	 * @generated
	 */
	int PARAMETER_DECLARATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DECLARATION__NAME = CALLABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DECLARATION_FEATURE_COUNT = CALLABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.TemplateParameterDeclarationImpl <em>Template Parameter Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.TemplateParameterDeclarationImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getTemplateParameterDeclaration()
	 * @generated
	 */
	int TEMPLATE_PARAMETER_DECLARATION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_DECLARATION__NAME = PARAMETER_DECLARATION__NAME;

	/**
	 * The number of structural features of the '<em>Template Parameter Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_DECLARATION_FEATURE_COUNT = PARAMETER_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.InputParameterDeclarationImpl <em>Input Parameter Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.InputParameterDeclarationImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getInputParameterDeclaration()
	 * @generated
	 */
	int INPUT_PARAMETER_DECLARATION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_DECLARATION__NAME = PARAMETER_DECLARATION__NAME;

	/**
	 * The number of structural features of the '<em>Input Parameter Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_DECLARATION_FEATURE_COUNT = PARAMETER_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.OutputParameterDeclarationImpl <em>Output Parameter Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.OutputParameterDeclarationImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getOutputParameterDeclaration()
	 * @generated
	 */
	int OUTPUT_PARAMETER_DECLARATION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PARAMETER_DECLARATION__NAME = PARAMETER_DECLARATION__NAME;

	/**
	 * The number of structural features of the '<em>Output Parameter Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PARAMETER_DECLARATION_FEATURE_COUNT = PARAMETER_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.AssertionImpl <em>Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.AssertionImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getAssertion()
	 * @generated
	 */
	int ASSERTION = 15;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__STATIC = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Status Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__STATUS_KIND = 2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__MESSAGE = 3;

	/**
	 * The number of structural features of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.StateVariableDeclarationImpl <em>State Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.StateVariableDeclarationImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getStateVariableDeclaration()
	 * @generated
	 */
	int STATE_VARIABLE_DECLARATION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE_DECLARATION__NAME = CALLABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE_DECLARATION_FEATURE_COUNT = CALLABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.FunctionObjectDeclarationImpl <em>Function Object Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.FunctionObjectDeclarationImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getFunctionObjectDeclaration()
	 * @generated
	 */
	int FUNCTION_OBJECT_DECLARATION = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OBJECT_DECLARATION__NAME = CALLABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OBJECT_DECLARATION__FUNCTION_NAME = CALLABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Template Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OBJECT_DECLARATION__TEMPLATE_ARGUMENTS = CALLABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Function Object Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OBJECT_DECLARATION_FEATURE_COUNT = CALLABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.EquationImpl <em>Equation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.EquationImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getEquation()
	 * @generated
	 */
	int EQUATION = 18;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION__INITIAL = 0;

	/**
	 * The feature id for the '<em><b>Left Hand Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION__LEFT_HAND_SIDE = 1;

	/**
	 * The feature id for the '<em><b>Right Hand Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION__RIGHT_HAND_SIDE = 2;

	/**
	 * The number of structural features of the '<em>Equation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.DataTypeSpecifierImpl <em>Data Type Specifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.DataTypeSpecifierImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getDataTypeSpecifier()
	 * @generated
	 */
	int DATA_TYPE_SPECIFIER = 19;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_SPECIFIER__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Defined Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_SPECIFIER__DEFINED_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Data Type Specifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_SPECIFIER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.ExpressionImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 92;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.LetExpressionImpl <em>Let Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.LetExpressionImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getLetExpression()
	 * @generated
	 */
	int LET_EXPRESSION = 20;

	/**
	 * The feature id for the '<em><b>Variable Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPRESSION__VARIABLE_DECLARATIONS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPRESSION__TARGET_EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Let Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.LetExpressionVariableDeclarationImpl <em>Let Expression Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.LetExpressionVariableDeclarationImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getLetExpressionVariableDeclaration()
	 * @generated
	 */
	int LET_EXPRESSION_VARIABLE_DECLARATION = 21;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPRESSION_VARIABLE_DECLARATION__PARTS = 0;

	/**
	 * The feature id for the '<em><b>Assigned Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPRESSION_VARIABLE_DECLARATION__ASSIGNED_EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Let Expression Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPRESSION_VARIABLE_DECLARATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.LetExpressionVariableDeclarationPartImpl <em>Let Expression Variable Declaration Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.LetExpressionVariableDeclarationPartImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getLetExpressionVariableDeclarationPart()
	 * @generated
	 */
	int LET_EXPRESSION_VARIABLE_DECLARATION_PART = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPRESSION_VARIABLE_DECLARATION_PART__NAME = CALLABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Let Expression Variable Declaration Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPRESSION_VARIABLE_DECLARATION_PART_FEATURE_COUNT = CALLABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.IfExpressionImpl <em>If Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.IfExpressionImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getIfExpression()
	 * @generated
	 */
	int IF_EXPRESSION = 23;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION__STATIC = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION__CONDITION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Then Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION__THEN_EXPRESSION = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Else Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION__ELSE_EXPRESSION = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>If Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.SwitchExpressionImpl <em>Switch Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.SwitchExpressionImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getSwitchExpression()
	 * @generated
	 */
	int SWITCH_EXPRESSION = 24;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXPRESSION__STATIC = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Control Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXPRESSION__CONTROL_EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXPRESSION__CASES = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXPRESSION__DEFAULT_EXPRESSION = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Switch Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.SwitchCaseImpl <em>Switch Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.SwitchCaseImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getSwitchCase()
	 * @generated
	 */
	int SWITCH_CASE = 25;

	/**
	 * The feature id for the '<em><b>Case Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE__CASE_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Result Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE__RESULT_EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Switch Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.ArrayElementAccessImpl <em>Array Element Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.ArrayElementAccessImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getArrayElementAccess()
	 * @generated
	 */
	int ARRAY_ELEMENT_ACCESS = 26;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ELEMENT_ACCESS__ARRAY = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subscripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ELEMENT_ACCESS__SUBSCRIPTS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array Element Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ELEMENT_ACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.ArraySubscriptImpl <em>Array Subscript</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.ArraySubscriptImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getArraySubscript()
	 * @generated
	 */
	int ARRAY_SUBSCRIPT = 27;

	/**
	 * The feature id for the '<em><b>Slice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SUBSCRIPT__SLICE = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SUBSCRIPT__EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Array Subscript</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SUBSCRIPT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.IterationCallImpl <em>Iteration Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.IterationCallImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getIterationCall()
	 * @generated
	 */
	int ITERATION_CALL = 28;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_CALL__TARGET = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_CALL__IDENTIFIER = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_CALL__VARIABLES = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Accumulator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_CALL__ACCUMULATOR = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Break Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_CALL__BREAK_CONDITION = EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_CALL__EXPRESSION = EXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Iteration Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.IterationVariableImpl <em>Iteration Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.IterationVariableImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getIterationVariable()
	 * @generated
	 */
	int ITERATION_VARIABLE = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_VARIABLE__NAME = CALLABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Iteration Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_VARIABLE_FEATURE_COUNT = CALLABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.IterationAccumulatorImpl <em>Iteration Accumulator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.IterationAccumulatorImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getIterationAccumulator()
	 * @generated
	 */
	int ITERATION_ACCUMULATOR = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_ACCUMULATOR__NAME = CALLABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_ACCUMULATOR__INITIALIZER = CALLABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Iteration Accumulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_ACCUMULATOR_FEATURE_COUNT = CALLABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.DerivativeOperatorImpl <em>Derivative Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.DerivativeOperatorImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getDerivativeOperator()
	 * @generated
	 */
	int DERIVATIVE_OPERATOR = 31;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATIVE_OPERATOR__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Derivative Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATIVE_OPERATOR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.ArrayConstructionOperatorImpl <em>Array Construction Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.ArrayConstructionOperatorImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getArrayConstructionOperator()
	 * @generated
	 */
	int ARRAY_CONSTRUCTION_OPERATOR = 32;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CONSTRUCTION_OPERATOR__EXPRESSIONS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Iteration Clauses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CONSTRUCTION_OPERATOR__ITERATION_CLAUSES = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array Construction Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CONSTRUCTION_OPERATOR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.ArrayConstructionIterationClauseImpl <em>Array Construction Iteration Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.ArrayConstructionIterationClauseImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getArrayConstructionIterationClause()
	 * @generated
	 */
	int ARRAY_CONSTRUCTION_ITERATION_CLAUSE = 33;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CONSTRUCTION_ITERATION_CLAUSE__VARIABLE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Collection Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CONSTRUCTION_ITERATION_CLAUSE__COLLECTION_EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Array Construction Iteration Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CONSTRUCTION_ITERATION_CLAUSE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.ArrayConcatenationOperatorImpl <em>Array Concatenation Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.ArrayConcatenationOperatorImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getArrayConcatenationOperator()
	 * @generated
	 */
	int ARRAY_CONCATENATION_OPERATOR = 34;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CONCATENATION_OPERATOR__ROWS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Concatenation Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CONCATENATION_OPERATOR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.ExpressionListImpl <em>Expression List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.ExpressionListImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getExpressionList()
	 * @generated
	 */
	int EXPRESSION_LIST = 35;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LIST__EXPRESSIONS = 0;

	/**
	 * The number of structural features of the '<em>Expression List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.UnitConstructionOperatorImpl <em>Unit Construction Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.UnitConstructionOperatorImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getUnitConstructionOperator()
	 * @generated
	 */
	int UNIT_CONSTRUCTION_OPERATOR = 36;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONSTRUCTION_OPERATOR__UNIT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unit Construction Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONSTRUCTION_OPERATOR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.ParenthesizedExpressionImpl <em>Parenthesized Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.ParenthesizedExpressionImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getParenthesizedExpression()
	 * @generated
	 */
	int PARENTHESIZED_EXPRESSION = 37;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIZED_EXPRESSION__EXPRESSIONS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parenthesized Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIZED_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.EndExpressionImpl <em>End Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.EndExpressionImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getEndExpression()
	 * @generated
	 */
	int END_EXPRESSION = 38;

	/**
	 * The number of structural features of the '<em>End Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.RangeExpressionImpl <em>Range Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.RangeExpressionImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getRangeExpression()
	 * @generated
	 */
	int RANGE_EXPRESSION = 39;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_EXPRESSION__OPERANDS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Range Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.ImpliesExpressionImpl <em>Implies Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.ImpliesExpressionImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getImpliesExpression()
	 * @generated
	 */
	int IMPLIES_EXPRESSION = 40;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPRESSION__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPRESSION__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Implies Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.LogicalOrExpressionImpl <em>Logical Or Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.LogicalOrExpressionImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getLogicalOrExpression()
	 * @generated
	 */
	int LOGICAL_OR_EXPRESSION = 41;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OR_EXPRESSION__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OR_EXPRESSION__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Logical Or Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OR_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.LogicalAndExpressionImpl <em>Logical And Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.LogicalAndExpressionImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getLogicalAndExpression()
	 * @generated
	 */
	int LOGICAL_AND_EXPRESSION = 42;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_AND_EXPRESSION__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_AND_EXPRESSION__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Logical And Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_AND_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.EqualityExpressionImpl <em>Equality Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.EqualityExpressionImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getEqualityExpression()
	 * @generated
	 */
	int EQUALITY_EXPRESSION = 43;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_EXPRESSION__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_EXPRESSION__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Equality Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.RelationalExpressionImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getRelationalExpression()
	 * @generated
	 */
	int RELATIONAL_EXPRESSION = 44;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relational Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.TypeTestExpressionImpl <em>Type Test Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.TypeTestExpressionImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getTypeTestExpression()
	 * @generated
	 */
	int TYPE_TEST_EXPRESSION = 45;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TEST_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Specifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TEST_EXPRESSION__TYPE_SPECIFIER = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Test Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TEST_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.AdditiveExpressionImpl <em>Additive Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.AdditiveExpressionImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getAdditiveExpression()
	 * @generated
	 */
	int ADDITIVE_EXPRESSION = 46;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_EXPRESSION__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_EXPRESSION__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Additive Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.MultiplicativeExpressionImpl <em>Multiplicative Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.MultiplicativeExpressionImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getMultiplicativeExpression()
	 * @generated
	 */
	int MULTIPLICATIVE_EXPRESSION = 47;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_EXPRESSION__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_EXPRESSION__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Multiplicative Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.PowerExpressionImpl <em>Power Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.PowerExpressionImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getPowerExpression()
	 * @generated
	 */
	int POWER_EXPRESSION = 48;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_EXPRESSION__OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exponent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_EXPRESSION__EXPONENT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Power Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.UnaryExpressionImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 49;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OPERAND = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.PostfixExpressionImpl <em>Postfix Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.PostfixExpressionImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getPostfixExpression()
	 * @generated
	 */
	int POSTFIX_EXPRESSION = 50;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTFIX_EXPRESSION__OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTFIX_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Postfix Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTFIX_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.FeatureCallImpl <em>Feature Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.FeatureCallImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getFeatureCall()
	 * @generated
	 */
	int FEATURE_CALL = 51;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL__FEATURE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.VariableAccessImpl <em>Variable Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.VariableAccessImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getVariableAccess()
	 * @generated
	 */
	int VARIABLE_ACCESS = 52;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACCESS__FEATURE = FEATURE_CALL__FEATURE;

	/**
	 * The feature id for the '<em><b>Step Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACCESS__STEP_EXPRESSION = FEATURE_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACCESS_FEATURE_COUNT = FEATURE_CALL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.StepExpressionImpl <em>Step Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.StepExpressionImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getStepExpression()
	 * @generated
	 */
	int STEP_EXPRESSION = 53;

	/**
	 * The number of structural features of the '<em>Step Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.RangeStepExpressionImpl <em>Range Step Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.RangeStepExpressionImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getRangeStepExpression()
	 * @generated
	 */
	int RANGE_STEP_EXPRESSION = 54;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_STEP_EXPRESSION__START = STEP_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_STEP_EXPRESSION__END = STEP_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Range Step Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_STEP_EXPRESSION_FEATURE_COUNT = STEP_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.AdditiveStepExpressionImpl <em>Additive Step Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.AdditiveStepExpressionImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getAdditiveStepExpression()
	 * @generated
	 */
	int ADDITIVE_STEP_EXPRESSION = 55;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_STEP_EXPRESSION__OPERATOR = STEP_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_STEP_EXPRESSION__LEFT_OPERAND = STEP_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_STEP_EXPRESSION__RIGHT_OPERAND = STEP_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Additive Step Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_STEP_EXPRESSION_FEATURE_COUNT = STEP_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.NegateStepExpressionImpl <em>Negate Step Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.NegateStepExpressionImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getNegateStepExpression()
	 * @generated
	 */
	int NEGATE_STEP_EXPRESSION = 56;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE_STEP_EXPRESSION__OPERAND = STEP_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Negate Step Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE_STEP_EXPRESSION_FEATURE_COUNT = STEP_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.PrimitiveStepExpressionImpl <em>Primitive Step Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.PrimitiveStepExpressionImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getPrimitiveStepExpression()
	 * @generated
	 */
	int PRIMITIVE_STEP_EXPRESSION = 57;

	/**
	 * The number of structural features of the '<em>Primitive Step Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_STEP_EXPRESSION_FEATURE_COUNT = STEP_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.StepLiteralImpl <em>Step Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.StepLiteralImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getStepLiteral()
	 * @generated
	 */
	int STEP_LITERAL = 58;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_LITERAL__VALUE = PRIMITIVE_STEP_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Step Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_LITERAL_FEATURE_COUNT = PRIMITIVE_STEP_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.StepNImpl <em>Step N</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.StepNImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getStepN()
	 * @generated
	 */
	int STEP_N = 59;

	/**
	 * The number of structural features of the '<em>Step N</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_N_FEATURE_COUNT = PRIMITIVE_STEP_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.FunctionCallImpl <em>Function Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.FunctionCallImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getFunctionCall()
	 * @generated
	 */
	int FUNCTION_CALL = 60;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__FEATURE = FEATURE_CALL__FEATURE;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__ARGUMENTS = FEATURE_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_FEATURE_COUNT = FEATURE_CALL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.MemberVariableAccessImpl <em>Member Variable Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.MemberVariableAccessImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getMemberVariableAccess()
	 * @generated
	 */
	int MEMBER_VARIABLE_ACCESS = 61;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_VARIABLE_ACCESS__TARGET = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Member Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_VARIABLE_ACCESS__MEMBER_VARIABLE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Member Variable Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_VARIABLE_ACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.AlgorithmExpressionImpl <em>Algorithm Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.AlgorithmExpressionImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getAlgorithmExpression()
	 * @generated
	 */
	int ALGORITHM_EXPRESSION = 62;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_EXPRESSION__BODY = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Algorithm Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.StatementImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 64;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.CompoundImpl <em>Compound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.CompoundImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getCompound()
	 * @generated
	 */
	int COMPOUND = 63;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND__STATEMENTS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.AssignmentImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 65;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__TARGET = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.VariableDeclarationImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getVariableDeclaration()
	 * @generated
	 */
	int VARIABLE_DECLARATION = 66;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__INITIALIZER = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.IfStatementImpl <em>If Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.IfStatementImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getIfStatement()
	 * @generated
	 */
	int IF_STATEMENT = 67;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__THEN_STATEMENT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__ELSE_STATEMENT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.WhileStatementImpl <em>While Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.WhileStatementImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getWhileStatement()
	 * @generated
	 */
	int WHILE_STATEMENT = 68;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__BODY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>While Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.DoWhileStatementImpl <em>Do While Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.DoWhileStatementImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getDoWhileStatement()
	 * @generated
	 */
	int DO_WHILE_STATEMENT = 69;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_WHILE_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_WHILE_STATEMENT__BODY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Do While Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_WHILE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.ForStatementImpl <em>For Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.ForStatementImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getForStatement()
	 * @generated
	 */
	int FOR_STATEMENT = 70;

	/**
	 * The feature id for the '<em><b>Declared Iteration Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__DECLARED_ITERATION_VARIABLE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Iteration Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__ITERATION_VARIABLE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Collection Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__COLLECTION_EXPRESSION = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__BODY = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>For Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.ContinueStatementImpl <em>Continue Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.ContinueStatementImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getContinueStatement()
	 * @generated
	 */
	int CONTINUE_STATEMENT = 71;

	/**
	 * The number of structural features of the '<em>Continue Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.BreakStatementImpl <em>Break Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.BreakStatementImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getBreakStatement()
	 * @generated
	 */
	int BREAK_STATEMENT = 72;

	/**
	 * The number of structural features of the '<em>Break Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.ReturnStatementImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getReturnStatement()
	 * @generated
	 */
	int RETURN_STATEMENT = 73;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.BuiltinDefinitionImpl <em>Builtin Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.BuiltinDefinitionImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getBuiltinDefinition()
	 * @generated
	 */
	int BUILTIN_DEFINITION = 74;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILTIN_DEFINITION__NAME = DEFINITION__NAME;

	/**
	 * The number of structural features of the '<em>Builtin Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILTIN_DEFINITION_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.BuiltinFunctionImpl <em>Builtin Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.BuiltinFunctionImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getBuiltinFunction()
	 * @generated
	 */
	int BUILTIN_FUNCTION = 75;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILTIN_FUNCTION__NAME = BUILTIN_DEFINITION__NAME;

	/**
	 * The number of structural features of the '<em>Builtin Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILTIN_FUNCTION_FEATURE_COUNT = BUILTIN_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.BuiltinVariableImpl <em>Builtin Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.BuiltinVariableImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getBuiltinVariable()
	 * @generated
	 */
	int BUILTIN_VARIABLE = 76;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILTIN_VARIABLE__NAME = BUILTIN_DEFINITION__NAME;

	/**
	 * The number of structural features of the '<em>Builtin Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILTIN_VARIABLE_FEATURE_COUNT = BUILTIN_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.DataTypeImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 77;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.InvalidDataTypeImpl <em>Invalid Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.InvalidDataTypeImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getInvalidDataType()
	 * @generated
	 */
	int INVALID_DATA_TYPE = 78;

	/**
	 * The number of structural features of the '<em>Invalid Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.AnyDataTypeImpl <em>Any Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.AnyDataTypeImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getAnyDataType()
	 * @generated
	 */
	int ANY_DATA_TYPE = 79;

	/**
	 * The number of structural features of the '<em>Any Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.UnitTypeImpl <em>Unit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.UnitTypeImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getUnitType()
	 * @generated
	 */
	int UNIT_TYPE = 80;

	/**
	 * The number of structural features of the '<em>Unit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.PrimitiveTypeImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 81;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.NumericTypeImpl <em>Numeric Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.NumericTypeImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getNumericType()
	 * @generated
	 */
	int NUMERIC_TYPE = 82;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__UNIT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Numeric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.RealTypeImpl <em>Real Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.RealTypeImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getRealType()
	 * @generated
	 */
	int REAL_TYPE = 83;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__UNIT = NUMERIC_TYPE__UNIT;

	/**
	 * The number of structural features of the '<em>Real Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE_FEATURE_COUNT = NUMERIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.IntegerTypeImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getIntegerType()
	 * @generated
	 */
	int INTEGER_TYPE = 84;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__UNIT = NUMERIC_TYPE__UNIT;

	/**
	 * The number of structural features of the '<em>Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE_FEATURE_COUNT = NUMERIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.ComplexTypeImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getComplexType()
	 * @generated
	 */
	int COMPLEX_TYPE = 85;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__UNIT = NUMERIC_TYPE__UNIT;

	/**
	 * The number of structural features of the '<em>Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_FEATURE_COUNT = NUMERIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.GaussianTypeImpl <em>Gaussian Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.GaussianTypeImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getGaussianType()
	 * @generated
	 */
	int GAUSSIAN_TYPE = 86;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_TYPE__UNIT = NUMERIC_TYPE__UNIT;

	/**
	 * The number of structural features of the '<em>Gaussian Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_TYPE_FEATURE_COUNT = NUMERIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.BooleanTypeImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getBooleanType()
	 * @generated
	 */
	int BOOLEAN_TYPE = 87;

	/**
	 * The number of structural features of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.StringTypeImpl <em>String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.StringTypeImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getStringType()
	 * @generated
	 */
	int STRING_TYPE = 88;

	/**
	 * The number of structural features of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.ArrayTypeImpl <em>Array Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.ArrayTypeImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getArrayType()
	 * @generated
	 */
	int ARRAY_TYPE = 89;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__ELEMENT_TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Defined Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__DEFINED_ELEMENT_TYPE = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__DIMENSIONS = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dimensionality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__DIMENSIONALITY = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Dimensional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__DIMENSIONAL = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Multidimensional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__MULTIDIMENSIONAL = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Array Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.TensorTypeImpl <em>Tensor Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.TensorTypeImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getTensorType()
	 * @generated
	 */
	int TENSOR_TYPE = 90;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENSOR_TYPE__ELEMENT_TYPE = ARRAY_TYPE__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Defined Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENSOR_TYPE__DEFINED_ELEMENT_TYPE = ARRAY_TYPE__DEFINED_ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENSOR_TYPE__DIMENSIONS = ARRAY_TYPE__DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Dimensionality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENSOR_TYPE__DIMENSIONALITY = ARRAY_TYPE__DIMENSIONALITY;

	/**
	 * The feature id for the '<em><b>Dimensional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENSOR_TYPE__DIMENSIONAL = ARRAY_TYPE__DIMENSIONAL;

	/**
	 * The feature id for the '<em><b>Multidimensional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENSOR_TYPE__MULTIDIMENSIONAL = ARRAY_TYPE__MULTIDIMENSIONAL;

	/**
	 * The feature id for the '<em><b>Vector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENSOR_TYPE__VECTOR = ARRAY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Matrix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENSOR_TYPE__MATRIX = ARRAY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tensor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENSOR_TYPE_FEATURE_COUNT = ARRAY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.ArrayDimensionImpl <em>Array Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.ArrayDimensionImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getArrayDimension()
	 * @generated
	 */
	int ARRAY_DIMENSION = 91;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DIMENSION__SIZE = 0;

	/**
	 * The number of structural features of the '<em>Array Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DIMENSION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.UnitImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 93;

	/**
	 * The feature id for the '<em><b>Numerator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__NUMERATOR = 0;

	/**
	 * The feature id for the '<em><b>Denominator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__DENOMINATOR = 1;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__SCALE = 2;

	/**
	 * The feature id for the '<em><b>Wildcard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__WILDCARD = 3;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.UnitProductImpl <em>Unit Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.UnitProductImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getUnitProduct()
	 * @generated
	 */
	int UNIT_PRODUCT = 94;

	/**
	 * The feature id for the '<em><b>Factors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_PRODUCT__FACTORS = 0;

	/**
	 * The number of structural features of the '<em>Unit Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_PRODUCT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.UnitNumeratorImpl <em>Unit Numerator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.UnitNumeratorImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getUnitNumerator()
	 * @generated
	 */
	int UNIT_NUMERATOR = 95;

	/**
	 * The feature id for the '<em><b>Factors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_NUMERATOR__FACTORS = UNIT_PRODUCT__FACTORS;

	/**
	 * The number of structural features of the '<em>Unit Numerator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_NUMERATOR_FEATURE_COUNT = UNIT_PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.UnitDenominatorImpl <em>Unit Denominator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.UnitDenominatorImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getUnitDenominator()
	 * @generated
	 */
	int UNIT_DENOMINATOR = 96;

	/**
	 * The feature id for the '<em><b>Factors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_DENOMINATOR__FACTORS = UNIT_PRODUCT__FACTORS;

	/**
	 * The number of structural features of the '<em>Unit Denominator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_DENOMINATOR_FEATURE_COUNT = UNIT_PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.UnitFactorImpl <em>Unit Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.UnitFactorImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getUnitFactor()
	 * @generated
	 */
	int UNIT_FACTOR = 97;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FACTOR__SYMBOL = 0;

	/**
	 * The feature id for the '<em><b>Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FACTOR__EXPONENT = 1;

	/**
	 * The number of structural features of the '<em>Unit Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FACTOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.LiteralImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 98;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.NumericLiteralImpl <em>Numeric Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.NumericLiteralImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getNumericLiteral()
	 * @generated
	 */
	int NUMERIC_LITERAL = 99;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_LITERAL__UNIT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Numeric Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.RealLiteralImpl <em>Real Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.RealLiteralImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getRealLiteral()
	 * @generated
	 */
	int REAL_LITERAL = 100;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL__UNIT = NUMERIC_LITERAL__UNIT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL__DATA = NUMERIC_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL__VALUE = NUMERIC_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Real Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL_FEATURE_COUNT = NUMERIC_LITERAL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.IntegerLiteralImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getIntegerLiteral()
	 * @generated
	 */
	int INTEGER_LITERAL = 101;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__UNIT = NUMERIC_LITERAL__UNIT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__DATA = NUMERIC_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__VALUE = NUMERIC_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_FEATURE_COUNT = NUMERIC_LITERAL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.BooleanLiteralImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 102;

	/**
	 * The feature id for the '<em><b>True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__TRUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.impl.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.impl.StringLiteralImpl
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 103;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.FunctionKind <em>Function Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.FunctionKind
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getFunctionKind()
	 * @generated
	 */
	int FUNCTION_KIND = 104;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.AssertionStatusKind <em>Assertion Status Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.AssertionStatusKind
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getAssertionStatusKind()
	 * @generated
	 */
	int ASSERTION_STATUS_KIND = 105;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.EqualityOperator <em>Equality Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.EqualityOperator
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getEqualityOperator()
	 * @generated
	 */
	int EQUALITY_OPERATOR = 106;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.RelationalOperator <em>Relational Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.RelationalOperator
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getRelationalOperator()
	 * @generated
	 */
	int RELATIONAL_OPERATOR = 107;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.AdditiveOperator <em>Additive Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.AdditiveOperator
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getAdditiveOperator()
	 * @generated
	 */
	int ADDITIVE_OPERATOR = 108;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.MultiplicativeOperator <em>Multiplicative Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.MultiplicativeOperator
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getMultiplicativeOperator()
	 * @generated
	 */
	int MULTIPLICATIVE_OPERATOR = 109;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.PowerOperator <em>Power Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.PowerOperator
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getPowerOperator()
	 * @generated
	 */
	int POWER_OPERATOR = 110;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.UnaryOperator <em>Unary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.UnaryOperator
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getUnaryOperator()
	 * @generated
	 */
	int UNARY_OPERATOR = 111;

	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.PostfixOperator <em>Postfix Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.PostfixOperator
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getPostfixOperator()
	 * @generated
	 */
	int POSTFIX_OPERATOR = 112;


	/**
	 * The meta object id for the '{@link org.eclipselabs.damos.mscript.OperatorKind <em>Operator Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.OperatorKind
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getOperatorKind()
	 * @generated
	 */
	int OPERATOR_KIND = 113;

	/**
	 * The meta object id for the '<em>Real Data</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.RealData
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getRealData()
	 * @generated
	 */
	int REAL_DATA = 114;

	/**
	 * The meta object id for the '<em>Integer Data</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.damos.mscript.IntegerData
	 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getIntegerData()
	 * @generated
	 */
	int INTEGER_DATA = 115;


	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see org.eclipselabs.damos.mscript.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.damos.mscript.Module#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definitions</em>'.
	 * @see org.eclipselabs.damos.mscript.Module#getDefinitions()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Definitions();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see org.eclipselabs.damos.mscript.Definition
	 * @generated
	 */
	EClass getDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.Definition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipselabs.damos.mscript.Definition#getName()
	 * @see #getDefinition()
	 * @generated
	 */
	EAttribute getDefinition_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.DataTypeDefinition <em>Data Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Definition</em>'.
	 * @see org.eclipselabs.damos.mscript.DataTypeDefinition
	 * @generated
	 */
	EClass getDataTypeDefinition();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.EnumerationDefinition <em>Enumeration Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Definition</em>'.
	 * @see org.eclipselabs.damos.mscript.EnumerationDefinition
	 * @generated
	 */
	EClass getEnumerationDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.damos.mscript.EnumerationDefinition#getLiteralDeclarations <em>Literal Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literal Declarations</em>'.
	 * @see org.eclipselabs.damos.mscript.EnumerationDefinition#getLiteralDeclarations()
	 * @see #getEnumerationDefinition()
	 * @generated
	 */
	EReference getEnumerationDefinition_LiteralDeclarations();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.EnumerationLiteralDeclaration <em>Enumeration Literal Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Literal Declaration</em>'.
	 * @see org.eclipselabs.damos.mscript.EnumerationLiteralDeclaration
	 * @generated
	 */
	EClass getEnumerationLiteralDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.EnumerationLiteralDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipselabs.damos.mscript.EnumerationLiteralDeclaration#getName()
	 * @see #getEnumerationLiteralDeclaration()
	 * @generated
	 */
	EAttribute getEnumerationLiteralDeclaration_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.TypedefDeclaration <em>Typedef Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typedef Declaration</em>'.
	 * @see org.eclipselabs.damos.mscript.TypedefDeclaration
	 * @generated
	 */
	EClass getTypedefDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.TypedefDeclaration#getTypeSpecifier <em>Type Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Specifier</em>'.
	 * @see org.eclipselabs.damos.mscript.TypedefDeclaration#getTypeSpecifier()
	 * @see #getTypedefDeclaration()
	 * @generated
	 */
	EReference getTypedefDeclaration_TypeSpecifier();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.StructDefinition <em>Struct Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Definition</em>'.
	 * @see org.eclipselabs.damos.mscript.StructDefinition
	 * @generated
	 */
	EClass getStructDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.damos.mscript.StructDefinition#getMemberDeclarations <em>Member Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member Declarations</em>'.
	 * @see org.eclipselabs.damos.mscript.StructDefinition#getMemberDeclarations()
	 * @see #getStructDefinition()
	 * @generated
	 */
	EReference getStructDefinition_MemberDeclarations();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.StructMemberDeclaration <em>Struct Member Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Member Declaration</em>'.
	 * @see org.eclipselabs.damos.mscript.StructMemberDeclaration
	 * @generated
	 */
	EClass getStructMemberDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.StructMemberDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipselabs.damos.mscript.StructMemberDeclaration#getName()
	 * @see #getStructMemberDeclaration()
	 * @generated
	 */
	EAttribute getStructMemberDeclaration_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.StructMemberDeclaration#getTypeSpecifier <em>Type Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Specifier</em>'.
	 * @see org.eclipselabs.damos.mscript.StructMemberDeclaration#getTypeSpecifier()
	 * @see #getStructMemberDeclaration()
	 * @generated
	 */
	EReference getStructMemberDeclaration_TypeSpecifier();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.FunctionDefinition <em>Function Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Definition</em>'.
	 * @see org.eclipselabs.damos.mscript.FunctionDefinition
	 * @generated
	 */
	EClass getFunctionDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.FunctionDefinition#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipselabs.damos.mscript.FunctionDefinition#getKind()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EAttribute getFunctionDefinition_Kind();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.damos.mscript.FunctionDefinition#getTemplateParameterDeclarations <em>Template Parameter Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Parameter Declarations</em>'.
	 * @see org.eclipselabs.damos.mscript.FunctionDefinition#getTemplateParameterDeclarations()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_TemplateParameterDeclarations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.damos.mscript.FunctionDefinition#getInputParameterDeclarations <em>Input Parameter Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Parameter Declarations</em>'.
	 * @see org.eclipselabs.damos.mscript.FunctionDefinition#getInputParameterDeclarations()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_InputParameterDeclarations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.damos.mscript.FunctionDefinition#getOutputParameterDeclarations <em>Output Parameter Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Parameter Declarations</em>'.
	 * @see org.eclipselabs.damos.mscript.FunctionDefinition#getOutputParameterDeclarations()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_OutputParameterDeclarations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.damos.mscript.FunctionDefinition#getChecks <em>Checks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Checks</em>'.
	 * @see org.eclipselabs.damos.mscript.FunctionDefinition#getChecks()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_Checks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.damos.mscript.FunctionDefinition#getAssertions <em>Assertions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assertions</em>'.
	 * @see org.eclipselabs.damos.mscript.FunctionDefinition#getAssertions()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_Assertions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.damos.mscript.FunctionDefinition#getFunctionObjectDeclarations <em>Function Object Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function Object Declarations</em>'.
	 * @see org.eclipselabs.damos.mscript.FunctionDefinition#getFunctionObjectDeclarations()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_FunctionObjectDeclarations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.damos.mscript.FunctionDefinition#getStateVariableDeclarations <em>State Variable Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State Variable Declarations</em>'.
	 * @see org.eclipselabs.damos.mscript.FunctionDefinition#getStateVariableDeclarations()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_StateVariableDeclarations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.damos.mscript.FunctionDefinition#getEquations <em>Equations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Equations</em>'.
	 * @see org.eclipselabs.damos.mscript.FunctionDefinition#getEquations()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_Equations();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.Check <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check</em>'.
	 * @see org.eclipselabs.damos.mscript.Check
	 * @generated
	 */
	EClass getCheck();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipselabs.damos.mscript.Check#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Function</em>'.
	 * @see org.eclipselabs.damos.mscript.Check#getFunction()
	 * @see #getCheck()
	 * @generated
	 */
	EReference getCheck_Function();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.damos.mscript.Check#getTemplateArguments <em>Template Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Arguments</em>'.
	 * @see org.eclipselabs.damos.mscript.Check#getTemplateArguments()
	 * @see #getCheck()
	 * @generated
	 */
	EReference getCheck_TemplateArguments();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.damos.mscript.Check#getInputParameterTypes <em>Input Parameter Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Parameter Types</em>'.
	 * @see org.eclipselabs.damos.mscript.Check#getInputParameterTypes()
	 * @see #getCheck()
	 * @generated
	 */
	EReference getCheck_InputParameterTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.damos.mscript.Check#getOutputParameterTypes <em>Output Parameter Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Parameter Types</em>'.
	 * @see org.eclipselabs.damos.mscript.Check#getOutputParameterTypes()
	 * @see #getCheck()
	 * @generated
	 */
	EReference getCheck_OutputParameterTypes();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.CallableElement <em>Callable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callable Element</em>'.
	 * @see org.eclipselabs.damos.mscript.CallableElement
	 * @generated
	 */
	EClass getCallableElement();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.ParameterDeclaration <em>Parameter Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Declaration</em>'.
	 * @see org.eclipselabs.damos.mscript.ParameterDeclaration
	 * @generated
	 */
	EClass getParameterDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.ParameterDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipselabs.damos.mscript.ParameterDeclaration#getName()
	 * @see #getParameterDeclaration()
	 * @generated
	 */
	EAttribute getParameterDeclaration_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.TemplateParameterDeclaration <em>Template Parameter Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Parameter Declaration</em>'.
	 * @see org.eclipselabs.damos.mscript.TemplateParameterDeclaration
	 * @generated
	 */
	EClass getTemplateParameterDeclaration();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.InputParameterDeclaration <em>Input Parameter Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Parameter Declaration</em>'.
	 * @see org.eclipselabs.damos.mscript.InputParameterDeclaration
	 * @generated
	 */
	EClass getInputParameterDeclaration();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.OutputParameterDeclaration <em>Output Parameter Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Parameter Declaration</em>'.
	 * @see org.eclipselabs.damos.mscript.OutputParameterDeclaration
	 * @generated
	 */
	EClass getOutputParameterDeclaration();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion</em>'.
	 * @see org.eclipselabs.damos.mscript.Assertion
	 * @generated
	 */
	EClass getAssertion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.Assertion#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see org.eclipselabs.damos.mscript.Assertion#isStatic()
	 * @see #getAssertion()
	 * @generated
	 */
	EAttribute getAssertion_Static();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.Assertion#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclipselabs.damos.mscript.Assertion#getCondition()
	 * @see #getAssertion()
	 * @generated
	 */
	EReference getAssertion_Condition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.Assertion#getStatusKind <em>Status Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Kind</em>'.
	 * @see org.eclipselabs.damos.mscript.Assertion#getStatusKind()
	 * @see #getAssertion()
	 * @generated
	 */
	EAttribute getAssertion_StatusKind();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.Assertion#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message</em>'.
	 * @see org.eclipselabs.damos.mscript.Assertion#getMessage()
	 * @see #getAssertion()
	 * @generated
	 */
	EReference getAssertion_Message();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.StateVariableDeclaration <em>State Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Variable Declaration</em>'.
	 * @see org.eclipselabs.damos.mscript.StateVariableDeclaration
	 * @generated
	 */
	EClass getStateVariableDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.StateVariableDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipselabs.damos.mscript.StateVariableDeclaration#getName()
	 * @see #getStateVariableDeclaration()
	 * @generated
	 */
	EAttribute getStateVariableDeclaration_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.FunctionObjectDeclaration <em>Function Object Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Object Declaration</em>'.
	 * @see org.eclipselabs.damos.mscript.FunctionObjectDeclaration
	 * @generated
	 */
	EClass getFunctionObjectDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.FunctionObjectDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipselabs.damos.mscript.FunctionObjectDeclaration#getName()
	 * @see #getFunctionObjectDeclaration()
	 * @generated
	 */
	EAttribute getFunctionObjectDeclaration_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.damos.mscript.FunctionObjectDeclaration#getFunctionName <em>Function Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function Name</em>'.
	 * @see org.eclipselabs.damos.mscript.FunctionObjectDeclaration#getFunctionName()
	 * @see #getFunctionObjectDeclaration()
	 * @generated
	 */
	EReference getFunctionObjectDeclaration_FunctionName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.damos.mscript.FunctionObjectDeclaration#getTemplateArguments <em>Template Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Arguments</em>'.
	 * @see org.eclipselabs.damos.mscript.FunctionObjectDeclaration#getTemplateArguments()
	 * @see #getFunctionObjectDeclaration()
	 * @generated
	 */
	EReference getFunctionObjectDeclaration_TemplateArguments();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.Equation <em>Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equation</em>'.
	 * @see org.eclipselabs.damos.mscript.Equation
	 * @generated
	 */
	EClass getEquation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.Equation#isInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial</em>'.
	 * @see org.eclipselabs.damos.mscript.Equation#isInitial()
	 * @see #getEquation()
	 * @generated
	 */
	EAttribute getEquation_Initial();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.Equation#getLeftHandSide <em>Left Hand Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Hand Side</em>'.
	 * @see org.eclipselabs.damos.mscript.Equation#getLeftHandSide()
	 * @see #getEquation()
	 * @generated
	 */
	EReference getEquation_LeftHandSide();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.Equation#getRightHandSide <em>Right Hand Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Hand Side</em>'.
	 * @see org.eclipselabs.damos.mscript.Equation#getRightHandSide()
	 * @see #getEquation()
	 * @generated
	 */
	EReference getEquation_RightHandSide();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.DataTypeSpecifier <em>Data Type Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Specifier</em>'.
	 * @see org.eclipselabs.damos.mscript.DataTypeSpecifier
	 * @generated
	 */
	EClass getDataTypeSpecifier();

	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.damos.mscript.DataTypeSpecifier#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipselabs.damos.mscript.DataTypeSpecifier#getType()
	 * @see #getDataTypeSpecifier()
	 * @generated
	 */
	EReference getDataTypeSpecifier_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.DataTypeSpecifier#getDefinedType <em>Defined Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Defined Type</em>'.
	 * @see org.eclipselabs.damos.mscript.DataTypeSpecifier#getDefinedType()
	 * @see #getDataTypeSpecifier()
	 * @generated
	 */
	EReference getDataTypeSpecifier_DefinedType();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.LetExpression <em>Let Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Let Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.LetExpression
	 * @generated
	 */
	EClass getLetExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.damos.mscript.LetExpression#getVariableDeclarations <em>Variable Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable Declarations</em>'.
	 * @see org.eclipselabs.damos.mscript.LetExpression#getVariableDeclarations()
	 * @see #getLetExpression()
	 * @generated
	 */
	EReference getLetExpression_VariableDeclarations();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.LetExpression#getTargetExpression <em>Target Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.LetExpression#getTargetExpression()
	 * @see #getLetExpression()
	 * @generated
	 */
	EReference getLetExpression_TargetExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.LetExpressionVariableDeclaration <em>Let Expression Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Let Expression Variable Declaration</em>'.
	 * @see org.eclipselabs.damos.mscript.LetExpressionVariableDeclaration
	 * @generated
	 */
	EClass getLetExpressionVariableDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.damos.mscript.LetExpressionVariableDeclaration#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see org.eclipselabs.damos.mscript.LetExpressionVariableDeclaration#getParts()
	 * @see #getLetExpressionVariableDeclaration()
	 * @generated
	 */
	EReference getLetExpressionVariableDeclaration_Parts();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.LetExpressionVariableDeclaration#getAssignedExpression <em>Assigned Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assigned Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.LetExpressionVariableDeclaration#getAssignedExpression()
	 * @see #getLetExpressionVariableDeclaration()
	 * @generated
	 */
	EReference getLetExpressionVariableDeclaration_AssignedExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.LetExpressionVariableDeclarationPart <em>Let Expression Variable Declaration Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Let Expression Variable Declaration Part</em>'.
	 * @see org.eclipselabs.damos.mscript.LetExpressionVariableDeclarationPart
	 * @generated
	 */
	EClass getLetExpressionVariableDeclarationPart();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.LetExpressionVariableDeclarationPart#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipselabs.damos.mscript.LetExpressionVariableDeclarationPart#getName()
	 * @see #getLetExpressionVariableDeclarationPart()
	 * @generated
	 */
	EAttribute getLetExpressionVariableDeclarationPart_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.IfExpression <em>If Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.IfExpression
	 * @generated
	 */
	EClass getIfExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.IfExpression#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see org.eclipselabs.damos.mscript.IfExpression#isStatic()
	 * @see #getIfExpression()
	 * @generated
	 */
	EAttribute getIfExpression_Static();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.IfExpression#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclipselabs.damos.mscript.IfExpression#getCondition()
	 * @see #getIfExpression()
	 * @generated
	 */
	EReference getIfExpression_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.IfExpression#getThenExpression <em>Then Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.IfExpression#getThenExpression()
	 * @see #getIfExpression()
	 * @generated
	 */
	EReference getIfExpression_ThenExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.IfExpression#getElseExpression <em>Else Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.IfExpression#getElseExpression()
	 * @see #getIfExpression()
	 * @generated
	 */
	EReference getIfExpression_ElseExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.SwitchExpression <em>Switch Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.SwitchExpression
	 * @generated
	 */
	EClass getSwitchExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.SwitchExpression#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see org.eclipselabs.damos.mscript.SwitchExpression#isStatic()
	 * @see #getSwitchExpression()
	 * @generated
	 */
	EAttribute getSwitchExpression_Static();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.SwitchExpression#getControlExpression <em>Control Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Control Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.SwitchExpression#getControlExpression()
	 * @see #getSwitchExpression()
	 * @generated
	 */
	EReference getSwitchExpression_ControlExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.damos.mscript.SwitchExpression#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see org.eclipselabs.damos.mscript.SwitchExpression#getCases()
	 * @see #getSwitchExpression()
	 * @generated
	 */
	EReference getSwitchExpression_Cases();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.SwitchExpression#getDefaultExpression <em>Default Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.SwitchExpression#getDefaultExpression()
	 * @see #getSwitchExpression()
	 * @generated
	 */
	EReference getSwitchExpression_DefaultExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.SwitchCase <em>Switch Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Case</em>'.
	 * @see org.eclipselabs.damos.mscript.SwitchCase
	 * @generated
	 */
	EClass getSwitchCase();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.SwitchCase#getCaseExpression <em>Case Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Case Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.SwitchCase#getCaseExpression()
	 * @see #getSwitchCase()
	 * @generated
	 */
	EReference getSwitchCase_CaseExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.SwitchCase#getResultExpression <em>Result Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.SwitchCase#getResultExpression()
	 * @see #getSwitchCase()
	 * @generated
	 */
	EReference getSwitchCase_ResultExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.ArrayElementAccess <em>Array Element Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Element Access</em>'.
	 * @see org.eclipselabs.damos.mscript.ArrayElementAccess
	 * @generated
	 */
	EClass getArrayElementAccess();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.ArrayElementAccess#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Array</em>'.
	 * @see org.eclipselabs.damos.mscript.ArrayElementAccess#getArray()
	 * @see #getArrayElementAccess()
	 * @generated
	 */
	EReference getArrayElementAccess_Array();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.damos.mscript.ArrayElementAccess#getSubscripts <em>Subscripts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subscripts</em>'.
	 * @see org.eclipselabs.damos.mscript.ArrayElementAccess#getSubscripts()
	 * @see #getArrayElementAccess()
	 * @generated
	 */
	EReference getArrayElementAccess_Subscripts();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.ArraySubscript <em>Array Subscript</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Subscript</em>'.
	 * @see org.eclipselabs.damos.mscript.ArraySubscript
	 * @generated
	 */
	EClass getArraySubscript();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.ArraySubscript#isSlice <em>Slice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slice</em>'.
	 * @see org.eclipselabs.damos.mscript.ArraySubscript#isSlice()
	 * @see #getArraySubscript()
	 * @generated
	 */
	EAttribute getArraySubscript_Slice();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.ArraySubscript#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.ArraySubscript#getExpression()
	 * @see #getArraySubscript()
	 * @generated
	 */
	EReference getArraySubscript_Expression();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.IterationCall <em>Iteration Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iteration Call</em>'.
	 * @see org.eclipselabs.damos.mscript.IterationCall
	 * @generated
	 */
	EClass getIterationCall();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.IterationCall#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.eclipselabs.damos.mscript.IterationCall#getTarget()
	 * @see #getIterationCall()
	 * @generated
	 */
	EReference getIterationCall_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.IterationCall#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipselabs.damos.mscript.IterationCall#getIdentifier()
	 * @see #getIterationCall()
	 * @generated
	 */
	EAttribute getIterationCall_Identifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.damos.mscript.IterationCall#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see org.eclipselabs.damos.mscript.IterationCall#getVariables()
	 * @see #getIterationCall()
	 * @generated
	 */
	EReference getIterationCall_Variables();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.IterationCall#getAccumulator <em>Accumulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Accumulator</em>'.
	 * @see org.eclipselabs.damos.mscript.IterationCall#getAccumulator()
	 * @see #getIterationCall()
	 * @generated
	 */
	EReference getIterationCall_Accumulator();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.IterationCall#getBreakCondition <em>Break Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Break Condition</em>'.
	 * @see org.eclipselabs.damos.mscript.IterationCall#getBreakCondition()
	 * @see #getIterationCall()
	 * @generated
	 */
	EReference getIterationCall_BreakCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.IterationCall#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.IterationCall#getExpression()
	 * @see #getIterationCall()
	 * @generated
	 */
	EReference getIterationCall_Expression();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.IterationVariable <em>Iteration Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iteration Variable</em>'.
	 * @see org.eclipselabs.damos.mscript.IterationVariable
	 * @generated
	 */
	EClass getIterationVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.IterationVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipselabs.damos.mscript.IterationVariable#getName()
	 * @see #getIterationVariable()
	 * @generated
	 */
	EAttribute getIterationVariable_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.IterationAccumulator <em>Iteration Accumulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iteration Accumulator</em>'.
	 * @see org.eclipselabs.damos.mscript.IterationAccumulator
	 * @generated
	 */
	EClass getIterationAccumulator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.IterationAccumulator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipselabs.damos.mscript.IterationAccumulator#getName()
	 * @see #getIterationAccumulator()
	 * @generated
	 */
	EAttribute getIterationAccumulator_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.IterationAccumulator#getInitializer <em>Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initializer</em>'.
	 * @see org.eclipselabs.damos.mscript.IterationAccumulator#getInitializer()
	 * @see #getIterationAccumulator()
	 * @generated
	 */
	EReference getIterationAccumulator_Initializer();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.DerivativeOperator <em>Derivative Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derivative Operator</em>'.
	 * @see org.eclipselabs.damos.mscript.DerivativeOperator
	 * @generated
	 */
	EClass getDerivativeOperator();

	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.damos.mscript.DerivativeOperator#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see org.eclipselabs.damos.mscript.DerivativeOperator#getVariable()
	 * @see #getDerivativeOperator()
	 * @generated
	 */
	EReference getDerivativeOperator_Variable();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.ArrayConstructionOperator <em>Array Construction Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Construction Operator</em>'.
	 * @see org.eclipselabs.damos.mscript.ArrayConstructionOperator
	 * @generated
	 */
	EClass getArrayConstructionOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.damos.mscript.ArrayConstructionOperator#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see org.eclipselabs.damos.mscript.ArrayConstructionOperator#getExpressions()
	 * @see #getArrayConstructionOperator()
	 * @generated
	 */
	EReference getArrayConstructionOperator_Expressions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.damos.mscript.ArrayConstructionOperator#getIterationClauses <em>Iteration Clauses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Iteration Clauses</em>'.
	 * @see org.eclipselabs.damos.mscript.ArrayConstructionOperator#getIterationClauses()
	 * @see #getArrayConstructionOperator()
	 * @generated
	 */
	EReference getArrayConstructionOperator_IterationClauses();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.ArrayConstructionIterationClause <em>Array Construction Iteration Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Construction Iteration Clause</em>'.
	 * @see org.eclipselabs.damos.mscript.ArrayConstructionIterationClause
	 * @generated
	 */
	EClass getArrayConstructionIterationClause();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.ArrayConstructionIterationClause#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see org.eclipselabs.damos.mscript.ArrayConstructionIterationClause#getVariableName()
	 * @see #getArrayConstructionIterationClause()
	 * @generated
	 */
	EAttribute getArrayConstructionIterationClause_VariableName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.ArrayConstructionIterationClause#getCollectionExpression <em>Collection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collection Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.ArrayConstructionIterationClause#getCollectionExpression()
	 * @see #getArrayConstructionIterationClause()
	 * @generated
	 */
	EReference getArrayConstructionIterationClause_CollectionExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.ArrayConcatenationOperator <em>Array Concatenation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Concatenation Operator</em>'.
	 * @see org.eclipselabs.damos.mscript.ArrayConcatenationOperator
	 * @generated
	 */
	EClass getArrayConcatenationOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.damos.mscript.ArrayConcatenationOperator#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see org.eclipselabs.damos.mscript.ArrayConcatenationOperator#getRows()
	 * @see #getArrayConcatenationOperator()
	 * @generated
	 */
	EReference getArrayConcatenationOperator_Rows();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.ExpressionList <em>Expression List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression List</em>'.
	 * @see org.eclipselabs.damos.mscript.ExpressionList
	 * @generated
	 */
	EClass getExpressionList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.damos.mscript.ExpressionList#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see org.eclipselabs.damos.mscript.ExpressionList#getExpressions()
	 * @see #getExpressionList()
	 * @generated
	 */
	EReference getExpressionList_Expressions();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.UnitConstructionOperator <em>Unit Construction Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Construction Operator</em>'.
	 * @see org.eclipselabs.damos.mscript.UnitConstructionOperator
	 * @generated
	 */
	EClass getUnitConstructionOperator();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.UnitConstructionOperator#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see org.eclipselabs.damos.mscript.UnitConstructionOperator#getUnit()
	 * @see #getUnitConstructionOperator()
	 * @generated
	 */
	EReference getUnitConstructionOperator_Unit();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.ParenthesizedExpression <em>Parenthesized Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parenthesized Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.ParenthesizedExpression
	 * @generated
	 */
	EClass getParenthesizedExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.damos.mscript.ParenthesizedExpression#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see org.eclipselabs.damos.mscript.ParenthesizedExpression#getExpressions()
	 * @see #getParenthesizedExpression()
	 * @generated
	 */
	EReference getParenthesizedExpression_Expressions();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.EndExpression <em>End Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.EndExpression
	 * @generated
	 */
	EClass getEndExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.RangeExpression <em>Range Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.RangeExpression
	 * @generated
	 */
	EClass getRangeExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.damos.mscript.RangeExpression#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see org.eclipselabs.damos.mscript.RangeExpression#getOperands()
	 * @see #getRangeExpression()
	 * @generated
	 */
	EReference getRangeExpression_Operands();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.ImpliesExpression <em>Implies Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implies Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.ImpliesExpression
	 * @generated
	 */
	EClass getImpliesExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.ImpliesExpression#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see org.eclipselabs.damos.mscript.ImpliesExpression#getLeftOperand()
	 * @see #getImpliesExpression()
	 * @generated
	 */
	EReference getImpliesExpression_LeftOperand();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.ImpliesExpression#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see org.eclipselabs.damos.mscript.ImpliesExpression#getRightOperand()
	 * @see #getImpliesExpression()
	 * @generated
	 */
	EReference getImpliesExpression_RightOperand();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.LogicalOrExpression <em>Logical Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Or Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.LogicalOrExpression
	 * @generated
	 */
	EClass getLogicalOrExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.LogicalOrExpression#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see org.eclipselabs.damos.mscript.LogicalOrExpression#getLeftOperand()
	 * @see #getLogicalOrExpression()
	 * @generated
	 */
	EReference getLogicalOrExpression_LeftOperand();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.LogicalOrExpression#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see org.eclipselabs.damos.mscript.LogicalOrExpression#getRightOperand()
	 * @see #getLogicalOrExpression()
	 * @generated
	 */
	EReference getLogicalOrExpression_RightOperand();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.LogicalAndExpression <em>Logical And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical And Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.LogicalAndExpression
	 * @generated
	 */
	EClass getLogicalAndExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.LogicalAndExpression#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see org.eclipselabs.damos.mscript.LogicalAndExpression#getLeftOperand()
	 * @see #getLogicalAndExpression()
	 * @generated
	 */
	EReference getLogicalAndExpression_LeftOperand();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.LogicalAndExpression#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see org.eclipselabs.damos.mscript.LogicalAndExpression#getRightOperand()
	 * @see #getLogicalAndExpression()
	 * @generated
	 */
	EReference getLogicalAndExpression_RightOperand();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.EqualityExpression <em>Equality Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equality Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.EqualityExpression
	 * @generated
	 */
	EClass getEqualityExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.EqualityExpression#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see org.eclipselabs.damos.mscript.EqualityExpression#getLeftOperand()
	 * @see #getEqualityExpression()
	 * @generated
	 */
	EReference getEqualityExpression_LeftOperand();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.EqualityExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.eclipselabs.damos.mscript.EqualityExpression#getOperator()
	 * @see #getEqualityExpression()
	 * @generated
	 */
	EAttribute getEqualityExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.EqualityExpression#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see org.eclipselabs.damos.mscript.EqualityExpression#getRightOperand()
	 * @see #getEqualityExpression()
	 * @generated
	 */
	EReference getEqualityExpression_RightOperand();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.RelationalExpression <em>Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.RelationalExpression
	 * @generated
	 */
	EClass getRelationalExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.RelationalExpression#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see org.eclipselabs.damos.mscript.RelationalExpression#getLeftOperand()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	EReference getRelationalExpression_LeftOperand();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.RelationalExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.eclipselabs.damos.mscript.RelationalExpression#getOperator()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	EAttribute getRelationalExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.RelationalExpression#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see org.eclipselabs.damos.mscript.RelationalExpression#getRightOperand()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	EReference getRelationalExpression_RightOperand();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.TypeTestExpression <em>Type Test Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Test Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.TypeTestExpression
	 * @generated
	 */
	EClass getTypeTestExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.TypeTestExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.TypeTestExpression#getExpression()
	 * @see #getTypeTestExpression()
	 * @generated
	 */
	EReference getTypeTestExpression_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.TypeTestExpression#getTypeSpecifier <em>Type Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Specifier</em>'.
	 * @see org.eclipselabs.damos.mscript.TypeTestExpression#getTypeSpecifier()
	 * @see #getTypeTestExpression()
	 * @generated
	 */
	EReference getTypeTestExpression_TypeSpecifier();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.AdditiveExpression <em>Additive Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additive Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.AdditiveExpression
	 * @generated
	 */
	EClass getAdditiveExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.AdditiveExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.eclipselabs.damos.mscript.AdditiveExpression#getOperator()
	 * @see #getAdditiveExpression()
	 * @generated
	 */
	EAttribute getAdditiveExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.AdditiveExpression#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see org.eclipselabs.damos.mscript.AdditiveExpression#getLeftOperand()
	 * @see #getAdditiveExpression()
	 * @generated
	 */
	EReference getAdditiveExpression_LeftOperand();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.AdditiveExpression#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see org.eclipselabs.damos.mscript.AdditiveExpression#getRightOperand()
	 * @see #getAdditiveExpression()
	 * @generated
	 */
	EReference getAdditiveExpression_RightOperand();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.MultiplicativeExpression <em>Multiplicative Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicative Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.MultiplicativeExpression
	 * @generated
	 */
	EClass getMultiplicativeExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.MultiplicativeExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.eclipselabs.damos.mscript.MultiplicativeExpression#getOperator()
	 * @see #getMultiplicativeExpression()
	 * @generated
	 */
	EAttribute getMultiplicativeExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.MultiplicativeExpression#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see org.eclipselabs.damos.mscript.MultiplicativeExpression#getLeftOperand()
	 * @see #getMultiplicativeExpression()
	 * @generated
	 */
	EReference getMultiplicativeExpression_LeftOperand();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.MultiplicativeExpression#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see org.eclipselabs.damos.mscript.MultiplicativeExpression#getRightOperand()
	 * @see #getMultiplicativeExpression()
	 * @generated
	 */
	EReference getMultiplicativeExpression_RightOperand();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.PowerExpression <em>Power Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.PowerExpression
	 * @generated
	 */
	EClass getPowerExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.PowerExpression#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see org.eclipselabs.damos.mscript.PowerExpression#getOperand()
	 * @see #getPowerExpression()
	 * @generated
	 */
	EReference getPowerExpression_Operand();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.PowerExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.eclipselabs.damos.mscript.PowerExpression#getOperator()
	 * @see #getPowerExpression()
	 * @generated
	 */
	EAttribute getPowerExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.PowerExpression#getExponent <em>Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exponent</em>'.
	 * @see org.eclipselabs.damos.mscript.PowerExpression#getExponent()
	 * @see #getPowerExpression()
	 * @generated
	 */
	EReference getPowerExpression_Exponent();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.UnaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.eclipselabs.damos.mscript.UnaryExpression#getOperator()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EAttribute getUnaryExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.UnaryExpression#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see org.eclipselabs.damos.mscript.UnaryExpression#getOperand()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Operand();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.PostfixExpression <em>Postfix Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postfix Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.PostfixExpression
	 * @generated
	 */
	EClass getPostfixExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.PostfixExpression#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see org.eclipselabs.damos.mscript.PostfixExpression#getOperand()
	 * @see #getPostfixExpression()
	 * @generated
	 */
	EReference getPostfixExpression_Operand();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.PostfixExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.eclipselabs.damos.mscript.PostfixExpression#getOperator()
	 * @see #getPostfixExpression()
	 * @generated
	 */
	EAttribute getPostfixExpression_Operator();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.FeatureCall <em>Feature Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Call</em>'.
	 * @see org.eclipselabs.damos.mscript.FeatureCall
	 * @generated
	 */
	EClass getFeatureCall();

	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.damos.mscript.FeatureCall#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.eclipselabs.damos.mscript.FeatureCall#getFeature()
	 * @see #getFeatureCall()
	 * @generated
	 */
	EReference getFeatureCall_Feature();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.VariableAccess <em>Variable Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Access</em>'.
	 * @see org.eclipselabs.damos.mscript.VariableAccess
	 * @generated
	 */
	EClass getVariableAccess();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.VariableAccess#getStepExpression <em>Step Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Step Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.VariableAccess#getStepExpression()
	 * @see #getVariableAccess()
	 * @generated
	 */
	EReference getVariableAccess_StepExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.StepExpression <em>Step Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.StepExpression
	 * @generated
	 */
	EClass getStepExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.RangeStepExpression <em>Range Step Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Step Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.RangeStepExpression
	 * @generated
	 */
	EClass getRangeStepExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.RangeStepExpression#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see org.eclipselabs.damos.mscript.RangeStepExpression#getStart()
	 * @see #getRangeStepExpression()
	 * @generated
	 */
	EReference getRangeStepExpression_Start();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.RangeStepExpression#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see org.eclipselabs.damos.mscript.RangeStepExpression#getEnd()
	 * @see #getRangeStepExpression()
	 * @generated
	 */
	EReference getRangeStepExpression_End();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.AdditiveStepExpression <em>Additive Step Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additive Step Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.AdditiveStepExpression
	 * @generated
	 */
	EClass getAdditiveStepExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.AdditiveStepExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.eclipselabs.damos.mscript.AdditiveStepExpression#getOperator()
	 * @see #getAdditiveStepExpression()
	 * @generated
	 */
	EAttribute getAdditiveStepExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.AdditiveStepExpression#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see org.eclipselabs.damos.mscript.AdditiveStepExpression#getLeftOperand()
	 * @see #getAdditiveStepExpression()
	 * @generated
	 */
	EReference getAdditiveStepExpression_LeftOperand();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.AdditiveStepExpression#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see org.eclipselabs.damos.mscript.AdditiveStepExpression#getRightOperand()
	 * @see #getAdditiveStepExpression()
	 * @generated
	 */
	EReference getAdditiveStepExpression_RightOperand();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.NegateStepExpression <em>Negate Step Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negate Step Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.NegateStepExpression
	 * @generated
	 */
	EClass getNegateStepExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.NegateStepExpression#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see org.eclipselabs.damos.mscript.NegateStepExpression#getOperand()
	 * @see #getNegateStepExpression()
	 * @generated
	 */
	EReference getNegateStepExpression_Operand();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.PrimitiveStepExpression <em>Primitive Step Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Step Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.PrimitiveStepExpression
	 * @generated
	 */
	EClass getPrimitiveStepExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.StepLiteral <em>Step Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Literal</em>'.
	 * @see org.eclipselabs.damos.mscript.StepLiteral
	 * @generated
	 */
	EClass getStepLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.StepLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipselabs.damos.mscript.StepLiteral#getValue()
	 * @see #getStepLiteral()
	 * @generated
	 */
	EAttribute getStepLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.StepN <em>Step N</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step N</em>'.
	 * @see org.eclipselabs.damos.mscript.StepN
	 * @generated
	 */
	EClass getStepN();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.FunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Call</em>'.
	 * @see org.eclipselabs.damos.mscript.FunctionCall
	 * @generated
	 */
	EClass getFunctionCall();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.damos.mscript.FunctionCall#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see org.eclipselabs.damos.mscript.FunctionCall#getArguments()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EReference getFunctionCall_Arguments();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.MemberVariableAccess <em>Member Variable Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member Variable Access</em>'.
	 * @see org.eclipselabs.damos.mscript.MemberVariableAccess
	 * @generated
	 */
	EClass getMemberVariableAccess();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.MemberVariableAccess#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.eclipselabs.damos.mscript.MemberVariableAccess#getTarget()
	 * @see #getMemberVariableAccess()
	 * @generated
	 */
	EReference getMemberVariableAccess_Target();

	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.damos.mscript.MemberVariableAccess#getMemberVariable <em>Member Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member Variable</em>'.
	 * @see org.eclipselabs.damos.mscript.MemberVariableAccess#getMemberVariable()
	 * @see #getMemberVariableAccess()
	 * @generated
	 */
	EReference getMemberVariableAccess_MemberVariable();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.AlgorithmExpression <em>Algorithm Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algorithm Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.AlgorithmExpression
	 * @generated
	 */
	EClass getAlgorithmExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.AlgorithmExpression#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.eclipselabs.damos.mscript.AlgorithmExpression#getBody()
	 * @see #getAlgorithmExpression()
	 * @generated
	 */
	EReference getAlgorithmExpression_Body();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.Compound <em>Compound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound</em>'.
	 * @see org.eclipselabs.damos.mscript.Compound
	 * @generated
	 */
	EClass getCompound();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.damos.mscript.Compound#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see org.eclipselabs.damos.mscript.Compound#getStatements()
	 * @see #getCompound()
	 * @generated
	 */
	EReference getCompound_Statements();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see org.eclipselabs.damos.mscript.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see org.eclipselabs.damos.mscript.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.Assignment#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.eclipselabs.damos.mscript.Assignment#getTarget()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Target();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.Assignment#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.Assignment#getExpression()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Expression();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration</em>'.
	 * @see org.eclipselabs.damos.mscript.VariableDeclaration
	 * @generated
	 */
	EClass getVariableDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.VariableDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipselabs.damos.mscript.VariableDeclaration#getName()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EAttribute getVariableDeclaration_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.VariableDeclaration#getInitializer <em>Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initializer</em>'.
	 * @see org.eclipselabs.damos.mscript.VariableDeclaration#getInitializer()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EReference getVariableDeclaration_Initializer();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Statement</em>'.
	 * @see org.eclipselabs.damos.mscript.IfStatement
	 * @generated
	 */
	EClass getIfStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.IfStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclipselabs.damos.mscript.IfStatement#getCondition()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.IfStatement#getThenStatement <em>Then Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then Statement</em>'.
	 * @see org.eclipselabs.damos.mscript.IfStatement#getThenStatement()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_ThenStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.IfStatement#getElseStatement <em>Else Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Statement</em>'.
	 * @see org.eclipselabs.damos.mscript.IfStatement#getElseStatement()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_ElseStatement();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.WhileStatement <em>While Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Statement</em>'.
	 * @see org.eclipselabs.damos.mscript.WhileStatement
	 * @generated
	 */
	EClass getWhileStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.WhileStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclipselabs.damos.mscript.WhileStatement#getCondition()
	 * @see #getWhileStatement()
	 * @generated
	 */
	EReference getWhileStatement_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.WhileStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.eclipselabs.damos.mscript.WhileStatement#getBody()
	 * @see #getWhileStatement()
	 * @generated
	 */
	EReference getWhileStatement_Body();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.DoWhileStatement <em>Do While Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Do While Statement</em>'.
	 * @see org.eclipselabs.damos.mscript.DoWhileStatement
	 * @generated
	 */
	EClass getDoWhileStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.DoWhileStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclipselabs.damos.mscript.DoWhileStatement#getCondition()
	 * @see #getDoWhileStatement()
	 * @generated
	 */
	EReference getDoWhileStatement_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.DoWhileStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.eclipselabs.damos.mscript.DoWhileStatement#getBody()
	 * @see #getDoWhileStatement()
	 * @generated
	 */
	EReference getDoWhileStatement_Body();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.ForStatement <em>For Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Statement</em>'.
	 * @see org.eclipselabs.damos.mscript.ForStatement
	 * @generated
	 */
	EClass getForStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.ForStatement#getDeclaredIterationVariable <em>Declared Iteration Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Declared Iteration Variable</em>'.
	 * @see org.eclipselabs.damos.mscript.ForStatement#getDeclaredIterationVariable()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_DeclaredIterationVariable();

	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.damos.mscript.ForStatement#getIterationVariable <em>Iteration Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Iteration Variable</em>'.
	 * @see org.eclipselabs.damos.mscript.ForStatement#getIterationVariable()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_IterationVariable();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.ForStatement#getCollectionExpression <em>Collection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collection Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.ForStatement#getCollectionExpression()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_CollectionExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.ForStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclipselabs.damos.mscript.ForStatement#getCondition()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.ForStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.eclipselabs.damos.mscript.ForStatement#getBody()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_Body();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.ContinueStatement <em>Continue Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continue Statement</em>'.
	 * @see org.eclipselabs.damos.mscript.ContinueStatement
	 * @generated
	 */
	EClass getContinueStatement();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.BreakStatement <em>Break Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Break Statement</em>'.
	 * @see org.eclipselabs.damos.mscript.BreakStatement
	 * @generated
	 */
	EClass getBreakStatement();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.ReturnStatement <em>Return Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Statement</em>'.
	 * @see org.eclipselabs.damos.mscript.ReturnStatement
	 * @generated
	 */
	EClass getReturnStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.ReturnStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.ReturnStatement#getExpression()
	 * @see #getReturnStatement()
	 * @generated
	 */
	EReference getReturnStatement_Expression();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.BuiltinDefinition <em>Builtin Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Builtin Definition</em>'.
	 * @see org.eclipselabs.damos.mscript.BuiltinDefinition
	 * @generated
	 */
	EClass getBuiltinDefinition();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.BuiltinFunction <em>Builtin Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Builtin Function</em>'.
	 * @see org.eclipselabs.damos.mscript.BuiltinFunction
	 * @generated
	 */
	EClass getBuiltinFunction();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.BuiltinVariable <em>Builtin Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Builtin Variable</em>'.
	 * @see org.eclipselabs.damos.mscript.BuiltinVariable
	 * @generated
	 */
	EClass getBuiltinVariable();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see org.eclipselabs.damos.mscript.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.InvalidDataType <em>Invalid Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invalid Data Type</em>'.
	 * @see org.eclipselabs.damos.mscript.InvalidDataType
	 * @generated
	 */
	EClass getInvalidDataType();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.AnyDataType <em>Any Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Data Type</em>'.
	 * @see org.eclipselabs.damos.mscript.AnyDataType
	 * @generated
	 */
	EClass getAnyDataType();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.UnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Type</em>'.
	 * @see org.eclipselabs.damos.mscript.UnitType
	 * @generated
	 */
	EClass getUnitType();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see org.eclipselabs.damos.mscript.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.NumericType <em>Numeric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Type</em>'.
	 * @see org.eclipselabs.damos.mscript.NumericType
	 * @generated
	 */
	EClass getNumericType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.NumericType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see org.eclipselabs.damos.mscript.NumericType#getUnit()
	 * @see #getNumericType()
	 * @generated
	 */
	EReference getNumericType_Unit();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.RealType <em>Real Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Type</em>'.
	 * @see org.eclipselabs.damos.mscript.RealType
	 * @generated
	 */
	EClass getRealType();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.IntegerType <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Type</em>'.
	 * @see org.eclipselabs.damos.mscript.IntegerType
	 * @generated
	 */
	EClass getIntegerType();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.ComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Type</em>'.
	 * @see org.eclipselabs.damos.mscript.ComplexType
	 * @generated
	 */
	EClass getComplexType();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.GaussianType <em>Gaussian Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gaussian Type</em>'.
	 * @see org.eclipselabs.damos.mscript.GaussianType
	 * @generated
	 */
	EClass getGaussianType();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Type</em>'.
	 * @see org.eclipselabs.damos.mscript.BooleanType
	 * @generated
	 */
	EClass getBooleanType();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Type</em>'.
	 * @see org.eclipselabs.damos.mscript.StringType
	 * @generated
	 */
	EClass getStringType();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.ArrayType <em>Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Type</em>'.
	 * @see org.eclipselabs.damos.mscript.ArrayType
	 * @generated
	 */
	EClass getArrayType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.damos.mscript.ArrayType#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Type</em>'.
	 * @see org.eclipselabs.damos.mscript.ArrayType#getElementType()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_ElementType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.ArrayType#getDefinedElementType <em>Defined Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Defined Element Type</em>'.
	 * @see org.eclipselabs.damos.mscript.ArrayType#getDefinedElementType()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_DefinedElementType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.damos.mscript.ArrayType#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimensions</em>'.
	 * @see org.eclipselabs.damos.mscript.ArrayType#getDimensions()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_Dimensions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.ArrayType#getDimensionality <em>Dimensionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimensionality</em>'.
	 * @see org.eclipselabs.damos.mscript.ArrayType#getDimensionality()
	 * @see #getArrayType()
	 * @generated
	 */
	EAttribute getArrayType_Dimensionality();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.ArrayType#isDimensional <em>Dimensional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimensional</em>'.
	 * @see org.eclipselabs.damos.mscript.ArrayType#isDimensional()
	 * @see #getArrayType()
	 * @generated
	 */
	EAttribute getArrayType_Dimensional();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.ArrayType#isMultidimensional <em>Multidimensional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multidimensional</em>'.
	 * @see org.eclipselabs.damos.mscript.ArrayType#isMultidimensional()
	 * @see #getArrayType()
	 * @generated
	 */
	EAttribute getArrayType_Multidimensional();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.TensorType <em>Tensor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tensor Type</em>'.
	 * @see org.eclipselabs.damos.mscript.TensorType
	 * @generated
	 */
	EClass getTensorType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.TensorType#isVector <em>Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vector</em>'.
	 * @see org.eclipselabs.damos.mscript.TensorType#isVector()
	 * @see #getTensorType()
	 * @generated
	 */
	EAttribute getTensorType_Vector();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.TensorType#isMatrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matrix</em>'.
	 * @see org.eclipselabs.damos.mscript.TensorType#isMatrix()
	 * @see #getTensorType()
	 * @generated
	 */
	EAttribute getTensorType_Matrix();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.ArrayDimension <em>Array Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Dimension</em>'.
	 * @see org.eclipselabs.damos.mscript.ArrayDimension
	 * @generated
	 */
	EClass getArrayDimension();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.ArrayDimension#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see org.eclipselabs.damos.mscript.ArrayDimension#getSize()
	 * @see #getArrayDimension()
	 * @generated
	 */
	EReference getArrayDimension_Size();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.eclipselabs.damos.mscript.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see org.eclipselabs.damos.mscript.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.Unit#getNumerator <em>Numerator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Numerator</em>'.
	 * @see org.eclipselabs.damos.mscript.Unit#getNumerator()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Numerator();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.Unit#getDenominator <em>Denominator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Denominator</em>'.
	 * @see org.eclipselabs.damos.mscript.Unit#getDenominator()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Denominator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.Unit#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.eclipselabs.damos.mscript.Unit#getScale()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Scale();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.Unit#isWildcard <em>Wildcard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wildcard</em>'.
	 * @see org.eclipselabs.damos.mscript.Unit#isWildcard()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Wildcard();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.UnitProduct <em>Unit Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Product</em>'.
	 * @see org.eclipselabs.damos.mscript.UnitProduct
	 * @generated
	 */
	EClass getUnitProduct();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.damos.mscript.UnitProduct#getFactors <em>Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Factors</em>'.
	 * @see org.eclipselabs.damos.mscript.UnitProduct#getFactors()
	 * @see #getUnitProduct()
	 * @generated
	 */
	EReference getUnitProduct_Factors();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.UnitNumerator <em>Unit Numerator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Numerator</em>'.
	 * @see org.eclipselabs.damos.mscript.UnitNumerator
	 * @generated
	 */
	EClass getUnitNumerator();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.UnitDenominator <em>Unit Denominator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Denominator</em>'.
	 * @see org.eclipselabs.damos.mscript.UnitDenominator
	 * @generated
	 */
	EClass getUnitDenominator();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.UnitFactor <em>Unit Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Factor</em>'.
	 * @see org.eclipselabs.damos.mscript.UnitFactor
	 * @generated
	 */
	EClass getUnitFactor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.UnitFactor#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see org.eclipselabs.damos.mscript.UnitFactor#getSymbol()
	 * @see #getUnitFactor()
	 * @generated
	 */
	EAttribute getUnitFactor_Symbol();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.UnitFactor#getExponent <em>Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exponent</em>'.
	 * @see org.eclipselabs.damos.mscript.UnitFactor#getExponent()
	 * @see #getUnitFactor()
	 * @generated
	 */
	EAttribute getUnitFactor_Exponent();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see org.eclipselabs.damos.mscript.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.NumericLiteral <em>Numeric Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Literal</em>'.
	 * @see org.eclipselabs.damos.mscript.NumericLiteral
	 * @generated
	 */
	EClass getNumericLiteral();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.damos.mscript.NumericLiteral#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see org.eclipselabs.damos.mscript.NumericLiteral#getUnit()
	 * @see #getNumericLiteral()
	 * @generated
	 */
	EReference getNumericLiteral_Unit();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.RealLiteral <em>Real Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Literal</em>'.
	 * @see org.eclipselabs.damos.mscript.RealLiteral
	 * @generated
	 */
	EClass getRealLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.RealLiteral#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see org.eclipselabs.damos.mscript.RealLiteral#getData()
	 * @see #getRealLiteral()
	 * @generated
	 */
	EAttribute getRealLiteral_Data();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.RealLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipselabs.damos.mscript.RealLiteral#getValue()
	 * @see #getRealLiteral()
	 * @generated
	 */
	EAttribute getRealLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.IntegerLiteral <em>Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Literal</em>'.
	 * @see org.eclipselabs.damos.mscript.IntegerLiteral
	 * @generated
	 */
	EClass getIntegerLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.IntegerLiteral#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see org.eclipselabs.damos.mscript.IntegerLiteral#getData()
	 * @see #getIntegerLiteral()
	 * @generated
	 */
	EAttribute getIntegerLiteral_Data();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.IntegerLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipselabs.damos.mscript.IntegerLiteral#getValue()
	 * @see #getIntegerLiteral()
	 * @generated
	 */
	EAttribute getIntegerLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal</em>'.
	 * @see org.eclipselabs.damos.mscript.BooleanLiteral
	 * @generated
	 */
	EClass getBooleanLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.BooleanLiteral#isTrue <em>True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>True</em>'.
	 * @see org.eclipselabs.damos.mscript.BooleanLiteral#isTrue()
	 * @see #getBooleanLiteral()
	 * @generated
	 */
	EAttribute getBooleanLiteral_True();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.damos.mscript.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see org.eclipselabs.damos.mscript.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.damos.mscript.StringLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipselabs.damos.mscript.StringLiteral#getValue()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EAttribute getStringLiteral_Value();

	/**
	 * Returns the meta object for enum '{@link org.eclipselabs.damos.mscript.FunctionKind <em>Function Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Function Kind</em>'.
	 * @see org.eclipselabs.damos.mscript.FunctionKind
	 * @generated
	 */
	EEnum getFunctionKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipselabs.damos.mscript.AssertionStatusKind <em>Assertion Status Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Assertion Status Kind</em>'.
	 * @see org.eclipselabs.damos.mscript.AssertionStatusKind
	 * @generated
	 */
	EEnum getAssertionStatusKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipselabs.damos.mscript.EqualityOperator <em>Equality Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Equality Operator</em>'.
	 * @see org.eclipselabs.damos.mscript.EqualityOperator
	 * @generated
	 */
	EEnum getEqualityOperator();

	/**
	 * Returns the meta object for enum '{@link org.eclipselabs.damos.mscript.RelationalOperator <em>Relational Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relational Operator</em>'.
	 * @see org.eclipselabs.damos.mscript.RelationalOperator
	 * @generated
	 */
	EEnum getRelationalOperator();

	/**
	 * Returns the meta object for enum '{@link org.eclipselabs.damos.mscript.AdditiveOperator <em>Additive Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Additive Operator</em>'.
	 * @see org.eclipselabs.damos.mscript.AdditiveOperator
	 * @generated
	 */
	EEnum getAdditiveOperator();

	/**
	 * Returns the meta object for enum '{@link org.eclipselabs.damos.mscript.MultiplicativeOperator <em>Multiplicative Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiplicative Operator</em>'.
	 * @see org.eclipselabs.damos.mscript.MultiplicativeOperator
	 * @generated
	 */
	EEnum getMultiplicativeOperator();

	/**
	 * Returns the meta object for enum '{@link org.eclipselabs.damos.mscript.PowerOperator <em>Power Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Power Operator</em>'.
	 * @see org.eclipselabs.damos.mscript.PowerOperator
	 * @generated
	 */
	EEnum getPowerOperator();

	/**
	 * Returns the meta object for enum '{@link org.eclipselabs.damos.mscript.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unary Operator</em>'.
	 * @see org.eclipselabs.damos.mscript.UnaryOperator
	 * @generated
	 */
	EEnum getUnaryOperator();

	/**
	 * Returns the meta object for enum '{@link org.eclipselabs.damos.mscript.PostfixOperator <em>Postfix Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Postfix Operator</em>'.
	 * @see org.eclipselabs.damos.mscript.PostfixOperator
	 * @generated
	 */
	EEnum getPostfixOperator();

	/**
	 * Returns the meta object for enum '{@link org.eclipselabs.damos.mscript.OperatorKind <em>Operator Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator Kind</em>'.
	 * @see org.eclipselabs.damos.mscript.OperatorKind
	 * @generated
	 */
	EEnum getOperatorKind();

	/**
	 * Returns the meta object for data type '{@link org.eclipselabs.damos.mscript.RealData <em>Real Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Real Data</em>'.
	 * @see org.eclipselabs.damos.mscript.RealData
	 * @model instanceClass="org.eclipselabs.damos.mscript.RealData"
	 * @generated
	 */
	EDataType getRealData();

	/**
	 * Returns the meta object for data type '{@link org.eclipselabs.damos.mscript.IntegerData <em>Integer Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer Data</em>'.
	 * @see org.eclipselabs.damos.mscript.IntegerData
	 * @model instanceClass="org.eclipselabs.damos.mscript.IntegerData"
	 * @generated
	 */
	EDataType getIntegerData();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MscriptFactory getMscriptFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.ModuleImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__DEFINITIONS = eINSTANCE.getModule_Definitions();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.DefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.DefinitionImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getDefinition()
		 * @generated
		 */
		EClass DEFINITION = eINSTANCE.getDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITION__NAME = eINSTANCE.getDefinition_Name();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.DataTypeDefinitionImpl <em>Data Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.DataTypeDefinitionImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getDataTypeDefinition()
		 * @generated
		 */
		EClass DATA_TYPE_DEFINITION = eINSTANCE.getDataTypeDefinition();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.EnumerationDefinitionImpl <em>Enumeration Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.EnumerationDefinitionImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getEnumerationDefinition()
		 * @generated
		 */
		EClass ENUMERATION_DEFINITION = eINSTANCE.getEnumerationDefinition();

		/**
		 * The meta object literal for the '<em><b>Literal Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_DEFINITION__LITERAL_DECLARATIONS = eINSTANCE.getEnumerationDefinition_LiteralDeclarations();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.EnumerationLiteralDeclarationImpl <em>Enumeration Literal Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.EnumerationLiteralDeclarationImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getEnumerationLiteralDeclaration()
		 * @generated
		 */
		EClass ENUMERATION_LITERAL_DECLARATION = eINSTANCE.getEnumerationLiteralDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_LITERAL_DECLARATION__NAME = eINSTANCE.getEnumerationLiteralDeclaration_Name();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.TypedefDeclarationImpl <em>Typedef Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.TypedefDeclarationImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getTypedefDeclaration()
		 * @generated
		 */
		EClass TYPEDEF_DECLARATION = eINSTANCE.getTypedefDeclaration();

		/**
		 * The meta object literal for the '<em><b>Type Specifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPEDEF_DECLARATION__TYPE_SPECIFIER = eINSTANCE.getTypedefDeclaration_TypeSpecifier();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.StructDefinitionImpl <em>Struct Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.StructDefinitionImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getStructDefinition()
		 * @generated
		 */
		EClass STRUCT_DEFINITION = eINSTANCE.getStructDefinition();

		/**
		 * The meta object literal for the '<em><b>Member Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_DEFINITION__MEMBER_DECLARATIONS = eINSTANCE.getStructDefinition_MemberDeclarations();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.StructMemberDeclarationImpl <em>Struct Member Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.StructMemberDeclarationImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getStructMemberDeclaration()
		 * @generated
		 */
		EClass STRUCT_MEMBER_DECLARATION = eINSTANCE.getStructMemberDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCT_MEMBER_DECLARATION__NAME = eINSTANCE.getStructMemberDeclaration_Name();

		/**
		 * The meta object literal for the '<em><b>Type Specifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_MEMBER_DECLARATION__TYPE_SPECIFIER = eINSTANCE.getStructMemberDeclaration_TypeSpecifier();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.FunctionDefinitionImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getFunctionDefinition()
		 * @generated
		 */
		EClass FUNCTION_DEFINITION = eINSTANCE.getFunctionDefinition();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_DEFINITION__KIND = eINSTANCE.getFunctionDefinition_Kind();

		/**
		 * The meta object literal for the '<em><b>Template Parameter Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEFINITION__TEMPLATE_PARAMETER_DECLARATIONS = eINSTANCE.getFunctionDefinition_TemplateParameterDeclarations();

		/**
		 * The meta object literal for the '<em><b>Input Parameter Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEFINITION__INPUT_PARAMETER_DECLARATIONS = eINSTANCE.getFunctionDefinition_InputParameterDeclarations();

		/**
		 * The meta object literal for the '<em><b>Output Parameter Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEFINITION__OUTPUT_PARAMETER_DECLARATIONS = eINSTANCE.getFunctionDefinition_OutputParameterDeclarations();

		/**
		 * The meta object literal for the '<em><b>Checks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEFINITION__CHECKS = eINSTANCE.getFunctionDefinition_Checks();

		/**
		 * The meta object literal for the '<em><b>Assertions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEFINITION__ASSERTIONS = eINSTANCE.getFunctionDefinition_Assertions();

		/**
		 * The meta object literal for the '<em><b>Function Object Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEFINITION__FUNCTION_OBJECT_DECLARATIONS = eINSTANCE.getFunctionDefinition_FunctionObjectDeclarations();

		/**
		 * The meta object literal for the '<em><b>State Variable Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEFINITION__STATE_VARIABLE_DECLARATIONS = eINSTANCE.getFunctionDefinition_StateVariableDeclarations();

		/**
		 * The meta object literal for the '<em><b>Equations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEFINITION__EQUATIONS = eINSTANCE.getFunctionDefinition_Equations();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.CheckImpl <em>Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.CheckImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getCheck()
		 * @generated
		 */
		EClass CHECK = eINSTANCE.getCheck();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK__FUNCTION = eINSTANCE.getCheck_Function();

		/**
		 * The meta object literal for the '<em><b>Template Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK__TEMPLATE_ARGUMENTS = eINSTANCE.getCheck_TemplateArguments();

		/**
		 * The meta object literal for the '<em><b>Input Parameter Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK__INPUT_PARAMETER_TYPES = eINSTANCE.getCheck_InputParameterTypes();

		/**
		 * The meta object literal for the '<em><b>Output Parameter Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK__OUTPUT_PARAMETER_TYPES = eINSTANCE.getCheck_OutputParameterTypes();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.CallableElementImpl <em>Callable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.CallableElementImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getCallableElement()
		 * @generated
		 */
		EClass CALLABLE_ELEMENT = eINSTANCE.getCallableElement();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.ParameterDeclarationImpl <em>Parameter Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.ParameterDeclarationImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getParameterDeclaration()
		 * @generated
		 */
		EClass PARAMETER_DECLARATION = eINSTANCE.getParameterDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_DECLARATION__NAME = eINSTANCE.getParameterDeclaration_Name();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.TemplateParameterDeclarationImpl <em>Template Parameter Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.TemplateParameterDeclarationImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getTemplateParameterDeclaration()
		 * @generated
		 */
		EClass TEMPLATE_PARAMETER_DECLARATION = eINSTANCE.getTemplateParameterDeclaration();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.InputParameterDeclarationImpl <em>Input Parameter Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.InputParameterDeclarationImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getInputParameterDeclaration()
		 * @generated
		 */
		EClass INPUT_PARAMETER_DECLARATION = eINSTANCE.getInputParameterDeclaration();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.OutputParameterDeclarationImpl <em>Output Parameter Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.OutputParameterDeclarationImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getOutputParameterDeclaration()
		 * @generated
		 */
		EClass OUTPUT_PARAMETER_DECLARATION = eINSTANCE.getOutputParameterDeclaration();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.AssertionImpl <em>Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.AssertionImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getAssertion()
		 * @generated
		 */
		EClass ASSERTION = eINSTANCE.getAssertion();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTION__STATIC = eINSTANCE.getAssertion_Static();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERTION__CONDITION = eINSTANCE.getAssertion_Condition();

		/**
		 * The meta object literal for the '<em><b>Status Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTION__STATUS_KIND = eINSTANCE.getAssertion_StatusKind();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERTION__MESSAGE = eINSTANCE.getAssertion_Message();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.StateVariableDeclarationImpl <em>State Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.StateVariableDeclarationImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getStateVariableDeclaration()
		 * @generated
		 */
		EClass STATE_VARIABLE_DECLARATION = eINSTANCE.getStateVariableDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_VARIABLE_DECLARATION__NAME = eINSTANCE.getStateVariableDeclaration_Name();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.FunctionObjectDeclarationImpl <em>Function Object Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.FunctionObjectDeclarationImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getFunctionObjectDeclaration()
		 * @generated
		 */
		EClass FUNCTION_OBJECT_DECLARATION = eINSTANCE.getFunctionObjectDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_OBJECT_DECLARATION__NAME = eINSTANCE.getFunctionObjectDeclaration_Name();

		/**
		 * The meta object literal for the '<em><b>Function Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_OBJECT_DECLARATION__FUNCTION_NAME = eINSTANCE.getFunctionObjectDeclaration_FunctionName();

		/**
		 * The meta object literal for the '<em><b>Template Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_OBJECT_DECLARATION__TEMPLATE_ARGUMENTS = eINSTANCE.getFunctionObjectDeclaration_TemplateArguments();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.EquationImpl <em>Equation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.EquationImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getEquation()
		 * @generated
		 */
		EClass EQUATION = eINSTANCE.getEquation();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUATION__INITIAL = eINSTANCE.getEquation_Initial();

		/**
		 * The meta object literal for the '<em><b>Left Hand Side</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUATION__LEFT_HAND_SIDE = eINSTANCE.getEquation_LeftHandSide();

		/**
		 * The meta object literal for the '<em><b>Right Hand Side</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUATION__RIGHT_HAND_SIDE = eINSTANCE.getEquation_RightHandSide();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.DataTypeSpecifierImpl <em>Data Type Specifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.DataTypeSpecifierImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getDataTypeSpecifier()
		 * @generated
		 */
		EClass DATA_TYPE_SPECIFIER = eINSTANCE.getDataTypeSpecifier();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE_SPECIFIER__TYPE = eINSTANCE.getDataTypeSpecifier_Type();

		/**
		 * The meta object literal for the '<em><b>Defined Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE_SPECIFIER__DEFINED_TYPE = eINSTANCE.getDataTypeSpecifier_DefinedType();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.LetExpressionImpl <em>Let Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.LetExpressionImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getLetExpression()
		 * @generated
		 */
		EClass LET_EXPRESSION = eINSTANCE.getLetExpression();

		/**
		 * The meta object literal for the '<em><b>Variable Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LET_EXPRESSION__VARIABLE_DECLARATIONS = eINSTANCE.getLetExpression_VariableDeclarations();

		/**
		 * The meta object literal for the '<em><b>Target Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LET_EXPRESSION__TARGET_EXPRESSION = eINSTANCE.getLetExpression_TargetExpression();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.LetExpressionVariableDeclarationImpl <em>Let Expression Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.LetExpressionVariableDeclarationImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getLetExpressionVariableDeclaration()
		 * @generated
		 */
		EClass LET_EXPRESSION_VARIABLE_DECLARATION = eINSTANCE.getLetExpressionVariableDeclaration();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LET_EXPRESSION_VARIABLE_DECLARATION__PARTS = eINSTANCE.getLetExpressionVariableDeclaration_Parts();

		/**
		 * The meta object literal for the '<em><b>Assigned Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LET_EXPRESSION_VARIABLE_DECLARATION__ASSIGNED_EXPRESSION = eINSTANCE.getLetExpressionVariableDeclaration_AssignedExpression();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.LetExpressionVariableDeclarationPartImpl <em>Let Expression Variable Declaration Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.LetExpressionVariableDeclarationPartImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getLetExpressionVariableDeclarationPart()
		 * @generated
		 */
		EClass LET_EXPRESSION_VARIABLE_DECLARATION_PART = eINSTANCE.getLetExpressionVariableDeclarationPart();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LET_EXPRESSION_VARIABLE_DECLARATION_PART__NAME = eINSTANCE.getLetExpressionVariableDeclarationPart_Name();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.IfExpressionImpl <em>If Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.IfExpressionImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getIfExpression()
		 * @generated
		 */
		EClass IF_EXPRESSION = eINSTANCE.getIfExpression();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IF_EXPRESSION__STATIC = eINSTANCE.getIfExpression_Static();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_EXPRESSION__CONDITION = eINSTANCE.getIfExpression_Condition();

		/**
		 * The meta object literal for the '<em><b>Then Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_EXPRESSION__THEN_EXPRESSION = eINSTANCE.getIfExpression_ThenExpression();

		/**
		 * The meta object literal for the '<em><b>Else Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_EXPRESSION__ELSE_EXPRESSION = eINSTANCE.getIfExpression_ElseExpression();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.SwitchExpressionImpl <em>Switch Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.SwitchExpressionImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getSwitchExpression()
		 * @generated
		 */
		EClass SWITCH_EXPRESSION = eINSTANCE.getSwitchExpression();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH_EXPRESSION__STATIC = eINSTANCE.getSwitchExpression_Static();

		/**
		 * The meta object literal for the '<em><b>Control Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_EXPRESSION__CONTROL_EXPRESSION = eINSTANCE.getSwitchExpression_ControlExpression();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_EXPRESSION__CASES = eINSTANCE.getSwitchExpression_Cases();

		/**
		 * The meta object literal for the '<em><b>Default Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_EXPRESSION__DEFAULT_EXPRESSION = eINSTANCE.getSwitchExpression_DefaultExpression();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.SwitchCaseImpl <em>Switch Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.SwitchCaseImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getSwitchCase()
		 * @generated
		 */
		EClass SWITCH_CASE = eINSTANCE.getSwitchCase();

		/**
		 * The meta object literal for the '<em><b>Case Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_CASE__CASE_EXPRESSION = eINSTANCE.getSwitchCase_CaseExpression();

		/**
		 * The meta object literal for the '<em><b>Result Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_CASE__RESULT_EXPRESSION = eINSTANCE.getSwitchCase_ResultExpression();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.ArrayElementAccessImpl <em>Array Element Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.ArrayElementAccessImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getArrayElementAccess()
		 * @generated
		 */
		EClass ARRAY_ELEMENT_ACCESS = eINSTANCE.getArrayElementAccess();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_ELEMENT_ACCESS__ARRAY = eINSTANCE.getArrayElementAccess_Array();

		/**
		 * The meta object literal for the '<em><b>Subscripts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_ELEMENT_ACCESS__SUBSCRIPTS = eINSTANCE.getArrayElementAccess_Subscripts();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.ArraySubscriptImpl <em>Array Subscript</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.ArraySubscriptImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getArraySubscript()
		 * @generated
		 */
		EClass ARRAY_SUBSCRIPT = eINSTANCE.getArraySubscript();

		/**
		 * The meta object literal for the '<em><b>Slice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_SUBSCRIPT__SLICE = eINSTANCE.getArraySubscript_Slice();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_SUBSCRIPT__EXPRESSION = eINSTANCE.getArraySubscript_Expression();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.IterationCallImpl <em>Iteration Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.IterationCallImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getIterationCall()
		 * @generated
		 */
		EClass ITERATION_CALL = eINSTANCE.getIterationCall();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATION_CALL__TARGET = eINSTANCE.getIterationCall_Target();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATION_CALL__IDENTIFIER = eINSTANCE.getIterationCall_Identifier();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATION_CALL__VARIABLES = eINSTANCE.getIterationCall_Variables();

		/**
		 * The meta object literal for the '<em><b>Accumulator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATION_CALL__ACCUMULATOR = eINSTANCE.getIterationCall_Accumulator();

		/**
		 * The meta object literal for the '<em><b>Break Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATION_CALL__BREAK_CONDITION = eINSTANCE.getIterationCall_BreakCondition();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATION_CALL__EXPRESSION = eINSTANCE.getIterationCall_Expression();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.IterationVariableImpl <em>Iteration Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.IterationVariableImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getIterationVariable()
		 * @generated
		 */
		EClass ITERATION_VARIABLE = eINSTANCE.getIterationVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATION_VARIABLE__NAME = eINSTANCE.getIterationVariable_Name();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.IterationAccumulatorImpl <em>Iteration Accumulator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.IterationAccumulatorImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getIterationAccumulator()
		 * @generated
		 */
		EClass ITERATION_ACCUMULATOR = eINSTANCE.getIterationAccumulator();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATION_ACCUMULATOR__NAME = eINSTANCE.getIterationAccumulator_Name();

		/**
		 * The meta object literal for the '<em><b>Initializer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATION_ACCUMULATOR__INITIALIZER = eINSTANCE.getIterationAccumulator_Initializer();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.DerivativeOperatorImpl <em>Derivative Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.DerivativeOperatorImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getDerivativeOperator()
		 * @generated
		 */
		EClass DERIVATIVE_OPERATOR = eINSTANCE.getDerivativeOperator();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVATIVE_OPERATOR__VARIABLE = eINSTANCE.getDerivativeOperator_Variable();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.ArrayConstructionOperatorImpl <em>Array Construction Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.ArrayConstructionOperatorImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getArrayConstructionOperator()
		 * @generated
		 */
		EClass ARRAY_CONSTRUCTION_OPERATOR = eINSTANCE.getArrayConstructionOperator();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_CONSTRUCTION_OPERATOR__EXPRESSIONS = eINSTANCE.getArrayConstructionOperator_Expressions();

		/**
		 * The meta object literal for the '<em><b>Iteration Clauses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_CONSTRUCTION_OPERATOR__ITERATION_CLAUSES = eINSTANCE.getArrayConstructionOperator_IterationClauses();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.ArrayConstructionIterationClauseImpl <em>Array Construction Iteration Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.ArrayConstructionIterationClauseImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getArrayConstructionIterationClause()
		 * @generated
		 */
		EClass ARRAY_CONSTRUCTION_ITERATION_CLAUSE = eINSTANCE.getArrayConstructionIterationClause();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_CONSTRUCTION_ITERATION_CLAUSE__VARIABLE_NAME = eINSTANCE.getArrayConstructionIterationClause_VariableName();

		/**
		 * The meta object literal for the '<em><b>Collection Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_CONSTRUCTION_ITERATION_CLAUSE__COLLECTION_EXPRESSION = eINSTANCE.getArrayConstructionIterationClause_CollectionExpression();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.ArrayConcatenationOperatorImpl <em>Array Concatenation Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.ArrayConcatenationOperatorImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getArrayConcatenationOperator()
		 * @generated
		 */
		EClass ARRAY_CONCATENATION_OPERATOR = eINSTANCE.getArrayConcatenationOperator();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_CONCATENATION_OPERATOR__ROWS = eINSTANCE.getArrayConcatenationOperator_Rows();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.ExpressionListImpl <em>Expression List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.ExpressionListImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getExpressionList()
		 * @generated
		 */
		EClass EXPRESSION_LIST = eINSTANCE.getExpressionList();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_LIST__EXPRESSIONS = eINSTANCE.getExpressionList_Expressions();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.UnitConstructionOperatorImpl <em>Unit Construction Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.UnitConstructionOperatorImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getUnitConstructionOperator()
		 * @generated
		 */
		EClass UNIT_CONSTRUCTION_OPERATOR = eINSTANCE.getUnitConstructionOperator();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_CONSTRUCTION_OPERATOR__UNIT = eINSTANCE.getUnitConstructionOperator_Unit();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.ParenthesizedExpressionImpl <em>Parenthesized Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.ParenthesizedExpressionImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getParenthesizedExpression()
		 * @generated
		 */
		EClass PARENTHESIZED_EXPRESSION = eINSTANCE.getParenthesizedExpression();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARENTHESIZED_EXPRESSION__EXPRESSIONS = eINSTANCE.getParenthesizedExpression_Expressions();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.EndExpressionImpl <em>End Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.EndExpressionImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getEndExpression()
		 * @generated
		 */
		EClass END_EXPRESSION = eINSTANCE.getEndExpression();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.RangeExpressionImpl <em>Range Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.RangeExpressionImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getRangeExpression()
		 * @generated
		 */
		EClass RANGE_EXPRESSION = eINSTANCE.getRangeExpression();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_EXPRESSION__OPERANDS = eINSTANCE.getRangeExpression_Operands();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.ImpliesExpressionImpl <em>Implies Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.ImpliesExpressionImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getImpliesExpression()
		 * @generated
		 */
		EClass IMPLIES_EXPRESSION = eINSTANCE.getImpliesExpression();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLIES_EXPRESSION__LEFT_OPERAND = eINSTANCE.getImpliesExpression_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLIES_EXPRESSION__RIGHT_OPERAND = eINSTANCE.getImpliesExpression_RightOperand();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.LogicalOrExpressionImpl <em>Logical Or Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.LogicalOrExpressionImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getLogicalOrExpression()
		 * @generated
		 */
		EClass LOGICAL_OR_EXPRESSION = eINSTANCE.getLogicalOrExpression();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_OR_EXPRESSION__LEFT_OPERAND = eINSTANCE.getLogicalOrExpression_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_OR_EXPRESSION__RIGHT_OPERAND = eINSTANCE.getLogicalOrExpression_RightOperand();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.LogicalAndExpressionImpl <em>Logical And Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.LogicalAndExpressionImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getLogicalAndExpression()
		 * @generated
		 */
		EClass LOGICAL_AND_EXPRESSION = eINSTANCE.getLogicalAndExpression();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_AND_EXPRESSION__LEFT_OPERAND = eINSTANCE.getLogicalAndExpression_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_AND_EXPRESSION__RIGHT_OPERAND = eINSTANCE.getLogicalAndExpression_RightOperand();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.EqualityExpressionImpl <em>Equality Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.EqualityExpressionImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getEqualityExpression()
		 * @generated
		 */
		EClass EQUALITY_EXPRESSION = eINSTANCE.getEqualityExpression();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUALITY_EXPRESSION__LEFT_OPERAND = eINSTANCE.getEqualityExpression_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUALITY_EXPRESSION__OPERATOR = eINSTANCE.getEqualityExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUALITY_EXPRESSION__RIGHT_OPERAND = eINSTANCE.getEqualityExpression_RightOperand();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.RelationalExpressionImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getRelationalExpression()
		 * @generated
		 */
		EClass RELATIONAL_EXPRESSION = eINSTANCE.getRelationalExpression();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_EXPRESSION__LEFT_OPERAND = eINSTANCE.getRelationalExpression_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONAL_EXPRESSION__OPERATOR = eINSTANCE.getRelationalExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_EXPRESSION__RIGHT_OPERAND = eINSTANCE.getRelationalExpression_RightOperand();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.TypeTestExpressionImpl <em>Type Test Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.TypeTestExpressionImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getTypeTestExpression()
		 * @generated
		 */
		EClass TYPE_TEST_EXPRESSION = eINSTANCE.getTypeTestExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_TEST_EXPRESSION__EXPRESSION = eINSTANCE.getTypeTestExpression_Expression();

		/**
		 * The meta object literal for the '<em><b>Type Specifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_TEST_EXPRESSION__TYPE_SPECIFIER = eINSTANCE.getTypeTestExpression_TypeSpecifier();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.AdditiveExpressionImpl <em>Additive Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.AdditiveExpressionImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getAdditiveExpression()
		 * @generated
		 */
		EClass ADDITIVE_EXPRESSION = eINSTANCE.getAdditiveExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIVE_EXPRESSION__OPERATOR = eINSTANCE.getAdditiveExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIVE_EXPRESSION__LEFT_OPERAND = eINSTANCE.getAdditiveExpression_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIVE_EXPRESSION__RIGHT_OPERAND = eINSTANCE.getAdditiveExpression_RightOperand();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.MultiplicativeExpressionImpl <em>Multiplicative Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.MultiplicativeExpressionImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getMultiplicativeExpression()
		 * @generated
		 */
		EClass MULTIPLICATIVE_EXPRESSION = eINSTANCE.getMultiplicativeExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICATIVE_EXPRESSION__OPERATOR = eINSTANCE.getMultiplicativeExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLICATIVE_EXPRESSION__LEFT_OPERAND = eINSTANCE.getMultiplicativeExpression_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLICATIVE_EXPRESSION__RIGHT_OPERAND = eINSTANCE.getMultiplicativeExpression_RightOperand();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.PowerExpressionImpl <em>Power Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.PowerExpressionImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getPowerExpression()
		 * @generated
		 */
		EClass POWER_EXPRESSION = eINSTANCE.getPowerExpression();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_EXPRESSION__OPERAND = eINSTANCE.getPowerExpression_Operand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_EXPRESSION__OPERATOR = eINSTANCE.getPowerExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Exponent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_EXPRESSION__EXPONENT = eINSTANCE.getPowerExpression_Exponent();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.UnaryExpressionImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getUnaryExpression()
		 * @generated
		 */
		EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_EXPRESSION__OPERATOR = eINSTANCE.getUnaryExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXPRESSION__OPERAND = eINSTANCE.getUnaryExpression_Operand();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.PostfixExpressionImpl <em>Postfix Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.PostfixExpressionImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getPostfixExpression()
		 * @generated
		 */
		EClass POSTFIX_EXPRESSION = eINSTANCE.getPostfixExpression();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSTFIX_EXPRESSION__OPERAND = eINSTANCE.getPostfixExpression_Operand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTFIX_EXPRESSION__OPERATOR = eINSTANCE.getPostfixExpression_Operator();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.FeatureCallImpl <em>Feature Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.FeatureCallImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getFeatureCall()
		 * @generated
		 */
		EClass FEATURE_CALL = eINSTANCE.getFeatureCall();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_CALL__FEATURE = eINSTANCE.getFeatureCall_Feature();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.VariableAccessImpl <em>Variable Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.VariableAccessImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getVariableAccess()
		 * @generated
		 */
		EClass VARIABLE_ACCESS = eINSTANCE.getVariableAccess();

		/**
		 * The meta object literal for the '<em><b>Step Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_ACCESS__STEP_EXPRESSION = eINSTANCE.getVariableAccess_StepExpression();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.StepExpressionImpl <em>Step Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.StepExpressionImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getStepExpression()
		 * @generated
		 */
		EClass STEP_EXPRESSION = eINSTANCE.getStepExpression();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.RangeStepExpressionImpl <em>Range Step Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.RangeStepExpressionImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getRangeStepExpression()
		 * @generated
		 */
		EClass RANGE_STEP_EXPRESSION = eINSTANCE.getRangeStepExpression();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_STEP_EXPRESSION__START = eINSTANCE.getRangeStepExpression_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_STEP_EXPRESSION__END = eINSTANCE.getRangeStepExpression_End();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.AdditiveStepExpressionImpl <em>Additive Step Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.AdditiveStepExpressionImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getAdditiveStepExpression()
		 * @generated
		 */
		EClass ADDITIVE_STEP_EXPRESSION = eINSTANCE.getAdditiveStepExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIVE_STEP_EXPRESSION__OPERATOR = eINSTANCE.getAdditiveStepExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIVE_STEP_EXPRESSION__LEFT_OPERAND = eINSTANCE.getAdditiveStepExpression_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIVE_STEP_EXPRESSION__RIGHT_OPERAND = eINSTANCE.getAdditiveStepExpression_RightOperand();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.NegateStepExpressionImpl <em>Negate Step Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.NegateStepExpressionImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getNegateStepExpression()
		 * @generated
		 */
		EClass NEGATE_STEP_EXPRESSION = eINSTANCE.getNegateStepExpression();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGATE_STEP_EXPRESSION__OPERAND = eINSTANCE.getNegateStepExpression_Operand();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.PrimitiveStepExpressionImpl <em>Primitive Step Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.PrimitiveStepExpressionImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getPrimitiveStepExpression()
		 * @generated
		 */
		EClass PRIMITIVE_STEP_EXPRESSION = eINSTANCE.getPrimitiveStepExpression();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.StepLiteralImpl <em>Step Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.StepLiteralImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getStepLiteral()
		 * @generated
		 */
		EClass STEP_LITERAL = eINSTANCE.getStepLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP_LITERAL__VALUE = eINSTANCE.getStepLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.StepNImpl <em>Step N</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.StepNImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getStepN()
		 * @generated
		 */
		EClass STEP_N = eINSTANCE.getStepN();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.FunctionCallImpl <em>Function Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.FunctionCallImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getFunctionCall()
		 * @generated
		 */
		EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL__ARGUMENTS = eINSTANCE.getFunctionCall_Arguments();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.MemberVariableAccessImpl <em>Member Variable Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.MemberVariableAccessImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getMemberVariableAccess()
		 * @generated
		 */
		EClass MEMBER_VARIABLE_ACCESS = eINSTANCE.getMemberVariableAccess();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER_VARIABLE_ACCESS__TARGET = eINSTANCE.getMemberVariableAccess_Target();

		/**
		 * The meta object literal for the '<em><b>Member Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER_VARIABLE_ACCESS__MEMBER_VARIABLE = eINSTANCE.getMemberVariableAccess_MemberVariable();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.AlgorithmExpressionImpl <em>Algorithm Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.AlgorithmExpressionImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getAlgorithmExpression()
		 * @generated
		 */
		EClass ALGORITHM_EXPRESSION = eINSTANCE.getAlgorithmExpression();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHM_EXPRESSION__BODY = eINSTANCE.getAlgorithmExpression_Body();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.CompoundImpl <em>Compound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.CompoundImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getCompound()
		 * @generated
		 */
		EClass COMPOUND = eINSTANCE.getCompound();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND__STATEMENTS = eINSTANCE.getCompound_Statements();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.StatementImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.AssignmentImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__TARGET = eINSTANCE.getAssignment_Target();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__EXPRESSION = eINSTANCE.getAssignment_Expression();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.VariableDeclarationImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getVariableDeclaration()
		 * @generated
		 */
		EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECLARATION__NAME = eINSTANCE.getVariableDeclaration_Name();

		/**
		 * The meta object literal for the '<em><b>Initializer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION__INITIALIZER = eINSTANCE.getVariableDeclaration_Initializer();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.IfStatementImpl <em>If Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.IfStatementImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getIfStatement()
		 * @generated
		 */
		EClass IF_STATEMENT = eINSTANCE.getIfStatement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__CONDITION = eINSTANCE.getIfStatement_Condition();

		/**
		 * The meta object literal for the '<em><b>Then Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__THEN_STATEMENT = eINSTANCE.getIfStatement_ThenStatement();

		/**
		 * The meta object literal for the '<em><b>Else Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__ELSE_STATEMENT = eINSTANCE.getIfStatement_ElseStatement();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.WhileStatementImpl <em>While Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.WhileStatementImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getWhileStatement()
		 * @generated
		 */
		EClass WHILE_STATEMENT = eINSTANCE.getWhileStatement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_STATEMENT__CONDITION = eINSTANCE.getWhileStatement_Condition();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_STATEMENT__BODY = eINSTANCE.getWhileStatement_Body();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.DoWhileStatementImpl <em>Do While Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.DoWhileStatementImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getDoWhileStatement()
		 * @generated
		 */
		EClass DO_WHILE_STATEMENT = eINSTANCE.getDoWhileStatement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DO_WHILE_STATEMENT__CONDITION = eINSTANCE.getDoWhileStatement_Condition();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DO_WHILE_STATEMENT__BODY = eINSTANCE.getDoWhileStatement_Body();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.ForStatementImpl <em>For Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.ForStatementImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getForStatement()
		 * @generated
		 */
		EClass FOR_STATEMENT = eINSTANCE.getForStatement();

		/**
		 * The meta object literal for the '<em><b>Declared Iteration Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STATEMENT__DECLARED_ITERATION_VARIABLE = eINSTANCE.getForStatement_DeclaredIterationVariable();

		/**
		 * The meta object literal for the '<em><b>Iteration Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STATEMENT__ITERATION_VARIABLE = eINSTANCE.getForStatement_IterationVariable();

		/**
		 * The meta object literal for the '<em><b>Collection Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STATEMENT__COLLECTION_EXPRESSION = eINSTANCE.getForStatement_CollectionExpression();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STATEMENT__CONDITION = eINSTANCE.getForStatement_Condition();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STATEMENT__BODY = eINSTANCE.getForStatement_Body();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.ContinueStatementImpl <em>Continue Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.ContinueStatementImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getContinueStatement()
		 * @generated
		 */
		EClass CONTINUE_STATEMENT = eINSTANCE.getContinueStatement();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.BreakStatementImpl <em>Break Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.BreakStatementImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getBreakStatement()
		 * @generated
		 */
		EClass BREAK_STATEMENT = eINSTANCE.getBreakStatement();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.ReturnStatementImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getReturnStatement()
		 * @generated
		 */
		EClass RETURN_STATEMENT = eINSTANCE.getReturnStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_STATEMENT__EXPRESSION = eINSTANCE.getReturnStatement_Expression();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.BuiltinDefinitionImpl <em>Builtin Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.BuiltinDefinitionImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getBuiltinDefinition()
		 * @generated
		 */
		EClass BUILTIN_DEFINITION = eINSTANCE.getBuiltinDefinition();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.BuiltinFunctionImpl <em>Builtin Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.BuiltinFunctionImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getBuiltinFunction()
		 * @generated
		 */
		EClass BUILTIN_FUNCTION = eINSTANCE.getBuiltinFunction();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.BuiltinVariableImpl <em>Builtin Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.BuiltinVariableImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getBuiltinVariable()
		 * @generated
		 */
		EClass BUILTIN_VARIABLE = eINSTANCE.getBuiltinVariable();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.DataTypeImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.InvalidDataTypeImpl <em>Invalid Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.InvalidDataTypeImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getInvalidDataType()
		 * @generated
		 */
		EClass INVALID_DATA_TYPE = eINSTANCE.getInvalidDataType();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.AnyDataTypeImpl <em>Any Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.AnyDataTypeImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getAnyDataType()
		 * @generated
		 */
		EClass ANY_DATA_TYPE = eINSTANCE.getAnyDataType();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.UnitTypeImpl <em>Unit Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.UnitTypeImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getUnitType()
		 * @generated
		 */
		EClass UNIT_TYPE = eINSTANCE.getUnitType();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.PrimitiveTypeImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.NumericTypeImpl <em>Numeric Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.NumericTypeImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getNumericType()
		 * @generated
		 */
		EClass NUMERIC_TYPE = eINSTANCE.getNumericType();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMERIC_TYPE__UNIT = eINSTANCE.getNumericType_Unit();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.RealTypeImpl <em>Real Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.RealTypeImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getRealType()
		 * @generated
		 */
		EClass REAL_TYPE = eINSTANCE.getRealType();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.IntegerTypeImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getIntegerType()
		 * @generated
		 */
		EClass INTEGER_TYPE = eINSTANCE.getIntegerType();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.ComplexTypeImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getComplexType()
		 * @generated
		 */
		EClass COMPLEX_TYPE = eINSTANCE.getComplexType();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.GaussianTypeImpl <em>Gaussian Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.GaussianTypeImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getGaussianType()
		 * @generated
		 */
		EClass GAUSSIAN_TYPE = eINSTANCE.getGaussianType();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.BooleanTypeImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getBooleanType()
		 * @generated
		 */
		EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.StringTypeImpl <em>String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.StringTypeImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getStringType()
		 * @generated
		 */
		EClass STRING_TYPE = eINSTANCE.getStringType();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.ArrayTypeImpl <em>Array Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.ArrayTypeImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getArrayType()
		 * @generated
		 */
		EClass ARRAY_TYPE = eINSTANCE.getArrayType();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_TYPE__ELEMENT_TYPE = eINSTANCE.getArrayType_ElementType();

		/**
		 * The meta object literal for the '<em><b>Defined Element Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_TYPE__DEFINED_ELEMENT_TYPE = eINSTANCE.getArrayType_DefinedElementType();

		/**
		 * The meta object literal for the '<em><b>Dimensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_TYPE__DIMENSIONS = eINSTANCE.getArrayType_Dimensions();

		/**
		 * The meta object literal for the '<em><b>Dimensionality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_TYPE__DIMENSIONALITY = eINSTANCE.getArrayType_Dimensionality();

		/**
		 * The meta object literal for the '<em><b>Dimensional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_TYPE__DIMENSIONAL = eINSTANCE.getArrayType_Dimensional();

		/**
		 * The meta object literal for the '<em><b>Multidimensional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_TYPE__MULTIDIMENSIONAL = eINSTANCE.getArrayType_Multidimensional();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.TensorTypeImpl <em>Tensor Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.TensorTypeImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getTensorType()
		 * @generated
		 */
		EClass TENSOR_TYPE = eINSTANCE.getTensorType();

		/**
		 * The meta object literal for the '<em><b>Vector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENSOR_TYPE__VECTOR = eINSTANCE.getTensorType_Vector();

		/**
		 * The meta object literal for the '<em><b>Matrix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENSOR_TYPE__MATRIX = eINSTANCE.getTensorType_Matrix();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.ArrayDimensionImpl <em>Array Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.ArrayDimensionImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getArrayDimension()
		 * @generated
		 */
		EClass ARRAY_DIMENSION = eINSTANCE.getArrayDimension();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_DIMENSION__SIZE = eINSTANCE.getArrayDimension_Size();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.ExpressionImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.UnitImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '<em><b>Numerator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__NUMERATOR = eINSTANCE.getUnit_Numerator();

		/**
		 * The meta object literal for the '<em><b>Denominator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__DENOMINATOR = eINSTANCE.getUnit_Denominator();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__SCALE = eINSTANCE.getUnit_Scale();

		/**
		 * The meta object literal for the '<em><b>Wildcard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__WILDCARD = eINSTANCE.getUnit_Wildcard();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.UnitProductImpl <em>Unit Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.UnitProductImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getUnitProduct()
		 * @generated
		 */
		EClass UNIT_PRODUCT = eINSTANCE.getUnitProduct();

		/**
		 * The meta object literal for the '<em><b>Factors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_PRODUCT__FACTORS = eINSTANCE.getUnitProduct_Factors();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.UnitNumeratorImpl <em>Unit Numerator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.UnitNumeratorImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getUnitNumerator()
		 * @generated
		 */
		EClass UNIT_NUMERATOR = eINSTANCE.getUnitNumerator();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.UnitDenominatorImpl <em>Unit Denominator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.UnitDenominatorImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getUnitDenominator()
		 * @generated
		 */
		EClass UNIT_DENOMINATOR = eINSTANCE.getUnitDenominator();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.UnitFactorImpl <em>Unit Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.UnitFactorImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getUnitFactor()
		 * @generated
		 */
		EClass UNIT_FACTOR = eINSTANCE.getUnitFactor();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FACTOR__SYMBOL = eINSTANCE.getUnitFactor_Symbol();

		/**
		 * The meta object literal for the '<em><b>Exponent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FACTOR__EXPONENT = eINSTANCE.getUnitFactor_Exponent();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.LiteralImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.NumericLiteralImpl <em>Numeric Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.NumericLiteralImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getNumericLiteral()
		 * @generated
		 */
		EClass NUMERIC_LITERAL = eINSTANCE.getNumericLiteral();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMERIC_LITERAL__UNIT = eINSTANCE.getNumericLiteral_Unit();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.RealLiteralImpl <em>Real Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.RealLiteralImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getRealLiteral()
		 * @generated
		 */
		EClass REAL_LITERAL = eINSTANCE.getRealLiteral();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_LITERAL__DATA = eINSTANCE.getRealLiteral_Data();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_LITERAL__VALUE = eINSTANCE.getRealLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.IntegerLiteralImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getIntegerLiteral()
		 * @generated
		 */
		EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_LITERAL__DATA = eINSTANCE.getIntegerLiteral_Data();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_LITERAL__VALUE = eINSTANCE.getIntegerLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.BooleanLiteralImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getBooleanLiteral()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

		/**
		 * The meta object literal for the '<em><b>True</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_LITERAL__TRUE = eINSTANCE.getBooleanLiteral_True();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.impl.StringLiteralImpl <em>String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.impl.StringLiteralImpl
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getStringLiteral()
		 * @generated
		 */
		EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.FunctionKind <em>Function Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.FunctionKind
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getFunctionKind()
		 * @generated
		 */
		EEnum FUNCTION_KIND = eINSTANCE.getFunctionKind();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.AssertionStatusKind <em>Assertion Status Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.AssertionStatusKind
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getAssertionStatusKind()
		 * @generated
		 */
		EEnum ASSERTION_STATUS_KIND = eINSTANCE.getAssertionStatusKind();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.EqualityOperator <em>Equality Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.EqualityOperator
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getEqualityOperator()
		 * @generated
		 */
		EEnum EQUALITY_OPERATOR = eINSTANCE.getEqualityOperator();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.RelationalOperator <em>Relational Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.RelationalOperator
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getRelationalOperator()
		 * @generated
		 */
		EEnum RELATIONAL_OPERATOR = eINSTANCE.getRelationalOperator();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.AdditiveOperator <em>Additive Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.AdditiveOperator
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getAdditiveOperator()
		 * @generated
		 */
		EEnum ADDITIVE_OPERATOR = eINSTANCE.getAdditiveOperator();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.MultiplicativeOperator <em>Multiplicative Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.MultiplicativeOperator
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getMultiplicativeOperator()
		 * @generated
		 */
		EEnum MULTIPLICATIVE_OPERATOR = eINSTANCE.getMultiplicativeOperator();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.PowerOperator <em>Power Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.PowerOperator
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getPowerOperator()
		 * @generated
		 */
		EEnum POWER_OPERATOR = eINSTANCE.getPowerOperator();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.UnaryOperator <em>Unary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.UnaryOperator
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getUnaryOperator()
		 * @generated
		 */
		EEnum UNARY_OPERATOR = eINSTANCE.getUnaryOperator();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.PostfixOperator <em>Postfix Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.PostfixOperator
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getPostfixOperator()
		 * @generated
		 */
		EEnum POSTFIX_OPERATOR = eINSTANCE.getPostfixOperator();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.damos.mscript.OperatorKind <em>Operator Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.OperatorKind
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getOperatorKind()
		 * @generated
		 */
		EEnum OPERATOR_KIND = eINSTANCE.getOperatorKind();

		/**
		 * The meta object literal for the '<em>Real Data</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.RealData
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getRealData()
		 * @generated
		 */
		EDataType REAL_DATA = eINSTANCE.getRealData();

		/**
		 * The meta object literal for the '<em>Integer Data</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.damos.mscript.IntegerData
		 * @see org.eclipselabs.damos.mscript.impl.MscriptPackageImpl#getIntegerData()
		 * @generated
		 */
		EDataType INTEGER_DATA = eINSTANCE.getIntegerData();

	}

} //MscriptPackage
