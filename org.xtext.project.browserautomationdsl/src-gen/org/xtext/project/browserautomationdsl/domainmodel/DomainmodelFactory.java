/**
 * generated by Xtext 2.15.0
 */
package org.xtext.project.browserautomationdsl.domainmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.project.browserautomationdsl.domainmodel.DomainmodelPackage
 * @generated
 */
public interface DomainmodelFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DomainmodelFactory eINSTANCE = org.xtext.project.browserautomationdsl.domainmodel.impl.DomainmodelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>PROGRAMME</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PROGRAMME</em>'.
   * @generated
   */
  PROGRAMME createPROGRAMME();

  /**
   * Returns a new object of class '<em>INSTRUCTION</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>INSTRUCTION</em>'.
   * @generated
   */
  INSTRUCTION createINSTRUCTION();

  /**
   * Returns a new object of class '<em>GOTO</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>GOTO</em>'.
   * @generated
   */
  GOTO createGOTO();

  /**
   * Returns a new object of class '<em>FILL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>FILL</em>'.
   * @generated
   */
  FILL createFILL();

  /**
   * Returns a new object of class '<em>SELECT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SELECT</em>'.
   * @generated
   */
  SELECT createSELECT();

  /**
   * Returns a new object of class '<em>READ</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>READ</em>'.
   * @generated
   */
  READ createREAD();

  /**
   * Returns a new object of class '<em>COUNT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>COUNT</em>'.
   * @generated
   */
  COUNT createCOUNT();

  /**
   * Returns a new object of class '<em>SAVEVAR</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SAVEVAR</em>'.
   * @generated
   */
  SAVEVAR createSAVEVAR();

  /**
   * Returns a new object of class '<em>VERIFY</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>VERIFY</em>'.
   * @generated
   */
  VERIFY createVERIFY();

  /**
   * Returns a new object of class '<em>PLAY</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PLAY</em>'.
   * @generated
   */
  PLAY createPLAY();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DomainmodelPackage getDomainmodelPackage();

} //DomainmodelFactory
