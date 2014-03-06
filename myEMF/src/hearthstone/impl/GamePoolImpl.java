/**
 */
package hearthstone.impl;

import hearthstone.Game;
import hearthstone.GamePool;
import hearthstone.HearthstonePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Pool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hearthstone.impl.GamePoolImpl#getGamePoolHasGames <em>Game Pool Has Games</em>}</li>
 *   <li>{@link hearthstone.impl.GamePoolImpl#getGamePoolDesc <em>Game Pool Desc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GamePoolImpl extends MinimalEObjectImpl.Container implements GamePool {
	/**
	 * The cached value of the '{@link #getGamePoolHasGames() <em>Game Pool Has Games</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamePoolHasGames()
	 * @generated
	 * @ordered
	 */
	protected EList<Game> gamePoolHasGames;

	/**
	 * The default value of the '{@link #getGamePoolDesc() <em>Game Pool Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamePoolDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String GAME_POOL_DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGamePoolDesc() <em>Game Pool Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamePoolDesc()
	 * @generated
	 * @ordered
	 */
	protected String gamePoolDesc = GAME_POOL_DESC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GamePoolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HearthstonePackage.Literals.GAME_POOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Game> getGamePoolHasGames() {
		if (gamePoolHasGames == null) {
			gamePoolHasGames = new EObjectContainmentEList<Game>(Game.class, this, HearthstonePackage.GAME_POOL__GAME_POOL_HAS_GAMES);
		}
		return gamePoolHasGames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGamePoolDesc() {
		return gamePoolDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGamePoolDesc(String newGamePoolDesc) {
		String oldGamePoolDesc = gamePoolDesc;
		gamePoolDesc = newGamePoolDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.GAME_POOL__GAME_POOL_DESC, oldGamePoolDesc, gamePoolDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HearthstonePackage.GAME_POOL__GAME_POOL_HAS_GAMES:
				return ((InternalEList<?>)getGamePoolHasGames()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HearthstonePackage.GAME_POOL__GAME_POOL_HAS_GAMES:
				return getGamePoolHasGames();
			case HearthstonePackage.GAME_POOL__GAME_POOL_DESC:
				return getGamePoolDesc();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HearthstonePackage.GAME_POOL__GAME_POOL_HAS_GAMES:
				getGamePoolHasGames().clear();
				getGamePoolHasGames().addAll((Collection<? extends Game>)newValue);
				return;
			case HearthstonePackage.GAME_POOL__GAME_POOL_DESC:
				setGamePoolDesc((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HearthstonePackage.GAME_POOL__GAME_POOL_HAS_GAMES:
				getGamePoolHasGames().clear();
				return;
			case HearthstonePackage.GAME_POOL__GAME_POOL_DESC:
				setGamePoolDesc(GAME_POOL_DESC_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HearthstonePackage.GAME_POOL__GAME_POOL_HAS_GAMES:
				return gamePoolHasGames != null && !gamePoolHasGames.isEmpty();
			case HearthstonePackage.GAME_POOL__GAME_POOL_DESC:
				return GAME_POOL_DESC_EDEFAULT == null ? gamePoolDesc != null : !GAME_POOL_DESC_EDEFAULT.equals(gamePoolDesc);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (GamePoolDesc: ");
		result.append(gamePoolDesc);
		result.append(')');
		return result.toString();
	}

} //GamePoolImpl
