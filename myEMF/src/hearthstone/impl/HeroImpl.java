/**
 */
package hearthstone.impl;

import hearthstone.HearthstonePackage;
import hearthstone.Hero;
import hearthstone.HeroClass;
import hearthstone.HeroStates;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hero</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hearthstone.impl.HeroImpl#getHeroClass <em>Hero Class</em>}</li>
 *   <li>{@link hearthstone.impl.HeroImpl#getHeroHealth <em>Hero Health</em>}</li>
 *   <li>{@link hearthstone.impl.HeroImpl#getHeroStates <em>Hero States</em>}</li>
 *   <li>{@link hearthstone.impl.HeroImpl#getHeroAbility <em>Hero Ability</em>}</li>
 *   <li>{@link hearthstone.impl.HeroImpl#getHeroDesc <em>Hero Desc</em>}</li>
 *   <li>{@link hearthstone.impl.HeroImpl#getHeroPower <em>Hero Power</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HeroImpl extends MinimalEObjectImpl.Container implements Hero {
	/**
	 * The default value of the '{@link #getHeroClass() <em>Hero Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeroClass()
	 * @generated
	 * @ordered
	 */
	protected static final HeroClass HERO_CLASS_EDEFAULT = HeroClass.MAGE;

	/**
	 * The cached value of the '{@link #getHeroClass() <em>Hero Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeroClass()
	 * @generated
	 * @ordered
	 */
	protected HeroClass heroClass = HERO_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeroHealth() <em>Hero Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeroHealth()
	 * @generated
	 * @ordered
	 */
	protected static final int HERO_HEALTH_EDEFAULT = 30;

	/**
	 * The cached value of the '{@link #getHeroHealth() <em>Hero Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeroHealth()
	 * @generated
	 * @ordered
	 */
	protected int heroHealth = HERO_HEALTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeroStates() <em>Hero States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeroStates()
	 * @generated
	 * @ordered
	 */
	protected static final HeroStates HERO_STATES_EDEFAULT = HeroStates.READY_FOR_ACTION;

	/**
	 * The cached value of the '{@link #getHeroStates() <em>Hero States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeroStates()
	 * @generated
	 * @ordered
	 */
	protected HeroStates heroStates = HERO_STATES_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeroAbility() <em>Hero Ability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeroAbility()
	 * @generated
	 * @ordered
	 */
	protected static final String HERO_ABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeroAbility() <em>Hero Ability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeroAbility()
	 * @generated
	 * @ordered
	 */
	protected String heroAbility = HERO_ABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeroDesc() <em>Hero Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeroDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String HERO_DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeroDesc() <em>Hero Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeroDesc()
	 * @generated
	 * @ordered
	 */
	protected String heroDesc = HERO_DESC_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeroPower() <em>Hero Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeroPower()
	 * @generated
	 * @ordered
	 */
	protected static final int HERO_POWER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeroPower() <em>Hero Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeroPower()
	 * @generated
	 * @ordered
	 */
	protected int heroPower = HERO_POWER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeroImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HearthstonePackage.Literals.HERO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeroClass getHeroClass() {
		return heroClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeroClass(HeroClass newHeroClass) {
		HeroClass oldHeroClass = heroClass;
		heroClass = newHeroClass == null ? HERO_CLASS_EDEFAULT : newHeroClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.HERO__HERO_CLASS, oldHeroClass, heroClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeroHealth() {
		return heroHealth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeroHealth(int newHeroHealth) {
		int oldHeroHealth = heroHealth;
		heroHealth = newHeroHealth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.HERO__HERO_HEALTH, oldHeroHealth, heroHealth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeroStates getHeroStates() {
		return heroStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeroStates(HeroStates newHeroStates) {
		HeroStates oldHeroStates = heroStates;
		heroStates = newHeroStates == null ? HERO_STATES_EDEFAULT : newHeroStates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.HERO__HERO_STATES, oldHeroStates, heroStates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeroAbility() {
		return heroAbility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeroAbility(String newHeroAbility) {
		String oldHeroAbility = heroAbility;
		heroAbility = newHeroAbility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.HERO__HERO_ABILITY, oldHeroAbility, heroAbility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeroDesc() {
		return heroDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeroDesc(String newHeroDesc) {
		String oldHeroDesc = heroDesc;
		heroDesc = newHeroDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.HERO__HERO_DESC, oldHeroDesc, heroDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeroPower() {
		return heroPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeroPower(int newHeroPower) {
		int oldHeroPower = heroPower;
		heroPower = newHeroPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.HERO__HERO_POWER, oldHeroPower, heroPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HearthstonePackage.HERO__HERO_CLASS:
				return getHeroClass();
			case HearthstonePackage.HERO__HERO_HEALTH:
				return getHeroHealth();
			case HearthstonePackage.HERO__HERO_STATES:
				return getHeroStates();
			case HearthstonePackage.HERO__HERO_ABILITY:
				return getHeroAbility();
			case HearthstonePackage.HERO__HERO_DESC:
				return getHeroDesc();
			case HearthstonePackage.HERO__HERO_POWER:
				return getHeroPower();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HearthstonePackage.HERO__HERO_CLASS:
				setHeroClass((HeroClass)newValue);
				return;
			case HearthstonePackage.HERO__HERO_HEALTH:
				setHeroHealth((Integer)newValue);
				return;
			case HearthstonePackage.HERO__HERO_STATES:
				setHeroStates((HeroStates)newValue);
				return;
			case HearthstonePackage.HERO__HERO_ABILITY:
				setHeroAbility((String)newValue);
				return;
			case HearthstonePackage.HERO__HERO_DESC:
				setHeroDesc((String)newValue);
				return;
			case HearthstonePackage.HERO__HERO_POWER:
				setHeroPower((Integer)newValue);
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
			case HearthstonePackage.HERO__HERO_CLASS:
				setHeroClass(HERO_CLASS_EDEFAULT);
				return;
			case HearthstonePackage.HERO__HERO_HEALTH:
				setHeroHealth(HERO_HEALTH_EDEFAULT);
				return;
			case HearthstonePackage.HERO__HERO_STATES:
				setHeroStates(HERO_STATES_EDEFAULT);
				return;
			case HearthstonePackage.HERO__HERO_ABILITY:
				setHeroAbility(HERO_ABILITY_EDEFAULT);
				return;
			case HearthstonePackage.HERO__HERO_DESC:
				setHeroDesc(HERO_DESC_EDEFAULT);
				return;
			case HearthstonePackage.HERO__HERO_POWER:
				setHeroPower(HERO_POWER_EDEFAULT);
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
			case HearthstonePackage.HERO__HERO_CLASS:
				return heroClass != HERO_CLASS_EDEFAULT;
			case HearthstonePackage.HERO__HERO_HEALTH:
				return heroHealth != HERO_HEALTH_EDEFAULT;
			case HearthstonePackage.HERO__HERO_STATES:
				return heroStates != HERO_STATES_EDEFAULT;
			case HearthstonePackage.HERO__HERO_ABILITY:
				return HERO_ABILITY_EDEFAULT == null ? heroAbility != null : !HERO_ABILITY_EDEFAULT.equals(heroAbility);
			case HearthstonePackage.HERO__HERO_DESC:
				return HERO_DESC_EDEFAULT == null ? heroDesc != null : !HERO_DESC_EDEFAULT.equals(heroDesc);
			case HearthstonePackage.HERO__HERO_POWER:
				return heroPower != HERO_POWER_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (HeroClass: ");
		result.append(heroClass);
		result.append(", HeroHealth: ");
		result.append(heroHealth);
		result.append(", HeroStates: ");
		result.append(heroStates);
		result.append(", HeroAbility: ");
		result.append(heroAbility);
		result.append(", HeroDesc: ");
		result.append(heroDesc);
		result.append(", HeroPower: ");
		result.append(heroPower);
		result.append(')');
		return result.toString();
	}

} //HeroImpl
