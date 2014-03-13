/**
 */
package hearthstone;

import java.util.Date;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Pool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hearthstone.GamePool#getGamePoolHasGames <em>Game Pool Has Games</em>}</li>
 *   <li>{@link hearthstone.GamePool#getGamePoolDesc <em>Game Pool Desc</em>}</li>
 *   <li>{@link hearthstone.GamePool#getGamePoolStartDate <em>Game Pool Start Date</em>}</li>
 *   <li>{@link hearthstone.GamePool#getGamePoolRegion <em>Game Pool Region</em>}</li>
 *   <li>{@link hearthstone.GamePool#getGamePoolHasCardLibrary <em>Game Pool Has Card Library</em>}</li>
 * </ul>
 * </p>
 *
 * @see hearthstone.HearthstonePackage#getGamePool()
 * @model
 * @generated
 */
public interface GamePool extends EObject {
	/**
	 * Returns the value of the '<em><b>Game Pool Has Games</b></em>' containment reference list.
	 * The list contents are of type {@link hearthstone.Game}.
	 * It is bidirectional and its opposite is '{@link hearthstone.Game#getGameInGamePool <em>Game In Game Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Game Pool Has Games</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Pool Has Games</em>' containment reference list.
	 * @see hearthstone.HearthstonePackage#getGamePool_GamePoolHasGames()
	 * @see hearthstone.Game#getGameInGamePool
	 * @model opposite="GameInGamePool" containment="true"
	 * @generated
	 */
	EList<Game> getGamePoolHasGames();

	/**
	 * Returns the value of the '<em><b>Game Pool Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Game Pool Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Pool Desc</em>' attribute.
	 * @see #setGamePoolDesc(String)
	 * @see hearthstone.HearthstonePackage#getGamePool_GamePoolDesc()
	 * @model
	 * @generated
	 */
	String getGamePoolDesc();

	/**
	 * Sets the value of the '{@link hearthstone.GamePool#getGamePoolDesc <em>Game Pool Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game Pool Desc</em>' attribute.
	 * @see #getGamePoolDesc()
	 * @generated
	 */
	void setGamePoolDesc(String value);

	/**
	 * Returns the value of the '<em><b>Game Pool Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Game Pool Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Pool Start Date</em>' attribute.
	 * @see #setGamePoolStartDate(Date)
	 * @see hearthstone.HearthstonePackage#getGamePool_GamePoolStartDate()
	 * @model
	 * @generated
	 */
	Date getGamePoolStartDate();

	/**
	 * Sets the value of the '{@link hearthstone.GamePool#getGamePoolStartDate <em>Game Pool Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game Pool Start Date</em>' attribute.
	 * @see #getGamePoolStartDate()
	 * @generated
	 */
	void setGamePoolStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Game Pool Region</b></em>' attribute.
	 * The literals are from the enumeration {@link hearthstone.GameRegion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Game Pool Region</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Pool Region</em>' attribute.
	 * @see hearthstone.GameRegion
	 * @see #setGamePoolRegion(GameRegion)
	 * @see hearthstone.HearthstonePackage#getGamePool_GamePoolRegion()
	 * @model
	 * @generated
	 */
	GameRegion getGamePoolRegion();

	/**
	 * Sets the value of the '{@link hearthstone.GamePool#getGamePoolRegion <em>Game Pool Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game Pool Region</em>' attribute.
	 * @see hearthstone.GameRegion
	 * @see #getGamePoolRegion()
	 * @generated
	 */
	void setGamePoolRegion(GameRegion value);

	/**
	 * Returns the value of the '<em><b>Game Pool Has Card Library</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Game Pool Has Card Library</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Pool Has Card Library</em>' reference.
	 * @see #setGamePoolHasCardLibrary(CardLibrary)
	 * @see hearthstone.HearthstonePackage#getGamePool_GamePoolHasCardLibrary()
	 * @model
	 * @generated
	 */
	CardLibrary getGamePoolHasCardLibrary();

	/**
	 * Sets the value of the '{@link hearthstone.GamePool#getGamePoolHasCardLibrary <em>Game Pool Has Card Library</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game Pool Has Card Library</em>' reference.
	 * @see #getGamePoolHasCardLibrary()
	 * @generated
	 */
	void setGamePoolHasCardLibrary(CardLibrary value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ShowAllGames();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void CreateGame();

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
	void ShowGamePoolStates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void Initialize();

} // GamePool
