/**
 */
package hearthstone.impl;

import hearthstone.Card;
import hearthstone.CardStates;
import hearthstone.Deck;
import hearthstone.GameDeck;
import hearthstone.GamePlayerHand;
import hearthstone.HearthstonePackage;
import hearthstone.Hero;
import hearthstone.Player;
import hearthstone.PlayerBoard;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hearthstone.impl.PlayerImpl#getName <em>Name</em>}</li>
 *   <li>{@link hearthstone.impl.PlayerImpl#getTotalWins <em>Total Wins</em>}</li>
 *   <li>{@link hearthstone.impl.PlayerImpl#getPlayerHasDeck <em>Player Has Deck</em>}</li>
 *   <li>{@link hearthstone.impl.PlayerImpl#getCardsInHand <em>Cards In Hand</em>}</li>
 *   <li>{@link hearthstone.impl.PlayerImpl#getPlayerHasOwnBoard <em>Player Has Own Board</em>}</li>
 *   <li>{@link hearthstone.impl.PlayerImpl#getPlayerID <em>Player ID</em>}</li>
 *   <li>{@link hearthstone.impl.PlayerImpl#getLastLogin <em>Last Login</em>}</li>
 *   <li>{@link hearthstone.impl.PlayerImpl#getPlayerLevel <em>Player Level</em>}</li>
 *   <li>{@link hearthstone.impl.PlayerImpl#getPlayerHasGameStartDeck <em>Player Has Game Start Deck</em>}</li>
 *   <li>{@link hearthstone.impl.PlayerImpl#getPlayerHasDeckSet <em>Player Has Deck Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlayerImpl extends MinimalEObjectImpl.Container implements Player {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalWins() <em>Total Wins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalWins()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_WINS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalWins() <em>Total Wins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalWins()
	 * @generated
	 * @ordered
	 */
	protected int totalWins = TOTAL_WINS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlayerHasDeck() <em>Player Has Deck</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerHasDeck()
	 * @generated
	 * @ordered
	 */
	protected GameDeck playerHasDeck;

	/**
	 * The cached value of the '{@link #getCardsInHand() <em>Cards In Hand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardsInHand()
	 * @generated
	 * @ordered
	 */
	protected GamePlayerHand cardsInHand;

	/**
	 * The cached value of the '{@link #getPlayerHasOwnBoard() <em>Player Has Own Board</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerHasOwnBoard()
	 * @generated
	 * @ordered
	 */
	protected PlayerBoard playerHasOwnBoard;

	/**
	 * The default value of the '{@link #getPlayerID() <em>Player ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerID()
	 * @generated
	 * @ordered
	 */
	protected static final int PLAYER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPlayerID() <em>Player ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerID()
	 * @generated
	 * @ordered
	 */
	protected int playerID = PLAYER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastLogin() <em>Last Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastLogin()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_LOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastLogin() <em>Last Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastLogin()
	 * @generated
	 * @ordered
	 */
	protected Date lastLogin = LAST_LOGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlayerLevel() <em>Player Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int PLAYER_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPlayerLevel() <em>Player Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerLevel()
	 * @generated
	 * @ordered
	 */
	protected int playerLevel = PLAYER_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlayerHasGameStartDeck() <em>Player Has Game Start Deck</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerHasGameStartDeck()
	 * @generated
	 * @ordered
	 */
	protected Deck playerHasGameStartDeck;

	/**
	 * The cached value of the '{@link #getPlayerHasDeckSet() <em>Player Has Deck Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerHasDeckSet()
	 * @generated
	 * @ordered
	 */
	protected EList<Deck> playerHasDeckSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HearthstonePackage.Literals.PLAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.PLAYER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotalWins() {
		return totalWins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalWins(int newTotalWins) {
		int oldTotalWins = totalWins;
		totalWins = newTotalWins;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.PLAYER__TOTAL_WINS, oldTotalWins, totalWins));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameDeck getPlayerHasDeck() {
		return playerHasDeck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlayerHasDeck(GameDeck newPlayerHasDeck, NotificationChain msgs) {
		GameDeck oldPlayerHasDeck = playerHasDeck;
		playerHasDeck = newPlayerHasDeck;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HearthstonePackage.PLAYER__PLAYER_HAS_DECK, oldPlayerHasDeck, newPlayerHasDeck);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayerHasDeck(GameDeck newPlayerHasDeck) {
		if (newPlayerHasDeck != playerHasDeck) {
			NotificationChain msgs = null;
			if (playerHasDeck != null)
				msgs = ((InternalEObject)playerHasDeck).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HearthstonePackage.PLAYER__PLAYER_HAS_DECK, null, msgs);
			if (newPlayerHasDeck != null)
				msgs = ((InternalEObject)newPlayerHasDeck).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HearthstonePackage.PLAYER__PLAYER_HAS_DECK, null, msgs);
			msgs = basicSetPlayerHasDeck(newPlayerHasDeck, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.PLAYER__PLAYER_HAS_DECK, newPlayerHasDeck, newPlayerHasDeck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GamePlayerHand getCardsInHand() {
		return cardsInHand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardsInHand(GamePlayerHand newCardsInHand, NotificationChain msgs) {
		GamePlayerHand oldCardsInHand = cardsInHand;
		cardsInHand = newCardsInHand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HearthstonePackage.PLAYER__CARDS_IN_HAND, oldCardsInHand, newCardsInHand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardsInHand(GamePlayerHand newCardsInHand) {
		if (newCardsInHand != cardsInHand) {
			NotificationChain msgs = null;
			if (cardsInHand != null)
				msgs = ((InternalEObject)cardsInHand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HearthstonePackage.PLAYER__CARDS_IN_HAND, null, msgs);
			if (newCardsInHand != null)
				msgs = ((InternalEObject)newCardsInHand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HearthstonePackage.PLAYER__CARDS_IN_HAND, null, msgs);
			msgs = basicSetCardsInHand(newCardsInHand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.PLAYER__CARDS_IN_HAND, newCardsInHand, newCardsInHand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayerBoard getPlayerHasOwnBoard() {
		return playerHasOwnBoard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlayerHasOwnBoard(PlayerBoard newPlayerHasOwnBoard, NotificationChain msgs) {
		PlayerBoard oldPlayerHasOwnBoard = playerHasOwnBoard;
		playerHasOwnBoard = newPlayerHasOwnBoard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HearthstonePackage.PLAYER__PLAYER_HAS_OWN_BOARD, oldPlayerHasOwnBoard, newPlayerHasOwnBoard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayerHasOwnBoard(PlayerBoard newPlayerHasOwnBoard) {
		if (newPlayerHasOwnBoard != playerHasOwnBoard) {
			NotificationChain msgs = null;
			if (playerHasOwnBoard != null)
				msgs = ((InternalEObject)playerHasOwnBoard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HearthstonePackage.PLAYER__PLAYER_HAS_OWN_BOARD, null, msgs);
			if (newPlayerHasOwnBoard != null)
				msgs = ((InternalEObject)newPlayerHasOwnBoard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HearthstonePackage.PLAYER__PLAYER_HAS_OWN_BOARD, null, msgs);
			msgs = basicSetPlayerHasOwnBoard(newPlayerHasOwnBoard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.PLAYER__PLAYER_HAS_OWN_BOARD, newPlayerHasOwnBoard, newPlayerHasOwnBoard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPlayerID() {
		return playerID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayerID(int newPlayerID) {
		int oldPlayerID = playerID;
		playerID = newPlayerID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.PLAYER__PLAYER_ID, oldPlayerID, playerID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastLogin() {
		return lastLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastLogin(Date newLastLogin) {
		Date oldLastLogin = lastLogin;
		lastLogin = newLastLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.PLAYER__LAST_LOGIN, oldLastLogin, lastLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPlayerLevel() {
		return playerLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayerLevel(int newPlayerLevel) {
		int oldPlayerLevel = playerLevel;
		playerLevel = newPlayerLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.PLAYER__PLAYER_LEVEL, oldPlayerLevel, playerLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deck getPlayerHasGameStartDeck() {
		return playerHasGameStartDeck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlayerHasGameStartDeck(Deck newPlayerHasGameStartDeck, NotificationChain msgs) {
		Deck oldPlayerHasGameStartDeck = playerHasGameStartDeck;
		playerHasGameStartDeck = newPlayerHasGameStartDeck;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HearthstonePackage.PLAYER__PLAYER_HAS_GAME_START_DECK, oldPlayerHasGameStartDeck, newPlayerHasGameStartDeck);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayerHasGameStartDeck(Deck newPlayerHasGameStartDeck) {
		if (newPlayerHasGameStartDeck != playerHasGameStartDeck) {
			NotificationChain msgs = null;
			if (playerHasGameStartDeck != null)
				msgs = ((InternalEObject)playerHasGameStartDeck).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HearthstonePackage.PLAYER__PLAYER_HAS_GAME_START_DECK, null, msgs);
			if (newPlayerHasGameStartDeck != null)
				msgs = ((InternalEObject)newPlayerHasGameStartDeck).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HearthstonePackage.PLAYER__PLAYER_HAS_GAME_START_DECK, null, msgs);
			msgs = basicSetPlayerHasGameStartDeck(newPlayerHasGameStartDeck, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.PLAYER__PLAYER_HAS_GAME_START_DECK, newPlayerHasGameStartDeck, newPlayerHasGameStartDeck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Deck> getPlayerHasDeckSet() {
		if (playerHasDeckSet == null) {
			playerHasDeckSet = new EObjectContainmentEList<Deck>(Deck.class, this, HearthstonePackage.PLAYER__PLAYER_HAS_DECK_SET);
		}
		return playerHasDeckSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void PlayCard(int _cardindex) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		if(_cardindex < (this.getCardsInHand().getCardsInHand().size()) && _cardindex >= 0){
			this.getCardsInHand().getCardsInHand().get(_cardindex).setCardStates(CardStates.SLEEP);
			System.out.println("[Play a card]"+ this.name+" plays this card to his board");
			this.getCardsInHand().getCardsInHand().get(_cardindex).ShowCard();
			this.getPlayerHasOwnBoard().getDeckHasCards().add(this.getCardsInHand().getCardsInHand().get(_cardindex));
			System.out.println("[Card left in hand] = "+this.getCardsInHand().getCardsInHand().size());
			System.out.println("[Card on board] = "+this.getPlayerHasOwnBoard().getDeckHasCards().size());
		}else{
			System.out.println("[Play a card] can't play, no cards left in hand");
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean OperateCard(Card thecard) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ClickNextTurnBtn() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean DrawCard() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		if(this.getPlayerHasDeck().getDeckHasCards().size() > 0){
			System.out.println("Cards in deck left "+this.getPlayerHasDeck().getDeckHasCards().size()+" A card of ["+this.getPlayerHasDeck().getDeckHasCards().get(0).getCardName()+"] has drew to hand");
			if(this.getCardsInHand().getCardsInHand().size()>9){
				System.out.println("[Oops] Player"+this.getName()+" hand is too full, card"+this.getPlayerHasDeck().getDeckHasCards().get(0).getCardName()+" was discard.");
				this.getPlayerHasDeck().getDeckHasCards().get(0).setCardStates(CardStates.DEAD);
				this.getPlayerHasDeck().getDeckHasCards().remove(0);
				return true;
			}else{
				this.getPlayerHasDeck().getDeckHasCards().get(0).setCardStates(CardStates.IN_PLAYER_HAND);
				this.getPlayerHasDeck().getDeckHasCards().get(0).ShowCard();
				this.getCardsInHand().getCardsInHand().add(this.getPlayerHasDeck().getDeckHasCards().get(0));
				//_player.getPlayerHasDeck().getDeckHasCards().remove(0); // don't need this
				return true;		
			}
		}else{
			System.out.println("No more cards in the deck");
			return false;
		}
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void OperateCard(Hero theHero) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HearthstonePackage.PLAYER__PLAYER_HAS_DECK:
				return basicSetPlayerHasDeck(null, msgs);
			case HearthstonePackage.PLAYER__CARDS_IN_HAND:
				return basicSetCardsInHand(null, msgs);
			case HearthstonePackage.PLAYER__PLAYER_HAS_OWN_BOARD:
				return basicSetPlayerHasOwnBoard(null, msgs);
			case HearthstonePackage.PLAYER__PLAYER_HAS_GAME_START_DECK:
				return basicSetPlayerHasGameStartDeck(null, msgs);
			case HearthstonePackage.PLAYER__PLAYER_HAS_DECK_SET:
				return ((InternalEList<?>)getPlayerHasDeckSet()).basicRemove(otherEnd, msgs);
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
			case HearthstonePackage.PLAYER__NAME:
				return getName();
			case HearthstonePackage.PLAYER__TOTAL_WINS:
				return getTotalWins();
			case HearthstonePackage.PLAYER__PLAYER_HAS_DECK:
				return getPlayerHasDeck();
			case HearthstonePackage.PLAYER__CARDS_IN_HAND:
				return getCardsInHand();
			case HearthstonePackage.PLAYER__PLAYER_HAS_OWN_BOARD:
				return getPlayerHasOwnBoard();
			case HearthstonePackage.PLAYER__PLAYER_ID:
				return getPlayerID();
			case HearthstonePackage.PLAYER__LAST_LOGIN:
				return getLastLogin();
			case HearthstonePackage.PLAYER__PLAYER_LEVEL:
				return getPlayerLevel();
			case HearthstonePackage.PLAYER__PLAYER_HAS_GAME_START_DECK:
				return getPlayerHasGameStartDeck();
			case HearthstonePackage.PLAYER__PLAYER_HAS_DECK_SET:
				return getPlayerHasDeckSet();
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
			case HearthstonePackage.PLAYER__NAME:
				setName((String)newValue);
				return;
			case HearthstonePackage.PLAYER__TOTAL_WINS:
				setTotalWins((Integer)newValue);
				return;
			case HearthstonePackage.PLAYER__PLAYER_HAS_DECK:
				setPlayerHasDeck((GameDeck)newValue);
				return;
			case HearthstonePackage.PLAYER__CARDS_IN_HAND:
				setCardsInHand((GamePlayerHand)newValue);
				return;
			case HearthstonePackage.PLAYER__PLAYER_HAS_OWN_BOARD:
				setPlayerHasOwnBoard((PlayerBoard)newValue);
				return;
			case HearthstonePackage.PLAYER__PLAYER_ID:
				setPlayerID((Integer)newValue);
				return;
			case HearthstonePackage.PLAYER__LAST_LOGIN:
				setLastLogin((Date)newValue);
				return;
			case HearthstonePackage.PLAYER__PLAYER_LEVEL:
				setPlayerLevel((Integer)newValue);
				return;
			case HearthstonePackage.PLAYER__PLAYER_HAS_GAME_START_DECK:
				setPlayerHasGameStartDeck((Deck)newValue);
				return;
			case HearthstonePackage.PLAYER__PLAYER_HAS_DECK_SET:
				getPlayerHasDeckSet().clear();
				getPlayerHasDeckSet().addAll((Collection<? extends Deck>)newValue);
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
			case HearthstonePackage.PLAYER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HearthstonePackage.PLAYER__TOTAL_WINS:
				setTotalWins(TOTAL_WINS_EDEFAULT);
				return;
			case HearthstonePackage.PLAYER__PLAYER_HAS_DECK:
				setPlayerHasDeck((GameDeck)null);
				return;
			case HearthstonePackage.PLAYER__CARDS_IN_HAND:
				setCardsInHand((GamePlayerHand)null);
				return;
			case HearthstonePackage.PLAYER__PLAYER_HAS_OWN_BOARD:
				setPlayerHasOwnBoard((PlayerBoard)null);
				return;
			case HearthstonePackage.PLAYER__PLAYER_ID:
				setPlayerID(PLAYER_ID_EDEFAULT);
				return;
			case HearthstonePackage.PLAYER__LAST_LOGIN:
				setLastLogin(LAST_LOGIN_EDEFAULT);
				return;
			case HearthstonePackage.PLAYER__PLAYER_LEVEL:
				setPlayerLevel(PLAYER_LEVEL_EDEFAULT);
				return;
			case HearthstonePackage.PLAYER__PLAYER_HAS_GAME_START_DECK:
				setPlayerHasGameStartDeck((Deck)null);
				return;
			case HearthstonePackage.PLAYER__PLAYER_HAS_DECK_SET:
				getPlayerHasDeckSet().clear();
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
			case HearthstonePackage.PLAYER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HearthstonePackage.PLAYER__TOTAL_WINS:
				return totalWins != TOTAL_WINS_EDEFAULT;
			case HearthstonePackage.PLAYER__PLAYER_HAS_DECK:
				return playerHasDeck != null;
			case HearthstonePackage.PLAYER__CARDS_IN_HAND:
				return cardsInHand != null;
			case HearthstonePackage.PLAYER__PLAYER_HAS_OWN_BOARD:
				return playerHasOwnBoard != null;
			case HearthstonePackage.PLAYER__PLAYER_ID:
				return playerID != PLAYER_ID_EDEFAULT;
			case HearthstonePackage.PLAYER__LAST_LOGIN:
				return LAST_LOGIN_EDEFAULT == null ? lastLogin != null : !LAST_LOGIN_EDEFAULT.equals(lastLogin);
			case HearthstonePackage.PLAYER__PLAYER_LEVEL:
				return playerLevel != PLAYER_LEVEL_EDEFAULT;
			case HearthstonePackage.PLAYER__PLAYER_HAS_GAME_START_DECK:
				return playerHasGameStartDeck != null;
			case HearthstonePackage.PLAYER__PLAYER_HAS_DECK_SET:
				return playerHasDeckSet != null && !playerHasDeckSet.isEmpty();
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
			case HearthstonePackage.PLAYER___PLAY_CARD__INT:
				PlayCard((Integer)arguments.get(0));
				return null;
			case HearthstonePackage.PLAYER___OPERATE_CARD__CARD:
				return OperateCard((Card)arguments.get(0));
			case HearthstonePackage.PLAYER___CLICK_NEXT_TURN_BTN:
				return ClickNextTurnBtn();
			case HearthstonePackage.PLAYER___DRAW_CARD:
				return DrawCard();
			case HearthstonePackage.PLAYER___OPERATE_CARD__HERO:
				OperateCard((Hero)arguments.get(0));
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", TotalWins: ");
		result.append(totalWins);
		result.append(", PlayerID: ");
		result.append(playerID);
		result.append(", LastLogin: ");
		result.append(lastLogin);
		result.append(", PlayerLevel: ");
		result.append(playerLevel);
		result.append(')');
		return result.toString();
	}

} //PlayerImpl
