/**
 * generated by Xtext 2.15.0
 */
package org.xtext.project.browserautomationdsl.domainmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.project.browserautomationdsl.domainmodel.DomainmodelPackage;
import org.xtext.project.browserautomationdsl.domainmodel.PLAY;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PLAY</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.project.browserautomationdsl.domainmodel.impl.PLAYImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.project.browserautomationdsl.domainmodel.impl.PLAYImpl#getPreocedure <em>Preocedure</em>}</li>
 *   <li>{@link org.xtext.project.browserautomationdsl.domainmodel.impl.PLAYImpl#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PLAYImpl extends INSTRUCTIONImpl implements PLAY
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getPreocedure() <em>Preocedure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreocedure()
   * @generated
   * @ordered
   */
  protected static final String PREOCEDURE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPreocedure() <em>Preocedure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreocedure()
   * @generated
   * @ordered
   */
  protected String preocedure = PREOCEDURE_EDEFAULT;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<String> params;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PLAYImpl()
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
    return DomainmodelPackage.Literals.PLAY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.PLAY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPreocedure()
  {
    return preocedure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPreocedure(String newPreocedure)
  {
    String oldPreocedure = preocedure;
    preocedure = newPreocedure;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.PLAY__PREOCEDURE, oldPreocedure, preocedure));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getParams()
  {
    if (params == null)
    {
      params = new EDataTypeEList<String>(String.class, this, DomainmodelPackage.PLAY__PARAMS);
    }
    return params;
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
      case DomainmodelPackage.PLAY__NAME:
        return getName();
      case DomainmodelPackage.PLAY__PREOCEDURE:
        return getPreocedure();
      case DomainmodelPackage.PLAY__PARAMS:
        return getParams();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DomainmodelPackage.PLAY__NAME:
        setName((String)newValue);
        return;
      case DomainmodelPackage.PLAY__PREOCEDURE:
        setPreocedure((String)newValue);
        return;
      case DomainmodelPackage.PLAY__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends String>)newValue);
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
      case DomainmodelPackage.PLAY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DomainmodelPackage.PLAY__PREOCEDURE:
        setPreocedure(PREOCEDURE_EDEFAULT);
        return;
      case DomainmodelPackage.PLAY__PARAMS:
        getParams().clear();
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
      case DomainmodelPackage.PLAY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DomainmodelPackage.PLAY__PREOCEDURE:
        return PREOCEDURE_EDEFAULT == null ? preocedure != null : !PREOCEDURE_EDEFAULT.equals(preocedure);
      case DomainmodelPackage.PLAY__PARAMS:
        return params != null && !params.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", preocedure: ");
    result.append(preocedure);
    result.append(", params: ");
    result.append(params);
    result.append(')');
    return result.toString();
  }

} //PLAYImpl
