/**
 */
package hearthstone.impl;

import hearthstone.Card;
import hearthstone.CardLibrary;
import hearthstone.GameDeck;
import hearthstone.HearthstonePackage;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Deck</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hearthstone.impl.GameDeckImpl#getDeckOwner <em>Deck Owner</em>}</li>
 *   <li>{@link hearthstone.impl.GameDeckImpl#getGameStartDeckCards <em>Game Start Deck Cards</em>}</li>
 *   <li>{@link hearthstone.impl.GameDeckImpl#getGameDeckBelongToCardLibrary <em>Game Deck Belong To Card Library</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GameDeckImpl extends DeckImpl implements GameDeck {
	/**
	 * The default value of the '{@link #getDeckOwner() <em>Deck Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeckOwner()
	 * @generated
	 * @ordered
	 */
	protected static final String DECK_OWNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeckOwner() <em>Deck Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeckOwner()
	 * @generated
	 * @ordered
	 */
	protected String deckOwner = DECK_OWNER_EDEFAULT;

	/**
	 * The default value of the '{@link #getGameStartDeckCards() <em>Game Start Deck Cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameStartDeckCards()
	 * @generated
	 * @ordered
	 */
	protected static final String GAME_START_DECK_CARDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGameStartDeckCards() <em>Game Start Deck Cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameStartDeckCards()
	 * @generated
	 * @ordered
	 */
	protected String gameStartDeckCards = GAME_START_DECK_CARDS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGameDeckBelongToCardLibrary() <em>Game Deck Belong To Card Library</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameDeckBelongToCardLibrary()
	 * @generated
	 * @ordered
	 */
	protected CardLibrary gameDeckBelongToCardLibrary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameDeckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HearthstonePackage.Literals.GAME_DECK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeckOwner() {
		return deckOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeckOwner(String newDeckOwner) {
		String oldDeckOwner = deckOwner;
		deckOwner = newDeckOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.GAME_DECK__DECK_OWNER, oldDeckOwner, deckOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGameStartDeckCards() {
		return gameStartDeckCards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGameStartDeckCards(String newGameStartDeckCards) {
		String oldGameStartDeckCards = gameStartDeckCards;
		gameStartDeckCards = newGameStartDeckCards;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.GAME_DECK__GAME_START_DECK_CARDS, oldGameStartDeckCards, gameStartDeckCards));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardLibrary getGameDeckBelongToCardLibrary() {
		if (gameDeckBelongToCardLibrary != null && gameDeckBelongToCardLibrary.eIsProxy()) {
			InternalEObject oldGameDeckBelongToCardLibrary = (InternalEObject)gameDeckBelongToCardLibrary;
			gameDeckBelongToCardLibrary = (CardLibrary)eResolveProxy(oldGameDeckBelongToCardLibrary);
			if (gameDeckBelongToCardLibrary != oldGameDeckBelongToCardLibrary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HearthstonePackage.GAME_DECK__GAME_DECK_BELONG_TO_CARD_LIBRARY, oldGameDeckBelongToCardLibrary, gameDeckBelongToCardLibrary));
			}
		}
		return gameDeckBelongToCardLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardLibrary basicGetGameDeckBelongToCardLibrary() {
		return gameDeckBelongToCardLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGameDeckBelongToCardLibrary(CardLibrary newGameDeckBelongToCardLibrary) {
		CardLibrary oldGameDeckBelongToCardLibrary = gameDeckBelongToCardLibrary;
		gameDeckBelongToCardLibrary = newGameDeckBelongToCardLibrary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.GAME_DECK__GAME_DECK_BELONG_TO_CARD_LIBRARY, oldGameDeckBelongToCardLibrary, gameDeckBelongToCardLibrary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean RemoveCard(int removeCardSN) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ReturnCard(int returnCardSN) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * show current game deck of one player
	 */
	public void ShowGameDeck() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//System.out.println("The hero is a "+this.getDeckHasHero().getHeroClass().toString()+", with ability of"+this.getDeckHasHero().getHeroAbility());
		System.out.println("[Current game deck report]");
		this.ShowCardsInDeck();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void ShowGameStartDeckCards() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		System.out.println("[Deck at game start] "+this.gameStartDeckCards);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void GenerateRandomGameDeck() {
		//GameDeck myRealDeck = cf.createGameDeck();
		Random randomGenerator = new Random();
		//AllCards allcards =
		LoadFromDb();
		
		/*if(allcards.size() == 0){
			throw new Exception("No card data in database, please check.");
			//return null;
		}*/
		
		int ccount = 0;
		while(ccount < 30){
			int cardsn = 1 + randomGenerator.nextInt(NUMOFCARDS);
			Card tdcard = cf.eINSTANCE.createCard();
			tdcard = this.allCardsPool.get(cardsn);
			//System.out.println("--> Card sn "+cardsn+":"+tdcard.getCardSN()+"- "+ tdcard.getCardName()+" was drew");
			Card thecard = cf.eINSTANCE.createCard();
			
			////Card object can't be reference as thecard = tdcard, otherwise it is the same object which will trigger unique exception
			
			thecard.setCardSN(tdcard.getCardSN());
			thecard.setCardDeckSN(ccount);
			thecard.setCardName(tdcard.getCardName());
			thecard.setCardClass(tdcard.getCardClass());
			thecard.setCardAbilityDesc(tdcard.getCardAbilityDesc());
			thecard.setCardLife(tdcard.getCardLife());
			thecard.setCardCost(tdcard.getCardCost());
			thecard.setCardPower(tdcard.getCardPower());
			thecard.setCardQuality(tdcard.getCardQuality());
			thecard.setCardRace(tdcard.getCardRace());
			//thecard.setCardStates();
			
			
			if(checkDuplicate(thecard)){		
					//System.out.println("->"+ccount+" "+thecard.getCardDeckSN());
					//System.out.println(tdcard.getCardName() + " | "+thecard.getCardName());
					this.getDeckHasCards().add(thecard);
					ccount++;
			}
		}
		
		//Collections.sort(myDeck,comparator);
		//ECollections.sort(myRealDeck.getDeckHasCards(),comparator);

		//showDeck();
		//showRealDeck(myRealDeck);
	}

	
	
	public boolean checkDuplicate(Card _card){
		boolean flag = true;
		int count = 0;
		for(int t=0;t<this.getDeckHasCards().size();t++){
			//System.out.println(_card.getCardSN()+"!!!!"+ myRealDeck.getDeckHasCards().get(t).getCardSN());
			if (_card.getCardSN() == this.getDeckHasCards().get(t).getCardSN()){
				count++;
				if(count > 2){
					flag = false;
					return flag;	
				}
			}
		}
		return flag;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HearthstonePackage.GAME_DECK__DECK_OWNER:
				return getDeckOwner();
			case HearthstonePackage.GAME_DECK__GAME_START_DECK_CARDS:
				return getGameStartDeckCards();
			case HearthstonePackage.GAME_DECK__GAME_DECK_BELONG_TO_CARD_LIBRARY:
				if (resolve) return getGameDeckBelongToCardLibrary();
				return basicGetGameDeckBelongToCardLibrary();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HearthstonePackage.GAME_DECK__DECK_OWNER:
				setDeckOwner((String)newValue);
				return;
			case HearthstonePackage.GAME_DECK__GAME_START_DECK_CARDS:
				setGameStartDeckCards((String)newValue);
				return;
			case HearthstonePackage.GAME_DECK__GAME_DECK_BELONG_TO_CARD_LIBRARY:
				setGameDeckBelongToCardLibrary((CardLibrary)newValue);
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
			case HearthstonePackage.GAME_DECK__DECK_OWNER:
				setDeckOwner(DECK_OWNER_EDEFAULT);
				return;
			case HearthstonePackage.GAME_DECK__GAME_START_DECK_CARDS:
				setGameStartDeckCards(GAME_START_DECK_CARDS_EDEFAULT);
				return;
			case HearthstonePackage.GAME_DECK__GAME_DECK_BELONG_TO_CARD_LIBRARY:
				setGameDeckBelongToCardLibrary((CardLibrary)null);
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
			case HearthstonePackage.GAME_DECK__DECK_OWNER:
				return DECK_OWNER_EDEFAULT == null ? deckOwner != null : !DECK_OWNER_EDEFAULT.equals(deckOwner);
			case HearthstonePackage.GAME_DECK__GAME_START_DECK_CARDS:
				return GAME_START_DECK_CARDS_EDEFAULT == null ? gameStartDeckCards != null : !GAME_START_DECK_CARDS_EDEFAULT.equals(gameStartDeckCards);
			case HearthstonePackage.GAME_DECK__GAME_DECK_BELONG_TO_CARD_LIBRARY:
				return gameDeckBelongToCardLibrary != null;
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
			case HearthstonePackage.GAME_DECK___REMOVE_CARD__INT:
				return RemoveCard((Integer)arguments.get(0));
			case HearthstonePackage.GAME_DECK___RETURN_CARD__INT:
				return ReturnCard((Integer)arguments.get(0));
			case HearthstonePackage.GAME_DECK___SHOW_GAME_DECK:
				ShowGameDeck();
				return null;
			case HearthstonePackage.GAME_DECK___SHOW_GAME_START_DECK_CARDS:
				ShowGameStartDeckCards();
				return null;
			case HearthstonePackage.GAME_DECK___GENERATE_RANDOM_GAME_DECK:
				GenerateRandomGameDeck();
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
		result.append(" (DeckOwner: ");
		result.append(deckOwner);
		result.append(", GameStartDeckCards: ");
		result.append(gameStartDeckCards);
		result.append(')');
		return result.toString();
	}

} //GameDeckImpl
