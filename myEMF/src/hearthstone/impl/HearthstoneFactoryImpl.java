/**
 */
package hearthstone.impl;

import hearthstone.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HearthstoneFactoryImpl extends EFactoryImpl implements HearthstoneFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HearthstoneFactory init() {
		try {
			HearthstoneFactory theHearthstoneFactory = (HearthstoneFactory)EPackage.Registry.INSTANCE.getEFactory(HearthstonePackage.eNS_URI);
			if (theHearthstoneFactory != null) {
				return theHearthstoneFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HearthstoneFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HearthstoneFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HearthstonePackage.CARD: return createCard();
			case HearthstonePackage.DECK: return createDeck();
			case HearthstonePackage.ABILITY: return createAbility();
			case HearthstonePackage.GAME_PLAYER_HAND: return createGamePlayerHand();
			case HearthstonePackage.GAME_BOARD: return createGameBoard();
			case HearthstonePackage.GAME_DECK: return createGameDeck();
			case HearthstonePackage.GAME: return createGame();
			case HearthstonePackage.PLAYER: return createPlayer();
			case HearthstonePackage.PLAYER_BOARD: return createPlayerBoard();
			case HearthstonePackage.HERO: return createHero();
			case HearthstonePackage.GAME_POOL: return createGamePool();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case HearthstonePackage.CARD_QUALITY:
				return createCardQualityFromString(eDataType, initialValue);
			case HearthstonePackage.CARD_RACE:
				return createCardRaceFromString(eDataType, initialValue);
			case HearthstonePackage.HERO_CLASS:
				return createHeroClassFromString(eDataType, initialValue);
			case HearthstonePackage.CARD_STATES:
				return createCardStatesFromString(eDataType, initialValue);
			case HearthstonePackage.HERO_STATES:
				return createHeroStatesFromString(eDataType, initialValue);
			case HearthstonePackage.GAME_STATE:
				return createGameStateFromString(eDataType, initialValue);
			case HearthstonePackage.ABILITIES:
				return createAbilitiesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case HearthstonePackage.CARD_QUALITY:
				return convertCardQualityToString(eDataType, instanceValue);
			case HearthstonePackage.CARD_RACE:
				return convertCardRaceToString(eDataType, instanceValue);
			case HearthstonePackage.HERO_CLASS:
				return convertHeroClassToString(eDataType, instanceValue);
			case HearthstonePackage.CARD_STATES:
				return convertCardStatesToString(eDataType, instanceValue);
			case HearthstonePackage.HERO_STATES:
				return convertHeroStatesToString(eDataType, instanceValue);
			case HearthstonePackage.GAME_STATE:
				return convertGameStateToString(eDataType, instanceValue);
			case HearthstonePackage.ABILITIES:
				return convertAbilitiesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Card createCard() {
		CardImpl card = new CardImpl();
		return card;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deck createDeck() {
		DeckImpl deck = new DeckImpl();
		return deck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ability createAbility() {
		AbilityImpl ability = new AbilityImpl();
		return ability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GamePlayerHand createGamePlayerHand() {
		GamePlayerHandImpl gamePlayerHand = new GamePlayerHandImpl();
		return gamePlayerHand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameBoard createGameBoard() {
		GameBoardImpl gameBoard = new GameBoardImpl();
		return gameBoard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameDeck createGameDeck() {
		GameDeckImpl gameDeck = new GameDeckImpl();
		return gameDeck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Game createGame() {
		GameImpl game = new GameImpl();
		return game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player createPlayer() {
		PlayerImpl player = new PlayerImpl();
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayerBoard createPlayerBoard() {
		PlayerBoardImpl playerBoard = new PlayerBoardImpl();
		return playerBoard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hero createHero() {
		HeroImpl hero = new HeroImpl();
		return hero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GamePool createGamePool() {
		GamePoolImpl gamePool = new GamePoolImpl();
		return gamePool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardQuality createCardQualityFromString(EDataType eDataType, String initialValue) {
		CardQuality result = CardQuality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCardQualityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardRace createCardRaceFromString(EDataType eDataType, String initialValue) {
		CardRace result = CardRace.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCardRaceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeroClass createHeroClassFromString(EDataType eDataType, String initialValue) {
		HeroClass result = HeroClass.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHeroClassToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardStates createCardStatesFromString(EDataType eDataType, String initialValue) {
		CardStates result = CardStates.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCardStatesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeroStates createHeroStatesFromString(EDataType eDataType, String initialValue) {
		HeroStates result = HeroStates.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHeroStatesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameState createGameStateFromString(EDataType eDataType, String initialValue) {
		GameState result = GameState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGameStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ability createAbilitiesFromString(EDataType eDataType, String initialValue) {
		return (Ability)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbilitiesToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HearthstonePackage getHearthstonePackage() {
		return (HearthstonePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HearthstonePackage getPackage() {
		return HearthstonePackage.eINSTANCE;
	}

} //HearthstoneFactoryImpl
