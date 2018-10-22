/**
 * generated by Xtext 2.15.0
 */
package org.xtext.project.browserautomationdsl.domainmodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.project.browserautomationdsl.domainmodel.DomainmodelFactory;
import org.xtext.project.browserautomationdsl.domainmodel.DomainmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainmodelPackageImpl extends EPackageImpl implements DomainmodelPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass programmeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fillEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass readEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass countEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass savevarEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass verifyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass playEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.project.browserautomationdsl.domainmodel.DomainmodelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DomainmodelPackageImpl()
  {
    super(eNS_URI, DomainmodelFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link DomainmodelPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DomainmodelPackage init()
  {
    if (isInited) return (DomainmodelPackage)EPackage.Registry.INSTANCE.getEPackage(DomainmodelPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredDomainmodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    DomainmodelPackageImpl theDomainmodelPackage = registeredDomainmodelPackage instanceof DomainmodelPackageImpl ? (DomainmodelPackageImpl)registeredDomainmodelPackage : new DomainmodelPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theDomainmodelPackage.createPackageContents();

    // Initialize created meta-data
    theDomainmodelPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDomainmodelPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DomainmodelPackage.eNS_URI, theDomainmodelPackage);
    return theDomainmodelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPROGRAMME()
  {
    return programmeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPROGRAMME_Name()
  {
    return (EAttribute)programmeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPROGRAMME_Param()
  {
    return (EAttribute)programmeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPROGRAMME_Params()
  {
    return (EAttribute)programmeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPROGRAMME_Inst()
  {
    return (EReference)programmeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getINSTRUCTION()
  {
    return instructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFILL()
  {
    return fillEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFILL_Var()
  {
    return (EAttribute)fillEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFILL_Value()
  {
    return (EAttribute)fillEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSELECT()
  {
    return selectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSELECT_Elem()
  {
    return (EAttribute)selectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getREAD()
  {
    return readEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCOUNT()
  {
    return countEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSAVEVAR()
  {
    return savevarEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVERIFY()
  {
    return verifyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVERIFY_Value()
  {
    return (EAttribute)verifyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVERIFY_Var()
  {
    return (EAttribute)verifyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPLAY()
  {
    return playEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPLAY_Params()
  {
    return (EAttribute)playEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainmodelFactory getDomainmodelFactory()
  {
    return (DomainmodelFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    programmeEClass = createEClass(PROGRAMME);
    createEAttribute(programmeEClass, PROGRAMME__NAME);
    createEAttribute(programmeEClass, PROGRAMME__PARAM);
    createEAttribute(programmeEClass, PROGRAMME__PARAMS);
    createEReference(programmeEClass, PROGRAMME__INST);

    instructionEClass = createEClass(INSTRUCTION);

    fillEClass = createEClass(FILL);
    createEAttribute(fillEClass, FILL__VAR);
    createEAttribute(fillEClass, FILL__VALUE);

    selectEClass = createEClass(SELECT);
    createEAttribute(selectEClass, SELECT__ELEM);

    readEClass = createEClass(READ);

    countEClass = createEClass(COUNT);

    savevarEClass = createEClass(SAVEVAR);

    verifyEClass = createEClass(VERIFY);
    createEAttribute(verifyEClass, VERIFY__VALUE);
    createEAttribute(verifyEClass, VERIFY__VAR);

    playEClass = createEClass(PLAY);
    createEAttribute(playEClass, PLAY__PARAMS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    fillEClass.getESuperTypes().add(this.getINSTRUCTION());
    selectEClass.getESuperTypes().add(this.getINSTRUCTION());
    readEClass.getESuperTypes().add(this.getINSTRUCTION());
    countEClass.getESuperTypes().add(this.getINSTRUCTION());
    countEClass.getESuperTypes().add(this.getVERIFY());
    savevarEClass.getESuperTypes().add(this.getREAD());
    savevarEClass.getESuperTypes().add(this.getCOUNT());
    verifyEClass.getESuperTypes().add(this.getINSTRUCTION());
    playEClass.getESuperTypes().add(this.getINSTRUCTION());

    // Initialize classes and features; add operations and parameters
    initEClass(programmeEClass, org.xtext.project.browserautomationdsl.domainmodel.PROGRAMME.class, "PROGRAMME", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPROGRAMME_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.xtext.project.browserautomationdsl.domainmodel.PROGRAMME.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPROGRAMME_Param(), ecorePackage.getEString(), "param", null, 0, 1, org.xtext.project.browserautomationdsl.domainmodel.PROGRAMME.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPROGRAMME_Params(), ecorePackage.getEString(), "params", null, 0, -1, org.xtext.project.browserautomationdsl.domainmodel.PROGRAMME.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPROGRAMME_Inst(), this.getINSTRUCTION(), null, "inst", null, 0, -1, org.xtext.project.browserautomationdsl.domainmodel.PROGRAMME.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instructionEClass, org.xtext.project.browserautomationdsl.domainmodel.INSTRUCTION.class, "INSTRUCTION", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(fillEClass, org.xtext.project.browserautomationdsl.domainmodel.FILL.class, "FILL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFILL_Var(), ecorePackage.getEString(), "var", null, 0, 1, org.xtext.project.browserautomationdsl.domainmodel.FILL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFILL_Value(), ecorePackage.getEString(), "value", null, 0, 1, org.xtext.project.browserautomationdsl.domainmodel.FILL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectEClass, org.xtext.project.browserautomationdsl.domainmodel.SELECT.class, "SELECT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSELECT_Elem(), ecorePackage.getEString(), "elem", null, 0, 1, org.xtext.project.browserautomationdsl.domainmodel.SELECT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(readEClass, org.xtext.project.browserautomationdsl.domainmodel.READ.class, "READ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(countEClass, org.xtext.project.browserautomationdsl.domainmodel.COUNT.class, "COUNT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(savevarEClass, org.xtext.project.browserautomationdsl.domainmodel.SAVEVAR.class, "SAVEVAR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(verifyEClass, org.xtext.project.browserautomationdsl.domainmodel.VERIFY.class, "VERIFY", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVERIFY_Value(), ecorePackage.getEString(), "value", null, 0, 1, org.xtext.project.browserautomationdsl.domainmodel.VERIFY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVERIFY_Var(), ecorePackage.getEString(), "var", null, 0, 1, org.xtext.project.browserautomationdsl.domainmodel.VERIFY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(playEClass, org.xtext.project.browserautomationdsl.domainmodel.PLAY.class, "PLAY", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPLAY_Params(), ecorePackage.getEString(), "params", null, 0, -1, org.xtext.project.browserautomationdsl.domainmodel.PLAY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //DomainmodelPackageImpl
