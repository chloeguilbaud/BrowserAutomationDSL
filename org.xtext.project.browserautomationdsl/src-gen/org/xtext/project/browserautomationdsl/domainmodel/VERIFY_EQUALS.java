/**
 * generated by Xtext 2.15.0
 */
package org.xtext.project.browserautomationdsl.domainmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VERIFY EQUALS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.project.browserautomationdsl.domainmodel.VERIFY_EQUALS#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.xtext.project.browserautomationdsl.domainmodel.VERIFY_EQUALS#getRegisteredValue <em>Registered Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.project.browserautomationdsl.domainmodel.DomainmodelPackage#getVERIFY_EQUALS()
 * @model
 * @generated
 */
public interface VERIFY_EQUALS extends VERIFY
{
  /**
   * Returns the value of the '<em><b>Operation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' containment reference.
   * @see #setOperation(COUNT)
   * @see org.xtext.project.browserautomationdsl.domainmodel.DomainmodelPackage#getVERIFY_EQUALS_Operation()
   * @model containment="true"
   * @generated
   */
  COUNT getOperation();

  /**
   * Sets the value of the '{@link org.xtext.project.browserautomationdsl.domainmodel.VERIFY_EQUALS#getOperation <em>Operation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation</em>' containment reference.
   * @see #getOperation()
   * @generated
   */
  void setOperation(COUNT value);

  /**
   * Returns the value of the '<em><b>Registered Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Registered Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Registered Value</em>' containment reference.
   * @see #setRegisteredValue(REGISTERED_VALUE)
   * @see org.xtext.project.browserautomationdsl.domainmodel.DomainmodelPackage#getVERIFY_EQUALS_RegisteredValue()
   * @model containment="true"
   * @generated
   */
  REGISTERED_VALUE getRegisteredValue();

  /**
   * Sets the value of the '{@link org.xtext.project.browserautomationdsl.domainmodel.VERIFY_EQUALS#getRegisteredValue <em>Registered Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Registered Value</em>' containment reference.
   * @see #getRegisteredValue()
   * @generated
   */
  void setRegisteredValue(REGISTERED_VALUE value);

} // VERIFY_EQUALS
