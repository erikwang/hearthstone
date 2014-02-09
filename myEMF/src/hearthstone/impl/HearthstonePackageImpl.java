/**
 */
package hearthstone.impl;



import hearthstone.Ability;
import hearthstone.Card;
import hearthstone.CardQuality;
import hearthstone.CardRace;
import hearthstone.Deck;
import hearthstone.HearthstoneFactory;
import hearthstone.HearthstonePackage;
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
	private EEnum classEEnum = null;

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
	public EAttribute getCard_CardAbility() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_CardAbilityList() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_CardClass() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCard__PlayCard() {
		return cardEClass.getEOperations().get(0);
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
	public EOperation getDeck__Hello() {
		return deckEClass.getEOperations().get(0);
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
	public EOperation getAbility__ReturnToHand() {
		return abilityEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbility__GiveShield() {
		return abilityEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbility__Summon() {
		return abilityEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbility__DealDamage() {
		return abilityEClass.getEOperations().get(5);
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
	public EEnum getClass_() {
		return classEEnum;
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
		createEAttribute(cardEClass, CARD__CARD_ABILITY);
		createEAttribute(cardEClass, CARD__CARD_ABILITY_LIST);
		createEAttribute(cardEClass, CARD__CARD_CLASS);
		createEOperation(cardEClass, CARD___PLAY_CARD);

		deckEClass = createEClass(DECK);
		createEAttribute(deckEClass, DECK__DECK_ID);
		createEAttribute(deckEClass, DECK__DECK_NAME);
		createEReference(deckEClass, DECK__DECK_HAS_CARDS);
		createEOperation(deckEClass, DECK___HELLO);

		abilityEClass = createEClass(ABILITY);
		createEAttribute(abilityEClass, ABILITY__ABILITY_ID);
		createEAttribute(abilityEClass, ABILITY__ABILITY_TYPE);
		createEAttribute(abilityEClass, ABILITY__ABILITY_AFFECT);
		createEReference(abilityEClass, ABILITY__CARD_HAS_ABILITY);
		createEOperation(abilityEClass, ABILITY___CHARGE);
		createEOperation(abilityEClass, ABILITY___INCREASE_ATTRIBUTE);
		createEOperation(abilityEClass, ABILITY___RETURN_TO_HAND);
		createEOperation(abilityEClass, ABILITY___GIVE_SHIELD);
		createEOperation(abilityEClass, ABILITY___SUMMON);
		createEOperation(abilityEClass, ABILITY___DEAL_DAMAGE);

		// Create enums
		cardQualityEEnum = createEEnum(CARD_QUALITY);
		cardRaceEEnum = createEEnum(CARD_RACE);
		classEEnum = createEEnum(CLASS);

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

		// Initialize classes, features, and operations; add parameters
		initEClass(cardEClass, Card.class, "Card", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCard_CardName(), ecorePackage.getEString(), "CardName", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_CardCost(), ecorePackage.getEString(), "CardCost", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_CardLife(), ecorePackage.getEInt(), "CardLife", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_CardPower(), ecorePackage.getEInt(), "CardPower", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_CardQuality(), ecorePackage.getEString(), "CardQuality", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_CardNumberLimit(), ecorePackage.getEInt(), "CardNumberLimit", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_CardRace(), ecorePackage.getEString(), "CardRace", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_CardStates(), ecorePackage.getEInt(), "CardStates", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_CardAbility(), ecorePackage.getEString(), "CardAbility", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_CardAbilityList(), this.getAbilities(), "CardAbilityList", null, 0, 3, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_CardClass(), ecorePackage.getEString(), "CardClass", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCard__PlayCard(), null, "PlayCard", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(deckEClass, Deck.class, "Deck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeck_DeckID(), ecorePackage.getEInt(), "DeckID", null, 0, 1, Deck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeck_DeckName(), ecorePackage.getEString(), "DeckName", null, 0, 1, Deck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeck_DeckHasCards(), this.getCard(), null, "DeckHasCards", null, 0, 9, Deck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDeck__Hello(), null, "Hello", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(abilityEClass, Ability.class, "Ability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbility_AbilityID(), ecorePackage.getEInt(), "AbilityID", null, 0, 1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbility_AbilityType(), ecorePackage.getEString(), "AbilityType", null, 0, 1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbility_AbilityAffect(), ecorePackage.getEString(), "AbilityAffect", null, 0, 1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbility_CardHasAbility(), this.getCard(), null, "CardHasAbility", null, 0, 5, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAbility__Charge(), null, "Charge", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbility__IncreaseAttribute(), null, "IncreaseAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbility__ReturnToHand(), null, "ReturnToHand", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbility__GiveShield(), null, "GiveShield", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbility__Summon(), null, "Summon", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbility__DealDamage(), null, "DealDamage", 0, 1, IS_UNIQUE, IS_ORDERED);

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

		initEEnum(classEEnum, hearthstone.Class.class, "Class");
		addEEnumLiteral(classEEnum, hearthstone.Class.MAGE);
		addEEnumLiteral(classEEnum, hearthstone.Class.PRIEST);
		addEEnumLiteral(classEEnum, hearthstone.Class.PALADIN);
		addEEnumLiteral(classEEnum, hearthstone.Class.WARLOCK);
		addEEnumLiteral(classEEnum, hearthstone.Class.HUNTER);
		addEEnumLiteral(classEEnum, hearthstone.Class.ROGUE);
		addEEnumLiteral(classEEnum, hearthstone.Class.DRUID);
		addEEnumLiteral(classEEnum, hearthstone.Class.WARRIOR);
		addEEnumLiteral(classEEnum, hearthstone.Class.SHAMAN);

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
