/**
 * generated by Xtext 2.15.0
 */
package org.xtext.project.browserautomationdsl.domainmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.project.browserautomationdsl.domainmodel.DomainmodelPackage;
import org.xtext.project.browserautomationdsl.domainmodel.PROCEDURE;
import org.xtext.project.browserautomationdsl.domainmodel.PROGRAMME;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PROGRAMME</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.project.browserautomationdsl.domainmodel.impl.PROGRAMMEImpl#getProcedures <em>Procedures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PROGRAMMEImpl extends MinimalEObjectImpl.Container implements PROGRAMME
{
  /**
   * The cached value of the '{@link #getProcedures() <em>Procedures</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcedures()
   * @generated
   * @ordered
   */
  protected EList<PROCEDURE> procedures;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PROGRAMMEImpl()
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
    return DomainmodelPackage.Literals.PROGRAMME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PROCEDURE> getProcedures()
  {
    if (procedures == null)
    {
      procedures = new EObjectContainmentEList<PROCEDURE>(PROCEDURE.class, this, DomainmodelPackage.PROGRAMME__PROCEDURES);
    }
    return procedures;
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
      case DomainmodelPackage.PROGRAMME__PROCEDURES:
        return ((InternalEList<?>)getProcedures()).basicRemove(otherEnd, msgs);
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
      case DomainmodelPackage.PROGRAMME__PROCEDURES:
        return getProcedures();
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
      case DomainmodelPackage.PROGRAMME__PROCEDURES:
        getProcedures().clear();
        getProcedures().addAll((Collection<? extends PROCEDURE>)newValue);
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
      case DomainmodelPackage.PROGRAMME__PROCEDURES:
        getProcedures().clear();
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
      case DomainmodelPackage.PROGRAMME__PROCEDURES:
        return procedures != null && !procedures.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PROGRAMMEImpl
