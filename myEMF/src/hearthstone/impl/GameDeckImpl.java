/**
 */
package hearthstone.impl;

import hearthstone.GameDeck;
import hearthstone.HearthstonePackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
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
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HearthstonePackage.GAME_DECK__DECK_OWNER:
				return getDeckOwner();
			case HearthstonePackage.GAME_DECK__GAME_START_DECK_CARDS:
				return getGameStartDeckCards();
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
