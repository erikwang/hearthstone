/**
 */
package hearthstone.impl;

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
 * </ul>
 * </p>
 *
 * @generated
 */
public class CardImpl extends MinimalEObjectImpl.Container implements Card {
	/**
	 * The cached value of the '{@link #getCardName() <em>Card Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> cardName;

	/**
	 * The cached value of the '{@link #getCardCost() <em>Card Cost</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardCost()
	 * @generated
	 * @ordered
	 */
	protected EList<String> cardCost;

	/**
	 * The cached value of the '{@link #getCardLife() <em>Card Life</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardLife()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> cardLife;

	/**
	 * The cached value of the '{@link #getCardPower() <em>Card Power</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardPower()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> cardPower;

	/**
	 * The default value of the '{@link #getCardQuality() <em>Card Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardQuality()
	 * @generated
	 * @ordered
	 */
	protected static final int CARD_QUALITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCardQuality() <em>Card Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardQuality()
	 * @generated
	 * @ordered
	 */
	protected int cardQuality = CARD_QUALITY_EDEFAULT;

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
	 * The cached value of the '{@link #getCardStates() <em>Card States</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardStates()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> cardStates;

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
	public EList<String> getCardName() {
		if (cardName == null) {
			cardName = new EDataTypeUniqueEList<String>(String.class, this, HearthstonePackage.CARD__CARD_NAME);
		}
		return cardName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCardCost() {
		if (cardCost == null) {
			cardCost = new EDataTypeUniqueEList<String>(String.class, this, HearthstonePackage.CARD__CARD_COST);
		}
		return cardCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getCardLife() {
		if (cardLife == null) {
			cardLife = new EDataTypeUniqueEList<Integer>(Integer.class, this, HearthstonePackage.CARD__CARD_LIFE);
		}
		return cardLife;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getCardPower() {
		if (cardPower == null) {
			cardPower = new EDataTypeUniqueEList<Integer>(Integer.class, this, HearthstonePackage.CARD__CARD_POWER);
		}
		return cardPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCardQuality() {
		return cardQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardQuality(int newCardQuality) {
		int oldCardQuality = cardQuality;
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
	public EList<Integer> getCardStates() {
		if (cardStates == null) {
			cardStates = new EDataTypeUniqueEList<Integer>(Integer.class, this, HearthstonePackage.CARD__CARD_STATES);
		}
		return cardStates;
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
				getCardName().clear();
				getCardName().addAll((Collection<? extends String>)newValue);
				return;
			case HearthstonePackage.CARD__CARD_COST:
				getCardCost().clear();
				getCardCost().addAll((Collection<? extends String>)newValue);
				return;
			case HearthstonePackage.CARD__CARD_LIFE:
				getCardLife().clear();
				getCardLife().addAll((Collection<? extends Integer>)newValue);
				return;
			case HearthstonePackage.CARD__CARD_POWER:
				getCardPower().clear();
				getCardPower().addAll((Collection<? extends Integer>)newValue);
				return;
			case HearthstonePackage.CARD__CARD_QUALITY:
				setCardQuality((Integer)newValue);
				return;
			case HearthstonePackage.CARD__CARD_NUMBER_LIMIT:
				setCardNumberLimit((Integer)newValue);
				return;
			case HearthstonePackage.CARD__CARD_RACE:
				setCardRace((String)newValue);
				return;
			case HearthstonePackage.CARD__CARD_STATES:
				getCardStates().clear();
				getCardStates().addAll((Collection<? extends Integer>)newValue);
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
				getCardName().clear();
				return;
			case HearthstonePackage.CARD__CARD_COST:
				getCardCost().clear();
				return;
			case HearthstonePackage.CARD__CARD_LIFE:
				getCardLife().clear();
				return;
			case HearthstonePackage.CARD__CARD_POWER:
				getCardPower().clear();
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
				getCardStates().clear();
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
				return cardName != null && !cardName.isEmpty();
			case HearthstonePackage.CARD__CARD_COST:
				return cardCost != null && !cardCost.isEmpty();
			case HearthstonePackage.CARD__CARD_LIFE:
				return cardLife != null && !cardLife.isEmpty();
			case HearthstonePackage.CARD__CARD_POWER:
				return cardPower != null && !cardPower.isEmpty();
			case HearthstonePackage.CARD__CARD_QUALITY:
				return cardQuality != CARD_QUALITY_EDEFAULT;
			case HearthstonePackage.CARD__CARD_NUMBER_LIMIT:
				return cardNumberLimit != CARD_NUMBER_LIMIT_EDEFAULT;
			case HearthstonePackage.CARD__CARD_RACE:
				return CARD_RACE_EDEFAULT == null ? cardRace != null : !CARD_RACE_EDEFAULT.equals(cardRace);
			case HearthstonePackage.CARD__CARD_STATES:
				return cardStates != null && !cardStates.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //CardImpl
