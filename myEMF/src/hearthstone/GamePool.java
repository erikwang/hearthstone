/**
 */
package hearthstone;

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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Game Pool Has Games</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Pool Has Games</em>' containment reference list.
	 * @see hearthstone.HearthstonePackage#getGamePool_GamePoolHasGames()
	 * @model containment="true"
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ShowGames();

} // GamePool
