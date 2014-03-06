/**
 */
package hearthstone.impl;

import hearthstone.Game;
import hearthstone.GameBoard;
import hearthstone.GameState;
import hearthstone.HearthstonePackage;
import hearthstone.Player;

import java.lang.reflect.InvocationTargetException;
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
 * An implementation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hearthstone.impl.GameImpl#getGameHasBoard <em>Game Has Board</em>}</li>
 *   <li>{@link hearthstone.impl.GameImpl#getGameSN <em>Game SN</em>}</li>
 *   <li>{@link hearthstone.impl.GameImpl#getGameHasTwoPlayers <em>Game Has Two Players</em>}</li>
 *   <li>{@link hearthstone.impl.GameImpl#getGameStates <em>Game States</em>}</li>
 *   <li>{@link hearthstone.impl.GameImpl#getGameID <em>Game ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GameImpl extends MinimalEObjectImpl.Container implements Game {
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
	 * The default value of the '{@link #getGameSN() <em>Game SN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameSN()
	 * @generated
	 * @ordered
	 */
	protected static final int GAME_SN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGameSN() <em>Game SN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameSN()
	 * @generated
	 * @ordered
	 */
	protected int gameSN = GAME_SN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGameHasTwoPlayers() <em>Game Has Two Players</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameHasTwoPlayers()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> gameHasTwoPlayers;

	/**
	 * The default value of the '{@link #getGameStates() <em>Game States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameStates()
	 * @generated
	 * @ordered
	 */
	protected static final GameState GAME_STATES_EDEFAULT = GameState.CREATED;

	/**
	 * The cached value of the '{@link #getGameStates() <em>Game States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameStates()
	 * @generated
	 * @ordered
	 */
	protected GameState gameStates = GAME_STATES_EDEFAULT;

	/**
	 * The default value of the '{@link #getGameID() <em>Game ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameID()
	 * @generated
	 * @ordered
	 */
	protected static final String GAME_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGameID() <em>Game ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameID()
	 * @generated
	 * @ordered
	 */
	protected String gameID = GAME_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HearthstonePackage.Literals.GAME;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HearthstonePackage.GAME__GAME_HAS_BOARD, oldGameHasBoard, newGameHasBoard);
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
				msgs = ((InternalEObject)gameHasBoard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HearthstonePackage.GAME__GAME_HAS_BOARD, null, msgs);
			if (newGameHasBoard != null)
				msgs = ((InternalEObject)newGameHasBoard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HearthstonePackage.GAME__GAME_HAS_BOARD, null, msgs);
			msgs = basicSetGameHasBoard(newGameHasBoard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.GAME__GAME_HAS_BOARD, newGameHasBoard, newGameHasBoard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGameSN() {
		return gameSN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGameSN(int newGameSN) {
		int oldGameSN = gameSN;
		gameSN = newGameSN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.GAME__GAME_SN, oldGameSN, gameSN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Player> getGameHasTwoPlayers() {
		if (gameHasTwoPlayers == null) {
			gameHasTwoPlayers = new EObjectContainmentEList<Player>(Player.class, this, HearthstonePackage.GAME__GAME_HAS_TWO_PLAYERS);
		}
		return gameHasTwoPlayers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameState getGameStates() {
		return gameStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGameStates(GameState newGameStates) {
		GameState oldGameStates = gameStates;
		gameStates = newGameStates == null ? GAME_STATES_EDEFAULT : newGameStates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.GAME__GAME_STATES, oldGameStates, gameStates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGameID() {
		return gameID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGameID(String newGameID) {
		String oldGameID = gameID;
		gameID = newGameID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.GAME__GAME_ID, oldGameID, gameID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ShowGame(int GameSN) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void ShowGameInDetail() {
		if(this.getGameID() == null){
			System.out.println("Current there is no game. Use cg to create a new one");
		}else if(this.getGameStates() == GameState.HALT){
			System.out.println("Current game ["+this.getGameID()+"] was halted");
		}else{
			System.out.println("[Game report] Game ID: "+this.getGameID());
			System.out.println("[Game report] Players: "+this.getGameHasTwoPlayers().get(0).getName()+" VS "+this.getGameHasTwoPlayers().get(1).getName());
			//System.out.println(_theGame.getGameHasTwoPlayers().get(0).getPlayerHasDeck());
			//System.out.println(_theGame.getGameHasTwoPlayers().get(1).getPlayerHasDeck());
			//Utilites.showCurrentGameDeckCards(_theGame.getGameHasTwoPlayers().get(0).getPlayerHasGameStartDeck());
			//Utilites.showCurrentGameDeckCards(_theGame.getGameHasTwoPlayers().get(1).getPlayerHasGameStartDeck());
			this.getGameHasTwoPlayers().get(0).getPlayerHasDeck().ShowGameStartDeckCards();
			this.getGameHasTwoPlayers().get(0).getPlayerHasDeck().ShowGameDeck();
			this.getGameHasTwoPlayers().get(1).getPlayerHasDeck().ShowGameStartDeckCards();
			this.getGameHasTwoPlayers().get(1).getPlayerHasDeck().ShowGameDeck();
		}
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HearthstonePackage.GAME__GAME_HAS_BOARD:
				return basicSetGameHasBoard(null, msgs);
			case HearthstonePackage.GAME__GAME_HAS_TWO_PLAYERS:
				return ((InternalEList<?>)getGameHasTwoPlayers()).basicRemove(otherEnd, msgs);
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
			case HearthstonePackage.GAME__GAME_HAS_BOARD:
				return getGameHasBoard();
			case HearthstonePackage.GAME__GAME_SN:
				return getGameSN();
			case HearthstonePackage.GAME__GAME_HAS_TWO_PLAYERS:
				return getGameHasTwoPlayers();
			case HearthstonePackage.GAME__GAME_STATES:
				return getGameStates();
			case HearthstonePackage.GAME__GAME_ID:
				return getGameID();
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
			case HearthstonePackage.GAME__GAME_HAS_BOARD:
				setGameHasBoard((GameBoard)newValue);
				return;
			case HearthstonePackage.GAME__GAME_SN:
				setGameSN((Integer)newValue);
				return;
			case HearthstonePackage.GAME__GAME_HAS_TWO_PLAYERS:
				getGameHasTwoPlayers().clear();
				getGameHasTwoPlayers().addAll((Collection<? extends Player>)newValue);
				return;
			case HearthstonePackage.GAME__GAME_STATES:
				setGameStates((GameState)newValue);
				return;
			case HearthstonePackage.GAME__GAME_ID:
				setGameID((String)newValue);
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
			case HearthstonePackage.GAME__GAME_HAS_BOARD:
				setGameHasBoard((GameBoard)null);
				return;
			case HearthstonePackage.GAME__GAME_SN:
				setGameSN(GAME_SN_EDEFAULT);
				return;
			case HearthstonePackage.GAME__GAME_HAS_TWO_PLAYERS:
				getGameHasTwoPlayers().clear();
				return;
			case HearthstonePackage.GAME__GAME_STATES:
				setGameStates(GAME_STATES_EDEFAULT);
				return;
			case HearthstonePackage.GAME__GAME_ID:
				setGameID(GAME_ID_EDEFAULT);
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
			case HearthstonePackage.GAME__GAME_HAS_BOARD:
				return gameHasBoard != null;
			case HearthstonePackage.GAME__GAME_SN:
				return gameSN != GAME_SN_EDEFAULT;
			case HearthstonePackage.GAME__GAME_HAS_TWO_PLAYERS:
				return gameHasTwoPlayers != null && !gameHasTwoPlayers.isEmpty();
			case HearthstonePackage.GAME__GAME_STATES:
				return gameStates != GAME_STATES_EDEFAULT;
			case HearthstonePackage.GAME__GAME_ID:
				return GAME_ID_EDEFAULT == null ? gameID != null : !GAME_ID_EDEFAULT.equals(gameID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HearthstonePackage.GAME___SHOW_GAME__INT:
				ShowGame((Integer)arguments.get(0));
				return null;
			case HearthstonePackage.GAME___SHOW_GAME_IN_DETAIL:
				ShowGameInDetail();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (GameSN: ");
		result.append(gameSN);
		result.append(", GameStates: ");
		result.append(gameStates);
		result.append(", GameID: ");
		result.append(gameID);
		result.append(')');
		return result.toString();
	}

} //GameImpl
