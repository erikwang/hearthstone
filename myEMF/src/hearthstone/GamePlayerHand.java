/**
 */
package hearthstone;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Player Hand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hearthstone.GamePlayerHand#getCardsInHand <em>Cards In Hand</em>}</li>
 *   <li>{@link hearthstone.GamePlayerHand#getHandOwner <em>Hand Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see hearthstone.HearthstonePackage#getGamePlayerHand()
 * @model
 * @generated
 */
public interface GamePlayerHand extends GameDeck {
	/**
	 * Returns the value of the '<em><b>Cards In Hand</b></em>' containment reference list.
	 * The list contents are of type {@link hearthstone.Card}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cards In Hand</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cards In Hand</em>' containment reference list.
	 * @see hearthstone.HearthstonePackage#getGamePlayerHand_CardsInHand()
	 * @model containment="true" upper="10"
	 * @generated
	 */
	EList<Card> getCardsInHand();

	/**
	 * Returns the value of the '<em><b>Hand Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hand Owner</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hand Owner</em>' attribute.
	 * @see #setHandOwner(String)
	 * @see hearthstone.HearthstonePackage#getGamePlayerHand_HandOwner()
	 * @model
	 * @generated
	 */
	String getHandOwner();

	/**
	 * Sets the value of the '{@link hearthstone.GamePlayerHand#getHandOwner <em>Hand Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hand Owner</em>' attribute.
	 * @see #getHandOwner()
	 * @generated
	 */
	void setHandOwner(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ShowGameHand();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" upper="5"
	 * @generated NOT
	 */
	boolean DrawCard(Player _player);

} // GamePlayerHand
