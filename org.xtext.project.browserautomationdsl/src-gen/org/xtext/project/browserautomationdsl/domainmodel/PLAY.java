/**
 * generated by Xtext 2.15.0
 */
package org.xtext.project.browserautomationdsl.domainmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PLAY</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.project.browserautomationdsl.domainmodel.PLAY#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.project.browserautomationdsl.domainmodel.PLAY#getPreocedure <em>Preocedure</em>}</li>
 *   <li>{@link org.xtext.project.browserautomationdsl.domainmodel.PLAY#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see org.xtext.project.browserautomationdsl.domainmodel.DomainmodelPackage#getPLAY()
 * @model
 * @generated
 */
public interface PLAY extends INSTRUCTION
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.project.browserautomationdsl.domainmodel.DomainmodelPackage#getPLAY_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.project.browserautomationdsl.domainmodel.PLAY#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Preocedure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Preocedure</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Preocedure</em>' attribute.
   * @see #setPreocedure(String)
   * @see org.xtext.project.browserautomationdsl.domainmodel.DomainmodelPackage#getPLAY_Preocedure()
   * @model
   * @generated
   */
  String getPreocedure();

  /**
   * Sets the value of the '{@link org.xtext.project.browserautomationdsl.domainmodel.PLAY#getPreocedure <em>Preocedure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Preocedure</em>' attribute.
   * @see #getPreocedure()
   * @generated
   */
  void setPreocedure(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' attribute list.
   * @see org.xtext.project.browserautomationdsl.domainmodel.DomainmodelPackage#getPLAY_Params()
   * @model unique="false"
   * @generated
   */
  EList<String> getParams();

} // PLAY
