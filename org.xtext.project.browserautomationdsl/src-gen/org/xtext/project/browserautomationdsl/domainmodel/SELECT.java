/**
 * generated by Xtext 2.15.0
 */
package org.xtext.project.browserautomationdsl.domainmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SELECT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.project.browserautomationdsl.domainmodel.SELECT#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.project.browserautomationdsl.domainmodel.SELECT#getElem <em>Elem</em>}</li>
 *   <li>{@link org.xtext.project.browserautomationdsl.domainmodel.SELECT#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @see org.xtext.project.browserautomationdsl.domainmodel.DomainmodelPackage#getSELECT()
 * @model
 * @generated
 */
public interface SELECT extends INSTRUCTION
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
   * @see org.xtext.project.browserautomationdsl.domainmodel.DomainmodelPackage#getSELECT_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.project.browserautomationdsl.domainmodel.SELECT#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Elem</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elem</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elem</em>' attribute.
   * @see #setElem(String)
   * @see org.xtext.project.browserautomationdsl.domainmodel.DomainmodelPackage#getSELECT_Elem()
   * @model
   * @generated
   */
  String getElem();

  /**
   * Sets the value of the '{@link org.xtext.project.browserautomationdsl.domainmodel.SELECT#getElem <em>Elem</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elem</em>' attribute.
   * @see #getElem()
   * @generated
   */
  void setElem(String value);

  /**
   * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' containment reference.
   * @see #setIdentifier(ELEMENTIDENTIFIER)
   * @see org.xtext.project.browserautomationdsl.domainmodel.DomainmodelPackage#getSELECT_Identifier()
   * @model containment="true"
   * @generated
   */
  ELEMENTIDENTIFIER getIdentifier();

  /**
   * Sets the value of the '{@link org.xtext.project.browserautomationdsl.domainmodel.SELECT#getIdentifier <em>Identifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' containment reference.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(ELEMENTIDENTIFIER value);

} // SELECT
