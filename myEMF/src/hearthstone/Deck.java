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
 * </ul>
 * </p>
 *
 * @see hearthstone.HearthstonePackage#getDeck()
 * @model
 * @generated
 */
public interface Deck extends EObject {
	/**
	 * Returns the value of the '<em><b>Deck ID</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deck ID</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deck ID</em>' attribute list.
	 * @see hearthstone.HearthstonePackage#getDeck_DeckID()
	 * @model upper="65535"
	 * @generated
	 */
	EList<Integer> getDeckID();

	/**
	 * Returns the value of the '<em><b>Deck Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deck Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deck Name</em>' attribute list.
	 * @see hearthstone.HearthstonePackage#getDeck_DeckName()
	 * @model upper="16"
	 * @generated
	 */
	EList<String> getDeckName();

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
	 * @model containment="true" upper="9"
	 * @generated
	 */
	EList<Card> getDeckHasCards();

} // Deck
