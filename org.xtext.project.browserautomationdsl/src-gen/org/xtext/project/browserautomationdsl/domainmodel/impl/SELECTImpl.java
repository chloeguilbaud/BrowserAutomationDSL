/**
 * generated by Xtext 2.15.0
 */
package org.xtext.project.browserautomationdsl.domainmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.project.browserautomationdsl.domainmodel.DomainmodelPackage;
import org.xtext.project.browserautomationdsl.domainmodel.SELECT;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SELECT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.project.browserautomationdsl.domainmodel.impl.SELECTImpl#getElem <em>Elem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SELECTImpl extends INSTRUCTIONImpl implements SELECT
{
  /**
   * The default value of the '{@link #getElem() <em>Elem</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElem()
   * @generated
   * @ordered
   */
  protected static final String ELEM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getElem() <em>Elem</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElem()
   * @generated
   * @ordered
   */
  protected String elem = ELEM_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SELECTImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DomainmodelPackage.Literals.SELECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getElem()
  {
    return elem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElem(String newElem)
  {
    String oldElem = elem;
    elem = newElem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.SELECT__ELEM, oldElem, elem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DomainmodelPackage.SELECT__ELEM:
        return getElem();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DomainmodelPackage.SELECT__ELEM:
        setElem((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DomainmodelPackage.SELECT__ELEM:
        setElem(ELEM_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DomainmodelPackage.SELECT__ELEM:
        return ELEM_EDEFAULT == null ? elem != null : !ELEM_EDEFAULT.equals(elem);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (elem: ");
    result.append(elem);
    result.append(')');
    return result.toString();
  }

} //SELECTImpl
