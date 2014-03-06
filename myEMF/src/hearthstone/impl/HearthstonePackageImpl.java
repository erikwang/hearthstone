/**
 */
package hearthstone.impl;

import hearthstone.Ability;
import hearthstone.Card;
import hearthstone.CardCollection;
import hearthstone.CardQuality;
import hearthstone.CardRace;
import hearthstone.CardStates;
import hearthstone.Deck;
import hearthstone.Game;
import hearthstone.GameBoard;
import hearthstone.GameDeck;
import hearthstone.GamePlayerHand;
import hearthstone.GamePool;
import hearthstone.GameState;
import hearthstone.HearthstoneFactory;
import hearthstone.HearthstonePackage;
import hearthstone.Hero;
import hearthstone.HeroClass;
import hearthstone.HeroStates;
import hearthstone.Player;
import hearthstone.PlayerBoard;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HearthstonePackageImpl extends EPackageImpl implements HearthstonePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gamePlayerHandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameBoardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameDeckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playerBoardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass heroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gamePoolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cardQualityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cardRaceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum heroClassEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cardStatesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum heroStatesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gameStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType abilitiesEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see hearthstone.HearthstonePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HearthstonePackageImpl() {
		super(eNS_URI, HearthstoneFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link HearthstonePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HearthstonePackage init() {
		if (isInited) return (HearthstonePackage)EPackage.Registry.INSTANCE.getEPackage(HearthstonePackage.eNS_URI);

		// Obtain or create and register package
		HearthstonePackageImpl theHearthstonePackage = (HearthstonePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HearthstonePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HearthstonePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theHearthstonePackage.createPackageContents();

		// Initialize created meta-data
		theHearthstonePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHearthstonePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HearthstonePackage.eNS_URI, theHearthstonePackage);
		return theHearthstonePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCard() {
		return cardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_CardName() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_CardCost() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_CardLife() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_CardPower() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_CardQuality() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_CardNumberLimit() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_CardRace() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_CardStates() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_CardClass() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCard_CardHasAbilities() {
		return (EReference)cardEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_CardSN() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_CardAbilityDesc() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_CardDeckSN() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCard__UpdateCardStates__int() {
		return cardEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCard__InteractAnotherCard__Card() {
		return cardEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCard__ShowCard() {
		return cardEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeck() {
		return deckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeck_DeckID() {
		return (EAttribute)deckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeck_DeckName() {
		return (EAttribute)deckEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeck_DeckHasCards() {
		return (EReference)deckEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeck_DeckHasHero() {
		return (EReference)deckEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDeck__Hello() {
		return deckEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDeck__ShowVersion() {
		return deckEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDeck__ShowCardsInDeck() {
		return deckEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbility() {
		return abilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbility_AbilityID() {
		return (EAttribute)abilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbility_AbilityType() {
		return (EAttribute)abilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbility_AbilityAffect() {
		return (EAttribute)abilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbility_CardHasAbility() {
		return (EReference)abilityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbility__Charge() {
		return abilityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbility__IncreaseAttribute() {
		return abilityEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGamePlayerHand() {
		return gamePlayerHandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGamePlayerHand_CardsInHand() {
		return (EReference)gamePlayerHandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGamePlayerHand_HandOwner() {
		return (EAttribute)gamePlayerHandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGamePlayerHand__ShowGameHand() {
		return gamePlayerHandEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameBoard() {
		return gameBoardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameBoard_GameBoardHasTwoPlayerBoard() {
		return (EReference)gameBoardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGameBoard_BoardSN() {
		return (EAttribute)gameBoardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGameBoard__ShowGameBoard__int() {
		return gameBoardEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameDeck() {
		return gameDeckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGameDeck_DeckOwner() {
		return (EAttribute)gameDeckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGameDeck_GameStartDeckCards() {
		return (EAttribute)gameDeckEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGameDeck__RemoveCard__int() {
		return gameDeckEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGameDeck__ReturnCard__int() {
		return gameDeckEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGameDeck__ShowGameDeck() {
		return gameDeckEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGameDeck__ShowGameStartDeckCards() {
		return gameDeckEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGame() {
		return gameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_GameHasBoard() {
		return (EReference)gameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGame_GameSN() {
		return (EAttribute)gameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_GameHasTwoPlayers() {
		return (EReference)gameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGame_GameStates() {
		return (EAttribute)gameEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGame_GameID() {
		return (EAttribute)gameEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGame__ShowGame__int() {
		return gameEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGame__ShowGameInDetail() {
		return gameEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlayer() {
		return playerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayer_Name() {
		return (EAttribute)playerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayer_TotalWins() {
		return (EAttribute)playerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlayer_PlayerHasDeck() {
		return (EReference)playerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlayer_CardsInHand() {
		return (EReference)playerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlayer_PlayerHasOwnBoard() {
		return (EReference)playerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayer_PlayerID() {
		return (EAttribute)playerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayer_LastLogin() {
		return (EAttribute)playerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayer_PlayerLevel() {
		return (EAttribute)playerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlayer_PlayerHasGameStartDeck() {
		return (EReference)playerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlayer_PlayerHasDeckSet() {
		return (EReference)playerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlayer__PlayCard__int() {
		return playerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlayer__OperateCard__Card() {
		return playerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlayer__ClickNextTurnBtn() {
		return playerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlayer__DrawCard() {
		return playerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlayer__OperateCard() {
		return playerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlayerBoard() {
		return playerBoardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayerBoard_BoardOwner() {
		return (EAttribute)playerBoardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlayerBoard__ShowPlayerBoard() {
		return playerBoardEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHero() {
		return heroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHero_HeroClass() {
		return (EAttribute)heroEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHero_HeroHealth() {
		return (EAttribute)heroEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHero_HeroStates() {
		return (EAttribute)heroEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHero_HeroAbility() {
		return (EAttribute)heroEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHero_HeroDesc() {
		return (EAttribute)heroEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGamePool() {
		return gamePoolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGamePool_GamePoolHasGames() {
		return (EReference)gamePoolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGamePool_GamePoolDesc() {
		return (EAttribute)gamePoolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardCollection() {
		return cardCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCardCollection_CollectionHasCards() {
		return (EReference)cardCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardCollection_CollectionID() {
		return (EAttribute)cardCollectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardCollection_CollectionOwner() {
		return (EAttribute)cardCollectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCardCollection__ShowCollection() {
		return cardCollectionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCardQuality() {
		return cardQualityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCardRace() {
		return cardRaceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHeroClass() {
		return heroClassEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCardStates() {
		return cardStatesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHeroStates() {
		return heroStatesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGameState() {
		return gameStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAbilities() {
		return abilitiesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HearthstoneFactory getHearthstoneFactory() {
		return (HearthstoneFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cardEClass = createEClass(CARD);
		createEAttribute(cardEClass, CARD__CARD_NAME);
		createEAttribute(cardEClass, CARD__CARD_COST);
		createEAttribute(cardEClass, CARD__CARD_LIFE);
		createEAttribute(cardEClass, CARD__CARD_POWER);
		createEAttribute(cardEClass, CARD__CARD_QUALITY);
		createEAttribute(cardEClass, CARD__CARD_NUMBER_LIMIT);
		createEAttribute(cardEClass, CARD__CARD_RACE);
		createEAttribute(cardEClass, CARD__CARD_STATES);
		createEAttribute(cardEClass, CARD__CARD_CLASS);
		createEReference(cardEClass, CARD__CARD_HAS_ABILITIES);
		createEAttribute(cardEClass, CARD__CARD_SN);
		createEAttribute(cardEClass, CARD__CARD_ABILITY_DESC);
		createEAttribute(cardEClass, CARD__CARD_DECK_SN);
		createEOperation(cardEClass, CARD___UPDATE_CARD_STATES__INT);
		createEOperation(cardEClass, CARD___INTERACT_ANOTHER_CARD__CARD);
		createEOperation(cardEClass, CARD___SHOW_CARD);

		deckEClass = createEClass(DECK);
		createEAttribute(deckEClass, DECK__DECK_ID);
		createEAttribute(deckEClass, DECK__DECK_NAME);
		createEReference(deckEClass, DECK__DECK_HAS_CARDS);
		createEReference(deckEClass, DECK__DECK_HAS_HERO);
		createEOperation(deckEClass, DECK___HELLO);
		createEOperation(deckEClass, DECK___SHOW_VERSION);
		createEOperation(deckEClass, DECK___SHOW_CARDS_IN_DECK);

		abilityEClass = createEClass(ABILITY);
		createEAttribute(abilityEClass, ABILITY__ABILITY_ID);
		createEAttribute(abilityEClass, ABILITY__ABILITY_TYPE);
		createEAttribute(abilityEClass, ABILITY__ABILITY_AFFECT);
		createEReference(abilityEClass, ABILITY__CARD_HAS_ABILITY);
		createEOperation(abilityEClass, ABILITY___CHARGE);
		createEOperation(abilityEClass, ABILITY___INCREASE_ATTRIBUTE);

		gamePlayerHandEClass = createEClass(GAME_PLAYER_HAND);
		createEReference(gamePlayerHandEClass, GAME_PLAYER_HAND__CARDS_IN_HAND);
		createEAttribute(gamePlayerHandEClass, GAME_PLAYER_HAND__HAND_OWNER);
		createEOperation(gamePlayerHandEClass, GAME_PLAYER_HAND___SHOW_GAME_HAND);

		gameBoardEClass = createEClass(GAME_BOARD);
		createEReference(gameBoardEClass, GAME_BOARD__GAME_BOARD_HAS_TWO_PLAYER_BOARD);
		createEAttribute(gameBoardEClass, GAME_BOARD__BOARD_SN);
		createEOperation(gameBoardEClass, GAME_BOARD___SHOW_GAME_BOARD__INT);

		gameDeckEClass = createEClass(GAME_DECK);
		createEAttribute(gameDeckEClass, GAME_DECK__DECK_OWNER);
		createEAttribute(gameDeckEClass, GAME_DECK__GAME_START_DECK_CARDS);
		createEOperation(gameDeckEClass, GAME_DECK___REMOVE_CARD__INT);
		createEOperation(gameDeckEClass, GAME_DECK___RETURN_CARD__INT);
		createEOperation(gameDeckEClass, GAME_DECK___SHOW_GAME_DECK);
		createEOperation(gameDeckEClass, GAME_DECK___SHOW_GAME_START_DECK_CARDS);

		gameEClass = createEClass(GAME);
		createEReference(gameEClass, GAME__GAME_HAS_BOARD);
		createEAttribute(gameEClass, GAME__GAME_SN);
		createEReference(gameEClass, GAME__GAME_HAS_TWO_PLAYERS);
		createEAttribute(gameEClass, GAME__GAME_STATES);
		createEAttribute(gameEClass, GAME__GAME_ID);
		createEOperation(gameEClass, GAME___SHOW_GAME__INT);
		createEOperation(gameEClass, GAME___SHOW_GAME_IN_DETAIL);

		playerEClass = createEClass(PLAYER);
		createEAttribute(playerEClass, PLAYER__NAME);
		createEAttribute(playerEClass, PLAYER__TOTAL_WINS);
		createEReference(playerEClass, PLAYER__PLAYER_HAS_DECK);
		createEReference(playerEClass, PLAYER__CARDS_IN_HAND);
		createEReference(playerEClass, PLAYER__PLAYER_HAS_OWN_BOARD);
		createEAttribute(playerEClass, PLAYER__PLAYER_ID);
		createEAttribute(playerEClass, PLAYER__LAST_LOGIN);
		createEAttribute(playerEClass, PLAYER__PLAYER_LEVEL);
		createEReference(playerEClass, PLAYER__PLAYER_HAS_GAME_START_DECK);
		createEReference(playerEClass, PLAYER__PLAYER_HAS_DECK_SET);
		createEOperation(playerEClass, PLAYER___PLAY_CARD__INT);
		createEOperation(playerEClass, PLAYER___OPERATE_CARD__CARD);
		createEOperation(playerEClass, PLAYER___CLICK_NEXT_TURN_BTN);
		createEOperation(playerEClass, PLAYER___DRAW_CARD);
		createEOperation(playerEClass, PLAYER___OPERATE_CARD);

		playerBoardEClass = createEClass(PLAYER_BOARD);
		createEAttribute(playerBoardEClass, PLAYER_BOARD__BOARD_OWNER);
		createEOperation(playerBoardEClass, PLAYER_BOARD___SHOW_PLAYER_BOARD);

		heroEClass = createEClass(HERO);
		createEAttribute(heroEClass, HERO__HERO_CLASS);
		createEAttribute(heroEClass, HERO__HERO_HEALTH);
		createEAttribute(heroEClass, HERO__HERO_STATES);
		createEAttribute(heroEClass, HERO__HERO_ABILITY);
		createEAttribute(heroEClass, HERO__HERO_DESC);

		gamePoolEClass = createEClass(GAME_POOL);
		createEReference(gamePoolEClass, GAME_POOL__GAME_POOL_HAS_GAMES);
		createEAttribute(gamePoolEClass, GAME_POOL__GAME_POOL_DESC);

		cardCollectionEClass = createEClass(CARD_COLLECTION);
		createEReference(cardCollectionEClass, CARD_COLLECTION__COLLECTION_HAS_CARDS);
		createEAttribute(cardCollectionEClass, CARD_COLLECTION__COLLECTION_ID);
		createEAttribute(cardCollectionEClass, CARD_COLLECTION__COLLECTION_OWNER);
		createEOperation(cardCollectionEClass, CARD_COLLECTION___SHOW_COLLECTION);

		// Create enums
		cardQualityEEnum = createEEnum(CARD_QUALITY);
		cardRaceEEnum = createEEnum(CARD_RACE);
		heroClassEEnum = createEEnum(HERO_CLASS);
		cardStatesEEnum = createEEnum(CARD_STATES);
		heroStatesEEnum = createEEnum(HERO_STATES);
		gameStateEEnum = createEEnum(GAME_STATE);

		// Create data types
		abilitiesEDataType = createEDataType(ABILITIES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gamePlayerHandEClass.getESuperTypes().add(this.getGameDeck());
		gameDeckEClass.getESuperTypes().add(this.getDeck());
		playerBoardEClass.getESuperTypes().add(this.getDeck());

		// Initialize classes, features, and operations; add parameters
		initEClass(cardEClass, Card.class, "Card", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCard_CardName(), ecorePackage.getEString(), "CardName", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_CardCost(), ecorePackage.getEString(), "CardCost", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_CardLife(), ecorePackage.getEInt(), "CardLife", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_CardPower(), ecorePackage.getEInt(), "CardPower", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_CardQuality(), this.getCardQuality(), "CardQuality", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_CardNumberLimit(), ecorePackage.getEInt(), "CardNumberLimit", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_CardRace(), ecorePackage.getEString(), "CardRace", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_CardStates(), this.getCardStates(), "CardStates", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_CardClass(), ecorePackage.getEString(), "CardClass", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCard_CardHasAbilities(), this.getAbility(), null, "CardHasAbilities", null, 0, 5, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_CardSN(), ecorePackage.getEInt(), "CardSN", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_CardAbilityDesc(), ecorePackage.getEString(), "CardAbilityDesc", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_CardDeckSN(), ecorePackage.getEInt(), "CardDeckSN", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getCard__UpdateCardStates__int(), ecorePackage.getEBoolean(), "UpdateCardStates", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "CardStates", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCard__InteractAnotherCard__Card(), null, "InteractAnotherCard", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCard(), "_card", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCard__ShowCard(), null, "ShowCard", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(deckEClass, Deck.class, "Deck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeck_DeckID(), ecorePackage.getEInt(), "DeckID", null, 0, 1, Deck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeck_DeckName(), ecorePackage.getEString(), "DeckName", null, 0, 1, Deck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeck_DeckHasCards(), this.getCard(), null, "DeckHasCards", null, 30, 30, Deck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getDeck_DeckHasCards().getEKeys().add(this.getCard_CardDeckSN());
		initEReference(getDeck_DeckHasHero(), this.getHero(), null, "DeckHasHero", null, 1, 1, Deck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDeck__Hello(), ecorePackage.getEBoolean(), "Hello", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDeck__ShowVersion(), null, "ShowVersion", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDeck__ShowCardsInDeck(), null, "ShowCardsInDeck", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(abilityEClass, Ability.class, "Ability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbility_AbilityID(), ecorePackage.getEInt(), "AbilityID", null, 0, 1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbility_AbilityType(), ecorePackage.getEString(), "AbilityType", null, 0, 1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbility_AbilityAffect(), ecorePackage.getEString(), "AbilityAffect", null, 0, 1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbility_CardHasAbility(), this.getCard(), null, "CardHasAbility", null, 0, 5, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAbility__Charge(), ecorePackage.getEBoolean(), "Charge", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbility__IncreaseAttribute(), ecorePackage.getEBoolean(), "IncreaseAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gamePlayerHandEClass, GamePlayerHand.class, "GamePlayerHand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGamePlayerHand_CardsInHand(), this.getCard(), null, "CardsInHand", null, 0, 10, GamePlayerHand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGamePlayerHand_HandOwner(), ecorePackage.getEString(), "HandOwner", null, 0, 1, GamePlayerHand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getGamePlayerHand__ShowGameHand(), null, "ShowGameHand", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gameBoardEClass, GameBoard.class, "GameBoard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGameBoard_GameBoardHasTwoPlayerBoard(), this.getPlayerBoard(), null, "GameBoardHasTwoPlayerBoard", null, 2, 2, GameBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameBoard_BoardSN(), ecorePackage.getEInt(), "BoardSN", null, 0, 1, GameBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getGameBoard__ShowGameBoard__int(), null, "ShowGameBoard", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "pindex", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gameDeckEClass, GameDeck.class, "GameDeck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGameDeck_DeckOwner(), ecorePackage.getEString(), "DeckOwner", null, 0, 1, GameDeck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameDeck_GameStartDeckCards(), ecorePackage.getEString(), "GameStartDeckCards", null, 0, 1, GameDeck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getGameDeck__RemoveCard__int(), ecorePackage.getEBoolean(), "RemoveCard", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "removeCardSN", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGameDeck__ReturnCard__int(), ecorePackage.getEBoolean(), "ReturnCard", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "returnCardSN", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGameDeck__ShowGameDeck(), null, "ShowGameDeck", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGameDeck__ShowGameStartDeckCards(), null, "ShowGameStartDeckCards", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gameEClass, Game.class, "Game", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGame_GameHasBoard(), this.getGameBoard(), null, "GameHasBoard", null, 1, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGame_GameSN(), ecorePackage.getEInt(), "GameSN", null, 0, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_GameHasTwoPlayers(), this.getPlayer(), null, "GameHasTwoPlayers", null, 2, 2, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGame_GameStates(), this.getGameState(), "GameStates", null, 0, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGame_GameID(), ecorePackage.getEString(), "GameID", null, 0, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getGame__ShowGame__int(), null, "ShowGame", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "GameSN", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGame__ShowGameInDetail(), null, "ShowGameInDetail", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(playerEClass, Player.class, "Player", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlayer_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayer_TotalWins(), ecorePackage.getEInt(), "TotalWins", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlayer_PlayerHasDeck(), this.getGameDeck(), null, "PlayerHasDeck", null, 1, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlayer_CardsInHand(), this.getGamePlayerHand(), null, "CardsInHand", null, 1, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlayer_PlayerHasOwnBoard(), this.getPlayerBoard(), null, "PlayerHasOwnBoard", null, 1, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayer_PlayerID(), ecorePackage.getEInt(), "PlayerID", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayer_LastLogin(), ecorePackage.getEDate(), "LastLogin", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayer_PlayerLevel(), ecorePackage.getEInt(), "PlayerLevel", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlayer_PlayerHasGameStartDeck(), this.getDeck(), null, "PlayerHasGameStartDeck", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlayer_PlayerHasDeckSet(), this.getDeck(), null, "PlayerHasDeckSet", null, 0, 9, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPlayer__PlayCard__int(), null, "PlayCard", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "_cardindex", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPlayer__OperateCard__Card(), ecorePackage.getEBoolean(), "OperateCard", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCard(), "_card", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPlayer__ClickNextTurnBtn(), ecorePackage.getEBoolean(), "ClickNextTurnBtn", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPlayer__DrawCard(), ecorePackage.getEBoolean(), "DrawCard", 1, 5, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPlayer__OperateCard(), null, "OperateCard", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(playerBoardEClass, PlayerBoard.class, "PlayerBoard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlayerBoard_BoardOwner(), ecorePackage.getEString(), "BoardOwner", null, 0, 1, PlayerBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPlayerBoard__ShowPlayerBoard(), null, "ShowPlayerBoard", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(heroEClass, Hero.class, "Hero", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHero_HeroClass(), this.getHeroClass(), "HeroClass", null, 1, 1, Hero.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHero_HeroHealth(), ecorePackage.getEInt(), "HeroHealth", null, 1, 1, Hero.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHero_HeroStates(), this.getHeroStates(), "HeroStates", null, 0, 1, Hero.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHero_HeroAbility(), ecorePackage.getEString(), "HeroAbility", null, 0, 1, Hero.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHero_HeroDesc(), ecorePackage.getEString(), "HeroDesc", null, 0, 1, Hero.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gamePoolEClass, GamePool.class, "GamePool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGamePool_GamePoolHasGames(), this.getGame(), null, "GamePoolHasGames", null, 0, -1, GamePool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGamePool_GamePoolDesc(), ecorePackage.getEString(), "GamePoolDesc", null, 0, 1, GamePool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardCollectionEClass, CardCollection.class, "CardCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCardCollection_CollectionHasCards(), this.getCard(), null, "CollectionHasCards", null, 0, -1, CardCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardCollection_CollectionID(), ecorePackage.getEInt(), "CollectionID", null, 0, 1, CardCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardCollection_CollectionOwner(), ecorePackage.getEInt(), "CollectionOwner", null, 0, 1, CardCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCardCollection__ShowCollection(), null, "ShowCollection", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(cardQualityEEnum, CardQuality.class, "CardQuality");
		addEEnumLiteral(cardQualityEEnum, CardQuality.NORMAL);
		addEEnumLiteral(cardQualityEEnum, CardQuality.RARE);
		addEEnumLiteral(cardQualityEEnum, CardQuality.EPIC);
		addEEnumLiteral(cardQualityEEnum, CardQuality.LEGEDARY);

		initEEnum(cardRaceEEnum, CardRace.class, "CardRace");
		addEEnumLiteral(cardRaceEEnum, CardRace.NORMAL);
		addEEnumLiteral(cardRaceEEnum, CardRace.BEAST);
		addEEnumLiteral(cardRaceEEnum, CardRace.PIRATE);
		addEEnumLiteral(cardRaceEEnum, CardRace.SKILL);
		addEEnumLiteral(cardRaceEEnum, CardRace.SPELL);

		initEEnum(heroClassEEnum, HeroClass.class, "HeroClass");
		addEEnumLiteral(heroClassEEnum, HeroClass.MAGE);
		addEEnumLiteral(heroClassEEnum, HeroClass.PRIEST);
		addEEnumLiteral(heroClassEEnum, HeroClass.PALADIN);
		addEEnumLiteral(heroClassEEnum, HeroClass.WARLOCK);
		addEEnumLiteral(heroClassEEnum, HeroClass.HUNTER);
		addEEnumLiteral(heroClassEEnum, HeroClass.ROGUE);
		addEEnumLiteral(heroClassEEnum, HeroClass.DRUID);
		addEEnumLiteral(heroClassEEnum, HeroClass.WARRIOR);
		addEEnumLiteral(heroClassEEnum, HeroClass.SHAMAN);

		initEEnum(cardStatesEEnum, CardStates.class, "CardStates");
		addEEnumLiteral(cardStatesEEnum, CardStates.IN_DECK);
		addEEnumLiteral(cardStatesEEnum, CardStates.IN_PLAYER_HAND);
		addEEnumLiteral(cardStatesEEnum, CardStates.SLEEP);
		addEEnumLiteral(cardStatesEEnum, CardStates.READY_FOR_ACTION);
		addEEnumLiteral(cardStatesEEnum, CardStates.DEAD);
		addEEnumLiteral(cardStatesEEnum, CardStates.ACTED);

		initEEnum(heroStatesEEnum, HeroStates.class, "HeroStates");
		addEEnumLiteral(heroStatesEEnum, HeroStates.READY_FOR_ACTION);
		addEEnumLiteral(heroStatesEEnum, HeroStates.ACTED);
		addEEnumLiteral(heroStatesEEnum, HeroStates.DEAD);

		initEEnum(gameStateEEnum, GameState.class, "GameState");
		addEEnumLiteral(gameStateEEnum, GameState.CREATED);
		addEEnumLiteral(gameStateEEnum, GameState.PLAYING);
		addEEnumLiteral(gameStateEEnum, GameState.OVER);
		addEEnumLiteral(gameStateEEnum, GameState.HALT);

		// Initialize data types
		initEDataType(abilitiesEDataType, Ability.class, "Abilities", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";			
		addAnnotation
		  (getCard_CardNumberLimit(), 
		   source, 
		   new String[] {
			 "wildcards", "",
			 "name", ""
		   });		
	}

} //HearthstonePackageImpl
