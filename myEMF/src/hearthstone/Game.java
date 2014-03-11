/**
 */
package hearthstone;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hearthstone.Game#getGameSN <em>Game SN</em>}</li>
 *   <li>{@link hearthstone.Game#getGameStates <em>Game States</em>}</li>
 *   <li>{@link hearthstone.Game#getGameID <em>Game ID</em>}</li>
 *   <li>{@link hearthstone.Game#getGameHasGameRule <em>Game Has Game Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see hearthstone.HearthstonePackage#getGame()
 * @model
 * @generated
 */
public interface Game extends EObject {
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
	 * Returns the value of the '<em><b>Game States</b></em>' attribute.
	 * The literals are from the enumeration {@link hearthstone.GameStates}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Game States</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game States</em>' attribute.
	 * @see hearthstone.GameStates
	 * @see #setGameStates(GameStates)
	 * @see hearthstone.HearthstonePackage#getGame_GameStates()
	 * @model
	 * @generated
	 */
	GameStates getGameStates();

	/**
	 * Sets the value of the '{@link hearthstone.Game#getGameStates <em>Game States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game States</em>' attribute.
	 * @see hearthstone.GameStates
	 * @see #getGameStates()
	 * @generated
	 */
	void setGameStates(GameStates value);

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
	 * Returns the value of the '<em><b>Game Has Game Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Game Has Game Rule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Has Game Rule</em>' reference.
	 * @see #setGameHasGameRule(GameRule)
	 * @see hearthstone.HearthstonePackage#getGame_GameHasGameRule()
	 * @model required="true"
	 * @generated
	 */
	GameRule getGameHasGameRule();

	/**
	 * Sets the value of the '{@link hearthstone.Game#getGameHasGameRule <em>Game Has Game Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game Has Game Rule</em>' reference.
	 * @see #getGameHasGameRule()
	 * @generated
	 */
	void setGameHasGameRule(GameRule value);

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void HaltGame();

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
	 * @model
	 * @generated
	 */
	void ShowGameBoard();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Check each hero's health, if <=0, we have a winner, and game over
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean CheckGameStates();

} // Game
