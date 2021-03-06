/**
 * generated by Xtext 2.15.0
 */
package org.xtext.project.browserautomationdsl.domainmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>READ</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.project.browserautomationdsl.domainmodel.READ#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.project.browserautomationdsl.domainmodel.READ#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.xtext.project.browserautomationdsl.domainmodel.READ#getSavePath <em>Save Path</em>}</li>
 * </ul>
 *
 * @see org.xtext.project.browserautomationdsl.domainmodel.DomainmodelPackage#getREAD()
 * @model
 * @generated
 */
public interface READ extends INSTRUCTION
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
   * @see org.xtext.project.browserautomationdsl.domainmodel.DomainmodelPackage#getREAD_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.project.browserautomationdsl.domainmodel.READ#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.xtext.project.browserautomationdsl.domainmodel.DomainmodelPackage#getREAD_Identifier()
   * @model containment="true"
   * @generated
   */
  ELEMENTIDENTIFIER getIdentifier();

  /**
   * Sets the value of the '{@link org.xtext.project.browserautomationdsl.domainmodel.READ#getIdentifier <em>Identifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' containment reference.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(ELEMENTIDENTIFIER value);

  /**
   * Returns the value of the '<em><b>Save Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Save Path</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Save Path</em>' containment reference.
   * @see #setSavePath(SAVEVAR)
   * @see org.xtext.project.browserautomationdsl.domainmodel.DomainmodelPackage#getREAD_SavePath()
   * @model containment="true"
   * @generated
   */
  SAVEVAR getSavePath();

  /**
   * Sets the value of the '{@link org.xtext.project.browserautomationdsl.domainmodel.READ#getSavePath <em>Save Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Save Path</em>' containment reference.
   * @see #getSavePath()
   * @generated
   */
  void setSavePath(SAVEVAR value);

} // READ
