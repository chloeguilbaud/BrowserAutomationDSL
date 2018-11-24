/**
 * generated by Xtext 2.15.0
 */
package org.xtext.project.browserautomationdsl.domainmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.project.browserautomationdsl.domainmodel.DomainmodelPackage;
import org.xtext.project.browserautomationdsl.domainmodel.INSTRUCTION;
import org.xtext.project.browserautomationdsl.domainmodel.PROCEDURE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PROCEDURE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.project.browserautomationdsl.domainmodel.impl.PROCEDUREImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.project.browserautomationdsl.domainmodel.impl.PROCEDUREImpl#getParam <em>Param</em>}</li>
 *   <li>{@link org.xtext.project.browserautomationdsl.domainmodel.impl.PROCEDUREImpl#getParams <em>Params</em>}</li>
 *   <li>{@link org.xtext.project.browserautomationdsl.domainmodel.impl.PROCEDUREImpl#getInst <em>Inst</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PROCEDUREImpl extends MinimalEObjectImpl.Container implements PROCEDURE
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
   * The default value of the '{@link #getParam() <em>Param</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParam()
   * @generated
   * @ordered
   */
  protected static final String PARAM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getParam() <em>Param</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParam()
   * @generated
   * @ordered
   */
  protected String param = PARAM_EDEFAULT;

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
   * The cached value of the '{@link #getInst() <em>Inst</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInst()
   * @generated
   * @ordered
   */
  protected EList<INSTRUCTION> inst;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PROCEDUREImpl()
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
    return DomainmodelPackage.Literals.PROCEDURE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.PROCEDURE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getParam()
  {
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParam(String newParam)
  {
    String oldParam = param;
    param = newParam;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.PROCEDURE__PARAM, oldParam, param));
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
      params = new EDataTypeEList<String>(String.class, this, DomainmodelPackage.PROCEDURE__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<INSTRUCTION> getInst()
  {
    if (inst == null)
    {
      inst = new EObjectContainmentEList<INSTRUCTION>(INSTRUCTION.class, this, DomainmodelPackage.PROCEDURE__INST);
    }
    return inst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DomainmodelPackage.PROCEDURE__INST:
        return ((InternalEList<?>)getInst()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case DomainmodelPackage.PROCEDURE__NAME:
        return getName();
      case DomainmodelPackage.PROCEDURE__PARAM:
        return getParam();
      case DomainmodelPackage.PROCEDURE__PARAMS:
        return getParams();
      case DomainmodelPackage.PROCEDURE__INST:
        return getInst();
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
      case DomainmodelPackage.PROCEDURE__NAME:
        setName((String)newValue);
        return;
      case DomainmodelPackage.PROCEDURE__PARAM:
        setParam((String)newValue);
        return;
      case DomainmodelPackage.PROCEDURE__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends String>)newValue);
        return;
      case DomainmodelPackage.PROCEDURE__INST:
        getInst().clear();
        getInst().addAll((Collection<? extends INSTRUCTION>)newValue);
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
      case DomainmodelPackage.PROCEDURE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DomainmodelPackage.PROCEDURE__PARAM:
        setParam(PARAM_EDEFAULT);
        return;
      case DomainmodelPackage.PROCEDURE__PARAMS:
        getParams().clear();
        return;
      case DomainmodelPackage.PROCEDURE__INST:
        getInst().clear();
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
      case DomainmodelPackage.PROCEDURE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DomainmodelPackage.PROCEDURE__PARAM:
        return PARAM_EDEFAULT == null ? param != null : !PARAM_EDEFAULT.equals(param);
      case DomainmodelPackage.PROCEDURE__PARAMS:
        return params != null && !params.isEmpty();
      case DomainmodelPackage.PROCEDURE__INST:
        return inst != null && !inst.isEmpty();
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
    result.append(", param: ");
    result.append(param);
    result.append(", params: ");
    result.append(params);
    result.append(')');
    return result.toString();
  }

} //PROCEDUREImpl