/**
 */
package hearthstone.impl;

import hearthstone.Game;
import hearthstone.GameBoard;
import hearthstone.GameRule;
import hearthstone.GameType;
import hearthstone.HearthstonePackage;
import hearthstone.Player;

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
 * An implementation of the model object '<em><b>Game Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hearthstone.impl.GameRuleImpl#getGameHasPlayers <em>Game Has Players</em>}</li>
 *   <li>{@link hearthstone.impl.GameRuleImpl#getGameHasBoard <em>Game Has Board</em>}</li>
 *   <li>{@link hearthstone.impl.GameRuleImpl#getGameHasGameRule <em>Game Has Game Rule</em>}</li>
 *   <li>{@link hearthstone.impl.GameRuleImpl#getGameRuleDesc <em>Game Rule Desc</em>}</li>
 *   <li>{@link hearthstone.impl.GameRuleImpl#getGameRuleType <em>Game Rule Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GameRuleImpl extends MinimalEObjectImpl.Container implements GameRule {
	/**
	 * The cached value of the '{@link #getGameHasPlayers() <em>Game Has Players</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameHasPlayers()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> gameHasPlayers;

	/**
	 * The cached value of the '{@link #getGameHasBoard() <em>Game Has Board</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameHasBoard()
	 * @generated
	 * @ordered
	 */
	protected GameBoard gameHasBoard;

	/**
	 * The cached value of the '{@link #getGameHasGameRule() <em>Game Has Game Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameHasGameRule()
	 * @generated
	 * @ordered
	 */
	protected Game gameHasGameRule;

	/**
	 * The default value of the '{@link #getGameRuleDesc() <em>Game Rule Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameRuleDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String GAME_RULE_DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGameRuleDesc() <em>Game Rule Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameRuleDesc()
	 * @generated
	 * @ordered
	 */
	protected String gameRuleDesc = GAME_RULE_DESC_EDEFAULT;

	/**
	 * The default value of the '{@link #getGameRuleType() <em>Game Rule Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameRuleType()
	 * @generated
	 * @ordered
	 */
	protected static final GameType GAME_RULE_TYPE_EDEFAULT = GameType.STANDARD;

	/**
	 * The cached value of the '{@link #getGameRuleType() <em>Game Rule Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameRuleType()
	 * @generated
	 * @ordered
	 */
	protected GameType gameRuleType = GAME_RULE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HearthstonePackage.Literals.GAME_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Player> getGameHasPlayers() {
		if (gameHasPlayers == null) {
			gameHasPlayers = new EObjectContainmentEList<Player>(Player.class, this, HearthstonePackage.GAME_RULE__GAME_HAS_PLAYERS);
		}
		return gameHasPlayers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameBoard getGameHasBoard() {
		return gameHasBoard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGameHasBoard(GameBoard newGameHasBoard, NotificationChain msgs) {
		GameBoard oldGameHasBoard = gameHasBoard;
		gameHasBoard = newGameHasBoard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HearthstonePackage.GAME_RULE__GAME_HAS_BOARD, oldGameHasBoard, newGameHasBoard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGameHasBoard(GameBoard newGameHasBoard) {
		if (newGameHasBoard != gameHasBoard) {
			NotificationChain msgs = null;
			if (gameHasBoard != null)
				msgs = ((InternalEObject)gameHasBoard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HearthstonePackage.GAME_RULE__GAME_HAS_BOARD, null, msgs);
			if (newGameHasBoard != null)
				msgs = ((InternalEObject)newGameHasBoard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HearthstonePackage.GAME_RULE__GAME_HAS_BOARD, null, msgs);
			msgs = basicSetGameHasBoard(newGameHasBoard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.GAME_RULE__GAME_HAS_BOARD, newGameHasBoard, newGameHasBoard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Game getGameHasGameRule() {
		if (gameHasGameRule != null && gameHasGameRule.eIsProxy()) {
			InternalEObject oldGameHasGameRule = (InternalEObject)gameHasGameRule;
			gameHasGameRule = (Game)eResolveProxy(oldGameHasGameRule);
			if (gameHasGameRule != oldGameHasGameRule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HearthstonePackage.GAME_RULE__GAME_HAS_GAME_RULE, oldGameHasGameRule, gameHasGameRule));
			}
		}
		return gameHasGameRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Game basicGetGameHasGameRule() {
		return gameHasGameRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGameHasGameRule(Game newGameHasGameRule) {
		Game oldGameHasGameRule = gameHasGameRule;
		gameHasGameRule = newGameHasGameRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.GAME_RULE__GAME_HAS_GAME_RULE, oldGameHasGameRule, gameHasGameRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGameRuleDesc() {
		return gameRuleDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGameRuleDesc(String newGameRuleDesc) {
		String oldGameRuleDesc = gameRuleDesc;
		gameRuleDesc = newGameRuleDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.GAME_RULE__GAME_RULE_DESC, oldGameRuleDesc, gameRuleDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameType getGameRuleType() {
		return gameRuleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGameRuleType(GameType newGameRuleType) {
		GameType oldGameRuleType = gameRuleType;
		gameRuleType = newGameRuleType == null ? GAME_RULE_TYPE_EDEFAULT : newGameRuleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.GAME_RULE__GAME_RULE_TYPE, oldGameRuleType, gameRuleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HearthstonePackage.GAME_RULE__GAME_HAS_PLAYERS:
				return ((InternalEList<?>)getGameHasPlayers()).basicRemove(otherEnd, msgs);
			case HearthstonePackage.GAME_RULE__GAME_HAS_BOARD:
				return basicSetGameHasBoard(null, msgs);
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
			case HearthstonePackage.GAME_RULE__GAME_HAS_PLAYERS:
				return getGameHasPlayers();
			case HearthstonePackage.GAME_RULE__GAME_HAS_BOARD:
				return getGameHasBoard();
			case HearthstonePackage.GAME_RULE__GAME_HAS_GAME_RULE:
				if (resolve) return getGameHasGameRule();
				return basicGetGameHasGameRule();
			case HearthstonePackage.GAME_RULE__GAME_RULE_DESC:
				return getGameRuleDesc();
			case HearthstonePackage.GAME_RULE__GAME_RULE_TYPE:
				return getGameRuleType();
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
			case HearthstonePackage.GAME_RULE__GAME_HAS_PLAYERS:
				getGameHasPlayers().clear();
				getGameHasPlayers().addAll((Collection<? extends Player>)newValue);
				return;
			case HearthstonePackage.GAME_RULE__GAME_HAS_BOARD:
				setGameHasBoard((GameBoard)newValue);
				return;
			case HearthstonePackage.GAME_RULE__GAME_HAS_GAME_RULE:
				setGameHasGameRule((Game)newValue);
				return;
			case HearthstonePackage.GAME_RULE__GAME_RULE_DESC:
				setGameRuleDesc((String)newValue);
				return;
			case HearthstonePackage.GAME_RULE__GAME_RULE_TYPE:
				setGameRuleType((GameType)newValue);
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
			case HearthstonePackage.GAME_RULE__GAME_HAS_PLAYERS:
				getGameHasPlayers().clear();
				return;
			case HearthstonePackage.GAME_RULE__GAME_HAS_BOARD:
				setGameHasBoard((GameBoard)null);
				return;
			case HearthstonePackage.GAME_RULE__GAME_HAS_GAME_RULE:
				setGameHasGameRule((Game)null);
				return;
			case HearthstonePackage.GAME_RULE__GAME_RULE_DESC:
				setGameRuleDesc(GAME_RULE_DESC_EDEFAULT);
				return;
			case HearthstonePackage.GAME_RULE__GAME_RULE_TYPE:
				setGameRuleType(GAME_RULE_TYPE_EDEFAULT);
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
			case HearthstonePackage.GAME_RULE__GAME_HAS_PLAYERS:
				return gameHasPlayers != null && !gameHasPlayers.isEmpty();
			case HearthstonePackage.GAME_RULE__GAME_HAS_BOARD:
				return gameHasBoard != null;
			case HearthstonePackage.GAME_RULE__GAME_HAS_GAME_RULE:
				return gameHasGameRule != null;
			case HearthstonePackage.GAME_RULE__GAME_RULE_DESC:
				return GAME_RULE_DESC_EDEFAULT == null ? gameRuleDesc != null : !GAME_RULE_DESC_EDEFAULT.equals(gameRuleDesc);
			case HearthstonePackage.GAME_RULE__GAME_RULE_TYPE:
				return gameRuleType != GAME_RULE_TYPE_EDEFAULT;
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
		result.append(" (GameRuleDesc: ");
		result.append(gameRuleDesc);
		result.append(", GameRuleType: ");
		result.append(gameRuleType);
		result.append(')');
		return result.toString();
	}

} //GameRuleImpl
