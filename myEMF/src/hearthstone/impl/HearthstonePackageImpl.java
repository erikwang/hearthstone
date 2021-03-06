/**
 */
package hearthstone.impl;

import hearthstone.Ability;
import hearthstone.Card;
import hearthstone.CardCollection;
import hearthstone.CardLibrary;
import hearthstone.CardLibraryType;
import hearthstone.CardQuality;
import hearthstone.CardRace;
import hearthstone.CardStates;
import hearthstone.Deck;
import hearthstone.Game;
import hearthstone.GameBoard;
import hearthstone.GameDeck;
import hearthstone.GamePlayerHand;
import hearthstone.GamePool;
import hearthstone.GameRegion;
import hearthstone.GameRule;
import hearthstone.GameSetter;
import hearthstone.GameStates;
import hearthstone.GameType;
import hearthstone.HearthstoneFactory;
import hearthstone.HearthstonePackage;
import hearthstone.Hero;
import hearthstone.HeroAbility;
import hearthstone.HeroClass;
import hearthstone.HeroStates;
import hearthstone.Player;
import hearthstone.PlayerBoard;
import hearthstone.util.AllCards;
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
	private EClass gameRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameSetterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardLibraryEClass = null;

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
	private EEnum gameStatesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gameTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum heroAbilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gameRegionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cardLibraryTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType abilitiesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType allCardsEDataType = null;

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
	public EOperation getCard__InteractOppoHero__Hero() {
		return cardEClass.getEOperations().get(3);
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
	public EReference getDeck_EReference0() {
		return (EReference)deckEClass.getEStructuralFeatures().get(4);
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
	public EOperation getDeck__FlushDeck() {
		return deckEClass.getEOperations().get(3);
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
	public EReference getGamePlayerHand_HandsBelongToPlayer() {
		return (EReference)gamePlayerHandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGamePlayerHand_HandOwner() {
		return (EAttribute)gamePlayerHandEClass.getEStructuralFeatures().get(2);
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
	public EReference getGameBoard_GameBoardHasPlayerBoard() {
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
	public EReference getGameDeck_GameDeckBelongToCardLibrary() {
		return (EReference)gameDeckEClass.getEStructuralFeatures().get(2);
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
	public EOperation getGameDeck__GenerateRandomGameDeck() {
		return gameDeckEClass.getEOperations().get(4);
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
	public EAttribute getGame_GameSN() {
		return (EAttribute)gameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGame_GameStates() {
		return (EAttribute)gameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGame_GameID() {
		return (EAttribute)gameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_GameHasGameRule() {
		return (EReference)gameEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_GameInGamePool() {
		return (EReference)gameEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGame__ShowGameInDetail() {
		return gameEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGame__CheckGameStates() {
		return gameEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGame__ShowPlayerGameBoard() {
		return gameEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGame__InitializeGame() {
		return gameEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGame__SetGameBoard() {
		return gameEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGame__SetGamePlayer() {
		return gameEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGame__SetPlayerHand() {
		return gameEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGame__SetGameRule() {
		return gameEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGame__SetPlayerDeck() {
		return gameEClass.getEOperations().get(8);
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
	public EReference getPlayer_PlayerHasHand() {
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
	public EReference getPlayer_PlayerHasCardCollection() {
		return (EReference)playerEClass.getEStructuralFeatures().get(10);
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
	public EOperation getPlayer__OperateCard__Hero() {
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
	public EAttribute getHero_HeroPower() {
		return (EAttribute)heroEClass.getEStructuralFeatures().get(5);
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
	public EAttribute getGamePool_GamePoolStartDate() {
		return (EAttribute)gamePoolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGamePool_GamePoolRegion() {
		return (EAttribute)gamePoolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGamePool_GamePoolHasCardLibrary() {
		return (EReference)gamePoolEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGamePool__ShowAllGames() {
		return gamePoolEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGamePool__CreateGame() {
		return gamePoolEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGamePool__HaltGame() {
		return gamePoolEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGamePool__ShowGamePoolStates() {
		return gamePoolEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGamePool__Initialize() {
		return gamePoolEClass.getEOperations().get(4);
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
		return (EAttribute)cardCollectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardCollection_CollectionOwner() {
		return (EAttribute)cardCollectionEClass.getEStructuralFeatures().get(1);
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
	public EClass getGameRule() {
		return gameRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameRule_GameHasPlayers() {
		return (EReference)gameRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameRule_GameHasBoard() {
		return (EReference)gameRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameRule_GameHasGameRule() {
		return (EReference)gameRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGameRule_GameRuleDesc() {
		return (EAttribute)gameRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGameRule_GameRuleType() {
		return (EAttribute)gameRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameSetter() {
		return gameSetterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardLibrary() {
		return cardLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCardLibrary_CardLibraryHasCards() {
		return (EReference)cardLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardLibrary_LibraryVersion() {
		return (EAttribute)cardLibraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardLibrary_LibraryType() {
		return (EAttribute)cardLibraryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardLibrary_AllCardsPool() {
		return (EAttribute)cardLibraryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCardLibrary__LoadFromDb() {
		return cardLibraryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCardLibrary__ShowCardLibrary() {
		return cardLibraryEClass.getEOperations().get(1);
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
	public EEnum getGameStates() {
		return gameStatesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGameType() {
		return gameTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHeroAbility() {
		return heroAbilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGameRegion() {
		return gameRegionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCardLibraryType() {
		return cardLibraryTypeEEnum;
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
	public EDataType getAllCards() {
		return allCardsEDataType;
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
		createEOperation(cardEClass, CARD___INTERACT_OPPO_HERO__HERO);

		deckEClass = createEClass(DECK);
		createEAttribute(deckEClass, DECK__DECK_ID);
		createEAttribute(deckEClass, DECK__DECK_NAME);
		createEReference(deckEClass, DECK__DECK_HAS_CARDS);
		createEReference(deckEClass, DECK__DECK_HAS_HERO);
		createEReference(deckEClass, DECK__EREFERENCE0);
		createEOperation(deckEClass, DECK___HELLO);
		createEOperation(deckEClass, DECK___SHOW_VERSION);
		createEOperation(deckEClass, DECK___SHOW_CARDS_IN_DECK);
		createEOperation(deckEClass, DECK___FLUSH_DECK);

		abilityEClass = createEClass(ABILITY);
		createEAttribute(abilityEClass, ABILITY__ABILITY_ID);
		createEAttribute(abilityEClass, ABILITY__ABILITY_TYPE);
		createEAttribute(abilityEClass, ABILITY__ABILITY_AFFECT);
		createEReference(abilityEClass, ABILITY__CARD_HAS_ABILITY);
		createEOperation(abilityEClass, ABILITY___CHARGE);
		createEOperation(abilityEClass, ABILITY___INCREASE_ATTRIBUTE);

		gamePlayerHandEClass = createEClass(GAME_PLAYER_HAND);
		createEReference(gamePlayerHandEClass, GAME_PLAYER_HAND__CARDS_IN_HAND);
		createEReference(gamePlayerHandEClass, GAME_PLAYER_HAND__HANDS_BELONG_TO_PLAYER);
		createEAttribute(gamePlayerHandEClass, GAME_PLAYER_HAND__HAND_OWNER);
		createEOperation(gamePlayerHandEClass, GAME_PLAYER_HAND___SHOW_GAME_HAND);

		gameBoardEClass = createEClass(GAME_BOARD);
		createEReference(gameBoardEClass, GAME_BOARD__GAME_BOARD_HAS_PLAYER_BOARD);
		createEAttribute(gameBoardEClass, GAME_BOARD__BOARD_SN);

		gameDeckEClass = createEClass(GAME_DECK);
		createEAttribute(gameDeckEClass, GAME_DECK__DECK_OWNER);
		createEAttribute(gameDeckEClass, GAME_DECK__GAME_START_DECK_CARDS);
		createEReference(gameDeckEClass, GAME_DECK__GAME_DECK_BELONG_TO_CARD_LIBRARY);
		createEOperation(gameDeckEClass, GAME_DECK___REMOVE_CARD__INT);
		createEOperation(gameDeckEClass, GAME_DECK___RETURN_CARD__INT);
		createEOperation(gameDeckEClass, GAME_DECK___SHOW_GAME_DECK);
		createEOperation(gameDeckEClass, GAME_DECK___SHOW_GAME_START_DECK_CARDS);
		createEOperation(gameDeckEClass, GAME_DECK___GENERATE_RANDOM_GAME_DECK);

		gameEClass = createEClass(GAME);
		createEAttribute(gameEClass, GAME__GAME_SN);
		createEAttribute(gameEClass, GAME__GAME_STATES);
		createEAttribute(gameEClass, GAME__GAME_ID);
		createEReference(gameEClass, GAME__GAME_HAS_GAME_RULE);
		createEReference(gameEClass, GAME__GAME_IN_GAME_POOL);
		createEOperation(gameEClass, GAME___SHOW_GAME_IN_DETAIL);
		createEOperation(gameEClass, GAME___CHECK_GAME_STATES);
		createEOperation(gameEClass, GAME___SHOW_PLAYER_GAME_BOARD);
		createEOperation(gameEClass, GAME___INITIALIZE_GAME);
		createEOperation(gameEClass, GAME___SET_GAME_BOARD);
		createEOperation(gameEClass, GAME___SET_GAME_PLAYER);
		createEOperation(gameEClass, GAME___SET_PLAYER_HAND);
		createEOperation(gameEClass, GAME___SET_GAME_RULE);
		createEOperation(gameEClass, GAME___SET_PLAYER_DECK);

		playerEClass = createEClass(PLAYER);
		createEAttribute(playerEClass, PLAYER__NAME);
		createEAttribute(playerEClass, PLAYER__TOTAL_WINS);
		createEReference(playerEClass, PLAYER__PLAYER_HAS_DECK);
		createEReference(playerEClass, PLAYER__PLAYER_HAS_HAND);
		createEReference(playerEClass, PLAYER__PLAYER_HAS_OWN_BOARD);
		createEAttribute(playerEClass, PLAYER__PLAYER_ID);
		createEAttribute(playerEClass, PLAYER__LAST_LOGIN);
		createEAttribute(playerEClass, PLAYER__PLAYER_LEVEL);
		createEReference(playerEClass, PLAYER__PLAYER_HAS_GAME_START_DECK);
		createEReference(playerEClass, PLAYER__PLAYER_HAS_DECK_SET);
		createEReference(playerEClass, PLAYER__PLAYER_HAS_CARD_COLLECTION);
		createEOperation(playerEClass, PLAYER___PLAY_CARD__INT);
		createEOperation(playerEClass, PLAYER___OPERATE_CARD__CARD);
		createEOperation(playerEClass, PLAYER___CLICK_NEXT_TURN_BTN);
		createEOperation(playerEClass, PLAYER___DRAW_CARD);
		createEOperation(playerEClass, PLAYER___OPERATE_CARD__HERO);

		playerBoardEClass = createEClass(PLAYER_BOARD);
		createEAttribute(playerBoardEClass, PLAYER_BOARD__BOARD_OWNER);
		createEOperation(playerBoardEClass, PLAYER_BOARD___SHOW_PLAYER_BOARD);

		heroEClass = createEClass(HERO);
		createEAttribute(heroEClass, HERO__HERO_CLASS);
		createEAttribute(heroEClass, HERO__HERO_HEALTH);
		createEAttribute(heroEClass, HERO__HERO_STATES);
		createEAttribute(heroEClass, HERO__HERO_ABILITY);
		createEAttribute(heroEClass, HERO__HERO_DESC);
		createEAttribute(heroEClass, HERO__HERO_POWER);

		gamePoolEClass = createEClass(GAME_POOL);
		createEReference(gamePoolEClass, GAME_POOL__GAME_POOL_HAS_GAMES);
		createEAttribute(gamePoolEClass, GAME_POOL__GAME_POOL_DESC);
		createEAttribute(gamePoolEClass, GAME_POOL__GAME_POOL_START_DATE);
		createEAttribute(gamePoolEClass, GAME_POOL__GAME_POOL_REGION);
		createEReference(gamePoolEClass, GAME_POOL__GAME_POOL_HAS_CARD_LIBRARY);
		createEOperation(gamePoolEClass, GAME_POOL___SHOW_ALL_GAMES);
		createEOperation(gamePoolEClass, GAME_POOL___CREATE_GAME);
		createEOperation(gamePoolEClass, GAME_POOL___HALT_GAME);
		createEOperation(gamePoolEClass, GAME_POOL___SHOW_GAME_POOL_STATES);
		createEOperation(gamePoolEClass, GAME_POOL___INITIALIZE);

		cardCollectionEClass = createEClass(CARD_COLLECTION);
		createEReference(cardCollectionEClass, CARD_COLLECTION__COLLECTION_HAS_CARDS);
		createEAttribute(cardCollectionEClass, CARD_COLLECTION__COLLECTION_OWNER);
		createEAttribute(cardCollectionEClass, CARD_COLLECTION__COLLECTION_ID);
		createEOperation(cardCollectionEClass, CARD_COLLECTION___SHOW_COLLECTION);

		gameRuleEClass = createEClass(GAME_RULE);
		createEReference(gameRuleEClass, GAME_RULE__GAME_HAS_PLAYERS);
		createEReference(gameRuleEClass, GAME_RULE__GAME_HAS_BOARD);
		createEReference(gameRuleEClass, GAME_RULE__GAME_HAS_GAME_RULE);
		createEAttribute(gameRuleEClass, GAME_RULE__GAME_RULE_DESC);
		createEAttribute(gameRuleEClass, GAME_RULE__GAME_RULE_TYPE);

		gameSetterEClass = createEClass(GAME_SETTER);

		cardLibraryEClass = createEClass(CARD_LIBRARY);
		createEReference(cardLibraryEClass, CARD_LIBRARY__CARD_LIBRARY_HAS_CARDS);
		createEAttribute(cardLibraryEClass, CARD_LIBRARY__LIBRARY_VERSION);
		createEAttribute(cardLibraryEClass, CARD_LIBRARY__LIBRARY_TYPE);
		createEAttribute(cardLibraryEClass, CARD_LIBRARY__ALL_CARDS_POOL);
		createEOperation(cardLibraryEClass, CARD_LIBRARY___LOAD_FROM_DB);
		createEOperation(cardLibraryEClass, CARD_LIBRARY___SHOW_CARD_LIBRARY);

		// Create enums
		cardQualityEEnum = createEEnum(CARD_QUALITY);
		cardRaceEEnum = createEEnum(CARD_RACE);
		heroClassEEnum = createEEnum(HERO_CLASS);
		cardStatesEEnum = createEEnum(CARD_STATES);
		heroStatesEEnum = createEEnum(HERO_STATES);
		gameStatesEEnum = createEEnum(GAME_STATES);
		gameTypeEEnum = createEEnum(GAME_TYPE);
		heroAbilityEEnum = createEEnum(HERO_ABILITY);
		gameRegionEEnum = createEEnum(GAME_REGION);
		cardLibraryTypeEEnum = createEEnum(CARD_LIBRARY_TYPE);

		// Create data types
		abilitiesEDataType = createEDataType(ABILITIES);
		allCardsEDataType = createEDataType(ALL_CARDS);
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
		deckEClass.getESuperTypes().add(this.getCardLibrary());
		gamePlayerHandEClass.getESuperTypes().add(this.getGameDeck());
		gameDeckEClass.getESuperTypes().add(this.getDeck());
		gameDeckEClass.getESuperTypes().add(this.getCardLibrary());
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
		addEParameter(op, this.getCard(), "thecard", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCard__ShowCard(), null, "ShowCard", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCard__InteractOppoHero__Hero(), null, "InteractOppoHero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getHero(), "theHero", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(deckEClass, Deck.class, "Deck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeck_DeckID(), ecorePackage.getEInt(), "DeckID", null, 0, 1, Deck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeck_DeckName(), ecorePackage.getEString(), "DeckName", null, 0, 1, Deck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeck_DeckHasCards(), this.getCard(), null, "DeckHasCards", null, 30, 30, Deck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getDeck_DeckHasCards().getEKeys().add(this.getCard_CardDeckSN());
		initEReference(getDeck_DeckHasHero(), this.getHero(), null, "DeckHasHero", null, 1, 1, Deck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeck_EReference0(), this.getCardLibrary(), null, "EReference0", null, 0, 1, Deck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDeck__Hello(), ecorePackage.getEBoolean(), "Hello", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDeck__ShowVersion(), null, "ShowVersion", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDeck__ShowCardsInDeck(), null, "ShowCardsInDeck", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDeck__FlushDeck(), null, "FlushDeck", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(abilityEClass, Ability.class, "Ability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbility_AbilityID(), ecorePackage.getEInt(), "AbilityID", null, 0, 1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbility_AbilityType(), ecorePackage.getEString(), "AbilityType", null, 0, 1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbility_AbilityAffect(), ecorePackage.getEString(), "AbilityAffect", null, 0, 1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbility_CardHasAbility(), this.getCard(), null, "CardHasAbility", null, 0, 5, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAbility__Charge(), ecorePackage.getEBoolean(), "Charge", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbility__IncreaseAttribute(), ecorePackage.getEBoolean(), "IncreaseAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gamePlayerHandEClass, GamePlayerHand.class, "GamePlayerHand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGamePlayerHand_CardsInHand(), this.getCard(), null, "CardsInHand", null, 0, 10, GamePlayerHand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGamePlayerHand_HandsBelongToPlayer(), this.getPlayer(), this.getPlayer_PlayerHasHand(), "HandsBelongToPlayer", null, 0, 1, GamePlayerHand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGamePlayerHand_HandOwner(), ecorePackage.getEString(), "HandOwner", null, 0, 1, GamePlayerHand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getGamePlayerHand__ShowGameHand(), null, "ShowGameHand", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gameBoardEClass, GameBoard.class, "GameBoard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGameBoard_GameBoardHasPlayerBoard(), this.getPlayerBoard(), null, "GameBoardHasPlayerBoard", null, 2, -1, GameBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameBoard_BoardSN(), ecorePackage.getEInt(), "BoardSN", null, 0, 1, GameBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameDeckEClass, GameDeck.class, "GameDeck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGameDeck_DeckOwner(), ecorePackage.getEString(), "DeckOwner", null, 0, 1, GameDeck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameDeck_GameStartDeckCards(), ecorePackage.getEString(), "GameStartDeckCards", null, 0, 1, GameDeck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameDeck_GameDeckBelongToCardLibrary(), this.getCardLibrary(), null, "GameDeckBelongToCardLibrary", null, 0, 1, GameDeck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getGameDeck__RemoveCard__int(), ecorePackage.getEBoolean(), "RemoveCard", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "removeCardSN", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGameDeck__ReturnCard__int(), ecorePackage.getEBoolean(), "ReturnCard", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "returnCardSN", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGameDeck__ShowGameDeck(), null, "ShowGameDeck", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGameDeck__ShowGameStartDeckCards(), null, "ShowGameStartDeckCards", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGameDeck__GenerateRandomGameDeck(), null, "GenerateRandomGameDeck", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gameEClass, Game.class, "Game", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGame_GameSN(), ecorePackage.getEInt(), "GameSN", null, 0, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGame_GameStates(), this.getGameStates(), "GameStates", null, 0, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGame_GameID(), ecorePackage.getEString(), "GameID", null, 0, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_GameHasGameRule(), this.getGameRule(), null, "GameHasGameRule", null, 1, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_GameInGamePool(), this.getGamePool(), this.getGamePool_GamePoolHasGames(), "GameInGamePool", null, 0, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getGame__ShowGameInDetail(), null, "ShowGameInDetail", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGame__CheckGameStates(), ecorePackage.getEBoolean(), "CheckGameStates", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGame__ShowPlayerGameBoard(), null, "ShowPlayerGameBoard", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGame__InitializeGame(), null, "InitializeGame", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGame__SetGameBoard(), null, "SetGameBoard", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGame__SetGamePlayer(), null, "SetGamePlayer", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGame__SetPlayerHand(), null, "SetPlayerHand", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGame__SetGameRule(), null, "SetGameRule", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGame__SetPlayerDeck(), null, "SetPlayerDeck", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(playerEClass, Player.class, "Player", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlayer_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayer_TotalWins(), ecorePackage.getEInt(), "TotalWins", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlayer_PlayerHasDeck(), this.getGameDeck(), null, "PlayerHasDeck", null, 1, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlayer_PlayerHasHand(), this.getGamePlayerHand(), this.getGamePlayerHand_HandsBelongToPlayer(), "PlayerHasHand", null, 1, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlayer_PlayerHasOwnBoard(), this.getPlayerBoard(), null, "PlayerHasOwnBoard", null, 1, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayer_PlayerID(), ecorePackage.getEInt(), "PlayerID", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayer_LastLogin(), ecorePackage.getEDate(), "LastLogin", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayer_PlayerLevel(), ecorePackage.getEInt(), "PlayerLevel", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlayer_PlayerHasGameStartDeck(), this.getDeck(), null, "PlayerHasGameStartDeck", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlayer_PlayerHasDeckSet(), this.getDeck(), null, "PlayerHasDeckSet", null, 0, 9, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlayer_PlayerHasCardCollection(), this.getCardCollection(), null, "PlayerHasCardCollection", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPlayer__PlayCard__int(), null, "PlayCard", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "cardindex", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPlayer__OperateCard__Card(), ecorePackage.getEBoolean(), "OperateCard", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCard(), "thecard", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPlayer__ClickNextTurnBtn(), ecorePackage.getEBoolean(), "ClickNextTurnBtn", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPlayer__DrawCard(), ecorePackage.getEBoolean(), "DrawCard", 1, 5, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPlayer__OperateCard__Hero(), null, "OperateCard", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getHero(), "theHero", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(playerBoardEClass, PlayerBoard.class, "PlayerBoard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlayerBoard_BoardOwner(), ecorePackage.getEString(), "BoardOwner", null, 0, 1, PlayerBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPlayerBoard__ShowPlayerBoard(), null, "ShowPlayerBoard", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(heroEClass, Hero.class, "Hero", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHero_HeroClass(), this.getHeroClass(), "HeroClass", null, 1, 1, Hero.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHero_HeroHealth(), ecorePackage.getEInt(), "HeroHealth", "30", 1, 1, Hero.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHero_HeroStates(), this.getHeroStates(), "HeroStates", "ReadyForAction", 0, 1, Hero.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHero_HeroAbility(), ecorePackage.getEString(), "HeroAbility", null, 0, 1, Hero.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHero_HeroDesc(), ecorePackage.getEString(), "HeroDesc", null, 0, 1, Hero.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHero_HeroPower(), ecorePackage.getEInt(), "HeroPower", "0", 0, 1, Hero.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gamePoolEClass, GamePool.class, "GamePool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGamePool_GamePoolHasGames(), this.getGame(), this.getGame_GameInGamePool(), "GamePoolHasGames", null, 0, -1, GamePool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGamePool_GamePoolDesc(), ecorePackage.getEString(), "GamePoolDesc", null, 0, 1, GamePool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGamePool_GamePoolStartDate(), ecorePackage.getEDate(), "GamePoolStartDate", null, 0, 1, GamePool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGamePool_GamePoolRegion(), this.getGameRegion(), "GamePoolRegion", null, 0, 1, GamePool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGamePool_GamePoolHasCardLibrary(), this.getCardLibrary(), null, "GamePoolHasCardLibrary", null, 0, 1, GamePool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getGamePool__ShowAllGames(), null, "ShowAllGames", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGamePool__CreateGame(), null, "CreateGame", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGamePool__HaltGame(), null, "HaltGame", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGamePool__ShowGamePoolStates(), null, "ShowGamePoolStates", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGamePool__Initialize(), null, "Initialize", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cardCollectionEClass, CardCollection.class, "CardCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCardCollection_CollectionHasCards(), this.getCard(), null, "CollectionHasCards", null, 0, -1, CardCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardCollection_CollectionOwner(), ecorePackage.getEInt(), "CollectionOwner", null, 0, 1, CardCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardCollection_CollectionID(), ecorePackage.getEInt(), "CollectionID", null, 0, 1, CardCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCardCollection__ShowCollection(), null, "ShowCollection", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gameRuleEClass, GameRule.class, "GameRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGameRule_GameHasPlayers(), this.getPlayer(), null, "GameHasPlayers", null, 2, -1, GameRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameRule_GameHasBoard(), this.getGameBoard(), null, "GameHasBoard", null, 1, 1, GameRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameRule_GameHasGameRule(), this.getGame(), null, "GameHasGameRule", null, 1, 1, GameRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameRule_GameRuleDesc(), ecorePackage.getEString(), "GameRuleDesc", null, 0, 1, GameRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameRule_GameRuleType(), this.getGameType(), "GameRuleType", null, 0, 1, GameRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameSetterEClass, GameSetter.class, "GameSetter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cardLibraryEClass, CardLibrary.class, "CardLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCardLibrary_CardLibraryHasCards(), this.getCard(), null, "CardLibraryHasCards", null, 0, -1, CardLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardLibrary_LibraryVersion(), ecorePackage.getEString(), "LibraryVersion", null, 0, 1, CardLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardLibrary_LibraryType(), this.getCardLibraryType(), "LibraryType", null, 0, 1, CardLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardLibrary_AllCardsPool(), this.getAllCards(), "AllCardsPool", null, 0, 1, CardLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCardLibrary__LoadFromDb(), null, "LoadFromDb", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCardLibrary__ShowCardLibrary(), null, "ShowCardLibrary", 0, 1, IS_UNIQUE, IS_ORDERED);

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

		initEEnum(gameStatesEEnum, GameStates.class, "GameStates");
		addEEnumLiteral(gameStatesEEnum, GameStates.CREATED);
		addEEnumLiteral(gameStatesEEnum, GameStates.PLAYING);
		addEEnumLiteral(gameStatesEEnum, GameStates.OVER);
		addEEnumLiteral(gameStatesEEnum, GameStates.HALT);

		initEEnum(gameTypeEEnum, GameType.class, "GameType");
		addEEnumLiteral(gameTypeEEnum, GameType.STANDARD);
		addEEnumLiteral(gameTypeEEnum, GameType.TWOVSTWO);
		addEEnumLiteral(gameTypeEEnum, GameType.PVE);

		initEEnum(heroAbilityEEnum, HeroAbility.class, "HeroAbility");
		addEEnumLiteral(heroAbilityEEnum, HeroAbility.MAGE_ABILITY);

		initEEnum(gameRegionEEnum, GameRegion.class, "GameRegion");
		addEEnumLiteral(gameRegionEEnum, GameRegion.AMS);
		addEEnumLiteral(gameRegionEEnum, GameRegion.APJ);
		addEEnumLiteral(gameRegionEEnum, GameRegion.EMEA);

		initEEnum(cardLibraryTypeEEnum, CardLibraryType.class, "CardLibraryType");
		addEEnumLiteral(cardLibraryTypeEEnum, CardLibraryType.STANDARD);
		addEEnumLiteral(cardLibraryTypeEEnum, CardLibraryType.EXPERT);

		// Initialize data types
		initEDataType(abilitiesEDataType, Ability.class, "Abilities", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(allCardsEDataType, AllCards.class, "AllCards", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
