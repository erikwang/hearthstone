/**
 */
package hearthstone.impl;

import hearthstone.Ability;
import hearthstone.Card;
import hearthstone.HearthstonePackage;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hearthstone.impl.CardImpl#getCardName <em>Card Name</em>}</li>
 *   <li>{@link hearthstone.impl.CardImpl#getCardCost <em>Card Cost</em>}</li>
 *   <li>{@link hearthstone.impl.CardImpl#getCardLife <em>Card Life</em>}</li>
 *   <li>{@link hearthstone.impl.CardImpl#getCardPower <em>Card Power</em>}</li>
 *   <li>{@link hearthstone.impl.CardImpl#getCardQuality <em>Card Quality</em>}</li>
 *   <li>{@link hearthstone.impl.CardImpl#getCardNumberLimit <em>Card Number Limit</em>}</li>
 *   <li>{@link hearthstone.impl.CardImpl#getCardRace <em>Card Race</em>}</li>
 *   <li>{@link hearthstone.impl.CardImpl#getCardStates <em>Card States</em>}</li>
 *   <li>{@link hearthstone.impl.CardImpl#getCardAbility <em>Card Ability</em>}</li>
 *   <li>{@link hearthstone.impl.CardImpl#getCardAbilityList <em>Card Ability List</em>}</li>
 *   <li>{@link hearthstone.impl.CardImpl#getCardClass <em>Card Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CardImpl extends MinimalEObjectImpl.Container implements Card {
	/**
	 * The default value of the '{@link #getCardName() <em>Card Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardName()
	 * @generated
	 * @ordered
	 */
	protected static final String CARD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardName() <em>Card Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardName()
	 * @generated
	 * @ordered
	 */
	protected String cardName = CARD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardCost() <em>Card Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardCost()
	 * @generated
	 * @ordered
	 */
	protected static final String CARD_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardCost() <em>Card Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardCost()
	 * @generated
	 * @ordered
	 */
	protected String cardCost = CARD_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardLife() <em>Card Life</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardLife()
	 * @generated
	 * @ordered
	 */
	protected static final int CARD_LIFE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCardLife() <em>Card Life</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardLife()
	 * @generated
	 * @ordered
	 */
	protected int cardLife = CARD_LIFE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardPower() <em>Card Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardPower()
	 * @generated
	 * @ordered
	 */
	protected static final int CARD_POWER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCardPower() <em>Card Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardPower()
	 * @generated
	 * @ordered
	 */
	protected int cardPower = CARD_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardQuality() <em>Card Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardQuality()
	 * @generated
	 * @ordered
	 */
	protected static final String CARD_QUALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardQuality() <em>Card Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardQuality()
	 * @generated
	 * @ordered
	 */
	protected String cardQuality = CARD_QUALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardNumberLimit() <em>Card Number Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardNumberLimit()
	 * @generated
	 * @ordered
	 */
	protected static final int CARD_NUMBER_LIMIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCardNumberLimit() <em>Card Number Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardNumberLimit()
	 * @generated
	 * @ordered
	 */
	protected int cardNumberLimit = CARD_NUMBER_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardRace() <em>Card Race</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardRace()
	 * @generated
	 * @ordered
	 */
	protected static final String CARD_RACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardRace() <em>Card Race</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardRace()
	 * @generated
	 * @ordered
	 */
	protected String cardRace = CARD_RACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardStates() <em>Card States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardStates()
	 * @generated
	 * @ordered
	 */
	protected static final int CARD_STATES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCardStates() <em>Card States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardStates()
	 * @generated
	 * @ordered
	 */
	protected int cardStates = CARD_STATES_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardAbility() <em>Card Ability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardAbility()
	 * @generated
	 * @ordered
	 */
	protected static final String CARD_ABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardAbility() <em>Card Ability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardAbility()
	 * @generated
	 * @ordered
	 */
	protected String cardAbility = CARD_ABILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCardAbilityList() <em>Card Ability List</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardAbilityList()
	 * @generated
	 * @ordered
	 */
	protected EList<Ability> cardAbilityList;

	/**
	 * The default value of the '{@link #getCardClass() <em>Card Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardClass()
	 * @generated
	 * @ordered
	 */
	protected static final String CARD_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardClass() <em>Card Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardClass()
	 * @generated
	 * @ordered
	 */
	protected String cardClass = CARD_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HearthstonePackage.Literals.CARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCardName() {
		return cardName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardName(String newCardName) {
		String oldCardName = cardName;
		cardName = newCardName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.CARD__CARD_NAME, oldCardName, cardName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCardCost() {
		return cardCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardCost(String newCardCost) {
		String oldCardCost = cardCost;
		cardCost = newCardCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.CARD__CARD_COST, oldCardCost, cardCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCardLife() {
		return cardLife;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardLife(int newCardLife) {
		int oldCardLife = cardLife;
		cardLife = newCardLife;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.CARD__CARD_LIFE, oldCardLife, cardLife));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCardPower() {
		return cardPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardPower(int newCardPower) {
		int oldCardPower = cardPower;
		cardPower = newCardPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.CARD__CARD_POWER, oldCardPower, cardPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCardQuality() {
		return cardQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardQuality(String newCardQuality) {
		String oldCardQuality = cardQuality;
		cardQuality = newCardQuality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.CARD__CARD_QUALITY, oldCardQuality, cardQuality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCardNumberLimit() {
		return cardNumberLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardNumberLimit(int newCardNumberLimit) {
		int oldCardNumberLimit = cardNumberLimit;
		cardNumberLimit = newCardNumberLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.CARD__CARD_NUMBER_LIMIT, oldCardNumberLimit, cardNumberLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCardRace() {
		return cardRace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardRace(String newCardRace) {
		String oldCardRace = cardRace;
		cardRace = newCardRace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.CARD__CARD_RACE, oldCardRace, cardRace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCardStates() {
		return cardStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardStates(int newCardStates) {
		int oldCardStates = cardStates;
		cardStates = newCardStates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.CARD__CARD_STATES, oldCardStates, cardStates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCardAbility() {
		return cardAbility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardAbility(String newCardAbility) {
		String oldCardAbility = cardAbility;
		cardAbility = newCardAbility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.CARD__CARD_ABILITY, oldCardAbility, cardAbility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ability> getCardAbilityList() {
		if (cardAbilityList == null) {
			cardAbilityList = new EDataTypeUniqueEList<Ability>(Ability.class, this, HearthstonePackage.CARD__CARD_ABILITY_LIST);
		}
		return cardAbilityList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCardClass() {
		return cardClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardClass(String newCardClass) {
		String oldCardClass = cardClass;
		cardClass = newCardClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.CARD__CARD_CLASS, oldCardClass, cardClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void PlayCard() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HearthstonePackage.CARD__CARD_NAME:
				return getCardName();
			case HearthstonePackage.CARD__CARD_COST:
				return getCardCost();
			case HearthstonePackage.CARD__CARD_LIFE:
				return getCardLife();
			case HearthstonePackage.CARD__CARD_POWER:
				return getCardPower();
			case HearthstonePackage.CARD__CARD_QUALITY:
				return getCardQuality();
			case HearthstonePackage.CARD__CARD_NUMBER_LIMIT:
				return getCardNumberLimit();
			case HearthstonePackage.CARD__CARD_RACE:
				return getCardRace();
			case HearthstonePackage.CARD__CARD_STATES:
				return getCardStates();
			case HearthstonePackage.CARD__CARD_ABILITY:
				return getCardAbility();
			case HearthstonePackage.CARD__CARD_ABILITY_LIST:
				return getCardAbilityList();
			case HearthstonePackage.CARD__CARD_CLASS:
				return getCardClass();
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
			case HearthstonePackage.CARD__CARD_NAME:
				setCardName((String)newValue);
				return;
			case HearthstonePackage.CARD__CARD_COST:
				setCardCost((String)newValue);
				return;
			case HearthstonePackage.CARD__CARD_LIFE:
				setCardLife((Integer)newValue);
				return;
			case HearthstonePackage.CARD__CARD_POWER:
				setCardPower((Integer)newValue);
				return;
			case HearthstonePackage.CARD__CARD_QUALITY:
				setCardQuality((String)newValue);
				return;
			case HearthstonePackage.CARD__CARD_NUMBER_LIMIT:
				setCardNumberLimit((Integer)newValue);
				return;
			case HearthstonePackage.CARD__CARD_RACE:
				setCardRace((String)newValue);
				return;
			case HearthstonePackage.CARD__CARD_STATES:
				setCardStates((Integer)newValue);
				return;
			case HearthstonePackage.CARD__CARD_ABILITY:
				setCardAbility((String)newValue);
				return;
			case HearthstonePackage.CARD__CARD_ABILITY_LIST:
				getCardAbilityList().clear();
				getCardAbilityList().addAll((Collection<? extends Ability>)newValue);
				return;
			case HearthstonePackage.CARD__CARD_CLASS:
				setCardClass((String)newValue);
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
			case HearthstonePackage.CARD__CARD_NAME:
				setCardName(CARD_NAME_EDEFAULT);
				return;
			case HearthstonePackage.CARD__CARD_COST:
				setCardCost(CARD_COST_EDEFAULT);
				return;
			case HearthstonePackage.CARD__CARD_LIFE:
				setCardLife(CARD_LIFE_EDEFAULT);
				return;
			case HearthstonePackage.CARD__CARD_POWER:
				setCardPower(CARD_POWER_EDEFAULT);
				return;
			case HearthstonePackage.CARD__CARD_QUALITY:
				setCardQuality(CARD_QUALITY_EDEFAULT);
				return;
			case HearthstonePackage.CARD__CARD_NUMBER_LIMIT:
				setCardNumberLimit(CARD_NUMBER_LIMIT_EDEFAULT);
				return;
			case HearthstonePackage.CARD__CARD_RACE:
				setCardRace(CARD_RACE_EDEFAULT);
				return;
			case HearthstonePackage.CARD__CARD_STATES:
				setCardStates(CARD_STATES_EDEFAULT);
				return;
			case HearthstonePackage.CARD__CARD_ABILITY:
				setCardAbility(CARD_ABILITY_EDEFAULT);
				return;
			case HearthstonePackage.CARD__CARD_ABILITY_LIST:
				getCardAbilityList().clear();
				return;
			case HearthstonePackage.CARD__CARD_CLASS:
				setCardClass(CARD_CLASS_EDEFAULT);
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
			case HearthstonePackage.CARD__CARD_NAME:
				return CARD_NAME_EDEFAULT == null ? cardName != null : !CARD_NAME_EDEFAULT.equals(cardName);
			case HearthstonePackage.CARD__CARD_COST:
				return CARD_COST_EDEFAULT == null ? cardCost != null : !CARD_COST_EDEFAULT.equals(cardCost);
			case HearthstonePackage.CARD__CARD_LIFE:
				return cardLife != CARD_LIFE_EDEFAULT;
			case HearthstonePackage.CARD__CARD_POWER:
				return cardPower != CARD_POWER_EDEFAULT;
			case HearthstonePackage.CARD__CARD_QUALITY:
				return CARD_QUALITY_EDEFAULT == null ? cardQuality != null : !CARD_QUALITY_EDEFAULT.equals(cardQuality);
			case HearthstonePackage.CARD__CARD_NUMBER_LIMIT:
				return cardNumberLimit != CARD_NUMBER_LIMIT_EDEFAULT;
			case HearthstonePackage.CARD__CARD_RACE:
				return CARD_RACE_EDEFAULT == null ? cardRace != null : !CARD_RACE_EDEFAULT.equals(cardRace);
			case HearthstonePackage.CARD__CARD_STATES:
				return cardStates != CARD_STATES_EDEFAULT;
			case HearthstonePackage.CARD__CARD_ABILITY:
				return CARD_ABILITY_EDEFAULT == null ? cardAbility != null : !CARD_ABILITY_EDEFAULT.equals(cardAbility);
			case HearthstonePackage.CARD__CARD_ABILITY_LIST:
				return cardAbilityList != null && !cardAbilityList.isEmpty();
			case HearthstonePackage.CARD__CARD_CLASS:
				return CARD_CLASS_EDEFAULT == null ? cardClass != null : !CARD_CLASS_EDEFAULT.equals(cardClass);
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
			case HearthstonePackage.CARD___PLAY_CARD:
				PlayCard();
				return null;
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
		result.append(" (CardName: ");
		result.append(cardName);
		result.append(", CardCost: ");
		result.append(cardCost);
		result.append(", CardLife: ");
		result.append(cardLife);
		result.append(", CardPower: ");
		result.append(cardPower);
		result.append(", CardQuality: ");
		result.append(cardQuality);
		result.append(", CardNumberLimit: ");
		result.append(cardNumberLimit);
		result.append(", CardRace: ");
		result.append(cardRace);
		result.append(", CardStates: ");
		result.append(cardStates);
		result.append(", CardAbility: ");
		result.append(cardAbility);
		result.append(", CardAbilityList: ");
		result.append(cardAbilityList);
		result.append(", CardClass: ");
		result.append(cardClass);
		result.append(')');
		return result.toString();
	}

} //CardImpl
