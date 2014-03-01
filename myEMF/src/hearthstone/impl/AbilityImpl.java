/**
 */
package hearthstone.impl;

import hearthstone.Ability;
import hearthstone.Card;
import hearthstone.HearthstonePackage;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hearthstone.impl.AbilityImpl#getAbilityID <em>Ability ID</em>}</li>
 *   <li>{@link hearthstone.impl.AbilityImpl#getAbilityType <em>Ability Type</em>}</li>
 *   <li>{@link hearthstone.impl.AbilityImpl#getAbilityAffect <em>Ability Affect</em>}</li>
 *   <li>{@link hearthstone.impl.AbilityImpl#getCardHasAbility <em>Card Has Ability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbilityImpl extends MinimalEObjectImpl.Container implements Ability {
	/**
	 * The default value of the '{@link #getAbilityID() <em>Ability ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbilityID()
	 * @generated
	 * @ordered
	 */
	protected static final int ABILITY_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAbilityID() <em>Ability ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbilityID()
	 * @generated
	 * @ordered
	 */
	protected int abilityID = ABILITY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbilityType() <em>Ability Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbilityType()
	 * @generated
	 * @ordered
	 */
	protected static final String ABILITY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbilityType() <em>Ability Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbilityType()
	 * @generated
	 * @ordered
	 */
	protected String abilityType = ABILITY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbilityAffect() <em>Ability Affect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbilityAffect()
	 * @generated
	 * @ordered
	 */
	protected static final String ABILITY_AFFECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbilityAffect() <em>Ability Affect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbilityAffect()
	 * @generated
	 * @ordered
	 */
	protected String abilityAffect = ABILITY_AFFECT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCardHasAbility() <em>Card Has Ability</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardHasAbility()
	 * @generated
	 * @ordered
	 */
	protected EList<Card> cardHasAbility;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HearthstonePackage.Literals.ABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAbilityID() {
		return abilityID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbilityID(int newAbilityID) {
		int oldAbilityID = abilityID;
		abilityID = newAbilityID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.ABILITY__ABILITY_ID, oldAbilityID, abilityID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbilityType() {
		return abilityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbilityType(String newAbilityType) {
		String oldAbilityType = abilityType;
		abilityType = newAbilityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.ABILITY__ABILITY_TYPE, oldAbilityType, abilityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbilityAffect() {
		return abilityAffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbilityAffect(String newAbilityAffect) {
		String oldAbilityAffect = abilityAffect;
		abilityAffect = newAbilityAffect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.ABILITY__ABILITY_AFFECT, oldAbilityAffect, abilityAffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Card> getCardHasAbility() {
		if (cardHasAbility == null) {
			cardHasAbility = new EObjectContainmentEList<Card>(Card.class, this, HearthstonePackage.ABILITY__CARD_HAS_ABILITY);
		}
		return cardHasAbility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean Charge() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean IncreaseAttribute() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HearthstonePackage.ABILITY__CARD_HAS_ABILITY:
				return ((InternalEList<?>)getCardHasAbility()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HearthstonePackage.ABILITY__ABILITY_ID:
				return getAbilityID();
			case HearthstonePackage.ABILITY__ABILITY_TYPE:
				return getAbilityType();
			case HearthstonePackage.ABILITY__ABILITY_AFFECT:
				return getAbilityAffect();
			case HearthstonePackage.ABILITY__CARD_HAS_ABILITY:
				return getCardHasAbility();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HearthstonePackage.ABILITY__ABILITY_ID:
				setAbilityID((Integer)newValue);
				return;
			case HearthstonePackage.ABILITY__ABILITY_TYPE:
				setAbilityType((String)newValue);
				return;
			case HearthstonePackage.ABILITY__ABILITY_AFFECT:
				setAbilityAffect((String)newValue);
				return;
			case HearthstonePackage.ABILITY__CARD_HAS_ABILITY:
				getCardHasAbility().clear();
				getCardHasAbility().addAll((Collection<? extends Card>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case HearthstonePackage.ABILITY__ABILITY_ID:
				setAbilityID(ABILITY_ID_EDEFAULT);
				return;
			case HearthstonePackage.ABILITY__ABILITY_TYPE:
				setAbilityType(ABILITY_TYPE_EDEFAULT);
				return;
			case HearthstonePackage.ABILITY__ABILITY_AFFECT:
				setAbilityAffect(ABILITY_AFFECT_EDEFAULT);
				return;
			case HearthstonePackage.ABILITY__CARD_HAS_ABILITY:
				getCardHasAbility().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HearthstonePackage.ABILITY__ABILITY_ID:
				return abilityID != ABILITY_ID_EDEFAULT;
			case HearthstonePackage.ABILITY__ABILITY_TYPE:
				return ABILITY_TYPE_EDEFAULT == null ? abilityType != null : !ABILITY_TYPE_EDEFAULT.equals(abilityType);
			case HearthstonePackage.ABILITY__ABILITY_AFFECT:
				return ABILITY_AFFECT_EDEFAULT == null ? abilityAffect != null : !ABILITY_AFFECT_EDEFAULT.equals(abilityAffect);
			case HearthstonePackage.ABILITY__CARD_HAS_ABILITY:
				return cardHasAbility != null && !cardHasAbility.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HearthstonePackage.ABILITY___CHARGE:
				return Charge();
			case HearthstonePackage.ABILITY___INCREASE_ATTRIBUTE:
				return IncreaseAttribute();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (AbilityID: ");
		result.append(abilityID);
		result.append(", AbilityType: ");
		result.append(abilityType);
		result.append(", AbilityAffect: ");
		result.append(abilityAffect);
		result.append(')');
		return result.toString();
	}

} //AbilityImpl
