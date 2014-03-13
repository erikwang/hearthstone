/**
 */
package hearthstone;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hearthstone.GameBoard#getGameBoardHasPlayerBoard <em>Game Board Has Player Board</em>}</li>
 *   <li>{@link hearthstone.GameBoard#getBoardSN <em>Board SN</em>}</li>
 * </ul>
 * </p>
 *
 * @see hearthstone.HearthstonePackage#getGameBoard()
 * @model
 * @generated
 */
public interface GameBoard extends EObject {
	/**
	 * Returns the value of the '<em><b>Game Board Has Player Board</b></em>' containment reference list.
	 * The list contents are of type {@link hearthstone.PlayerBoard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Game Board Has Player Board</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Board Has Player Board</em>' containment reference list.
	 * @see hearthstone.HearthstonePackage#getGameBoard_GameBoardHasPlayerBoard()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<PlayerBoard> getGameBoardHasPlayerBoard();

	/**
	 * Returns the value of the '<em><b>Board SN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Board SN</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board SN</em>' attribute.
	 * @see #setBoardSN(int)
	 * @see hearthstone.HearthstonePackage#getGameBoard_BoardSN()
	 * @model
	 * @generated
	 */
	int getBoardSN();

	/**
	 * Sets the value of the '{@link hearthstone.GameBoard#getBoardSN <em>Board SN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board SN</em>' attribute.
	 * @see #getBoardSN()
	 * @generated
	 */
	void setBoardSN(int value);

} // GameBoard
