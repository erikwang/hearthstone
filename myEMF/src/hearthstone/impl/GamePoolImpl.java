/**
 */
package hearthstone.impl;

import hearthstone.Card;
import hearthstone.CardLibrary;
import hearthstone.Game;
import hearthstone.GamePool;
import hearthstone.GameRegion;
import hearthstone.GameStates;
import hearthstone.HearthstoneFactory;
import hearthstone.HearthstonePackage;
import hearthstone.Hero;
import hearthstone.PlayerBoard;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
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
 *   <li>{@link hearthstone.impl.GamePoolImpl#getGamePoolStartDate <em>Game Pool Start Date</em>}</li>
 *   <li>{@link hearthstone.impl.GamePoolImpl#getGamePoolRegion <em>Game Pool Region</em>}</li>
 *   <li>{@link hearthstone.impl.GamePoolImpl#getGamePoolHasCardLibrary <em>Game Pool Has Card Library</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GamePoolImpl extends MinimalEObjectImpl.Container implements GamePool {
	HearthstoneFactory cf = HearthstoneFactory.eINSTANCE;
	//SetGame sg = new SetGame();
	//SetCards sc = new SetCards();
	Game theGame;
	Scanner sca = new Scanner(System.in);
	CardLibrary clb;
	
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
	 * The default value of the '{@link #getGamePoolStartDate() <em>Game Pool Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamePoolStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date GAME_POOL_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGamePoolStartDate() <em>Game Pool Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamePoolStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date gamePoolStartDate = GAME_POOL_START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGamePoolRegion() <em>Game Pool Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamePoolRegion()
	 * @generated
	 * @ordered
	 */
	protected static final GameRegion GAME_POOL_REGION_EDEFAULT = GameRegion.AMS;
	/**
	 * The cached value of the '{@link #getGamePoolRegion() <em>Game Pool Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamePoolRegion()
	 * @generated
	 * @ordered
	 */
	protected GameRegion gamePoolRegion = GAME_POOL_REGION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGamePoolHasCardLibrary() <em>Game Pool Has Card Library</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamePoolHasCardLibrary()
	 * @generated
	 * @ordered
	 */
	protected CardLibrary gamePoolHasCardLibrary;

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
			gamePoolHasGames = new EObjectContainmentWithInverseEList<Game>(Game.class, this, HearthstonePackage.GAME_POOL__GAME_POOL_HAS_GAMES, HearthstonePackage.GAME__GAME_IN_GAME_POOL);
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
	public Date getGamePoolStartDate() {
		return gamePoolStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGamePoolStartDate(Date newGamePoolStartDate) {
		Date oldGamePoolStartDate = gamePoolStartDate;
		gamePoolStartDate = newGamePoolStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.GAME_POOL__GAME_POOL_START_DATE, oldGamePoolStartDate, gamePoolStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameRegion getGamePoolRegion() {
		return gamePoolRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGamePoolRegion(GameRegion newGamePoolRegion) {
		GameRegion oldGamePoolRegion = gamePoolRegion;
		gamePoolRegion = newGamePoolRegion == null ? GAME_POOL_REGION_EDEFAULT : newGamePoolRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.GAME_POOL__GAME_POOL_REGION, oldGamePoolRegion, gamePoolRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardLibrary getGamePoolHasCardLibrary() {
		if (gamePoolHasCardLibrary != null && gamePoolHasCardLibrary.eIsProxy()) {
			InternalEObject oldGamePoolHasCardLibrary = (InternalEObject)gamePoolHasCardLibrary;
			gamePoolHasCardLibrary = (CardLibrary)eResolveProxy(oldGamePoolHasCardLibrary);
			if (gamePoolHasCardLibrary != oldGamePoolHasCardLibrary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HearthstonePackage.GAME_POOL__GAME_POOL_HAS_CARD_LIBRARY, oldGamePoolHasCardLibrary, gamePoolHasCardLibrary));
			}
		}
		return gamePoolHasCardLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardLibrary basicGetGamePoolHasCardLibrary() {
		return gamePoolHasCardLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGamePoolHasCardLibrary(CardLibrary newGamePoolHasCardLibrary) {
		CardLibrary oldGamePoolHasCardLibrary = gamePoolHasCardLibrary;
		gamePoolHasCardLibrary = newGamePoolHasCardLibrary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.GAME_POOL__GAME_POOL_HAS_CARD_LIBRARY, oldGamePoolHasCardLibrary, gamePoolHasCardLibrary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void ShowAllGames() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		if(this.getGamePoolHasGames().size() == 0){
			System.out.println("[Show game pool] There is no game in play.");	
		}else{
			for(int t=0;t<this.getGamePoolHasGames().size();t++){
				System.out.println("[Game] "+t+" information:");
				System.out.println("Game state = "+this.getGamePoolHasGames().get(t).getGameStates());
				this.getGamePoolHasGames().get(t).ShowGameInDetail();
				System.out.println("--------------------------");
			}	
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void CreateGame() {
		theGame = cf.createGame();
		String id = new Date().toString();
		theGame.setGameID(id);
		theGame.InitializeGame();
		this.getGamePoolHasGames().add(theGame);
		System.out.println("Complete, a new game is ready, in game pool spot "+this.getGamePoolHasGames().size());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void HaltGame() {
		theGame = AskInputGameIndex();
		if(theGame != null){	
			theGame.setGameStates(GameStates.HALT);
			System.out.println("[Game has halted] "+ theGame.toString());
		}else{
			System.out.println("Game index is illegal. Game not exists");
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void ShowGamePoolStates() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		System.out.println("--------[Game Pool report]--------");
		System.out.println("Game pool region -------- "+this.getGamePoolRegion());
		System.out.println("Game pool started ------- "+this.getGamePoolStartDate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * 
	 * Initial works
	 */
	public void Initialize() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		System.out.println("> Starting initial the game......");

				
		//load cards from db, put the list to AllCards in CardLibrary
		clb = cf.createCardLibrary();
		this.setGamePoolHasCardLibrary(clb);
		//clb.LoadFromDb();
		
		
		this.getGamePoolHasCardLibrary().LoadFromDb();
		//this.setGamePoolHasCardLibrary(clb);
		
		this.setGamePoolRegion(GameRegion.AMS);
		this.setGamePoolStartDate(new Date());
		System.out.println("> Done...");
		
		ShowHelp();
		while(true){
		System.out.println("> Please enter your command / ? for help");
		String name = sca.nextLine();
		
		switch(name){
			case "?":
				ShowHelp();
				break;
			
			case "cg":
				CreateGame();
				break;
			
			case "sagd":
				for(int t=0;t<this.getGamePoolHasGames().size();t++){
					System.out.println("[Game] "+t+" information:");
					this.getGamePoolHasGames().get(t).ShowGameInDetail();
					System.out.println("--------------------------");
				}
				break;
			
			case "sag":
				ShowAllGames();
				break;
			
			case "sgp":
				ShowGamePoolStates();
			break;
			
			case "sgb":
				theGame = AskInputGameIndex();
				if(theGame == null){
					break;
				}else{
					theGame.ShowPlayerGameBoard();
				}
				break;
				
			case "sgh":
				theGame = AskInputGameIndex();
				if(theGame != null){
					theGame.getGameHasGameRule().getGameHasPlayers().get(0).getPlayerHasHand().ShowGameHand();
					theGame.getGameHasGameRule().getGameHasPlayers().get(1).getPlayerHasHand().ShowGameHand();
				}else{
					//System.out.println("Game index is illegal. Game not exists");
				}
				break;
				
			case "hg":
				HaltGame();
				break;
			
			case "eg":
				theGame = AskInputGameIndex();
				if(theGame != null){
					System.out.println("[Current game] you now can operate game"+theGame.toString());
				}
				break;
			
			case "fc":
				//sc.showCardDb();
				String strCardName = sca.nextLine();
				this.getGamePoolHasCardLibrary().getAllCardsPool().findCard(strCardName);
				break;
			
			case "sc":
				//sc.showCardDb();
				this.getGamePoolHasCardLibrary().ShowCardLibrary();
				break;
			case "dc":
				theGame = AskInputGameIndex();
				if(theGame != null){
					System.out.println("> Please enter which player draw a card: 0-you or 1-opponet");
					String strPlayer = sca.nextLine();
					if(! strPlayer.matches("^[01]$")){
						System.out.println("[Error] Input is not a number either 0 or 1");
						break;
					}
					System.out.println("> Please enter how many cards to draw: 1-9");
					String strNumOfCards = sca.nextLine();
					if(! strNumOfCards.matches("^[1-9]$")){
						System.out.println("[Error] Number of card should be a number from 1 to 9");
						break;
					}else{
						int intPlayer = new Integer(strPlayer).intValue();
						int intNumOfCards = new Integer(strNumOfCards).intValue();
						for(int tt = 0;tt<intNumOfCards;tt++){
							theGame.getGameHasGameRule().getGameHasPlayers().get(intPlayer).DrawCard();							
						}
						System.out.println("Player "+theGame.getGameHasGameRule().getGameHasPlayers().get(intPlayer)+" drew "+intNumOfCards+" card(s)");	
					}
					
				}else{
						//No game in the index
				}
				break;
			
			case "pc":
					theGame = AskInputGameIndex();
					if(theGame != null){
						System.out.println("> Please enter which player play a card: 0-you or 1-opponet");
						String strPlayer = sca.nextLine();
						if(! strPlayer.matches("^[01]$")){
							System.out.println("[Error] Input is not a number either 0 or 1");
							break;
						}else{
							int intPlayer = new Integer(strPlayer).intValue();
							theGame.getGameHasGameRule().getGameHasPlayers().get(intPlayer).getPlayerHasHand().ShowGameHand();
							System.out.println("> Please enter which card to play 0 - "+(theGame.getGameHasGameRule().getGameHasPlayers().get(intPlayer).getPlayerHasHand().getCardsInHand().size()-1));
							String strIndexOfCards = sca.nextLine();
							if(! strIndexOfCards.matches("^[0-9]$")){
								System.out.println("[Error] Input is not a number between 0 to 9");
								break;
							}else{
								int intIndexOfCards = new Integer(strIndexOfCards).intValue();
								theGame.getGameHasGameRule().getGameHasPlayers().get(intPlayer).PlayCard(intIndexOfCards);
								System.out.println("Player "+theGame.getGameHasGameRule().getGameHasPlayers().get(intPlayer)+" has player a card");
							break;
							}
						}
					}
			break;

			//Operate a card, this part should be placed in player model, but since it needs some interaction with UI, for convenience I put them here
			case "oc":
				theGame = AskInputGameIndex();
				if(theGame != null){
					System.out.println("> Please enter which player player a card: 0-you or 1-opponet");
					String strPlayer = sca.nextLine();
					if(! strPlayer.matches("^[01]$")){
						System.out.println("[Error] Input is not a number either 0 or 1");
						break;
					}
					int intPlayer = new Integer(strPlayer).intValue();
					System.out.println("> Cards on your board:");
					theGame.getGameHasGameRule().getGameHasPlayers().get(intPlayer).getPlayerHasOwnBoard().ShowPlayerBoard();
					System.out.println("> Cards on your opponent's board:");
					theGame.getGameHasGameRule().getGameHasPlayers().get(Math.abs(intPlayer -1)).getPlayerHasOwnBoard().ShowPlayerBoard();
					
					
					//actually here doesn't need two card object, but for coding convenience I put another two cards objects
					Card yourCard = cf.createCard();
					Card oppoCard = cf.createCard();
					Hero oppoHero = cf.createHero();
					yourCard = AskInputCardIndex(theGame.getGameHasGameRule().getGameHasPlayers().get(intPlayer).getPlayerHasOwnBoard());
					
					
					System.out.println("> Please enter the opponent's card index you want to attack : 0-"+(+theGame.getGameHasGameRule().getGameHasPlayers().get(intPlayer).getPlayerHasOwnBoard().getDeckHasCards().size()-1)+". Or h for opponent's hero");
					String _input = sca.nextLine();
					if(_input.matches("^[0-9]$")){
						int cardIndex = new Integer(_input).intValue();
						if(cardIndex < theGame.getGameHasGameRule().getGameHasPlayers().get(Math.abs(intPlayer - 1)).getPlayerHasOwnBoard().getDeckHasCards().size()){
							System.out.println("[Card picked] Found the card of index="+cardIndex+" of board");
							oppoCard = theGame.getGameHasGameRule().getGameHasPlayers().get(Math.abs(intPlayer - 1)).getPlayerHasOwnBoard().getDeckHasCards().get(cardIndex);
							if (yourCard != null & oppoCard != null){
								yourCard.InteractAnotherCard(oppoCard);
								theGame.getGameHasGameRule().getGameHasPlayers().get(0).getPlayerHasOwnBoard().FlushDeck();
								theGame.getGameHasGameRule().getGameHasPlayers().get(1).getPlayerHasOwnBoard().FlushDeck();
								
								System.out.println("> Now cards on your board:");
								theGame.getGameHasGameRule().getGameHasPlayers().get(intPlayer).getPlayerHasOwnBoard().ShowPlayerBoard();
								
								System.out.println("> Now cards on your opponent's board:");
								theGame.getGameHasGameRule().getGameHasPlayers().get(Math.abs(intPlayer -1)).getPlayerHasOwnBoard().ShowPlayerBoard();
								
							}else{
								System.out.println("[Error] One of your card or opponent's card is not exist");
							}
						}else{
							System.out.println("[Can't find card on board] No such card in index="+cardIndex+" on the player's board");
						}
					}if(_input.matches("^[h]$")){
						oppoHero = theGame.getGameHasGameRule().getGameHasPlayers().get(Math.abs(intPlayer - 1)).getPlayerHasOwnBoard().getDeckHasHero();
						if (yourCard != null & oppoHero != null){
							yourCard.InteractOppoHero(oppoHero);
							theGame.getGameHasGameRule().getGameHasPlayers().get(0).getPlayerHasOwnBoard().FlushDeck();
							theGame.getGameHasGameRule().getGameHasPlayers().get(1).getPlayerHasOwnBoard().FlushDeck();
							System.out.println("> Now cards on your board:");
							theGame.getGameHasGameRule().getGameHasPlayers().get(intPlayer).getPlayerHasOwnBoard().ShowPlayerBoard();
							System.out.println("> Now cards on your opponent's board:");
							theGame.getGameHasGameRule().getGameHasPlayers().get(Math.abs(intPlayer -1)).getPlayerHasOwnBoard().ShowPlayerBoard();
						}else{
							System.out.println("[Error] Your opponent's hero is missing");
						}

					}
					else{
						System.out.println("[Input error] Input is not a number, operation terminated.");
					}
				}
			if(theGame != null){
				theGame.CheckGameStates();	
			}
			break;
			
			case "sgd":
				theGame = AskInputGameIndex();
				if(theGame != null){
					System.out.println("> Please enter which player player a card: 0-you or 1-opponet");
					String strPlayer = sca.nextLine();
					if(! strPlayer.matches("^[01]")){
						System.out.println("[Error] Input is not a number either 0 or 1");
						break;
					}else{
						int intPlayer = new Integer(strPlayer).intValue();
						theGame.getGameHasGameRule().getGameHasPlayers().get(intPlayer).getPlayerHasDeck().ShowGameDeck();
					}
				}
				break;
			
			case "sg":
				theGame = AskInputGameIndex();
				if(theGame != null){
					theGame.ShowGameInDetail();
					break;
				}
				break;
			
			case "by":
				System.out.println("bye - thank you for use");
				return;
			
			
			default:
				System.out.println("Unknown command, please try again. ? for help");
				
			}
		}
	}


	public static void ShowHelp(){
		System.out.println("Command help:");
		System.out.println("? - this message");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("cg - create a new game");
		System.out.println("hg - halt a game");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("sgp - show game pool information");
		System.out.println("sag - show all current game(s)");
		System.out.println("sagd - show all current game(s) in details");
		System.out.println("sg - show a game in detail");
		System.out.println("sgd - show game deck");
		System.out.println("sgb - show a game board");
		System.out.println("sgh - show a player's current hand");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("fc - find a card by name (hash)");
		System.out.println("pc - play a card from your hand to board");
		System.out.println("dc - draw a card");
		System.out.println("oc - operat a card on board to interact with another card on your oppenent's board");
		System.out.println("sc - show card database");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("by - quit");
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HearthstonePackage.GAME_POOL__GAME_POOL_HAS_GAMES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGamePoolHasGames()).basicAdd(otherEnd, msgs);
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
			case HearthstonePackage.GAME_POOL__GAME_POOL_START_DATE:
				return getGamePoolStartDate();
			case HearthstonePackage.GAME_POOL__GAME_POOL_REGION:
				return getGamePoolRegion();
			case HearthstonePackage.GAME_POOL__GAME_POOL_HAS_CARD_LIBRARY:
				if (resolve) return getGamePoolHasCardLibrary();
				return basicGetGamePoolHasCardLibrary();
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
			case HearthstonePackage.GAME_POOL__GAME_POOL_START_DATE:
				setGamePoolStartDate((Date)newValue);
				return;
			case HearthstonePackage.GAME_POOL__GAME_POOL_REGION:
				setGamePoolRegion((GameRegion)newValue);
				return;
			case HearthstonePackage.GAME_POOL__GAME_POOL_HAS_CARD_LIBRARY:
				setGamePoolHasCardLibrary((CardLibrary)newValue);
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
			case HearthstonePackage.GAME_POOL__GAME_POOL_START_DATE:
				setGamePoolStartDate(GAME_POOL_START_DATE_EDEFAULT);
				return;
			case HearthstonePackage.GAME_POOL__GAME_POOL_REGION:
				setGamePoolRegion(GAME_POOL_REGION_EDEFAULT);
				return;
			case HearthstonePackage.GAME_POOL__GAME_POOL_HAS_CARD_LIBRARY:
				setGamePoolHasCardLibrary((CardLibrary)null);
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
			case HearthstonePackage.GAME_POOL__GAME_POOL_START_DATE:
				return GAME_POOL_START_DATE_EDEFAULT == null ? gamePoolStartDate != null : !GAME_POOL_START_DATE_EDEFAULT.equals(gamePoolStartDate);
			case HearthstonePackage.GAME_POOL__GAME_POOL_REGION:
				return gamePoolRegion != GAME_POOL_REGION_EDEFAULT;
			case HearthstonePackage.GAME_POOL__GAME_POOL_HAS_CARD_LIBRARY:
				return gamePoolHasCardLibrary != null;
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
			case HearthstonePackage.GAME_POOL___SHOW_ALL_GAMES:
				ShowAllGames();
				return null;
			case HearthstonePackage.GAME_POOL___CREATE_GAME:
				CreateGame();
				return null;
			case HearthstonePackage.GAME_POOL___HALT_GAME:
				HaltGame();
				return null;
			case HearthstonePackage.GAME_POOL___SHOW_GAME_POOL_STATES:
				ShowGamePoolStates();
				return null;
			case HearthstonePackage.GAME_POOL___INITIALIZE:
				Initialize();
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
		result.append(" (GamePoolDesc: ");
		result.append(gamePoolDesc);
		result.append(", GamePoolStartDate: ");
		result.append(gamePoolStartDate);
		result.append(", GamePoolRegion: ");
		result.append(gamePoolRegion);
		result.append(')');
		return result.toString();
	}


	public Game AskInputGameIndex(){
		System.out.println("> Please enter the index number of game: 0-"+(this.getGamePoolHasGames().size()-1)+".");
		String _input = sca.nextLine();
		if(_input.matches("^[0-9]+$")){
			int gameIndex = new Integer(_input).intValue();
			if(gameIndex < this.getGamePoolHasGames().size()){
				System.out.println("[Game found] Found the game of index="+gameIndex+" of game pool");
				if(! this.getGamePoolHasGames().get(gameIndex).getGameStates().equals(GameStates.OVER)){
					return this.getGamePoolHasGames().get(gameIndex);	
				}else{
					System.out.println("[Game found] Found the game of index="+gameIndex+" of game pool, but this game is already over. Try another one");
					return null;
				}
				
			}else{
				System.out.println("[Can't find a game] No such game in index="+gameIndex+" of game pool");
				return null;
			}
		}else{
			System.out.println("[Input error] Input is not a number");
			return null;
		}
	}

	public Card AskInputCardIndex(PlayerBoard pb){
		System.out.println("> Please enter the index number of card: 0-"+(+pb.getDeckHasCards().size()-1));
		String _input = sca.nextLine();
		if(_input.matches("^[0-9]+$")){
			int cardIndex = new Integer(_input).intValue();
			if(cardIndex < pb.getDeckHasCards().size()){
				System.out.println("[Card picked] Found the card of index="+cardIndex+" of board");
				return pb.getDeckHasCards().get(cardIndex);
			}else{
				System.out.println("[Can't find card on board] No such card in index="+cardIndex+" on the player's board");
				return null;
			}
		}else{
			System.out.println("[Input error] Input is not a number, operation terminated.");
			return null;
		}
		
	}
} //GamePoolImpl
