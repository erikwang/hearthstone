/**
 */
package hearthstone.impl;

import hearth.retired.SetPlayers;
import hearthstone.Game;
import hearthstone.GameBoard;
import hearthstone.GameDeck;
import hearthstone.GamePlayerHand;
import hearthstone.GamePool;
import hearthstone.GameRule;
import hearthstone.GameStates;
import hearthstone.HearthstoneFactory;
import hearthstone.HearthstonePackage;
import hearthstone.Hero;
import hearthstone.HeroClass;
import hearthstone.Player;
import hearthstone.PlayerBoard;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

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
 *   <li>{@link hearthstone.impl.GameImpl#getGameInGamePool <em>Game In Game Pool</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GameImpl extends MinimalEObjectImpl.Container implements Game {
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
	public GamePool getGameInGamePool() {
		if (eContainerFeatureID() != HearthstonePackage.GAME__GAME_IN_GAME_POOL) return null;
		return (GamePool)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGameInGamePool(GamePool newGameInGamePool, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGameInGamePool, HearthstonePackage.GAME__GAME_IN_GAME_POOL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGameInGamePool(GamePool newGameInGamePool) {
		if (newGameInGamePool != eInternalContainer() || (eContainerFeatureID() != HearthstonePackage.GAME__GAME_IN_GAME_POOL && newGameInGamePool != null)) {
			if (EcoreUtil.isAncestor(this, newGameInGamePool))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGameInGamePool != null)
				msgs = ((InternalEObject)newGameInGamePool).eInverseAdd(this, HearthstonePackage.GAME_POOL__GAME_POOL_HAS_GAMES, GamePool.class, msgs);
			msgs = basicSetGameInGamePool(newGameInGamePool, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.GAME__GAME_IN_GAME_POOL, newGameInGamePool, newGameInGamePool));
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
			this.getGameHasGameRule().getGameHasPlayers().get(0).getPlayerHasDeck().ShowGameStartDeckCards();
			this.getGameHasGameRule().getGameHasPlayers().get(0).getPlayerHasDeck().ShowGameDeck();
			this.getGameHasGameRule().getGameHasPlayers().get(1).getPlayerHasDeck().ShowGameStartDeckCards();
			this.getGameHasGameRule().getGameHasPlayers().get(1).getPlayerHasDeck().ShowGameDeck();
			ShowPlayerGameBoard();			
			System.out.println("Game pool information"+this.getGameInGamePool().getGamePoolStartDate());
		}
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
	 * @generated NOT
	 */
	public void ShowPlayerGameBoard(){
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		System.out.println("+-------------------------------------------------------------------------------+");
		if(this.getGameHasGameRule().getGameHasPlayers().get(0).getPlayerHasOwnBoard().getDeckHasCards().size() > 0){
			System.out.println("cards on board: "+this.getGameHasGameRule().getGameHasPlayers().get(0).getPlayerHasOwnBoard().getDeckHasCards().size()+" cards on board");				
			this.getGameHasGameRule().getGameHasPlayers().get(0).getPlayerHasOwnBoard().ShowCardsInDeck();
		}else{
			System.out.println("- No cards on player1's board");
		}
		System.out.println("+-------------------------------------------------------------------------------+");
		if(this.getGameHasGameRule().getGameHasPlayers().get(1).getPlayerHasOwnBoard().getDeckHasCards().size() > 0){
			System.out.println("cards on board: "+this.getGameHasGameRule().getGameHasPlayers().get(0).getPlayerHasOwnBoard().getDeckHasCards().size()+" cards on board");				
			this.getGameHasGameRule().getGameHasPlayers().get(1).getPlayerHasOwnBoard().ShowCardsInDeck();
		}else{
			System.out.println("- No cards on player2's board");
		}
		System.out.println("+-------------------------------------------------------------------------------+");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void InitializeGame() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		this.SetGameRule();
		this.SetGamePlayer();
		this.SetPlayerDeck();
		this.SetGameBoard();
		//SetBoard(theGame);
		this.SetPlayerHand();
		System.out.println("Congs, a new game is ready for you");
		//SetPlayerHand(theGame);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void SetGameBoard() {
		HearthstoneFactory cf = HearthstoneFactory.eINSTANCE;
		GameBoard theGameBoard = cf.createGameBoard();
		theGameBoard.setBoardSN(2014);
		System.out.println("["+this.getGameID()+ "] Game <board> is ready");
		PlayerBoard pb1 = cf.createPlayerBoard();
		PlayerBoard pb2= cf.createPlayerBoard();
		
		pb1.setBoardOwner("Player1");
		pb2.setBoardOwner("Player2");
		//theGameBoard.getGameBoardHasTwoPlayerBoard().add(pb1);
		//theGameBoard.getGameBoardHasTwoPlayerBoard().add(pb2);
		System.out.println("["+this.getGameID()+ "] 2 of player game boards add to game <board>");
		
		pb1.setDeckHasHero(this.getGameHasGameRule().getGameHasPlayers().get(0).getPlayerHasDeck().getDeckHasHero());
		pb2.setDeckHasHero(this.getGameHasGameRule().getGameHasPlayers().get(1).getPlayerHasDeck().getDeckHasHero());
		
		this.getGameHasGameRule().getGameHasPlayers().get(0).setPlayerHasOwnBoard(pb1);
		this.getGameHasGameRule().getGameHasPlayers().get(1).setPlayerHasOwnBoard(pb2);
		
		
		System.out.println("["+this.getGameID()+ "] 2 of player game boards add to <player>");
		
		this.getGameHasGameRule().setGameHasBoard(theGameBoard);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void SetGamePlayer() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		List<Player> players = new ArrayList<Player>();
		SetPlayers sp = new SetPlayers();
		try {
			sp.GetPlayerFromDb();
			players = sp.getRandomPlayer();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.getGameHasGameRule().getGameHasPlayers().addAll(players);
		System.out.println("["+this.getGameID()+ "] <player>s are ready");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void SetPlayerHand() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		HearthstoneFactory cf = HearthstoneFactory.eINSTANCE;
		GamePlayerHand gph1 = cf.createGamePlayerHand();
		GamePlayerHand gph2 = cf.createGamePlayerHand();
		gph1.setHandOwner(this.getGameHasGameRule().getGameHasPlayers().get(0).getName());
		gph2.setHandOwner(this.getGameHasGameRule().getGameHasPlayers().get(1).getName());
		this.getGameHasGameRule().getGameHasPlayers().get(0).setPlayerHasHand(gph1);
		this.getGameHasGameRule().getGameHasPlayers().get(1).setPlayerHasHand(gph2);
		System.out.println("["+this.getGameID()+ "] 2 of player <hand>s to player");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * put game rule object to a new game object
	 */
	public void SetGameRule() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		HearthstoneFactory cf = HearthstoneFactory.eINSTANCE;
		GameRule gr = cf.createGameRule();
		this.setGameHasGameRule(gr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * Set players' deck (with a random hero)
	 */
	public void SetPlayerDeck() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		HearthstoneFactory cf = HearthstoneFactory.eINSTANCE;
		GameDeck gplayerDeck1 = cf.createGameDeck();
		GameDeck gplayerDeck2 = cf.createGameDeck();

		
		System.out.println("["+this.getGameID()+ "] <Heros> are set to players");
		
		try {
			gplayerDeck1.GenerateRandomGameDeck();
			gplayerDeck2.GenerateRandomGameDeck();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		gplayerDeck1.setDeckOwner(this.getGameHasGameRule().getGameHasPlayers().get(0).getName());
		gplayerDeck2.setDeckOwner(this.getGameHasGameRule().getGameHasPlayers().get(1).getName());
		
		this.getGameHasGameRule().getGameHasPlayers().get(0).setPlayerHasDeck(gplayerDeck1);
		this.getGameHasGameRule().getGameHasPlayers().get(1).setPlayerHasDeck(gplayerDeck2);
		
		this.getGameHasGameRule().getGameHasPlayers().get(0).getPlayerHasDeck().setGameStartDeckCards("player 1 game start deck");
		this.getGameHasGameRule().getGameHasPlayers().get(1).getPlayerHasDeck().setGameStartDeckCards("player 2 game start deck");
		
		
		
		Hero playerHero1 = cf.createHero();
		Hero playerHero2 = cf.createHero();
		
		//Since current we have 9 hero class, but I can't get enumeration's length, so just put 9 here as random seed.
		Random randomGenerator = new Random();
		playerHero1.setHeroClass(HeroClass.get(randomGenerator.nextInt(9)));
		playerHero2.setHeroClass(HeroClass.get(randomGenerator.nextInt(9)));
		
		this.getGameHasGameRule().getGameHasPlayers().get(0).getPlayerHasDeck().setDeckHasHero(playerHero1);
		this.getGameHasGameRule().getGameHasPlayers().get(1).getPlayerHasDeck().setDeckHasHero(playerHero2);
		System.out.println("["+this.getGameID()+ "] Player <heroes> are ready");			
		System.out.println("["+this.getGameID()+ "] Player in Game <Decks> are ready");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HearthstonePackage.GAME__GAME_IN_GAME_POOL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGameInGamePool((GamePool)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HearthstonePackage.GAME__GAME_IN_GAME_POOL:
				return basicSetGameInGamePool(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case HearthstonePackage.GAME__GAME_IN_GAME_POOL:
				return eInternalContainer().eInverseRemove(this, HearthstonePackage.GAME_POOL__GAME_POOL_HAS_GAMES, GamePool.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case HearthstonePackage.GAME__GAME_IN_GAME_POOL:
				return getGameInGamePool();
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
			case HearthstonePackage.GAME__GAME_IN_GAME_POOL:
				setGameInGamePool((GamePool)newValue);
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
			case HearthstonePackage.GAME__GAME_IN_GAME_POOL:
				setGameInGamePool((GamePool)null);
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
			case HearthstonePackage.GAME__GAME_IN_GAME_POOL:
				return getGameInGamePool() != null;
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
			case HearthstonePackage.GAME___SHOW_GAME_IN_DETAIL:
				ShowGameInDetail();
				return null;
			case HearthstonePackage.GAME___CHECK_GAME_STATES:
				return CheckGameStates();
			case HearthstonePackage.GAME___SHOW_PLAYER_GAME_BOARD:
				ShowPlayerGameBoard();
				return null;
			case HearthstonePackage.GAME___INITIALIZE_GAME:
				InitializeGame();
				return null;
			case HearthstonePackage.GAME___SET_GAME_BOARD:
				SetGameBoard();
				return null;
			case HearthstonePackage.GAME___SET_GAME_PLAYER:
				SetGamePlayer();
				return null;
			case HearthstonePackage.GAME___SET_PLAYER_HAND:
				SetPlayerHand();
				return null;
			case HearthstonePackage.GAME___SET_GAME_RULE:
				SetGameRule();
				return null;
			case HearthstonePackage.GAME___SET_PLAYER_DECK:
				SetPlayerDeck();
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
