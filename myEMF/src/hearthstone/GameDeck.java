/**
 */
package hearthstone;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Deck</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hearthstone.GameDeck#getDeckOwner <em>Deck Owner</em>}</li>
 *   <li>{@link hearthstone.GameDeck#getGameStartDeckCards <em>Game Start Deck Cards</em>}</li>
 * </ul>
 * </p>
 *
 * @see hearthstone.HearthstonePackage#getGameDeck()
 * @model
 * @generated
 */
public interface GameDeck extends Deck {
	/**
	 * Returns the value of the '<em><b>Deck Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deck Owner</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deck Owner</em>' attribute.
	 * @see #setDeckOwner(String)
	 * @see hearthstone.HearthstonePackage#getGameDeck_DeckOwner()
	 * @model
	 * @generated
	 */
	String getDeckOwner();

	/**
	 * Sets the value of the '{@link hearthstone.GameDeck#getDeckOwner <em>Deck Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deck Owner</em>' attribute.
	 * @see #getDeckOwner()
	 * @generated
	 */
	void setDeckOwner(String value);

	/**
	 * Returns the value of the '<em><b>Game Start Deck Cards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Game Start Deck Cards</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Start Deck Cards</em>' attribute.
	 * @see #setGameStartDeckCards(String)
	 * @see hearthstone.HearthstonePackage#getGameDeck_GameStartDeckCards()
	 * @model
	 * @generated
	 */
	String getGameStartDeckCards();

	/**
	 * Sets the value of the '{@link hearthstone.GameDeck#getGameStartDeckCards <em>Game Start Deck Cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game Start Deck Cards</em>' attribute.
	 * @see #getGameStartDeckCards()
	 * @generated
	 */
	void setGameStartDeckCards(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean RemoveCard(int removeCardSN);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean ReturnCard(int returnCardSN);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ShowGameDeck();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ShowGameStartDeckCards();

} // GameDeck
