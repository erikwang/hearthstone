/**
 */
package hearthstone;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deck</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hearthstone.Deck#getDeckID <em>Deck ID</em>}</li>
 *   <li>{@link hearthstone.Deck#getDeckName <em>Deck Name</em>}</li>
 *   <li>{@link hearthstone.Deck#getDeckHasCards <em>Deck Has Cards</em>}</li>
 *   <li>{@link hearthstone.Deck#getDeckHasHero <em>Deck Has Hero</em>}</li>
 * </ul>
 * </p>
 *
 * @see hearthstone.HearthstonePackage#getDeck()
 * @model
 * @generated
 */
public interface Deck extends EObject {
	/**
	 * Returns the value of the '<em><b>Deck ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deck ID</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deck ID</em>' attribute.
	 * @see #setDeckID(int)
	 * @see hearthstone.HearthstonePackage#getDeck_DeckID()
	 * @model
	 * @generated
	 */
	int getDeckID();

	/**
	 * Sets the value of the '{@link hearthstone.Deck#getDeckID <em>Deck ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deck ID</em>' attribute.
	 * @see #getDeckID()
	 * @generated
	 */
	void setDeckID(int value);

	/**
	 * Returns the value of the '<em><b>Deck Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deck Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deck Name</em>' attribute.
	 * @see #setDeckName(String)
	 * @see hearthstone.HearthstonePackage#getDeck_DeckName()
	 * @model
	 * @generated
	 */
	String getDeckName();

	/**
	 * Sets the value of the '{@link hearthstone.Deck#getDeckName <em>Deck Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deck Name</em>' attribute.
	 * @see #getDeckName()
	 * @generated
	 */
	void setDeckName(String value);

	/**
	 * Returns the value of the '<em><b>Deck Has Cards</b></em>' containment reference list.
	 * The list contents are of type {@link hearthstone.Card}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deck Has Cards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deck Has Cards</em>' containment reference list.
	 * @see hearthstone.HearthstonePackage#getDeck_DeckHasCards()
	 * @model containment="true" lower="30" upper="30"
	 * @generated
	 */
	EList<Card> getDeckHasCards();

	/**
	 * Returns the value of the '<em><b>Deck Has Hero</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deck Has Hero</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deck Has Hero</em>' containment reference.
	 * @see #setDeckHasHero(Hero)
	 * @see hearthstone.HearthstonePackage#getDeck_DeckHasHero()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Hero getDeckHasHero();

	/**
	 * Sets the value of the '{@link hearthstone.Deck#getDeckHasHero <em>Deck Has Hero</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deck Has Hero</em>' containment reference.
	 * @see #getDeckHasHero()
	 * @generated
	 */
	void setDeckHasHero(Hero value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean Hello();

} // Deck
