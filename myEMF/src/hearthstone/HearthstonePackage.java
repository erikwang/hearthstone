/**
 */
package hearthstone;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hearthstone.HearthstoneFactory
 * @model kind="package"
 * @generated
 */
public interface HearthstonePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hearthstone";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://hearthstone/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hearthstone";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HearthstonePackage eINSTANCE = hearthstone.impl.HearthstonePackageImpl.init();

	/**
	 * The meta object id for the '{@link hearthstone.impl.CardImpl <em>Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hearthstone.impl.CardImpl
	 * @see hearthstone.impl.HearthstonePackageImpl#getCard()
	 * @generated
	 */
	int CARD = 0;

	/**
	 * The feature id for the '<em><b>Card Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__CARD_NAME = 0;

	/**
	 * The feature id for the '<em><b>Card Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__CARD_COST = 1;

	/**
	 * The feature id for the '<em><b>Card Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__CARD_LIFE = 2;

	/**
	 * The feature id for the '<em><b>Card Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__CARD_POWER = 3;

	/**
	 * The feature id for the '<em><b>Card Quality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__CARD_QUALITY = 4;

	/**
	 * The feature id for the '<em><b>Card Number Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__CARD_NUMBER_LIMIT = 5;

	/**
	 * The feature id for the '<em><b>Card Race</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__CARD_RACE = 6;

	/**
	 * The feature id for the '<em><b>Card States</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__CARD_STATES = 7;

	/**
	 * The feature id for the '<em><b>Card Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__CARD_CLASS = 8;

	/**
	 * The feature id for the '<em><b>Card Has Abilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__CARD_HAS_ABILITIES = 9;

	/**
	 * The feature id for the '<em><b>Card SN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__CARD_SN = 10;

	/**
	 * The feature id for the '<em><b>Card Ability Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__CARD_ABILITY_DESC = 11;

	/**
	 * The feature id for the '<em><b>Card Deck SN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__CARD_DECK_SN = 12;

	/**
	 * The number of structural features of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FEATURE_COUNT = 13;

	/**
	 * The operation id for the '<em>Update Card States</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD___UPDATE_CARD_STATES__INT = 0;

	/**
	 * The operation id for the '<em>Interact Another Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD___INTERACT_ANOTHER_CARD__CARD = 1;

	/**
	 * The operation id for the '<em>Show Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD___SHOW_CARD = 2;

	/**
	 * The operation id for the '<em>Interact Oppo Hero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD___INTERACT_OPPO_HERO__HERO = 3;

	/**
	 * The number of operations of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link hearthstone.impl.DeckImpl <em>Deck</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hearthstone.impl.DeckImpl
	 * @see hearthstone.impl.HearthstonePackageImpl#getDeck()
	 * @generated
	 */
	int DECK = 1;

	/**
	 * The meta object id for the '{@link hearthstone.impl.AbilityImpl <em>Ability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hearthstone.impl.AbilityImpl
	 * @see hearthstone.impl.HearthstonePackageImpl#getAbility()
	 * @generated
	 */
	int ABILITY = 2;

	/**
	 * The meta object id for the '{@link hearthstone.impl.GamePlayerHandImpl <em>Game Player Hand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hearthstone.impl.GamePlayerHandImpl
	 * @see hearthstone.impl.HearthstonePackageImpl#getGamePlayerHand()
	 * @generated
	 */
	int GAME_PLAYER_HAND = 3;

	/**
	 * The meta object id for the '{@link hearthstone.impl.GameBoardImpl <em>Game Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hearthstone.impl.GameBoardImpl
	 * @see hearthstone.impl.HearthstonePackageImpl#getGameBoard()
	 * @generated
	 */
	int GAME_BOARD = 4;

	/**
	 * The meta object id for the '{@link hearthstone.impl.GameDeckImpl <em>Game Deck</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hearthstone.impl.GameDeckImpl
	 * @see hearthstone.impl.HearthstonePackageImpl#getGameDeck()
	 * @generated
	 */
	int GAME_DECK = 5;

	/**
	 * The meta object id for the '{@link hearthstone.impl.GameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hearthstone.impl.GameImpl
	 * @see hearthstone.impl.HearthstonePackageImpl#getGame()
	 * @generated
	 */
	int GAME = 6;

	/**
	 * The meta object id for the '{@link hearthstone.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hearthstone.impl.PlayerImpl
	 * @see hearthstone.impl.HearthstonePackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 7;

	/**
	 * The meta object id for the '{@link hearthstone.impl.PlayerBoardImpl <em>Player Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hearthstone.impl.PlayerBoardImpl
	 * @see hearthstone.impl.HearthstonePackageImpl#getPlayerBoard()
	 * @generated
	 */
	int PLAYER_BOARD = 8;

	/**
	 * The meta object id for the '{@link hearthstone.impl.HeroImpl <em>Hero</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hearthstone.impl.HeroImpl
	 * @see hearthstone.impl.HearthstonePackageImpl#getHero()
	 * @generated
	 */
	int HERO = 9;

	/**
	 * The meta object id for the '{@link hearthstone.impl.GamePoolImpl <em>Game Pool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hearthstone.impl.GamePoolImpl
	 * @see hearthstone.impl.HearthstonePackageImpl#getGamePool()
	 * @generated
	 */
	int GAME_POOL = 10;

	/**
	 * The meta object id for the '{@link hearthstone.impl.CardCollectionImpl <em>Card Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hearthstone.impl.CardCollectionImpl
	 * @see hearthstone.impl.HearthstonePackageImpl#getCardCollection()
	 * @generated
	 */
	int CARD_COLLECTION = 11;

	/**
	 * The meta object id for the '{@link hearthstone.impl.GameRuleImpl <em>Game Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hearthstone.impl.GameRuleImpl
	 * @see hearthstone.impl.HearthstonePackageImpl#getGameRule()
	 * @generated
	 */
	int GAME_RULE = 12;

	/**
	 * The meta object id for the '{@link hearthstone.impl.GameSetterImpl <em>Game Setter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hearthstone.impl.GameSetterImpl
	 * @see hearthstone.impl.HearthstonePackageImpl#getGameSetter()
	 * @generated
	 */
	int GAME_SETTER = 13;

	/**
	 * The meta object id for the '{@link hearthstone.impl.CardLibraryImpl <em>Card Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hearthstone.impl.CardLibraryImpl
	 * @see hearthstone.impl.HearthstonePackageImpl#getCardLibrary()
	 * @generated
	 */
	int CARD_LIBRARY = 14;

	/**
	 * The feature id for the '<em><b>Card Library Has Cards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_LIBRARY__CARD_LIBRARY_HAS_CARDS = 0;

	/**
	 * The feature id for the '<em><b>Library Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_LIBRARY__LIBRARY_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Library Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_LIBRARY__LIBRARY_TYPE = 2;

	/**
	 * The feature id for the '<em><b>All Cards Pool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_LIBRARY__ALL_CARDS_POOL = 3;

	/**
	 * The number of structural features of the '<em>Card Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_LIBRARY_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Load From Db</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_LIBRARY___LOAD_FROM_DB = 0;

	/**
	 * The operation id for the '<em>Show Card Library</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_LIBRARY___SHOW_CARD_LIBRARY = 1;

	/**
	 * The number of operations of the '<em>Card Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_LIBRARY_OPERATION_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Card Library Has Cards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK__CARD_LIBRARY_HAS_CARDS = CARD_LIBRARY__CARD_LIBRARY_HAS_CARDS;

	/**
	 * The feature id for the '<em><b>Library Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK__LIBRARY_VERSION = CARD_LIBRARY__LIBRARY_VERSION;

	/**
	 * The feature id for the '<em><b>Library Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK__LIBRARY_TYPE = CARD_LIBRARY__LIBRARY_TYPE;

	/**
	 * The feature id for the '<em><b>All Cards Pool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK__ALL_CARDS_POOL = CARD_LIBRARY__ALL_CARDS_POOL;

	/**
	 * The feature id for the '<em><b>Deck ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK__DECK_ID = CARD_LIBRARY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deck Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK__DECK_NAME = CARD_LIBRARY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deck Has Cards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK__DECK_HAS_CARDS = CARD_LIBRARY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Deck Has Hero</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK__DECK_HAS_HERO = CARD_LIBRARY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK__EREFERENCE0 = CARD_LIBRARY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Deck</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK_FEATURE_COUNT = CARD_LIBRARY_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Load From Db</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK___LOAD_FROM_DB = CARD_LIBRARY___LOAD_FROM_DB;

	/**
	 * The operation id for the '<em>Show Card Library</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK___SHOW_CARD_LIBRARY = CARD_LIBRARY___SHOW_CARD_LIBRARY;

	/**
	 * The operation id for the '<em>Hello</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK___HELLO = CARD_LIBRARY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Show Version</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK___SHOW_VERSION = CARD_LIBRARY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Show Cards In Deck</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK___SHOW_CARDS_IN_DECK = CARD_LIBRARY_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Flush Deck</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK___FLUSH_DECK = CARD_LIBRARY_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Deck</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK_OPERATION_COUNT = CARD_LIBRARY_OPERATION_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ability ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__ABILITY_ID = 0;

	/**
	 * The feature id for the '<em><b>Ability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__ABILITY_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Ability Affect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__ABILITY_AFFECT = 2;

	/**
	 * The feature id for the '<em><b>Card Has Ability</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__CARD_HAS_ABILITY = 3;

	/**
	 * The number of structural features of the '<em>Ability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Charge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY___CHARGE = 0;

	/**
	 * The operation id for the '<em>Increase Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY___INCREASE_ATTRIBUTE = 1;

	/**
	 * The number of operations of the '<em>Ability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY_OPERATION_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Card Library Has Cards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DECK__CARD_LIBRARY_HAS_CARDS = DECK__CARD_LIBRARY_HAS_CARDS;

	/**
	 * The feature id for the '<em><b>Library Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DECK__LIBRARY_VERSION = DECK__LIBRARY_VERSION;

	/**
	 * The feature id for the '<em><b>Library Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DECK__LIBRARY_TYPE = DECK__LIBRARY_TYPE;

	/**
	 * The feature id for the '<em><b>All Cards Pool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DECK__ALL_CARDS_POOL = DECK__ALL_CARDS_POOL;

	/**
	 * The feature id for the '<em><b>Deck ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DECK__DECK_ID = DECK__DECK_ID;

	/**
	 * The feature id for the '<em><b>Deck Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DECK__DECK_NAME = DECK__DECK_NAME;

	/**
	 * The feature id for the '<em><b>Deck Has Cards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DECK__DECK_HAS_CARDS = DECK__DECK_HAS_CARDS;

	/**
	 * The feature id for the '<em><b>Deck Has Hero</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DECK__DECK_HAS_HERO = DECK__DECK_HAS_HERO;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DECK__EREFERENCE0 = DECK__EREFERENCE0;

	/**
	 * The feature id for the '<em><b>Deck Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DECK__DECK_OWNER = DECK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Game Start Deck Cards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DECK__GAME_START_DECK_CARDS = DECK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Game Deck Belong To Card Library</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DECK__GAME_DECK_BELONG_TO_CARD_LIBRARY = DECK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Game Deck</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DECK_FEATURE_COUNT = DECK_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Load From Db</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DECK___LOAD_FROM_DB = DECK___LOAD_FROM_DB;

	/**
	 * The operation id for the '<em>Show Card Library</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DECK___SHOW_CARD_LIBRARY = DECK___SHOW_CARD_LIBRARY;

	/**
	 * The operation id for the '<em>Hello</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DECK___HELLO = DECK___HELLO;

	/**
	 * The operation id for the '<em>Show Version</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DECK___SHOW_VERSION = DECK___SHOW_VERSION;

	/**
	 * The operation id for the '<em>Show Cards In Deck</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DECK___SHOW_CARDS_IN_DECK = DECK___SHOW_CARDS_IN_DECK;

	/**
	 * The operation id for the '<em>Flush Deck</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DECK___FLUSH_DECK = DECK___FLUSH_DECK;

	/**
	 * The operation id for the '<em>Remove Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DECK___REMOVE_CARD__INT = DECK_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Return Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DECK___RETURN_CARD__INT = DECK_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Show Game Deck</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DECK___SHOW_GAME_DECK = DECK_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Show Game Start Deck Cards</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DECK___SHOW_GAME_START_DECK_CARDS = DECK_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Generate Random Game Deck</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DECK___GENERATE_RANDOM_GAME_DECK = DECK_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Game Deck</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_DECK_OPERATION_COUNT = DECK_OPERATION_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Card Library Has Cards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_HAND__CARD_LIBRARY_HAS_CARDS = GAME_DECK__CARD_LIBRARY_HAS_CARDS;

	/**
	 * The feature id for the '<em><b>Library Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_HAND__LIBRARY_VERSION = GAME_DECK__LIBRARY_VERSION;

	/**
	 * The feature id for the '<em><b>Library Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_HAND__LIBRARY_TYPE = GAME_DECK__LIBRARY_TYPE;

	/**
	 * The feature id for the '<em><b>All Cards Pool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_HAND__ALL_CARDS_POOL = GAME_DECK__ALL_CARDS_POOL;

	/**
	 * The feature id for the '<em><b>Deck ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_HAND__DECK_ID = GAME_DECK__DECK_ID;

	/**
	 * The feature id for the '<em><b>Deck Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_HAND__DECK_NAME = GAME_DECK__DECK_NAME;

	/**
	 * The feature id for the '<em><b>Deck Has Cards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_HAND__DECK_HAS_CARDS = GAME_DECK__DECK_HAS_CARDS;

	/**
	 * The feature id for the '<em><b>Deck Has Hero</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_HAND__DECK_HAS_HERO = GAME_DECK__DECK_HAS_HERO;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_HAND__EREFERENCE0 = GAME_DECK__EREFERENCE0;

	/**
	 * The feature id for the '<em><b>Deck Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_HAND__DECK_OWNER = GAME_DECK__DECK_OWNER;

	/**
	 * The feature id for the '<em><b>Game Start Deck Cards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_HAND__GAME_START_DECK_CARDS = GAME_DECK__GAME_START_DECK_CARDS;

	/**
	 * The feature id for the '<em><b>Game Deck Belong To Card Library</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_HAND__GAME_DECK_BELONG_TO_CARD_LIBRARY = GAME_DECK__GAME_DECK_BELONG_TO_CARD_LIBRARY;

	/**
	 * The feature id for the '<em><b>Cards In Hand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_HAND__CARDS_IN_HAND = GAME_DECK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hands Belong To Player</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_HAND__HANDS_BELONG_TO_PLAYER = GAME_DECK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hand Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_HAND__HAND_OWNER = GAME_DECK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Game Player Hand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_HAND_FEATURE_COUNT = GAME_DECK_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Load From Db</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_HAND___LOAD_FROM_DB = GAME_DECK___LOAD_FROM_DB;

	/**
	 * The operation id for the '<em>Show Card Library</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_HAND___SHOW_CARD_LIBRARY = GAME_DECK___SHOW_CARD_LIBRARY;

	/**
	 * The operation id for the '<em>Hello</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_HAND___HELLO = GAME_DECK___HELLO;

	/**
	 * The operation id for the '<em>Show Version</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_HAND___SHOW_VERSION = GAME_DECK___SHOW_VERSION;

	/**
	 * The operation id for the '<em>Show Cards In Deck</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_HAND___SHOW_CARDS_IN_DECK = GAME_DECK___SHOW_CARDS_IN_DECK;

	/**
	 * The operation id for the '<em>Flush Deck</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_HAND___FLUSH_DECK = GAME_DECK___FLUSH_DECK;

	/**
	 * The operation id for the '<em>Remove Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_HAND___REMOVE_CARD__INT = GAME_DECK___REMOVE_CARD__INT;

	/**
	 * The operation id for the '<em>Return Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_HAND___RETURN_CARD__INT = GAME_DECK___RETURN_CARD__INT;

	/**
	 * The operation id for the '<em>Show Game Deck</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_HAND___SHOW_GAME_DECK = GAME_DECK___SHOW_GAME_DECK;

	/**
	 * The operation id for the '<em>Show Game Start Deck Cards</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_HAND___SHOW_GAME_START_DECK_CARDS = GAME_DECK___SHOW_GAME_START_DECK_CARDS;

	/**
	 * The operation id for the '<em>Generate Random Game Deck</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_HAND___GENERATE_RANDOM_GAME_DECK = GAME_DECK___GENERATE_RANDOM_GAME_DECK;

	/**
	 * The operation id for the '<em>Show Game Hand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_HAND___SHOW_GAME_HAND = GAME_DECK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Game Player Hand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PLAYER_HAND_OPERATION_COUNT = GAME_DECK_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Game Board Has Player Board</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_BOARD__GAME_BOARD_HAS_PLAYER_BOARD = 0;

	/**
	 * The feature id for the '<em><b>Board SN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_BOARD__BOARD_SN = 1;

	/**
	 * The number of structural features of the '<em>Game Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_BOARD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Game Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_BOARD_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Game SN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__GAME_SN = 0;

	/**
	 * The feature id for the '<em><b>Game States</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__GAME_STATES = 1;

	/**
	 * The feature id for the '<em><b>Game ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__GAME_ID = 2;

	/**
	 * The feature id for the '<em><b>Game Has Game Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__GAME_HAS_GAME_RULE = 3;

	/**
	 * The feature id for the '<em><b>Game In Game Pool</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__GAME_IN_GAME_POOL = 4;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Show Game In Detail</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___SHOW_GAME_IN_DETAIL = 0;

	/**
	 * The operation id for the '<em>Check Game States</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___CHECK_GAME_STATES = 1;

	/**
	 * The operation id for the '<em>Show Player Game Board</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___SHOW_PLAYER_GAME_BOARD = 2;

	/**
	 * The operation id for the '<em>Initialize Game</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___INITIALIZE_GAME = 3;

	/**
	 * The operation id for the '<em>Set Game Board</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___SET_GAME_BOARD = 4;

	/**
	 * The operation id for the '<em>Set Game Player</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___SET_GAME_PLAYER = 5;

	/**
	 * The operation id for the '<em>Set Player Hand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___SET_PLAYER_HAND = 6;

	/**
	 * The operation id for the '<em>Set Game Rule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___SET_GAME_RULE = 7;

	/**
	 * The operation id for the '<em>Set Player Deck</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___SET_PLAYER_DECK = 8;

	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Total Wins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__TOTAL_WINS = 1;

	/**
	 * The feature id for the '<em><b>Player Has Deck</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__PLAYER_HAS_DECK = 2;

	/**
	 * The feature id for the '<em><b>Player Has Hand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__PLAYER_HAS_HAND = 3;

	/**
	 * The feature id for the '<em><b>Player Has Own Board</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__PLAYER_HAS_OWN_BOARD = 4;

	/**
	 * The feature id for the '<em><b>Player ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__PLAYER_ID = 5;

	/**
	 * The feature id for the '<em><b>Last Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__LAST_LOGIN = 6;

	/**
	 * The feature id for the '<em><b>Player Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__PLAYER_LEVEL = 7;

	/**
	 * The feature id for the '<em><b>Player Has Game Start Deck</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__PLAYER_HAS_GAME_START_DECK = 8;

	/**
	 * The feature id for the '<em><b>Player Has Deck Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__PLAYER_HAS_DECK_SET = 9;

	/**
	 * The feature id for the '<em><b>Player Has Card Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__PLAYER_HAS_CARD_COLLECTION = 10;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = 11;

	/**
	 * The operation id for the '<em>Play Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER___PLAY_CARD__INT = 0;

	/**
	 * The operation id for the '<em>Operate Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER___OPERATE_CARD__CARD = 1;

	/**
	 * The operation id for the '<em>Click Next Turn Btn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER___CLICK_NEXT_TURN_BTN = 2;

	/**
	 * The operation id for the '<em>Draw Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER___DRAW_CARD = 3;

	/**
	 * The operation id for the '<em>Operate Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER___OPERATE_CARD__HERO = 4;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_OPERATION_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Card Library Has Cards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_BOARD__CARD_LIBRARY_HAS_CARDS = DECK__CARD_LIBRARY_HAS_CARDS;

	/**
	 * The feature id for the '<em><b>Library Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_BOARD__LIBRARY_VERSION = DECK__LIBRARY_VERSION;

	/**
	 * The feature id for the '<em><b>Library Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_BOARD__LIBRARY_TYPE = DECK__LIBRARY_TYPE;

	/**
	 * The feature id for the '<em><b>All Cards Pool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_BOARD__ALL_CARDS_POOL = DECK__ALL_CARDS_POOL;

	/**
	 * The feature id for the '<em><b>Deck ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_BOARD__DECK_ID = DECK__DECK_ID;

	/**
	 * The feature id for the '<em><b>Deck Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_BOARD__DECK_NAME = DECK__DECK_NAME;

	/**
	 * The feature id for the '<em><b>Deck Has Cards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_BOARD__DECK_HAS_CARDS = DECK__DECK_HAS_CARDS;

	/**
	 * The feature id for the '<em><b>Deck Has Hero</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_BOARD__DECK_HAS_HERO = DECK__DECK_HAS_HERO;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_BOARD__EREFERENCE0 = DECK__EREFERENCE0;

	/**
	 * The feature id for the '<em><b>Board Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_BOARD__BOARD_OWNER = DECK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Player Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_BOARD_FEATURE_COUNT = DECK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Load From Db</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_BOARD___LOAD_FROM_DB = DECK___LOAD_FROM_DB;

	/**
	 * The operation id for the '<em>Show Card Library</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_BOARD___SHOW_CARD_LIBRARY = DECK___SHOW_CARD_LIBRARY;

	/**
	 * The operation id for the '<em>Hello</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_BOARD___HELLO = DECK___HELLO;

	/**
	 * The operation id for the '<em>Show Version</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_BOARD___SHOW_VERSION = DECK___SHOW_VERSION;

	/**
	 * The operation id for the '<em>Show Cards In Deck</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_BOARD___SHOW_CARDS_IN_DECK = DECK___SHOW_CARDS_IN_DECK;

	/**
	 * The operation id for the '<em>Flush Deck</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_BOARD___FLUSH_DECK = DECK___FLUSH_DECK;

	/**
	 * The operation id for the '<em>Show Player Board</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_BOARD___SHOW_PLAYER_BOARD = DECK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Player Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_BOARD_OPERATION_COUNT = DECK_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hero Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERO__HERO_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Hero Health</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERO__HERO_HEALTH = 1;

	/**
	 * The feature id for the '<em><b>Hero States</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERO__HERO_STATES = 2;

	/**
	 * The feature id for the '<em><b>Hero Ability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERO__HERO_ABILITY = 3;

	/**
	 * The feature id for the '<em><b>Hero Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERO__HERO_DESC = 4;

	/**
	 * The feature id for the '<em><b>Hero Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERO__HERO_POWER = 5;

	/**
	 * The number of structural features of the '<em>Hero</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERO_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Hero</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERO_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Game Pool Has Games</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_POOL__GAME_POOL_HAS_GAMES = 0;

	/**
	 * The feature id for the '<em><b>Game Pool Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_POOL__GAME_POOL_DESC = 1;

	/**
	 * The feature id for the '<em><b>Game Pool Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_POOL__GAME_POOL_START_DATE = 2;

	/**
	 * The feature id for the '<em><b>Game Pool Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_POOL__GAME_POOL_REGION = 3;

	/**
	 * The feature id for the '<em><b>Game Pool Has Card Library</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_POOL__GAME_POOL_HAS_CARD_LIBRARY = 4;

	/**
	 * The number of structural features of the '<em>Game Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_POOL_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Show All Games</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_POOL___SHOW_ALL_GAMES = 0;

	/**
	 * The operation id for the '<em>Create Game</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_POOL___CREATE_GAME = 1;

	/**
	 * The operation id for the '<em>Halt Game</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_POOL___HALT_GAME = 2;

	/**
	 * The operation id for the '<em>Show Game Pool States</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_POOL___SHOW_GAME_POOL_STATES = 3;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_POOL___INITIALIZE = 4;

	/**
	 * The number of operations of the '<em>Game Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_POOL_OPERATION_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Collection Has Cards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_COLLECTION__COLLECTION_HAS_CARDS = 0;

	/**
	 * The feature id for the '<em><b>Collection Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_COLLECTION__COLLECTION_OWNER = 1;

	/**
	 * The feature id for the '<em><b>Collection ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_COLLECTION__COLLECTION_ID = 2;

	/**
	 * The number of structural features of the '<em>Card Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_COLLECTION_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Show Collection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_COLLECTION___SHOW_COLLECTION = 0;

	/**
	 * The number of operations of the '<em>Card Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_COLLECTION_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Game Has Players</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_RULE__GAME_HAS_PLAYERS = 0;

	/**
	 * The feature id for the '<em><b>Game Has Board</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_RULE__GAME_HAS_BOARD = 1;

	/**
	 * The feature id for the '<em><b>Game Has Game Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_RULE__GAME_HAS_GAME_RULE = 2;

	/**
	 * The feature id for the '<em><b>Game Rule Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_RULE__GAME_RULE_DESC = 3;

	/**
	 * The feature id for the '<em><b>Game Rule Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_RULE__GAME_RULE_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Game Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_RULE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Game Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_RULE_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Game Setter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_SETTER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Game Setter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_SETTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hearthstone.CardQuality <em>Card Quality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hearthstone.CardQuality
	 * @see hearthstone.impl.HearthstonePackageImpl#getCardQuality()
	 * @generated
	 */
	int CARD_QUALITY = 15;

	/**
	 * The meta object id for the '{@link hearthstone.CardRace <em>Card Race</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hearthstone.CardRace
	 * @see hearthstone.impl.HearthstonePackageImpl#getCardRace()
	 * @generated
	 */
	int CARD_RACE = 16;

	/**
	 * The meta object id for the '{@link hearthstone.HeroClass <em>Hero Class</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hearthstone.HeroClass
	 * @see hearthstone.impl.HearthstonePackageImpl#getHeroClass()
	 * @generated
	 */
	int HERO_CLASS = 17;

	/**
	 * The meta object id for the '{@link hearthstone.CardStates <em>Card States</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hearthstone.CardStates
	 * @see hearthstone.impl.HearthstonePackageImpl#getCardStates()
	 * @generated
	 */
	int CARD_STATES = 18;

	/**
	 * The meta object id for the '{@link hearthstone.HeroStates <em>Hero States</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hearthstone.HeroStates
	 * @see hearthstone.impl.HearthstonePackageImpl#getHeroStates()
	 * @generated
	 */
	int HERO_STATES = 19;

	/**
	 * The meta object id for the '{@link hearthstone.GameStates <em>Game States</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hearthstone.GameStates
	 * @see hearthstone.impl.HearthstonePackageImpl#getGameStates()
	 * @generated
	 */
	int GAME_STATES = 20;

	/**
	 * The meta object id for the '{@link hearthstone.GameType <em>Game Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hearthstone.GameType
	 * @see hearthstone.impl.HearthstonePackageImpl#getGameType()
	 * @generated
	 */
	int GAME_TYPE = 21;

	/**
	 * The meta object id for the '{@link hearthstone.HeroAbility <em>Hero Ability</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hearthstone.HeroAbility
	 * @see hearthstone.impl.HearthstonePackageImpl#getHeroAbility()
	 * @generated
	 */
	int HERO_ABILITY = 22;

	/**
	 * The meta object id for the '{@link hearthstone.GameRegion <em>Game Region</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hearthstone.GameRegion
	 * @see hearthstone.impl.HearthstonePackageImpl#getGameRegion()
	 * @generated
	 */
	int GAME_REGION = 23;

	/**
	 * The meta object id for the '{@link hearthstone.CardLibraryType <em>Card Library Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hearthstone.CardLibraryType
	 * @see hearthstone.impl.HearthstonePackageImpl#getCardLibraryType()
	 * @generated
	 */
	int CARD_LIBRARY_TYPE = 24;

	/**
	 * The meta object id for the '<em>Abilities</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hearthstone.Ability
	 * @see hearthstone.impl.HearthstonePackageImpl#getAbilities()
	 * @generated
	 */
	int ABILITIES = 25;


	/**
	 * The meta object id for the '<em>All Cards</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hearthstone.util.AllCards
	 * @see hearthstone.impl.HearthstonePackageImpl#getAllCards()
	 * @generated
	 */
	int ALL_CARDS = 26;


	/**
	 * Returns the meta object for class '{@link hearthstone.Card <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card</em>'.
	 * @see hearthstone.Card
	 * @generated
	 */
	EClass getCard();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.Card#getCardName <em>Card Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Name</em>'.
	 * @see hearthstone.Card#getCardName()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_CardName();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.Card#getCardCost <em>Card Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Cost</em>'.
	 * @see hearthstone.Card#getCardCost()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_CardCost();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.Card#getCardLife <em>Card Life</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Life</em>'.
	 * @see hearthstone.Card#getCardLife()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_CardLife();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.Card#getCardPower <em>Card Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Power</em>'.
	 * @see hearthstone.Card#getCardPower()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_CardPower();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.Card#getCardQuality <em>Card Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Quality</em>'.
	 * @see hearthstone.Card#getCardQuality()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_CardQuality();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.Card#getCardNumberLimit <em>Card Number Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Number Limit</em>'.
	 * @see hearthstone.Card#getCardNumberLimit()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_CardNumberLimit();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.Card#getCardRace <em>Card Race</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Race</em>'.
	 * @see hearthstone.Card#getCardRace()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_CardRace();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.Card#getCardStates <em>Card States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card States</em>'.
	 * @see hearthstone.Card#getCardStates()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_CardStates();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.Card#getCardClass <em>Card Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Class</em>'.
	 * @see hearthstone.Card#getCardClass()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_CardClass();

	/**
	 * Returns the meta object for the containment reference list '{@link hearthstone.Card#getCardHasAbilities <em>Card Has Abilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Card Has Abilities</em>'.
	 * @see hearthstone.Card#getCardHasAbilities()
	 * @see #getCard()
	 * @generated
	 */
	EReference getCard_CardHasAbilities();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.Card#getCardSN <em>Card SN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card SN</em>'.
	 * @see hearthstone.Card#getCardSN()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_CardSN();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.Card#getCardAbilityDesc <em>Card Ability Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Ability Desc</em>'.
	 * @see hearthstone.Card#getCardAbilityDesc()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_CardAbilityDesc();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.Card#getCardDeckSN <em>Card Deck SN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Deck SN</em>'.
	 * @see hearthstone.Card#getCardDeckSN()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_CardDeckSN();

	/**
	 * Returns the meta object for the '{@link hearthstone.Card#UpdateCardStates(int) <em>Update Card States</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Card States</em>' operation.
	 * @see hearthstone.Card#UpdateCardStates(int)
	 * @generated
	 */
	EOperation getCard__UpdateCardStates__int();

	/**
	 * Returns the meta object for the '{@link hearthstone.Card#InteractAnotherCard(hearthstone.Card) <em>Interact Another Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Interact Another Card</em>' operation.
	 * @see hearthstone.Card#InteractAnotherCard(hearthstone.Card)
	 * @generated
	 */
	EOperation getCard__InteractAnotherCard__Card();

	/**
	 * Returns the meta object for the '{@link hearthstone.Card#ShowCard() <em>Show Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Show Card</em>' operation.
	 * @see hearthstone.Card#ShowCard()
	 * @generated
	 */
	EOperation getCard__ShowCard();

	/**
	 * Returns the meta object for the '{@link hearthstone.Card#InteractOppoHero(hearthstone.Hero) <em>Interact Oppo Hero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Interact Oppo Hero</em>' operation.
	 * @see hearthstone.Card#InteractOppoHero(hearthstone.Hero)
	 * @generated
	 */
	EOperation getCard__InteractOppoHero__Hero();

	/**
	 * Returns the meta object for class '{@link hearthstone.Deck <em>Deck</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deck</em>'.
	 * @see hearthstone.Deck
	 * @generated
	 */
	EClass getDeck();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.Deck#getDeckID <em>Deck ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deck ID</em>'.
	 * @see hearthstone.Deck#getDeckID()
	 * @see #getDeck()
	 * @generated
	 */
	EAttribute getDeck_DeckID();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.Deck#getDeckName <em>Deck Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deck Name</em>'.
	 * @see hearthstone.Deck#getDeckName()
	 * @see #getDeck()
	 * @generated
	 */
	EAttribute getDeck_DeckName();

	/**
	 * Returns the meta object for the containment reference list '{@link hearthstone.Deck#getDeckHasCards <em>Deck Has Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deck Has Cards</em>'.
	 * @see hearthstone.Deck#getDeckHasCards()
	 * @see #getDeck()
	 * @generated
	 */
	EReference getDeck_DeckHasCards();

	/**
	 * Returns the meta object for the reference '{@link hearthstone.Deck#getDeckHasHero <em>Deck Has Hero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deck Has Hero</em>'.
	 * @see hearthstone.Deck#getDeckHasHero()
	 * @see #getDeck()
	 * @generated
	 */
	EReference getDeck_DeckHasHero();

	/**
	 * Returns the meta object for the reference '{@link hearthstone.Deck#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference0</em>'.
	 * @see hearthstone.Deck#getEReference0()
	 * @see #getDeck()
	 * @generated
	 */
	EReference getDeck_EReference0();

	/**
	 * Returns the meta object for the '{@link hearthstone.Deck#Hello() <em>Hello</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Hello</em>' operation.
	 * @see hearthstone.Deck#Hello()
	 * @generated
	 */
	EOperation getDeck__Hello();

	/**
	 * Returns the meta object for the '{@link hearthstone.Deck#ShowVersion() <em>Show Version</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Show Version</em>' operation.
	 * @see hearthstone.Deck#ShowVersion()
	 * @generated
	 */
	EOperation getDeck__ShowVersion();

	/**
	 * Returns the meta object for the '{@link hearthstone.Deck#ShowCardsInDeck() <em>Show Cards In Deck</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Show Cards In Deck</em>' operation.
	 * @see hearthstone.Deck#ShowCardsInDeck()
	 * @generated
	 */
	EOperation getDeck__ShowCardsInDeck();

	/**
	 * Returns the meta object for the '{@link hearthstone.Deck#FlushDeck() <em>Flush Deck</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Flush Deck</em>' operation.
	 * @see hearthstone.Deck#FlushDeck()
	 * @generated
	 */
	EOperation getDeck__FlushDeck();

	/**
	 * Returns the meta object for class '{@link hearthstone.Ability <em>Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ability</em>'.
	 * @see hearthstone.Ability
	 * @generated
	 */
	EClass getAbility();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.Ability#getAbilityID <em>Ability ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ability ID</em>'.
	 * @see hearthstone.Ability#getAbilityID()
	 * @see #getAbility()
	 * @generated
	 */
	EAttribute getAbility_AbilityID();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.Ability#getAbilityType <em>Ability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ability Type</em>'.
	 * @see hearthstone.Ability#getAbilityType()
	 * @see #getAbility()
	 * @generated
	 */
	EAttribute getAbility_AbilityType();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.Ability#getAbilityAffect <em>Ability Affect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ability Affect</em>'.
	 * @see hearthstone.Ability#getAbilityAffect()
	 * @see #getAbility()
	 * @generated
	 */
	EAttribute getAbility_AbilityAffect();

	/**
	 * Returns the meta object for the containment reference list '{@link hearthstone.Ability#getCardHasAbility <em>Card Has Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Card Has Ability</em>'.
	 * @see hearthstone.Ability#getCardHasAbility()
	 * @see #getAbility()
	 * @generated
	 */
	EReference getAbility_CardHasAbility();

	/**
	 * Returns the meta object for the '{@link hearthstone.Ability#Charge() <em>Charge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Charge</em>' operation.
	 * @see hearthstone.Ability#Charge()
	 * @generated
	 */
	EOperation getAbility__Charge();

	/**
	 * Returns the meta object for the '{@link hearthstone.Ability#IncreaseAttribute() <em>Increase Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Increase Attribute</em>' operation.
	 * @see hearthstone.Ability#IncreaseAttribute()
	 * @generated
	 */
	EOperation getAbility__IncreaseAttribute();

	/**
	 * Returns the meta object for class '{@link hearthstone.GamePlayerHand <em>Game Player Hand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Player Hand</em>'.
	 * @see hearthstone.GamePlayerHand
	 * @generated
	 */
	EClass getGamePlayerHand();

	/**
	 * Returns the meta object for the containment reference list '{@link hearthstone.GamePlayerHand#getCardsInHand <em>Cards In Hand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cards In Hand</em>'.
	 * @see hearthstone.GamePlayerHand#getCardsInHand()
	 * @see #getGamePlayerHand()
	 * @generated
	 */
	EReference getGamePlayerHand_CardsInHand();

	/**
	 * Returns the meta object for the container reference '{@link hearthstone.GamePlayerHand#getHandsBelongToPlayer <em>Hands Belong To Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Hands Belong To Player</em>'.
	 * @see hearthstone.GamePlayerHand#getHandsBelongToPlayer()
	 * @see #getGamePlayerHand()
	 * @generated
	 */
	EReference getGamePlayerHand_HandsBelongToPlayer();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.GamePlayerHand#getHandOwner <em>Hand Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hand Owner</em>'.
	 * @see hearthstone.GamePlayerHand#getHandOwner()
	 * @see #getGamePlayerHand()
	 * @generated
	 */
	EAttribute getGamePlayerHand_HandOwner();

	/**
	 * Returns the meta object for the '{@link hearthstone.GamePlayerHand#ShowGameHand() <em>Show Game Hand</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Show Game Hand</em>' operation.
	 * @see hearthstone.GamePlayerHand#ShowGameHand()
	 * @generated
	 */
	EOperation getGamePlayerHand__ShowGameHand();

	/**
	 * Returns the meta object for class '{@link hearthstone.GameBoard <em>Game Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Board</em>'.
	 * @see hearthstone.GameBoard
	 * @generated
	 */
	EClass getGameBoard();

	/**
	 * Returns the meta object for the containment reference list '{@link hearthstone.GameBoard#getGameBoardHasPlayerBoard <em>Game Board Has Player Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Game Board Has Player Board</em>'.
	 * @see hearthstone.GameBoard#getGameBoardHasPlayerBoard()
	 * @see #getGameBoard()
	 * @generated
	 */
	EReference getGameBoard_GameBoardHasPlayerBoard();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.GameBoard#getBoardSN <em>Board SN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Board SN</em>'.
	 * @see hearthstone.GameBoard#getBoardSN()
	 * @see #getGameBoard()
	 * @generated
	 */
	EAttribute getGameBoard_BoardSN();

	/**
	 * Returns the meta object for class '{@link hearthstone.GameDeck <em>Game Deck</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Deck</em>'.
	 * @see hearthstone.GameDeck
	 * @generated
	 */
	EClass getGameDeck();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.GameDeck#getDeckOwner <em>Deck Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deck Owner</em>'.
	 * @see hearthstone.GameDeck#getDeckOwner()
	 * @see #getGameDeck()
	 * @generated
	 */
	EAttribute getGameDeck_DeckOwner();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.GameDeck#getGameStartDeckCards <em>Game Start Deck Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Game Start Deck Cards</em>'.
	 * @see hearthstone.GameDeck#getGameStartDeckCards()
	 * @see #getGameDeck()
	 * @generated
	 */
	EAttribute getGameDeck_GameStartDeckCards();

	/**
	 * Returns the meta object for the reference '{@link hearthstone.GameDeck#getGameDeckBelongToCardLibrary <em>Game Deck Belong To Card Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Game Deck Belong To Card Library</em>'.
	 * @see hearthstone.GameDeck#getGameDeckBelongToCardLibrary()
	 * @see #getGameDeck()
	 * @generated
	 */
	EReference getGameDeck_GameDeckBelongToCardLibrary();

	/**
	 * Returns the meta object for the '{@link hearthstone.GameDeck#RemoveCard(int) <em>Remove Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Card</em>' operation.
	 * @see hearthstone.GameDeck#RemoveCard(int)
	 * @generated
	 */
	EOperation getGameDeck__RemoveCard__int();

	/**
	 * Returns the meta object for the '{@link hearthstone.GameDeck#ReturnCard(int) <em>Return Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Return Card</em>' operation.
	 * @see hearthstone.GameDeck#ReturnCard(int)
	 * @generated
	 */
	EOperation getGameDeck__ReturnCard__int();

	/**
	 * Returns the meta object for the '{@link hearthstone.GameDeck#ShowGameDeck() <em>Show Game Deck</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Show Game Deck</em>' operation.
	 * @see hearthstone.GameDeck#ShowGameDeck()
	 * @generated
	 */
	EOperation getGameDeck__ShowGameDeck();

	/**
	 * Returns the meta object for the '{@link hearthstone.GameDeck#ShowGameStartDeckCards() <em>Show Game Start Deck Cards</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Show Game Start Deck Cards</em>' operation.
	 * @see hearthstone.GameDeck#ShowGameStartDeckCards()
	 * @generated
	 */
	EOperation getGameDeck__ShowGameStartDeckCards();

	/**
	 * Returns the meta object for the '{@link hearthstone.GameDeck#GenerateRandomGameDeck() <em>Generate Random Game Deck</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Random Game Deck</em>' operation.
	 * @see hearthstone.GameDeck#GenerateRandomGameDeck()
	 * @generated
	 */
	EOperation getGameDeck__GenerateRandomGameDeck();

	/**
	 * Returns the meta object for class '{@link hearthstone.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see hearthstone.Game
	 * @generated
	 */
	EClass getGame();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.Game#getGameSN <em>Game SN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Game SN</em>'.
	 * @see hearthstone.Game#getGameSN()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_GameSN();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.Game#getGameStates <em>Game States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Game States</em>'.
	 * @see hearthstone.Game#getGameStates()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_GameStates();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.Game#getGameID <em>Game ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Game ID</em>'.
	 * @see hearthstone.Game#getGameID()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_GameID();

	/**
	 * Returns the meta object for the reference '{@link hearthstone.Game#getGameHasGameRule <em>Game Has Game Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Game Has Game Rule</em>'.
	 * @see hearthstone.Game#getGameHasGameRule()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_GameHasGameRule();

	/**
	 * Returns the meta object for the container reference '{@link hearthstone.Game#getGameInGamePool <em>Game In Game Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Game In Game Pool</em>'.
	 * @see hearthstone.Game#getGameInGamePool()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_GameInGamePool();

	/**
	 * Returns the meta object for the '{@link hearthstone.Game#ShowGameInDetail() <em>Show Game In Detail</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Show Game In Detail</em>' operation.
	 * @see hearthstone.Game#ShowGameInDetail()
	 * @generated
	 */
	EOperation getGame__ShowGameInDetail();

	/**
	 * Returns the meta object for the '{@link hearthstone.Game#CheckGameStates() <em>Check Game States</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Game States</em>' operation.
	 * @see hearthstone.Game#CheckGameStates()
	 * @generated
	 */
	EOperation getGame__CheckGameStates();

	/**
	 * Returns the meta object for the '{@link hearthstone.Game#ShowPlayerGameBoard() <em>Show Player Game Board</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Show Player Game Board</em>' operation.
	 * @see hearthstone.Game#ShowPlayerGameBoard()
	 * @generated
	 */
	EOperation getGame__ShowPlayerGameBoard();

	/**
	 * Returns the meta object for the '{@link hearthstone.Game#InitializeGame() <em>Initialize Game</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialize Game</em>' operation.
	 * @see hearthstone.Game#InitializeGame()
	 * @generated
	 */
	EOperation getGame__InitializeGame();

	/**
	 * Returns the meta object for the '{@link hearthstone.Game#SetGameBoard() <em>Set Game Board</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Game Board</em>' operation.
	 * @see hearthstone.Game#SetGameBoard()
	 * @generated
	 */
	EOperation getGame__SetGameBoard();

	/**
	 * Returns the meta object for the '{@link hearthstone.Game#SetGamePlayer() <em>Set Game Player</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Game Player</em>' operation.
	 * @see hearthstone.Game#SetGamePlayer()
	 * @generated
	 */
	EOperation getGame__SetGamePlayer();

	/**
	 * Returns the meta object for the '{@link hearthstone.Game#SetPlayerHand() <em>Set Player Hand</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Player Hand</em>' operation.
	 * @see hearthstone.Game#SetPlayerHand()
	 * @generated
	 */
	EOperation getGame__SetPlayerHand();

	/**
	 * Returns the meta object for the '{@link hearthstone.Game#SetGameRule() <em>Set Game Rule</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Game Rule</em>' operation.
	 * @see hearthstone.Game#SetGameRule()
	 * @generated
	 */
	EOperation getGame__SetGameRule();

	/**
	 * Returns the meta object for the '{@link hearthstone.Game#SetPlayerDeck() <em>Set Player Deck</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Player Deck</em>' operation.
	 * @see hearthstone.Game#SetPlayerDeck()
	 * @generated
	 */
	EOperation getGame__SetPlayerDeck();

	/**
	 * Returns the meta object for class '{@link hearthstone.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see hearthstone.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.Player#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hearthstone.Player#getName()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Name();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.Player#getTotalWins <em>Total Wins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Wins</em>'.
	 * @see hearthstone.Player#getTotalWins()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_TotalWins();

	/**
	 * Returns the meta object for the containment reference '{@link hearthstone.Player#getPlayerHasDeck <em>Player Has Deck</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Player Has Deck</em>'.
	 * @see hearthstone.Player#getPlayerHasDeck()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_PlayerHasDeck();

	/**
	 * Returns the meta object for the containment reference '{@link hearthstone.Player#getPlayerHasHand <em>Player Has Hand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Player Has Hand</em>'.
	 * @see hearthstone.Player#getPlayerHasHand()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_PlayerHasHand();

	/**
	 * Returns the meta object for the containment reference '{@link hearthstone.Player#getPlayerHasOwnBoard <em>Player Has Own Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Player Has Own Board</em>'.
	 * @see hearthstone.Player#getPlayerHasOwnBoard()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_PlayerHasOwnBoard();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.Player#getPlayerID <em>Player ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Player ID</em>'.
	 * @see hearthstone.Player#getPlayerID()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_PlayerID();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.Player#getLastLogin <em>Last Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Login</em>'.
	 * @see hearthstone.Player#getLastLogin()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_LastLogin();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.Player#getPlayerLevel <em>Player Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Player Level</em>'.
	 * @see hearthstone.Player#getPlayerLevel()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_PlayerLevel();

	/**
	 * Returns the meta object for the containment reference '{@link hearthstone.Player#getPlayerHasGameStartDeck <em>Player Has Game Start Deck</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Player Has Game Start Deck</em>'.
	 * @see hearthstone.Player#getPlayerHasGameStartDeck()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_PlayerHasGameStartDeck();

	/**
	 * Returns the meta object for the containment reference list '{@link hearthstone.Player#getPlayerHasDeckSet <em>Player Has Deck Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Player Has Deck Set</em>'.
	 * @see hearthstone.Player#getPlayerHasDeckSet()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_PlayerHasDeckSet();

	/**
	 * Returns the meta object for the reference '{@link hearthstone.Player#getPlayerHasCardCollection <em>Player Has Card Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Player Has Card Collection</em>'.
	 * @see hearthstone.Player#getPlayerHasCardCollection()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_PlayerHasCardCollection();

	/**
	 * Returns the meta object for the '{@link hearthstone.Player#PlayCard(int) <em>Play Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Play Card</em>' operation.
	 * @see hearthstone.Player#PlayCard(int)
	 * @generated
	 */
	EOperation getPlayer__PlayCard__int();

	/**
	 * Returns the meta object for the '{@link hearthstone.Player#OperateCard(hearthstone.Card) <em>Operate Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Operate Card</em>' operation.
	 * @see hearthstone.Player#OperateCard(hearthstone.Card)
	 * @generated
	 */
	EOperation getPlayer__OperateCard__Card();

	/**
	 * Returns the meta object for the '{@link hearthstone.Player#ClickNextTurnBtn() <em>Click Next Turn Btn</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Click Next Turn Btn</em>' operation.
	 * @see hearthstone.Player#ClickNextTurnBtn()
	 * @generated
	 */
	EOperation getPlayer__ClickNextTurnBtn();

	/**
	 * Returns the meta object for the '{@link hearthstone.Player#DrawCard() <em>Draw Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Draw Card</em>' operation.
	 * @see hearthstone.Player#DrawCard()
	 * @generated
	 */
	EOperation getPlayer__DrawCard();

	/**
	 * Returns the meta object for the '{@link hearthstone.Player#OperateCard(hearthstone.Hero) <em>Operate Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Operate Card</em>' operation.
	 * @see hearthstone.Player#OperateCard(hearthstone.Hero)
	 * @generated
	 */
	EOperation getPlayer__OperateCard__Hero();

	/**
	 * Returns the meta object for class '{@link hearthstone.PlayerBoard <em>Player Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player Board</em>'.
	 * @see hearthstone.PlayerBoard
	 * @generated
	 */
	EClass getPlayerBoard();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.PlayerBoard#getBoardOwner <em>Board Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Board Owner</em>'.
	 * @see hearthstone.PlayerBoard#getBoardOwner()
	 * @see #getPlayerBoard()
	 * @generated
	 */
	EAttribute getPlayerBoard_BoardOwner();

	/**
	 * Returns the meta object for the '{@link hearthstone.PlayerBoard#ShowPlayerBoard() <em>Show Player Board</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Show Player Board</em>' operation.
	 * @see hearthstone.PlayerBoard#ShowPlayerBoard()
	 * @generated
	 */
	EOperation getPlayerBoard__ShowPlayerBoard();

	/**
	 * Returns the meta object for class '{@link hearthstone.Hero <em>Hero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hero</em>'.
	 * @see hearthstone.Hero
	 * @generated
	 */
	EClass getHero();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.Hero#getHeroClass <em>Hero Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hero Class</em>'.
	 * @see hearthstone.Hero#getHeroClass()
	 * @see #getHero()
	 * @generated
	 */
	EAttribute getHero_HeroClass();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.Hero#getHeroHealth <em>Hero Health</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hero Health</em>'.
	 * @see hearthstone.Hero#getHeroHealth()
	 * @see #getHero()
	 * @generated
	 */
	EAttribute getHero_HeroHealth();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.Hero#getHeroStates <em>Hero States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hero States</em>'.
	 * @see hearthstone.Hero#getHeroStates()
	 * @see #getHero()
	 * @generated
	 */
	EAttribute getHero_HeroStates();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.Hero#getHeroAbility <em>Hero Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hero Ability</em>'.
	 * @see hearthstone.Hero#getHeroAbility()
	 * @see #getHero()
	 * @generated
	 */
	EAttribute getHero_HeroAbility();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.Hero#getHeroDesc <em>Hero Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hero Desc</em>'.
	 * @see hearthstone.Hero#getHeroDesc()
	 * @see #getHero()
	 * @generated
	 */
	EAttribute getHero_HeroDesc();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.Hero#getHeroPower <em>Hero Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hero Power</em>'.
	 * @see hearthstone.Hero#getHeroPower()
	 * @see #getHero()
	 * @generated
	 */
	EAttribute getHero_HeroPower();

	/**
	 * Returns the meta object for class '{@link hearthstone.GamePool <em>Game Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Pool</em>'.
	 * @see hearthstone.GamePool
	 * @generated
	 */
	EClass getGamePool();

	/**
	 * Returns the meta object for the containment reference list '{@link hearthstone.GamePool#getGamePoolHasGames <em>Game Pool Has Games</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Game Pool Has Games</em>'.
	 * @see hearthstone.GamePool#getGamePoolHasGames()
	 * @see #getGamePool()
	 * @generated
	 */
	EReference getGamePool_GamePoolHasGames();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.GamePool#getGamePoolDesc <em>Game Pool Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Game Pool Desc</em>'.
	 * @see hearthstone.GamePool#getGamePoolDesc()
	 * @see #getGamePool()
	 * @generated
	 */
	EAttribute getGamePool_GamePoolDesc();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.GamePool#getGamePoolStartDate <em>Game Pool Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Game Pool Start Date</em>'.
	 * @see hearthstone.GamePool#getGamePoolStartDate()
	 * @see #getGamePool()
	 * @generated
	 */
	EAttribute getGamePool_GamePoolStartDate();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.GamePool#getGamePoolRegion <em>Game Pool Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Game Pool Region</em>'.
	 * @see hearthstone.GamePool#getGamePoolRegion()
	 * @see #getGamePool()
	 * @generated
	 */
	EAttribute getGamePool_GamePoolRegion();

	/**
	 * Returns the meta object for the reference '{@link hearthstone.GamePool#getGamePoolHasCardLibrary <em>Game Pool Has Card Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Game Pool Has Card Library</em>'.
	 * @see hearthstone.GamePool#getGamePoolHasCardLibrary()
	 * @see #getGamePool()
	 * @generated
	 */
	EReference getGamePool_GamePoolHasCardLibrary();

	/**
	 * Returns the meta object for the '{@link hearthstone.GamePool#ShowAllGames() <em>Show All Games</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Show All Games</em>' operation.
	 * @see hearthstone.GamePool#ShowAllGames()
	 * @generated
	 */
	EOperation getGamePool__ShowAllGames();

	/**
	 * Returns the meta object for the '{@link hearthstone.GamePool#CreateGame() <em>Create Game</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Game</em>' operation.
	 * @see hearthstone.GamePool#CreateGame()
	 * @generated
	 */
	EOperation getGamePool__CreateGame();

	/**
	 * Returns the meta object for the '{@link hearthstone.GamePool#HaltGame() <em>Halt Game</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Halt Game</em>' operation.
	 * @see hearthstone.GamePool#HaltGame()
	 * @generated
	 */
	EOperation getGamePool__HaltGame();

	/**
	 * Returns the meta object for the '{@link hearthstone.GamePool#ShowGamePoolStates() <em>Show Game Pool States</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Show Game Pool States</em>' operation.
	 * @see hearthstone.GamePool#ShowGamePoolStates()
	 * @generated
	 */
	EOperation getGamePool__ShowGamePoolStates();

	/**
	 * Returns the meta object for the '{@link hearthstone.GamePool#Initialize() <em>Initialize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialize</em>' operation.
	 * @see hearthstone.GamePool#Initialize()
	 * @generated
	 */
	EOperation getGamePool__Initialize();

	/**
	 * Returns the meta object for class '{@link hearthstone.CardCollection <em>Card Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card Collection</em>'.
	 * @see hearthstone.CardCollection
	 * @generated
	 */
	EClass getCardCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link hearthstone.CardCollection#getCollectionHasCards <em>Collection Has Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collection Has Cards</em>'.
	 * @see hearthstone.CardCollection#getCollectionHasCards()
	 * @see #getCardCollection()
	 * @generated
	 */
	EReference getCardCollection_CollectionHasCards();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.CardCollection#getCollectionID <em>Collection ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection ID</em>'.
	 * @see hearthstone.CardCollection#getCollectionID()
	 * @see #getCardCollection()
	 * @generated
	 */
	EAttribute getCardCollection_CollectionID();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.CardCollection#getCollectionOwner <em>Collection Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Owner</em>'.
	 * @see hearthstone.CardCollection#getCollectionOwner()
	 * @see #getCardCollection()
	 * @generated
	 */
	EAttribute getCardCollection_CollectionOwner();

	/**
	 * Returns the meta object for the '{@link hearthstone.CardCollection#ShowCollection() <em>Show Collection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Show Collection</em>' operation.
	 * @see hearthstone.CardCollection#ShowCollection()
	 * @generated
	 */
	EOperation getCardCollection__ShowCollection();

	/**
	 * Returns the meta object for class '{@link hearthstone.GameRule <em>Game Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Rule</em>'.
	 * @see hearthstone.GameRule
	 * @generated
	 */
	EClass getGameRule();

	/**
	 * Returns the meta object for the containment reference list '{@link hearthstone.GameRule#getGameHasPlayers <em>Game Has Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Game Has Players</em>'.
	 * @see hearthstone.GameRule#getGameHasPlayers()
	 * @see #getGameRule()
	 * @generated
	 */
	EReference getGameRule_GameHasPlayers();

	/**
	 * Returns the meta object for the containment reference '{@link hearthstone.GameRule#getGameHasBoard <em>Game Has Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Game Has Board</em>'.
	 * @see hearthstone.GameRule#getGameHasBoard()
	 * @see #getGameRule()
	 * @generated
	 */
	EReference getGameRule_GameHasBoard();

	/**
	 * Returns the meta object for the reference '{@link hearthstone.GameRule#getGameHasGameRule <em>Game Has Game Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Game Has Game Rule</em>'.
	 * @see hearthstone.GameRule#getGameHasGameRule()
	 * @see #getGameRule()
	 * @generated
	 */
	EReference getGameRule_GameHasGameRule();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.GameRule#getGameRuleDesc <em>Game Rule Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Game Rule Desc</em>'.
	 * @see hearthstone.GameRule#getGameRuleDesc()
	 * @see #getGameRule()
	 * @generated
	 */
	EAttribute getGameRule_GameRuleDesc();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.GameRule#getGameRuleType <em>Game Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Game Rule Type</em>'.
	 * @see hearthstone.GameRule#getGameRuleType()
	 * @see #getGameRule()
	 * @generated
	 */
	EAttribute getGameRule_GameRuleType();

	/**
	 * Returns the meta object for class '{@link hearthstone.GameSetter <em>Game Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Setter</em>'.
	 * @see hearthstone.GameSetter
	 * @generated
	 */
	EClass getGameSetter();

	/**
	 * Returns the meta object for class '{@link hearthstone.CardLibrary <em>Card Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card Library</em>'.
	 * @see hearthstone.CardLibrary
	 * @generated
	 */
	EClass getCardLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link hearthstone.CardLibrary#getCardLibraryHasCards <em>Card Library Has Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Card Library Has Cards</em>'.
	 * @see hearthstone.CardLibrary#getCardLibraryHasCards()
	 * @see #getCardLibrary()
	 * @generated
	 */
	EReference getCardLibrary_CardLibraryHasCards();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.CardLibrary#getLibraryVersion <em>Library Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library Version</em>'.
	 * @see hearthstone.CardLibrary#getLibraryVersion()
	 * @see #getCardLibrary()
	 * @generated
	 */
	EAttribute getCardLibrary_LibraryVersion();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.CardLibrary#getLibraryType <em>Library Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library Type</em>'.
	 * @see hearthstone.CardLibrary#getLibraryType()
	 * @see #getCardLibrary()
	 * @generated
	 */
	EAttribute getCardLibrary_LibraryType();

	/**
	 * Returns the meta object for the attribute '{@link hearthstone.CardLibrary#getAllCardsPool <em>All Cards Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All Cards Pool</em>'.
	 * @see hearthstone.CardLibrary#getAllCardsPool()
	 * @see #getCardLibrary()
	 * @generated
	 */
	EAttribute getCardLibrary_AllCardsPool();

	/**
	 * Returns the meta object for the '{@link hearthstone.CardLibrary#LoadFromDb() <em>Load From Db</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load From Db</em>' operation.
	 * @see hearthstone.CardLibrary#LoadFromDb()
	 * @generated
	 */
	EOperation getCardLibrary__LoadFromDb();

	/**
	 * Returns the meta object for the '{@link hearthstone.CardLibrary#ShowCardLibrary() <em>Show Card Library</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Show Card Library</em>' operation.
	 * @see hearthstone.CardLibrary#ShowCardLibrary()
	 * @generated
	 */
	EOperation getCardLibrary__ShowCardLibrary();

	/**
	 * Returns the meta object for enum '{@link hearthstone.CardQuality <em>Card Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Card Quality</em>'.
	 * @see hearthstone.CardQuality
	 * @generated
	 */
	EEnum getCardQuality();

	/**
	 * Returns the meta object for enum '{@link hearthstone.CardRace <em>Card Race</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Card Race</em>'.
	 * @see hearthstone.CardRace
	 * @generated
	 */
	EEnum getCardRace();

	/**
	 * Returns the meta object for enum '{@link hearthstone.HeroClass <em>Hero Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hero Class</em>'.
	 * @see hearthstone.HeroClass
	 * @generated
	 */
	EEnum getHeroClass();

	/**
	 * Returns the meta object for enum '{@link hearthstone.CardStates <em>Card States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Card States</em>'.
	 * @see hearthstone.CardStates
	 * @generated
	 */
	EEnum getCardStates();

	/**
	 * Returns the meta object for enum '{@link hearthstone.HeroStates <em>Hero States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hero States</em>'.
	 * @see hearthstone.HeroStates
	 * @generated
	 */
	EEnum getHeroStates();

	/**
	 * Returns the meta object for enum '{@link hearthstone.GameStates <em>Game States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Game States</em>'.
	 * @see hearthstone.GameStates
	 * @generated
	 */
	EEnum getGameStates();

	/**
	 * Returns the meta object for enum '{@link hearthstone.GameType <em>Game Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Game Type</em>'.
	 * @see hearthstone.GameType
	 * @generated
	 */
	EEnum getGameType();

	/**
	 * Returns the meta object for enum '{@link hearthstone.HeroAbility <em>Hero Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hero Ability</em>'.
	 * @see hearthstone.HeroAbility
	 * @generated
	 */
	EEnum getHeroAbility();

	/**
	 * Returns the meta object for enum '{@link hearthstone.GameRegion <em>Game Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Game Region</em>'.
	 * @see hearthstone.GameRegion
	 * @generated
	 */
	EEnum getGameRegion();

	/**
	 * Returns the meta object for enum '{@link hearthstone.CardLibraryType <em>Card Library Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Card Library Type</em>'.
	 * @see hearthstone.CardLibraryType
	 * @generated
	 */
	EEnum getCardLibraryType();

	/**
	 * Returns the meta object for data type '{@link hearthstone.Ability <em>Abilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Abilities</em>'.
	 * @see hearthstone.Ability
	 * @model instanceClass="hearthstone.Ability"
	 * @generated
	 */
	EDataType getAbilities();

	/**
	 * Returns the meta object for data type '{@link hearthstone.util.AllCards <em>All Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>All Cards</em>'.
	 * @see hearthstone.util.AllCards
	 * @model instanceClass="hearthstone.util.AllCards"
	 * @generated
	 */
	EDataType getAllCards();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HearthstoneFactory getHearthstoneFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hearthstone.impl.CardImpl <em>Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hearthstone.impl.CardImpl
		 * @see hearthstone.impl.HearthstonePackageImpl#getCard()
		 * @generated
		 */
		EClass CARD = eINSTANCE.getCard();

		/**
		 * The meta object literal for the '<em><b>Card Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__CARD_NAME = eINSTANCE.getCard_CardName();

		/**
		 * The meta object literal for the '<em><b>Card Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__CARD_COST = eINSTANCE.getCard_CardCost();

		/**
		 * The meta object literal for the '<em><b>Card Life</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__CARD_LIFE = eINSTANCE.getCard_CardLife();

		/**
		 * The meta object literal for the '<em><b>Card Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__CARD_POWER = eINSTANCE.getCard_CardPower();

		/**
		 * The meta object literal for the '<em><b>Card Quality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__CARD_QUALITY = eINSTANCE.getCard_CardQuality();

		/**
		 * The meta object literal for the '<em><b>Card Number Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__CARD_NUMBER_LIMIT = eINSTANCE.getCard_CardNumberLimit();

		/**
		 * The meta object literal for the '<em><b>Card Race</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__CARD_RACE = eINSTANCE.getCard_CardRace();

		/**
		 * The meta object literal for the '<em><b>Card States</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__CARD_STATES = eINSTANCE.getCard_CardStates();

		/**
		 * The meta object literal for the '<em><b>Card Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__CARD_CLASS = eINSTANCE.getCard_CardClass();

		/**
		 * The meta object literal for the '<em><b>Card Has Abilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__CARD_HAS_ABILITIES = eINSTANCE.getCard_CardHasAbilities();

		/**
		 * The meta object literal for the '<em><b>Card SN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__CARD_SN = eINSTANCE.getCard_CardSN();

		/**
		 * The meta object literal for the '<em><b>Card Ability Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__CARD_ABILITY_DESC = eINSTANCE.getCard_CardAbilityDesc();

		/**
		 * The meta object literal for the '<em><b>Card Deck SN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__CARD_DECK_SN = eINSTANCE.getCard_CardDeckSN();

		/**
		 * The meta object literal for the '<em><b>Update Card States</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARD___UPDATE_CARD_STATES__INT = eINSTANCE.getCard__UpdateCardStates__int();

		/**
		 * The meta object literal for the '<em><b>Interact Another Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARD___INTERACT_ANOTHER_CARD__CARD = eINSTANCE.getCard__InteractAnotherCard__Card();

		/**
		 * The meta object literal for the '<em><b>Show Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARD___SHOW_CARD = eINSTANCE.getCard__ShowCard();

		/**
		 * The meta object literal for the '<em><b>Interact Oppo Hero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARD___INTERACT_OPPO_HERO__HERO = eINSTANCE.getCard__InteractOppoHero__Hero();

		/**
		 * The meta object literal for the '{@link hearthstone.impl.DeckImpl <em>Deck</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hearthstone.impl.DeckImpl
		 * @see hearthstone.impl.HearthstonePackageImpl#getDeck()
		 * @generated
		 */
		EClass DECK = eINSTANCE.getDeck();

		/**
		 * The meta object literal for the '<em><b>Deck ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECK__DECK_ID = eINSTANCE.getDeck_DeckID();

		/**
		 * The meta object literal for the '<em><b>Deck Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECK__DECK_NAME = eINSTANCE.getDeck_DeckName();

		/**
		 * The meta object literal for the '<em><b>Deck Has Cards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECK__DECK_HAS_CARDS = eINSTANCE.getDeck_DeckHasCards();

		/**
		 * The meta object literal for the '<em><b>Deck Has Hero</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECK__DECK_HAS_HERO = eINSTANCE.getDeck_DeckHasHero();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECK__EREFERENCE0 = eINSTANCE.getDeck_EReference0();

		/**
		 * The meta object literal for the '<em><b>Hello</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECK___HELLO = eINSTANCE.getDeck__Hello();

		/**
		 * The meta object literal for the '<em><b>Show Version</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECK___SHOW_VERSION = eINSTANCE.getDeck__ShowVersion();

		/**
		 * The meta object literal for the '<em><b>Show Cards In Deck</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECK___SHOW_CARDS_IN_DECK = eINSTANCE.getDeck__ShowCardsInDeck();

		/**
		 * The meta object literal for the '<em><b>Flush Deck</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECK___FLUSH_DECK = eINSTANCE.getDeck__FlushDeck();

		/**
		 * The meta object literal for the '{@link hearthstone.impl.AbilityImpl <em>Ability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hearthstone.impl.AbilityImpl
		 * @see hearthstone.impl.HearthstonePackageImpl#getAbility()
		 * @generated
		 */
		EClass ABILITY = eINSTANCE.getAbility();

		/**
		 * The meta object literal for the '<em><b>Ability ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABILITY__ABILITY_ID = eINSTANCE.getAbility_AbilityID();

		/**
		 * The meta object literal for the '<em><b>Ability Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABILITY__ABILITY_TYPE = eINSTANCE.getAbility_AbilityType();

		/**
		 * The meta object literal for the '<em><b>Ability Affect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABILITY__ABILITY_AFFECT = eINSTANCE.getAbility_AbilityAffect();

		/**
		 * The meta object literal for the '<em><b>Card Has Ability</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABILITY__CARD_HAS_ABILITY = eINSTANCE.getAbility_CardHasAbility();

		/**
		 * The meta object literal for the '<em><b>Charge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABILITY___CHARGE = eINSTANCE.getAbility__Charge();

		/**
		 * The meta object literal for the '<em><b>Increase Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABILITY___INCREASE_ATTRIBUTE = eINSTANCE.getAbility__IncreaseAttribute();

		/**
		 * The meta object literal for the '{@link hearthstone.impl.GamePlayerHandImpl <em>Game Player Hand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hearthstone.impl.GamePlayerHandImpl
		 * @see hearthstone.impl.HearthstonePackageImpl#getGamePlayerHand()
		 * @generated
		 */
		EClass GAME_PLAYER_HAND = eINSTANCE.getGamePlayerHand();

		/**
		 * The meta object literal for the '<em><b>Cards In Hand</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_PLAYER_HAND__CARDS_IN_HAND = eINSTANCE.getGamePlayerHand_CardsInHand();

		/**
		 * The meta object literal for the '<em><b>Hands Belong To Player</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_PLAYER_HAND__HANDS_BELONG_TO_PLAYER = eINSTANCE.getGamePlayerHand_HandsBelongToPlayer();

		/**
		 * The meta object literal for the '<em><b>Hand Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_PLAYER_HAND__HAND_OWNER = eINSTANCE.getGamePlayerHand_HandOwner();

		/**
		 * The meta object literal for the '<em><b>Show Game Hand</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_PLAYER_HAND___SHOW_GAME_HAND = eINSTANCE.getGamePlayerHand__ShowGameHand();

		/**
		 * The meta object literal for the '{@link hearthstone.impl.GameBoardImpl <em>Game Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hearthstone.impl.GameBoardImpl
		 * @see hearthstone.impl.HearthstonePackageImpl#getGameBoard()
		 * @generated
		 */
		EClass GAME_BOARD = eINSTANCE.getGameBoard();

		/**
		 * The meta object literal for the '<em><b>Game Board Has Player Board</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_BOARD__GAME_BOARD_HAS_PLAYER_BOARD = eINSTANCE.getGameBoard_GameBoardHasPlayerBoard();

		/**
		 * The meta object literal for the '<em><b>Board SN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_BOARD__BOARD_SN = eINSTANCE.getGameBoard_BoardSN();

		/**
		 * The meta object literal for the '{@link hearthstone.impl.GameDeckImpl <em>Game Deck</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hearthstone.impl.GameDeckImpl
		 * @see hearthstone.impl.HearthstonePackageImpl#getGameDeck()
		 * @generated
		 */
		EClass GAME_DECK = eINSTANCE.getGameDeck();

		/**
		 * The meta object literal for the '<em><b>Deck Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_DECK__DECK_OWNER = eINSTANCE.getGameDeck_DeckOwner();

		/**
		 * The meta object literal for the '<em><b>Game Start Deck Cards</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_DECK__GAME_START_DECK_CARDS = eINSTANCE.getGameDeck_GameStartDeckCards();

		/**
		 * The meta object literal for the '<em><b>Game Deck Belong To Card Library</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_DECK__GAME_DECK_BELONG_TO_CARD_LIBRARY = eINSTANCE.getGameDeck_GameDeckBelongToCardLibrary();

		/**
		 * The meta object literal for the '<em><b>Remove Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_DECK___REMOVE_CARD__INT = eINSTANCE.getGameDeck__RemoveCard__int();

		/**
		 * The meta object literal for the '<em><b>Return Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_DECK___RETURN_CARD__INT = eINSTANCE.getGameDeck__ReturnCard__int();

		/**
		 * The meta object literal for the '<em><b>Show Game Deck</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_DECK___SHOW_GAME_DECK = eINSTANCE.getGameDeck__ShowGameDeck();

		/**
		 * The meta object literal for the '<em><b>Show Game Start Deck Cards</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_DECK___SHOW_GAME_START_DECK_CARDS = eINSTANCE.getGameDeck__ShowGameStartDeckCards();

		/**
		 * The meta object literal for the '<em><b>Generate Random Game Deck</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_DECK___GENERATE_RANDOM_GAME_DECK = eINSTANCE.getGameDeck__GenerateRandomGameDeck();

		/**
		 * The meta object literal for the '{@link hearthstone.impl.GameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hearthstone.impl.GameImpl
		 * @see hearthstone.impl.HearthstonePackageImpl#getGame()
		 * @generated
		 */
		EClass GAME = eINSTANCE.getGame();

		/**
		 * The meta object literal for the '<em><b>Game SN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__GAME_SN = eINSTANCE.getGame_GameSN();

		/**
		 * The meta object literal for the '<em><b>Game States</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__GAME_STATES = eINSTANCE.getGame_GameStates();

		/**
		 * The meta object literal for the '<em><b>Game ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__GAME_ID = eINSTANCE.getGame_GameID();

		/**
		 * The meta object literal for the '<em><b>Game Has Game Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__GAME_HAS_GAME_RULE = eINSTANCE.getGame_GameHasGameRule();

		/**
		 * The meta object literal for the '<em><b>Game In Game Pool</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__GAME_IN_GAME_POOL = eINSTANCE.getGame_GameInGamePool();

		/**
		 * The meta object literal for the '<em><b>Show Game In Detail</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME___SHOW_GAME_IN_DETAIL = eINSTANCE.getGame__ShowGameInDetail();

		/**
		 * The meta object literal for the '<em><b>Check Game States</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME___CHECK_GAME_STATES = eINSTANCE.getGame__CheckGameStates();

		/**
		 * The meta object literal for the '<em><b>Show Player Game Board</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME___SHOW_PLAYER_GAME_BOARD = eINSTANCE.getGame__ShowPlayerGameBoard();

		/**
		 * The meta object literal for the '<em><b>Initialize Game</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME___INITIALIZE_GAME = eINSTANCE.getGame__InitializeGame();

		/**
		 * The meta object literal for the '<em><b>Set Game Board</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME___SET_GAME_BOARD = eINSTANCE.getGame__SetGameBoard();

		/**
		 * The meta object literal for the '<em><b>Set Game Player</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME___SET_GAME_PLAYER = eINSTANCE.getGame__SetGamePlayer();

		/**
		 * The meta object literal for the '<em><b>Set Player Hand</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME___SET_PLAYER_HAND = eINSTANCE.getGame__SetPlayerHand();

		/**
		 * The meta object literal for the '<em><b>Set Game Rule</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME___SET_GAME_RULE = eINSTANCE.getGame__SetGameRule();

		/**
		 * The meta object literal for the '<em><b>Set Player Deck</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME___SET_PLAYER_DECK = eINSTANCE.getGame__SetPlayerDeck();

		/**
		 * The meta object literal for the '{@link hearthstone.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hearthstone.impl.PlayerImpl
		 * @see hearthstone.impl.HearthstonePackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__NAME = eINSTANCE.getPlayer_Name();

		/**
		 * The meta object literal for the '<em><b>Total Wins</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__TOTAL_WINS = eINSTANCE.getPlayer_TotalWins();

		/**
		 * The meta object literal for the '<em><b>Player Has Deck</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__PLAYER_HAS_DECK = eINSTANCE.getPlayer_PlayerHasDeck();

		/**
		 * The meta object literal for the '<em><b>Player Has Hand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__PLAYER_HAS_HAND = eINSTANCE.getPlayer_PlayerHasHand();

		/**
		 * The meta object literal for the '<em><b>Player Has Own Board</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__PLAYER_HAS_OWN_BOARD = eINSTANCE.getPlayer_PlayerHasOwnBoard();

		/**
		 * The meta object literal for the '<em><b>Player ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__PLAYER_ID = eINSTANCE.getPlayer_PlayerID();

		/**
		 * The meta object literal for the '<em><b>Last Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__LAST_LOGIN = eINSTANCE.getPlayer_LastLogin();

		/**
		 * The meta object literal for the '<em><b>Player Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__PLAYER_LEVEL = eINSTANCE.getPlayer_PlayerLevel();

		/**
		 * The meta object literal for the '<em><b>Player Has Game Start Deck</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__PLAYER_HAS_GAME_START_DECK = eINSTANCE.getPlayer_PlayerHasGameStartDeck();

		/**
		 * The meta object literal for the '<em><b>Player Has Deck Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__PLAYER_HAS_DECK_SET = eINSTANCE.getPlayer_PlayerHasDeckSet();

		/**
		 * The meta object literal for the '<em><b>Player Has Card Collection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__PLAYER_HAS_CARD_COLLECTION = eINSTANCE.getPlayer_PlayerHasCardCollection();

		/**
		 * The meta object literal for the '<em><b>Play Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLAYER___PLAY_CARD__INT = eINSTANCE.getPlayer__PlayCard__int();

		/**
		 * The meta object literal for the '<em><b>Operate Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLAYER___OPERATE_CARD__CARD = eINSTANCE.getPlayer__OperateCard__Card();

		/**
		 * The meta object literal for the '<em><b>Click Next Turn Btn</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLAYER___CLICK_NEXT_TURN_BTN = eINSTANCE.getPlayer__ClickNextTurnBtn();

		/**
		 * The meta object literal for the '<em><b>Draw Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLAYER___DRAW_CARD = eINSTANCE.getPlayer__DrawCard();

		/**
		 * The meta object literal for the '<em><b>Operate Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLAYER___OPERATE_CARD__HERO = eINSTANCE.getPlayer__OperateCard__Hero();

		/**
		 * The meta object literal for the '{@link hearthstone.impl.PlayerBoardImpl <em>Player Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hearthstone.impl.PlayerBoardImpl
		 * @see hearthstone.impl.HearthstonePackageImpl#getPlayerBoard()
		 * @generated
		 */
		EClass PLAYER_BOARD = eINSTANCE.getPlayerBoard();

		/**
		 * The meta object literal for the '<em><b>Board Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_BOARD__BOARD_OWNER = eINSTANCE.getPlayerBoard_BoardOwner();

		/**
		 * The meta object literal for the '<em><b>Show Player Board</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLAYER_BOARD___SHOW_PLAYER_BOARD = eINSTANCE.getPlayerBoard__ShowPlayerBoard();

		/**
		 * The meta object literal for the '{@link hearthstone.impl.HeroImpl <em>Hero</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hearthstone.impl.HeroImpl
		 * @see hearthstone.impl.HearthstonePackageImpl#getHero()
		 * @generated
		 */
		EClass HERO = eINSTANCE.getHero();

		/**
		 * The meta object literal for the '<em><b>Hero Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HERO__HERO_CLASS = eINSTANCE.getHero_HeroClass();

		/**
		 * The meta object literal for the '<em><b>Hero Health</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HERO__HERO_HEALTH = eINSTANCE.getHero_HeroHealth();

		/**
		 * The meta object literal for the '<em><b>Hero States</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HERO__HERO_STATES = eINSTANCE.getHero_HeroStates();

		/**
		 * The meta object literal for the '<em><b>Hero Ability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HERO__HERO_ABILITY = eINSTANCE.getHero_HeroAbility();

		/**
		 * The meta object literal for the '<em><b>Hero Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HERO__HERO_DESC = eINSTANCE.getHero_HeroDesc();

		/**
		 * The meta object literal for the '<em><b>Hero Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HERO__HERO_POWER = eINSTANCE.getHero_HeroPower();

		/**
		 * The meta object literal for the '{@link hearthstone.impl.GamePoolImpl <em>Game Pool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hearthstone.impl.GamePoolImpl
		 * @see hearthstone.impl.HearthstonePackageImpl#getGamePool()
		 * @generated
		 */
		EClass GAME_POOL = eINSTANCE.getGamePool();

		/**
		 * The meta object literal for the '<em><b>Game Pool Has Games</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_POOL__GAME_POOL_HAS_GAMES = eINSTANCE.getGamePool_GamePoolHasGames();

		/**
		 * The meta object literal for the '<em><b>Game Pool Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_POOL__GAME_POOL_DESC = eINSTANCE.getGamePool_GamePoolDesc();

		/**
		 * The meta object literal for the '<em><b>Game Pool Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_POOL__GAME_POOL_START_DATE = eINSTANCE.getGamePool_GamePoolStartDate();

		/**
		 * The meta object literal for the '<em><b>Game Pool Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_POOL__GAME_POOL_REGION = eINSTANCE.getGamePool_GamePoolRegion();

		/**
		 * The meta object literal for the '<em><b>Game Pool Has Card Library</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_POOL__GAME_POOL_HAS_CARD_LIBRARY = eINSTANCE.getGamePool_GamePoolHasCardLibrary();

		/**
		 * The meta object literal for the '<em><b>Show All Games</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_POOL___SHOW_ALL_GAMES = eINSTANCE.getGamePool__ShowAllGames();

		/**
		 * The meta object literal for the '<em><b>Create Game</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_POOL___CREATE_GAME = eINSTANCE.getGamePool__CreateGame();

		/**
		 * The meta object literal for the '<em><b>Halt Game</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_POOL___HALT_GAME = eINSTANCE.getGamePool__HaltGame();

		/**
		 * The meta object literal for the '<em><b>Show Game Pool States</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_POOL___SHOW_GAME_POOL_STATES = eINSTANCE.getGamePool__ShowGamePoolStates();

		/**
		 * The meta object literal for the '<em><b>Initialize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_POOL___INITIALIZE = eINSTANCE.getGamePool__Initialize();

		/**
		 * The meta object literal for the '{@link hearthstone.impl.CardCollectionImpl <em>Card Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hearthstone.impl.CardCollectionImpl
		 * @see hearthstone.impl.HearthstonePackageImpl#getCardCollection()
		 * @generated
		 */
		EClass CARD_COLLECTION = eINSTANCE.getCardCollection();

		/**
		 * The meta object literal for the '<em><b>Collection Has Cards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_COLLECTION__COLLECTION_HAS_CARDS = eINSTANCE.getCardCollection_CollectionHasCards();

		/**
		 * The meta object literal for the '<em><b>Collection ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_COLLECTION__COLLECTION_ID = eINSTANCE.getCardCollection_CollectionID();

		/**
		 * The meta object literal for the '<em><b>Collection Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_COLLECTION__COLLECTION_OWNER = eINSTANCE.getCardCollection_CollectionOwner();

		/**
		 * The meta object literal for the '<em><b>Show Collection</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARD_COLLECTION___SHOW_COLLECTION = eINSTANCE.getCardCollection__ShowCollection();

		/**
		 * The meta object literal for the '{@link hearthstone.impl.GameRuleImpl <em>Game Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hearthstone.impl.GameRuleImpl
		 * @see hearthstone.impl.HearthstonePackageImpl#getGameRule()
		 * @generated
		 */
		EClass GAME_RULE = eINSTANCE.getGameRule();

		/**
		 * The meta object literal for the '<em><b>Game Has Players</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_RULE__GAME_HAS_PLAYERS = eINSTANCE.getGameRule_GameHasPlayers();

		/**
		 * The meta object literal for the '<em><b>Game Has Board</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_RULE__GAME_HAS_BOARD = eINSTANCE.getGameRule_GameHasBoard();

		/**
		 * The meta object literal for the '<em><b>Game Has Game Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_RULE__GAME_HAS_GAME_RULE = eINSTANCE.getGameRule_GameHasGameRule();

		/**
		 * The meta object literal for the '<em><b>Game Rule Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_RULE__GAME_RULE_DESC = eINSTANCE.getGameRule_GameRuleDesc();

		/**
		 * The meta object literal for the '<em><b>Game Rule Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_RULE__GAME_RULE_TYPE = eINSTANCE.getGameRule_GameRuleType();

		/**
		 * The meta object literal for the '{@link hearthstone.impl.GameSetterImpl <em>Game Setter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hearthstone.impl.GameSetterImpl
		 * @see hearthstone.impl.HearthstonePackageImpl#getGameSetter()
		 * @generated
		 */
		EClass GAME_SETTER = eINSTANCE.getGameSetter();

		/**
		 * The meta object literal for the '{@link hearthstone.impl.CardLibraryImpl <em>Card Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hearthstone.impl.CardLibraryImpl
		 * @see hearthstone.impl.HearthstonePackageImpl#getCardLibrary()
		 * @generated
		 */
		EClass CARD_LIBRARY = eINSTANCE.getCardLibrary();

		/**
		 * The meta object literal for the '<em><b>Card Library Has Cards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_LIBRARY__CARD_LIBRARY_HAS_CARDS = eINSTANCE.getCardLibrary_CardLibraryHasCards();

		/**
		 * The meta object literal for the '<em><b>Library Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_LIBRARY__LIBRARY_VERSION = eINSTANCE.getCardLibrary_LibraryVersion();

		/**
		 * The meta object literal for the '<em><b>Library Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_LIBRARY__LIBRARY_TYPE = eINSTANCE.getCardLibrary_LibraryType();

		/**
		 * The meta object literal for the '<em><b>All Cards Pool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_LIBRARY__ALL_CARDS_POOL = eINSTANCE.getCardLibrary_AllCardsPool();

		/**
		 * The meta object literal for the '<em><b>Load From Db</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARD_LIBRARY___LOAD_FROM_DB = eINSTANCE.getCardLibrary__LoadFromDb();

		/**
		 * The meta object literal for the '<em><b>Show Card Library</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARD_LIBRARY___SHOW_CARD_LIBRARY = eINSTANCE.getCardLibrary__ShowCardLibrary();

		/**
		 * The meta object literal for the '{@link hearthstone.CardQuality <em>Card Quality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hearthstone.CardQuality
		 * @see hearthstone.impl.HearthstonePackageImpl#getCardQuality()
		 * @generated
		 */
		EEnum CARD_QUALITY = eINSTANCE.getCardQuality();

		/**
		 * The meta object literal for the '{@link hearthstone.CardRace <em>Card Race</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hearthstone.CardRace
		 * @see hearthstone.impl.HearthstonePackageImpl#getCardRace()
		 * @generated
		 */
		EEnum CARD_RACE = eINSTANCE.getCardRace();

		/**
		 * The meta object literal for the '{@link hearthstone.HeroClass <em>Hero Class</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hearthstone.HeroClass
		 * @see hearthstone.impl.HearthstonePackageImpl#getHeroClass()
		 * @generated
		 */
		EEnum HERO_CLASS = eINSTANCE.getHeroClass();

		/**
		 * The meta object literal for the '{@link hearthstone.CardStates <em>Card States</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hearthstone.CardStates
		 * @see hearthstone.impl.HearthstonePackageImpl#getCardStates()
		 * @generated
		 */
		EEnum CARD_STATES = eINSTANCE.getCardStates();

		/**
		 * The meta object literal for the '{@link hearthstone.HeroStates <em>Hero States</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hearthstone.HeroStates
		 * @see hearthstone.impl.HearthstonePackageImpl#getHeroStates()
		 * @generated
		 */
		EEnum HERO_STATES = eINSTANCE.getHeroStates();

		/**
		 * The meta object literal for the '{@link hearthstone.GameStates <em>Game States</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hearthstone.GameStates
		 * @see hearthstone.impl.HearthstonePackageImpl#getGameStates()
		 * @generated
		 */
		EEnum GAME_STATES = eINSTANCE.getGameStates();

		/**
		 * The meta object literal for the '{@link hearthstone.GameType <em>Game Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hearthstone.GameType
		 * @see hearthstone.impl.HearthstonePackageImpl#getGameType()
		 * @generated
		 */
		EEnum GAME_TYPE = eINSTANCE.getGameType();

		/**
		 * The meta object literal for the '{@link hearthstone.HeroAbility <em>Hero Ability</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hearthstone.HeroAbility
		 * @see hearthstone.impl.HearthstonePackageImpl#getHeroAbility()
		 * @generated
		 */
		EEnum HERO_ABILITY = eINSTANCE.getHeroAbility();

		/**
		 * The meta object literal for the '{@link hearthstone.GameRegion <em>Game Region</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hearthstone.GameRegion
		 * @see hearthstone.impl.HearthstonePackageImpl#getGameRegion()
		 * @generated
		 */
		EEnum GAME_REGION = eINSTANCE.getGameRegion();

		/**
		 * The meta object literal for the '{@link hearthstone.CardLibraryType <em>Card Library Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hearthstone.CardLibraryType
		 * @see hearthstone.impl.HearthstonePackageImpl#getCardLibraryType()
		 * @generated
		 */
		EEnum CARD_LIBRARY_TYPE = eINSTANCE.getCardLibraryType();

		/**
		 * The meta object literal for the '<em>Abilities</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hearthstone.Ability
		 * @see hearthstone.impl.HearthstonePackageImpl#getAbilities()
		 * @generated
		 */
		EDataType ABILITIES = eINSTANCE.getAbilities();

		/**
		 * The meta object literal for the '<em>All Cards</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hearthstone.util.AllCards
		 * @see hearthstone.impl.HearthstonePackageImpl#getAllCards()
		 * @generated
		 */
		EDataType ALL_CARDS = eINSTANCE.getAllCards();

	}

} //HearthstonePackage
