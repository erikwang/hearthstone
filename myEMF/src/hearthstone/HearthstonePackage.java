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
	 * The feature id for the '<em><b>Card Ability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__CARD_ABILITY = 8;

	/**
	 * The feature id for the '<em><b>Card Ability List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__CARD_ABILITY_LIST = 9;

	/**
	 * The feature id for the '<em><b>Card Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__CARD_CLASS = 10;

	/**
	 * The number of structural features of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FEATURE_COUNT = 11;

	/**
	 * The operation id for the '<em>Play Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD___PLAY_CARD = 0;

	/**
	 * The number of operations of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_OPERATION_COUNT = 1;

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
	 * The feature id for the '<em><b>Deck ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK__DECK_ID = 0;

	/**
	 * The feature id for the '<em><b>Deck Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK__DECK_NAME = 1;

	/**
	 * The feature id for the '<em><b>Deck Has Cards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK__DECK_HAS_CARDS = 2;

	/**
	 * The number of structural features of the '<em>Deck</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Hello</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK___HELLO = 0;

	/**
	 * The number of operations of the '<em>Deck</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK_OPERATION_COUNT = 1;

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
	 * The feature id for the '<em><b>Card Has Ability</b></em>' reference list.
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
	 * The operation id for the '<em>Return To Hand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY___RETURN_TO_HAND = 2;

	/**
	 * The operation id for the '<em>Give Shield</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY___GIVE_SHIELD = 3;

	/**
	 * The operation id for the '<em>Summon</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY___SUMMON = 4;

	/**
	 * The operation id for the '<em>Deal Damage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY___DEAL_DAMAGE = 5;

	/**
	 * The number of operations of the '<em>Ability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link hearthstone.CardQuality <em>Card Quality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hearthstone.CardQuality
	 * @see hearthstone.impl.HearthstonePackageImpl#getCardQuality()
	 * @generated
	 */
	int CARD_QUALITY = 3;

	/**
	 * The meta object id for the '{@link hearthstone.CardRace <em>Card Race</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hearthstone.CardRace
	 * @see hearthstone.impl.HearthstonePackageImpl#getCardRace()
	 * @generated
	 */
	int CARD_RACE = 4;

	/**
	 * The meta object id for the '{@link hearthstone.Class <em>Class</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hearthstone.Class
	 * @see hearthstone.impl.HearthstonePackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 5;

	/**
	 * The meta object id for the '<em>Abilities</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hearthstone.Ability
	 * @see hearthstone.impl.HearthstonePackageImpl#getAbilities()
	 * @generated
	 */
	int ABILITIES = 6;

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
	 * Returns the meta object for the attribute '{@link hearthstone.Card#getCardAbility <em>Card Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Ability</em>'.
	 * @see hearthstone.Card#getCardAbility()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_CardAbility();

	/**
	 * Returns the meta object for the attribute list '{@link hearthstone.Card#getCardAbilityList <em>Card Ability List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Card Ability List</em>'.
	 * @see hearthstone.Card#getCardAbilityList()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_CardAbilityList();

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
	 * Returns the meta object for the '{@link hearthstone.Card#PlayCard() <em>Play Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Play Card</em>' operation.
	 * @see hearthstone.Card#PlayCard()
	 * @generated
	 */
	EOperation getCard__PlayCard();

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
	 * Returns the meta object for the '{@link hearthstone.Deck#Hello() <em>Hello</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Hello</em>' operation.
	 * @see hearthstone.Deck#Hello()
	 * @generated
	 */
	EOperation getDeck__Hello();

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
	 * Returns the meta object for the reference list '{@link hearthstone.Ability#getCardHasAbility <em>Card Has Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Card Has Ability</em>'.
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
	 * Returns the meta object for the '{@link hearthstone.Ability#ReturnToHand() <em>Return To Hand</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Return To Hand</em>' operation.
	 * @see hearthstone.Ability#ReturnToHand()
	 * @generated
	 */
	EOperation getAbility__ReturnToHand();

	/**
	 * Returns the meta object for the '{@link hearthstone.Ability#GiveShield() <em>Give Shield</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Give Shield</em>' operation.
	 * @see hearthstone.Ability#GiveShield()
	 * @generated
	 */
	EOperation getAbility__GiveShield();

	/**
	 * Returns the meta object for the '{@link hearthstone.Ability#Summon() <em>Summon</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Summon</em>' operation.
	 * @see hearthstone.Ability#Summon()
	 * @generated
	 */
	EOperation getAbility__Summon();

	/**
	 * Returns the meta object for the '{@link hearthstone.Ability#DealDamage() <em>Deal Damage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Deal Damage</em>' operation.
	 * @see hearthstone.Ability#DealDamage()
	 * @generated
	 */
	EOperation getAbility__DealDamage();

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
	 * Returns the meta object for enum '{@link hearthstone.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Class</em>'.
	 * @see hearthstone.Class
	 * @generated
	 */
	EEnum getClass_();

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
		 * The meta object literal for the '<em><b>Card Ability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__CARD_ABILITY = eINSTANCE.getCard_CardAbility();

		/**
		 * The meta object literal for the '<em><b>Card Ability List</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__CARD_ABILITY_LIST = eINSTANCE.getCard_CardAbilityList();

		/**
		 * The meta object literal for the '<em><b>Card Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__CARD_CLASS = eINSTANCE.getCard_CardClass();

		/**
		 * The meta object literal for the '<em><b>Play Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARD___PLAY_CARD = eINSTANCE.getCard__PlayCard();

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
		 * The meta object literal for the '<em><b>Hello</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECK___HELLO = eINSTANCE.getDeck__Hello();

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
		 * The meta object literal for the '<em><b>Card Has Ability</b></em>' reference list feature.
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
		 * The meta object literal for the '<em><b>Return To Hand</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABILITY___RETURN_TO_HAND = eINSTANCE.getAbility__ReturnToHand();

		/**
		 * The meta object literal for the '<em><b>Give Shield</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABILITY___GIVE_SHIELD = eINSTANCE.getAbility__GiveShield();

		/**
		 * The meta object literal for the '<em><b>Summon</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABILITY___SUMMON = eINSTANCE.getAbility__Summon();

		/**
		 * The meta object literal for the '<em><b>Deal Damage</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABILITY___DEAL_DAMAGE = eINSTANCE.getAbility__DealDamage();

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
		 * The meta object literal for the '{@link hearthstone.Class <em>Class</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hearthstone.Class
		 * @see hearthstone.impl.HearthstonePackageImpl#getClass_()
		 * @generated
		 */
		EEnum CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em>Abilities</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hearthstone.Ability
		 * @see hearthstone.impl.HearthstonePackageImpl#getAbilities()
		 * @generated
		 */
		EDataType ABILITIES = eINSTANCE.getAbilities();

	}

} //HearthstonePackage
