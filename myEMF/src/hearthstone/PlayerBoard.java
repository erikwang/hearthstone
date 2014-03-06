/**
 */
package hearthstone;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hearthstone.PlayerBoard#getBoardOwner <em>Board Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see hearthstone.HearthstonePackage#getPlayerBoard()
 * @model
 * @generated
 */
public interface PlayerBoard extends Deck {
	/**
	 * Returns the value of the '<em><b>Board Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Board Owner</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board Owner</em>' attribute.
	 * @see #setBoardOwner(String)
	 * @see hearthstone.HearthstonePackage#getPlayerBoard_BoardOwner()
	 * @model
	 * @generated
	 */
	String getBoardOwner();

	/**
	 * Sets the value of the '{@link hearthstone.PlayerBoard#getBoardOwner <em>Board Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board Owner</em>' attribute.
	 * @see #getBoardOwner()
	 * @generated
	 */
	void setBoardOwner(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ShowPlayerBoard();

} // PlayerBoard
