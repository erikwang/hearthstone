/**
 */
package hearthstone;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hearthstone.GameRule#getGameHasPlayers <em>Game Has Players</em>}</li>
 *   <li>{@link hearthstone.GameRule#getGameHasBoard <em>Game Has Board</em>}</li>
 *   <li>{@link hearthstone.GameRule#getGameHasGameRule <em>Game Has Game Rule</em>}</li>
 *   <li>{@link hearthstone.GameRule#getGameRuleDesc <em>Game Rule Desc</em>}</li>
 *   <li>{@link hearthstone.GameRule#getGameRuleType <em>Game Rule Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see hearthstone.HearthstonePackage#getGameRule()
 * @model
 * @generated
 */
public interface GameRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Game Has Players</b></em>' containment reference list.
	 * The list contents are of type {@link hearthstone.Player}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Game Has Players</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Has Players</em>' containment reference list.
	 * @see hearthstone.HearthstonePackage#getGameRule_GameHasPlayers()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Player> getGameHasPlayers();

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
	 * @see hearthstone.HearthstonePackage#getGameRule_GameHasBoard()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GameBoard getGameHasBoard();

	/**
	 * Sets the value of the '{@link hearthstone.GameRule#getGameHasBoard <em>Game Has Board</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game Has Board</em>' containment reference.
	 * @see #getGameHasBoard()
	 * @generated
	 */
	void setGameHasBoard(GameBoard value);

	/**
	 * Returns the value of the '<em><b>Game Has Game Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Game Has Game Rule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Has Game Rule</em>' reference.
	 * @see #setGameHasGameRule(Game)
	 * @see hearthstone.HearthstonePackage#getGameRule_GameHasGameRule()
	 * @model required="true"
	 * @generated
	 */
	Game getGameHasGameRule();

	/**
	 * Sets the value of the '{@link hearthstone.GameRule#getGameHasGameRule <em>Game Has Game Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game Has Game Rule</em>' reference.
	 * @see #getGameHasGameRule()
	 * @generated
	 */
	void setGameHasGameRule(Game value);

	/**
	 * Returns the value of the '<em><b>Game Rule Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Game Rule Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Rule Desc</em>' attribute.
	 * @see #setGameRuleDesc(String)
	 * @see hearthstone.HearthstonePackage#getGameRule_GameRuleDesc()
	 * @model
	 * @generated
	 */
	String getGameRuleDesc();

	/**
	 * Sets the value of the '{@link hearthstone.GameRule#getGameRuleDesc <em>Game Rule Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game Rule Desc</em>' attribute.
	 * @see #getGameRuleDesc()
	 * @generated
	 */
	void setGameRuleDesc(String value);

	/**
	 * Returns the value of the '<em><b>Game Rule Type</b></em>' attribute.
	 * The literals are from the enumeration {@link hearthstone.GameType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Game Rule Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Rule Type</em>' attribute.
	 * @see hearthstone.GameType
	 * @see #setGameRuleType(GameType)
	 * @see hearthstone.HearthstonePackage#getGameRule_GameRuleType()
	 * @model
	 * @generated
	 */
	GameType getGameRuleType();

	/**
	 * Sets the value of the '{@link hearthstone.GameRule#getGameRuleType <em>Game Rule Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game Rule Type</em>' attribute.
	 * @see hearthstone.GameType
	 * @see #getGameRuleType()
	 * @generated
	 */
	void setGameRuleType(GameType value);

} // GameRule
