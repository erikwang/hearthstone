/**
 */
package hearthstone;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hearthstone.Game#getGameHasBoard <em>Game Has Board</em>}</li>
 *   <li>{@link hearthstone.Game#getGameSN <em>Game SN</em>}</li>
 *   <li>{@link hearthstone.Game#getGameHasTwoPlayers <em>Game Has Two Players</em>}</li>
 *   <li>{@link hearthstone.Game#getGameStates <em>Game States</em>}</li>
 *   <li>{@link hearthstone.Game#getGameID <em>Game ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see hearthstone.HearthstonePackage#getGame()
 * @model
 * @generated
 */
public interface Game extends EObject {
	/**
	 * Returns the value of the '<em><b>Game Has Board</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Game Has Board</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Has Board</em>' containment reference.
	 * @see #setGameHasBoard(GameBoard)
	 * @see hearthstone.HearthstonePackage#getGame_GameHasBoard()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GameBoard getGameHasBoard();

	/**
	 * Sets the value of the '{@link hearthstone.Game#getGameHasBoard <em>Game Has Board</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game Has Board</em>' containment reference.
	 * @see #getGameHasBoard()
	 * @generated
	 */
	void setGameHasBoard(GameBoard value);

	/**
	 * Returns the value of the '<em><b>Game SN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Game SN</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game SN</em>' attribute.
	 * @see #setGameSN(int)
	 * @see hearthstone.HearthstonePackage#getGame_GameSN()
	 * @model
	 * @generated
	 */
	int getGameSN();

	/**
	 * Sets the value of the '{@link hearthstone.Game#getGameSN <em>Game SN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game SN</em>' attribute.
	 * @see #getGameSN()
	 * @generated
	 */
	void setGameSN(int value);

	/**
	 * Returns the value of the '<em><b>Game Has Two Players</b></em>' containment reference list.
	 * The list contents are of type {@link hearthstone.Player}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Game Has Two Players</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Has Two Players</em>' containment reference list.
	 * @see hearthstone.HearthstonePackage#getGame_GameHasTwoPlayers()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Player> getGameHasTwoPlayers();

	/**
	 * Returns the value of the '<em><b>Game States</b></em>' attribute.
	 * The literals are from the enumeration {@link hearthstone.GameState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Game States</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game States</em>' attribute.
	 * @see hearthstone.GameState
	 * @see #setGameStates(GameState)
	 * @see hearthstone.HearthstonePackage#getGame_GameStates()
	 * @model
	 * @generated
	 */
	GameState getGameStates();

	/**
	 * Sets the value of the '{@link hearthstone.Game#getGameStates <em>Game States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game States</em>' attribute.
	 * @see hearthstone.GameState
	 * @see #getGameStates()
	 * @generated
	 */
	void setGameStates(GameState value);

	/**
	 * Returns the value of the '<em><b>Game ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Game ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game ID</em>' attribute.
	 * @see #setGameID(String)
	 * @see hearthstone.HearthstonePackage#getGame_GameID()
	 * @model
	 * @generated
	 */
	String getGameID();

	/**
	 * Sets the value of the '{@link hearthstone.Game#getGameID <em>Game ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game ID</em>' attribute.
	 * @see #getGameID()
	 * @generated
	 */
	void setGameID(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ShowGame(int GameSN);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ShowGameInDetail();

} // Game
