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
