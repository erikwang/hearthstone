/**
 */
package hearthstone.impl;

import hearthstone.Game;
import hearthstone.GameRule;
import hearthstone.GameStates;
import hearthstone.HearthstonePackage;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hearthstone.impl.GameImpl#getGameSN <em>Game SN</em>}</li>
 *   <li>{@link hearthstone.impl.GameImpl#getGameStates <em>Game States</em>}</li>
 *   <li>{@link hearthstone.impl.GameImpl#getGameID <em>Game ID</em>}</li>
 *   <li>{@link hearthstone.impl.GameImpl#getGameHasGameRule <em>Game Has Game Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GameImpl extends MinimalEObjectImpl.Container implements Game {
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
	 * The default value of the '{@link #getGameStates() <em>Game States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameStates()
	 * @generated
	 * @ordered
	 */
	protected static final GameStates GAME_STATES_EDEFAULT = GameStates.CREATED;

	/**
	 * The cached value of the '{@link #getGameStates() <em>Game States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameStates()
	 * @generated
	 * @ordered
	 */
	protected GameStates gameStates = GAME_STATES_EDEFAULT;

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
	 * The cached value of the '{@link #getGameHasGameRule() <em>Game Has Game Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameHasGameRule()
	 * @generated
	 * @ordered
	 */
	protected GameRule gameHasGameRule;

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
	public GameStates getGameStates() {
		return gameStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGameStates(GameStates newGameStates) {
		GameStates oldGameStates = gameStates;
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
	public GameRule getGameHasGameRule() {
		if (gameHasGameRule != null && gameHasGameRule.eIsProxy()) {
			InternalEObject oldGameHasGameRule = (InternalEObject)gameHasGameRule;
			gameHasGameRule = (GameRule)eResolveProxy(oldGameHasGameRule);
			if (gameHasGameRule != oldGameHasGameRule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HearthstonePackage.GAME__GAME_HAS_GAME_RULE, oldGameHasGameRule, gameHasGameRule));
			}
		}
		return gameHasGameRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameRule basicGetGameHasGameRule() {
		return gameHasGameRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGameHasGameRule(GameRule newGameHasGameRule) {
		GameRule oldGameHasGameRule = gameHasGameRule;
		gameHasGameRule = newGameHasGameRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.GAME__GAME_HAS_GAME_RULE, oldGameHasGameRule, gameHasGameRule));
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
		}else if(this.getGameStates() == GameStates.HALT){
			System.out.println("Current game ["+this.getGameID()+"] was halted");
		}else{
			System.out.println("[Game report] Game ID: "+this.getGameID());
			System.out.println("[Game report] Players: "+this.getGameHasGameRule().getGameHasPlayers().get(0).getName()+" VS "+this.getGameHasGameRule().getGameHasPlayers().get(1).getName());
			//System.out.println(_theGame.getGameHasTwoPlayers().get(0).getPlayerHasDeck());
			//System.out.println(_theGame.getGameHasTwoPlayers().get(1).getPlayerHasDeck());
			//Utilites.showCurrentGameDeckCards(_theGame.getGameHasTwoPlayers().get(0).getPlayerHasGameStartDeck());
			//Utilites.showCurrentGameDeckCards(_theGame.getGameHasTwoPlayers().get(1).getPlayerHasGameStartDeck());
			this.getGameHasGameRule().getGameHasPlayers().get(0).getPlayerHasDeck().ShowGameStartDeckCards();
			this.getGameHasGameRule().getGameHasPlayers().get(0).getPlayerHasDeck().ShowGameDeck();
			this.getGameHasGameRule().getGameHasPlayers().get(1).getPlayerHasDeck().ShowGameStartDeckCards();
			this.getGameHasGameRule().getGameHasPlayers().get(1).getPlayerHasDeck().ShowGameDeck();
		}
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void HaltGame() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ShowGameHand() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ShowGameBoard() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean CheckGameStates() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		if (this.getGameHasGameRule().getGameHasPlayers().get(0).getPlayerHasOwnBoard().getDeckHasHero().getHeroHealth() <=0){
			System.out.println("[!!!Winner!!!] The winner of this game is "+this.getGameHasGameRule().getGameHasPlayers().get(1).getName());
			this.setGameStates(gameStates.OVER);
			return false;
		}else{ 
			if(this.getGameHasGameRule().getGameHasPlayers().get(1).getPlayerHasOwnBoard().getDeckHasHero().getHeroHealth() <=0){
			System.out.println("[!!!Winner!!!] The winner of this game is "+this.getGameHasGameRule().getGameHasPlayers().get(0).getName());
			this.setGameStates(gameStates.OVER);
			return false;
		}
		return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HearthstonePackage.GAME__GAME_SN:
				return getGameSN();
			case HearthstonePackage.GAME__GAME_STATES:
				return getGameStates();
			case HearthstonePackage.GAME__GAME_ID:
				return getGameID();
			case HearthstonePackage.GAME__GAME_HAS_GAME_RULE:
				if (resolve) return getGameHasGameRule();
				return basicGetGameHasGameRule();
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
			case HearthstonePackage.GAME__GAME_SN:
				setGameSN((Integer)newValue);
				return;
			case HearthstonePackage.GAME__GAME_STATES:
				setGameStates((GameStates)newValue);
				return;
			case HearthstonePackage.GAME__GAME_ID:
				setGameID((String)newValue);
				return;
			case HearthstonePackage.GAME__GAME_HAS_GAME_RULE:
				setGameHasGameRule((GameRule)newValue);
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
			case HearthstonePackage.GAME__GAME_SN:
				setGameSN(GAME_SN_EDEFAULT);
				return;
			case HearthstonePackage.GAME__GAME_STATES:
				setGameStates(GAME_STATES_EDEFAULT);
				return;
			case HearthstonePackage.GAME__GAME_ID:
				setGameID(GAME_ID_EDEFAULT);
				return;
			case HearthstonePackage.GAME__GAME_HAS_GAME_RULE:
				setGameHasGameRule((GameRule)null);
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
			case HearthstonePackage.GAME__GAME_SN:
				return gameSN != GAME_SN_EDEFAULT;
			case HearthstonePackage.GAME__GAME_STATES:
				return gameStates != GAME_STATES_EDEFAULT;
			case HearthstonePackage.GAME__GAME_ID:
				return GAME_ID_EDEFAULT == null ? gameID != null : !GAME_ID_EDEFAULT.equals(gameID);
			case HearthstonePackage.GAME__GAME_HAS_GAME_RULE:
				return gameHasGameRule != null;
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
			case HearthstonePackage.GAME___HALT_GAME:
				HaltGame();
				return null;
			case HearthstonePackage.GAME___SHOW_GAME_HAND:
				ShowGameHand();
				return null;
			case HearthstonePackage.GAME___SHOW_GAME_BOARD:
				ShowGameBoard();
				return null;
			case HearthstonePackage.GAME___CHECK_GAME_STATES:
				return CheckGameStates();
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
