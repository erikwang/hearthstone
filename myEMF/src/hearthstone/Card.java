/**
 */
package hearthstone;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hearthstone.Card#getCardName <em>Card Name</em>}</li>
 *   <li>{@link hearthstone.Card#getCardCost <em>Card Cost</em>}</li>
 *   <li>{@link hearthstone.Card#getCardLife <em>Card Life</em>}</li>
 *   <li>{@link hearthstone.Card#getCardPower <em>Card Power</em>}</li>
 *   <li>{@link hearthstone.Card#getCardQuality <em>Card Quality</em>}</li>
 *   <li>{@link hearthstone.Card#getCardNumberLimit <em>Card Number Limit</em>}</li>
 *   <li>{@link hearthstone.Card#getCardRace <em>Card Race</em>}</li>
 *   <li>{@link hearthstone.Card#getCardStates <em>Card States</em>}</li>
 *   <li>{@link hearthstone.Card#getCardClass <em>Card Class</em>}</li>
 *   <li>{@link hearthstone.Card#getCardHasAbilities <em>Card Has Abilities</em>}</li>
 *   <li>{@link hearthstone.Card#getCardSN <em>Card SN</em>}</li>
 *   <li>{@link hearthstone.Card#getCardAbilityDesc <em>Card Ability Desc</em>}</li>
 *   <li>{@link hearthstone.Card#getCardDeckSN <em>Card Deck SN</em>}</li>
 * </ul>
 * </p>
 *
 * @see hearthstone.HearthstonePackage#getCard()
 * @model
 * @generated
 */
public interface Card extends EObject {
	/**
	 * Returns the value of the '<em><b>Card Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Name</em>' attribute.
	 * @see #setCardName(String)
	 * @see hearthstone.HearthstonePackage#getCard_CardName()
	 * @model
	 * @generated
	 */
	String getCardName();

	/**
	 * Sets the value of the '{@link hearthstone.Card#getCardName <em>Card Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Name</em>' attribute.
	 * @see #getCardName()
	 * @generated
	 */
	void setCardName(String value);

	/**
	 * Returns the value of the '<em><b>Card Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Cost</em>' attribute.
	 * @see #setCardCost(String)
	 * @see hearthstone.HearthstonePackage#getCard_CardCost()
	 * @model
	 * @generated
	 */
	String getCardCost();

	/**
	 * Sets the value of the '{@link hearthstone.Card#getCardCost <em>Card Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Cost</em>' attribute.
	 * @see #getCardCost()
	 * @generated
	 */
	void setCardCost(String value);

	/**
	 * Returns the value of the '<em><b>Card Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card Life</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Life</em>' attribute.
	 * @see #setCardLife(int)
	 * @see hearthstone.HearthstonePackage#getCard_CardLife()
	 * @model
	 * @generated
	 */
	int getCardLife();

	/**
	 * Sets the value of the '{@link hearthstone.Card#getCardLife <em>Card Life</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Life</em>' attribute.
	 * @see #getCardLife()
	 * @generated
	 */
	void setCardLife(int value);

	/**
	 * Returns the value of the '<em><b>Card Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Power</em>' attribute.
	 * @see #setCardPower(int)
	 * @see hearthstone.HearthstonePackage#getCard_CardPower()
	 * @model
	 * @generated
	 */
	int getCardPower();

	/**
	 * Sets the value of the '{@link hearthstone.Card#getCardPower <em>Card Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Power</em>' attribute.
	 * @see #getCardPower()
	 * @generated
	 */
	void setCardPower(int value);

	/**
	 * Returns the value of the '<em><b>Card Quality</b></em>' attribute.
	 * The literals are from the enumeration {@link hearthstone.CardQuality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Quality means:
	 * 1 - normal
	 * 2 - rare
	 * 3 - epic
	 * 4 - legedary
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Card Quality</em>' attribute.
	 * @see hearthstone.CardQuality
	 * @see #setCardQuality(CardQuality)
	 * @see hearthstone.HearthstonePackage#getCard_CardQuality()
	 * @model
	 * @generated
	 */
	CardQuality getCardQuality();

	/**
	 * Sets the value of the '{@link hearthstone.Card#getCardQuality <em>Card Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Quality</em>' attribute.
	 * @see hearthstone.CardQuality
	 * @see #getCardQuality()
	 * @generated
	 */
	void setCardQuality(CardQuality value);

	/**
	 * Returns the value of the '<em><b>Card Number Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card Number Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Number Limit</em>' attribute.
	 * @see #setCardNumberLimit(int)
	 * @see hearthstone.HearthstonePackage#getCard_CardNumberLimit()
	 * @model extendedMetaData="wildcards='' name=''"
	 * @generated
	 */
	int getCardNumberLimit();

	/**
	 * Sets the value of the '{@link hearthstone.Card#getCardNumberLimit <em>Card Number Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Number Limit</em>' attribute.
	 * @see #getCardNumberLimit()
	 * @generated
	 */
	void setCardNumberLimit(int value);

	/**
	 * Returns the value of the '<em><b>Card Race</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Race means:
	 * 1 - Normal minion
	 * 2 - Beast
	 * 3 - Pirate
	 * 4 - Spell
	 * 5 - Weapon
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Card Race</em>' attribute.
	 * @see #setCardRace(String)
	 * @see hearthstone.HearthstonePackage#getCard_CardRace()
	 * @model
	 * @generated
	 */
	String getCardRace();

	/**
	 * Sets the value of the '{@link hearthstone.Card#getCardRace <em>Card Race</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Race</em>' attribute.
	 * @see #getCardRace()
	 * @generated
	 */
	void setCardRace(String value);

	/**
	 * Returns the value of the '<em><b>Card States</b></em>' attribute.
	 * The literals are from the enumeration {@link hearthstone.CardStates}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * States means the card is:
	 * In deck - 1
	 * In hand - 2
	 * Sleep -10
	 * Active - 11
	 * Destory - 99
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Card States</em>' attribute.
	 * @see hearthstone.CardStates
	 * @see #setCardStates(CardStates)
	 * @see hearthstone.HearthstonePackage#getCard_CardStates()
	 * @model
	 * @generated
	 */
	CardStates getCardStates();

	/**
	 * Sets the value of the '{@link hearthstone.Card#getCardStates <em>Card States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card States</em>' attribute.
	 * @see hearthstone.CardStates
	 * @see #getCardStates()
	 * @generated
	 */
	void setCardStates(CardStates value);

	/**
	 * Returns the value of the '<em><b>Card Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Class</em>' attribute.
	 * @see #setCardClass(String)
	 * @see hearthstone.HearthstonePackage#getCard_CardClass()
	 * @model
	 * @generated
	 */
	String getCardClass();

	/**
	 * Sets the value of the '{@link hearthstone.Card#getCardClass <em>Card Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Class</em>' attribute.
	 * @see #getCardClass()
	 * @generated
	 */
	void setCardClass(String value);

	/**
	 * Returns the value of the '<em><b>Card Has Abilities</b></em>' containment reference list.
	 * The list contents are of type {@link hearthstone.Ability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card Has Abilities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Has Abilities</em>' containment reference list.
	 * @see hearthstone.HearthstonePackage#getCard_CardHasAbilities()
	 * @model containment="true" upper="5"
	 * @generated
	 */
	EList<Ability> getCardHasAbilities();

	/**
	 * Returns the value of the '<em><b>Card SN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card SN</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card SN</em>' attribute.
	 * @see #setCardSN(int)
	 * @see hearthstone.HearthstonePackage#getCard_CardSN()
	 * @model
	 * @generated
	 */
	int getCardSN();

	/**
	 * Sets the value of the '{@link hearthstone.Card#getCardSN <em>Card SN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card SN</em>' attribute.
	 * @see #getCardSN()
	 * @generated
	 */
	void setCardSN(int value);

	/**
	 * Returns the value of the '<em><b>Card Ability Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card Ability Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Ability Desc</em>' attribute.
	 * @see #setCardAbilityDesc(String)
	 * @see hearthstone.HearthstonePackage#getCard_CardAbilityDesc()
	 * @model
	 * @generated
	 */
	String getCardAbilityDesc();

	/**
	 * Sets the value of the '{@link hearthstone.Card#getCardAbilityDesc <em>Card Ability Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Ability Desc</em>' attribute.
	 * @see #getCardAbilityDesc()
	 * @generated
	 */
	void setCardAbilityDesc(String value);

	/**
	 * Returns the value of the '<em><b>Card Deck SN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card Deck SN</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Deck SN</em>' attribute.
	 * @see #setCardDeckSN(int)
	 * @see hearthstone.HearthstonePackage#getCard_CardDeckSN()
	 * @model
	 * @generated
	 */
	int getCardDeckSN();

	/**
	 * Sets the value of the '{@link hearthstone.Card#getCardDeckSN <em>Card Deck SN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Deck SN</em>' attribute.
	 * @see #getCardDeckSN()
	 * @generated
	 */
	void setCardDeckSN(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean UpdateCardStates(int CardStates);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void InteractAnotherCard(Card thecard);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ShowCard();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void InteractOppoHero(Hero theHero);

} // Card
