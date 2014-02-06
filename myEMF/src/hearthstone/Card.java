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
 * </ul>
 * </p>
 *
 * @see hearthstone.HearthstonePackage#getCard()
 * @model
 * @generated
 */
public interface Card extends EObject {
	/**
	 * Returns the value of the '<em><b>Card Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Name</em>' attribute list.
	 * @see hearthstone.HearthstonePackage#getCard_CardName()
	 * @model upper="16"
	 * @generated
	 */
	EList<String> getCardName();

	/**
	 * Returns the value of the '<em><b>Card Cost</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card Cost</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Cost</em>' attribute list.
	 * @see hearthstone.HearthstonePackage#getCard_CardCost()
	 * @model upper="20"
	 * @generated
	 */
	EList<String> getCardCost();

	/**
	 * Returns the value of the '<em><b>Card Life</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card Life</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Life</em>' attribute list.
	 * @see hearthstone.HearthstonePackage#getCard_CardLife()
	 * @model upper="256"
	 * @generated
	 */
	EList<Integer> getCardLife();

	/**
	 * Returns the value of the '<em><b>Card Power</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card Power</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Power</em>' attribute list.
	 * @see hearthstone.HearthstonePackage#getCard_CardPower()
	 * @model upper="256"
	 * @generated
	 */
	EList<Integer> getCardPower();

	/**
	 * Returns the value of the '<em><b>Card Quality</b></em>' attribute.
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
	 * @see #setCardQuality(int)
	 * @see hearthstone.HearthstonePackage#getCard_CardQuality()
	 * @model
	 * @generated
	 */
	int getCardQuality();

	/**
	 * Sets the value of the '{@link hearthstone.Card#getCardQuality <em>Card Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Quality</em>' attribute.
	 * @see #getCardQuality()
	 * @generated
	 */
	void setCardQuality(int value);

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
	 * Returns the value of the '<em><b>Card States</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
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
	 * @return the value of the '<em>Card States</em>' attribute list.
	 * @see hearthstone.HearthstonePackage#getCard_CardStates()
	 * @model upper="5"
	 * @generated
	 */
	EList<Integer> getCardStates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void PlayCard();

} // Card
