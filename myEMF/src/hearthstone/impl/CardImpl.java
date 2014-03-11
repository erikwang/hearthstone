/**
 */
package hearthstone.impl;

import hearthstone.Ability;
import hearthstone.Card;
import hearthstone.CardQuality;
import hearthstone.CardStates;
import hearthstone.HearthstonePackage;
import hearthstone.Hero;
import hearthstone.HeroStates;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

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
 * An implementation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hearthstone.impl.CardImpl#getCardName <em>Card Name</em>}</li>
 *   <li>{@link hearthstone.impl.CardImpl#getCardCost <em>Card Cost</em>}</li>
 *   <li>{@link hearthstone.impl.CardImpl#getCardLife <em>Card Life</em>}</li>
 *   <li>{@link hearthstone.impl.CardImpl#getCardPower <em>Card Power</em>}</li>
 *   <li>{@link hearthstone.impl.CardImpl#getCardQuality <em>Card Quality</em>}</li>
 *   <li>{@link hearthstone.impl.CardImpl#getCardNumberLimit <em>Card Number Limit</em>}</li>
 *   <li>{@link hearthstone.impl.CardImpl#getCardRace <em>Card Race</em>}</li>
 *   <li>{@link hearthstone.impl.CardImpl#getCardStates <em>Card States</em>}</li>
 *   <li>{@link hearthstone.impl.CardImpl#getCardClass <em>Card Class</em>}</li>
 *   <li>{@link hearthstone.impl.CardImpl#getCardHasAbilities <em>Card Has Abilities</em>}</li>
 *   <li>{@link hearthstone.impl.CardImpl#getCardSN <em>Card SN</em>}</li>
 *   <li>{@link hearthstone.impl.CardImpl#getCardAbilityDesc <em>Card Ability Desc</em>}</li>
 *   <li>{@link hearthstone.impl.CardImpl#getCardDeckSN <em>Card Deck SN</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CardImpl extends MinimalEObjectImpl.Container implements Card {
	/**
	 * The default value of the '{@link #getCardName() <em>Card Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardName()
	 * @generated
	 * @ordered
	 */
	protected static final String CARD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardName() <em>Card Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardName()
	 * @generated
	 * @ordered
	 */
	protected String cardName = CARD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardCost() <em>Card Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardCost()
	 * @generated
	 * @ordered
	 */
	protected static final String CARD_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardCost() <em>Card Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardCost()
	 * @generated
	 * @ordered
	 */
	protected String cardCost = CARD_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardLife() <em>Card Life</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardLife()
	 * @generated
	 * @ordered
	 */
	protected static final int CARD_LIFE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCardLife() <em>Card Life</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardLife()
	 * @generated
	 * @ordered
	 */
	protected int cardLife = CARD_LIFE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardPower() <em>Card Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardPower()
	 * @generated
	 * @ordered
	 */
	protected static final int CARD_POWER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCardPower() <em>Card Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardPower()
	 * @generated
	 * @ordered
	 */
	protected int cardPower = CARD_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardQuality() <em>Card Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardQuality()
	 * @generated
	 * @ordered
	 */
	protected static final CardQuality CARD_QUALITY_EDEFAULT = CardQuality.NORMAL;

	/**
	 * The cached value of the '{@link #getCardQuality() <em>Card Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardQuality()
	 * @generated
	 * @ordered
	 */
	protected CardQuality cardQuality = CARD_QUALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardNumberLimit() <em>Card Number Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardNumberLimit()
	 * @generated
	 * @ordered
	 */
	protected static final int CARD_NUMBER_LIMIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCardNumberLimit() <em>Card Number Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardNumberLimit()
	 * @generated
	 * @ordered
	 */
	protected int cardNumberLimit = CARD_NUMBER_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardRace() <em>Card Race</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardRace()
	 * @generated
	 * @ordered
	 */
	protected static final String CARD_RACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardRace() <em>Card Race</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardRace()
	 * @generated
	 * @ordered
	 */
	protected String cardRace = CARD_RACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardStates() <em>Card States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardStates()
	 * @generated
	 * @ordered
	 */
	protected static final CardStates CARD_STATES_EDEFAULT = CardStates.IN_DECK;

	/**
	 * The cached value of the '{@link #getCardStates() <em>Card States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardStates()
	 * @generated
	 * @ordered
	 */
	protected CardStates cardStates = CARD_STATES_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardClass() <em>Card Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardClass()
	 * @generated
	 * @ordered
	 */
	protected static final String CARD_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardClass() <em>Card Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardClass()
	 * @generated
	 * @ordered
	 */
	protected String cardClass = CARD_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCardHasAbilities() <em>Card Has Abilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardHasAbilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Ability> cardHasAbilities;

	/**
	 * The default value of the '{@link #getCardSN() <em>Card SN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardSN()
	 * @generated
	 * @ordered
	 */
	protected static final int CARD_SN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCardSN() <em>Card SN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardSN()
	 * @generated
	 * @ordered
	 */
	protected int cardSN = CARD_SN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardAbilityDesc() <em>Card Ability Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardAbilityDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String CARD_ABILITY_DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardAbilityDesc() <em>Card Ability Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardAbilityDesc()
	 * @generated
	 * @ordered
	 */
	protected String cardAbilityDesc = CARD_ABILITY_DESC_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardDeckSN() <em>Card Deck SN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardDeckSN()
	 * @generated
	 * @ordered
	 */
	protected static final int CARD_DECK_SN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCardDeckSN() <em>Card Deck SN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardDeckSN()
	 * @generated
	 * @ordered
	 */
	protected int cardDeckSN = CARD_DECK_SN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HearthstonePackage.Literals.CARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCardName() {
		return cardName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardName(String newCardName) {
		String oldCardName = cardName;
		cardName = newCardName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.CARD__CARD_NAME, oldCardName, cardName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCardCost() {
		return cardCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardCost(String newCardCost) {
		String oldCardCost = cardCost;
		cardCost = newCardCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.CARD__CARD_COST, oldCardCost, cardCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCardLife() {
		return cardLife;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardLife(int newCardLife) {
		int oldCardLife = cardLife;
		cardLife = newCardLife;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.CARD__CARD_LIFE, oldCardLife, cardLife));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCardPower() {
		return cardPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardPower(int newCardPower) {
		int oldCardPower = cardPower;
		cardPower = newCardPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.CARD__CARD_POWER, oldCardPower, cardPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardQuality getCardQuality() {
		return cardQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardQuality(CardQuality newCardQuality) {
		CardQuality oldCardQuality = cardQuality;
		cardQuality = newCardQuality == null ? CARD_QUALITY_EDEFAULT : newCardQuality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.CARD__CARD_QUALITY, oldCardQuality, cardQuality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCardNumberLimit() {
		return cardNumberLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardNumberLimit(int newCardNumberLimit) {
		int oldCardNumberLimit = cardNumberLimit;
		cardNumberLimit = newCardNumberLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.CARD__CARD_NUMBER_LIMIT, oldCardNumberLimit, cardNumberLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCardRace() {
		return cardRace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardRace(String newCardRace) {
		String oldCardRace = cardRace;
		cardRace = newCardRace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.CARD__CARD_RACE, oldCardRace, cardRace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardStates getCardStates() {
		return cardStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardStates(CardStates newCardStates) {
		CardStates oldCardStates = cardStates;
		cardStates = newCardStates == null ? CARD_STATES_EDEFAULT : newCardStates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.CARD__CARD_STATES, oldCardStates, cardStates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCardClass() {
		return cardClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardClass(String newCardClass) {
		String oldCardClass = cardClass;
		cardClass = newCardClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.CARD__CARD_CLASS, oldCardClass, cardClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ability> getCardHasAbilities() {
		if (cardHasAbilities == null) {
			cardHasAbilities = new EObjectContainmentEList<Ability>(Ability.class, this, HearthstonePackage.CARD__CARD_HAS_ABILITIES);
		}
		return cardHasAbilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCardSN() {
		return cardSN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardSN(int newCardSN) {
		int oldCardSN = cardSN;
		cardSN = newCardSN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.CARD__CARD_SN, oldCardSN, cardSN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCardAbilityDesc() {
		return cardAbilityDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardAbilityDesc(String newCardAbilityDesc) {
		String oldCardAbilityDesc = cardAbilityDesc;
		cardAbilityDesc = newCardAbilityDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.CARD__CARD_ABILITY_DESC, oldCardAbilityDesc, cardAbilityDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCardDeckSN() {
		return cardDeckSN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardDeckSN(int newCardDeckSN) {
		int oldCardDeckSN = cardDeckSN;
		cardDeckSN = newCardDeckSN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.CARD__CARD_DECK_SN, oldCardDeckSN, cardDeckSN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UpdateCardStates(int CardStates) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void InteractAnotherCard(Card _card) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		System.out.println("[Card acting] "+this.cardName+" L= "+this.getCardLife()+" P= "+this.getCardPower() +" vs "+_card.getCardName()+" L= "+_card.getCardLife()+" P= "+_card.getCardPower());
		this.cardLife = this.cardLife - _card.getCardPower();
		_card.setCardLife(_card.getCardLife() - this.cardPower);
		
		System.out.println("[Card acted] "+this.cardName+" L= "+this.getCardLife()+" P= "+this.getCardPower() +" vs "+_card.getCardName()+" L= "+_card.getCardLife()+" P= "+_card.getCardPower());
		if(this.cardLife <= 0){
			this.setCardStates(CardStates.DEAD);
			System.out.println("[Card died] "+this.cardName+" is destroied");
		}else{
			this.cardStates = CardStates.ACTED;	
		}
		if(_card.getCardLife() <= 0){
			_card.setCardStates(CardStates.DEAD);
			System.out.println("[Card died] "+_card.getCardName()+" is destroied");
		}
		
		
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void ShowCard() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		System.out.println("[Card report][" +this.cardStates+"] "+ this.cardName+" Cost="+this.cardCost+" Life/Power="+ this.cardLife+"/"+this.cardPower);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void InteractOppoHero(Hero theHero) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		System.out.println("[Card acting] "+this.cardName+" L= "+this.getCardLife()+" P= "+this.getCardPower() +" vs "+theHero.getHeroClass()+" L= "+theHero.getHeroHealth()+" P= "+theHero.getHeroPower());
		this.cardLife = this.cardLife - theHero.getHeroPower();
		theHero.setHeroHealth(theHero.getHeroHealth() - this.cardPower);
		
		System.out.println("[Card acting] "+this.cardName+" L= "+this.getCardLife()+" P= "+this.getCardPower() +" vs "+theHero.getHeroClass()+" L= "+theHero.getHeroHealth()+" P= "+theHero.getHeroPower());
		if(this.cardLife <= 0){
			this.setCardStates(CardStates.DEAD);
			System.out.println("[Card died] "+this.cardName+" is destroied");
		}else{
			this.cardStates = CardStates.ACTED;	
		}
		if(theHero.getHeroHealth() <= 0){
			theHero.setHeroStates(HeroStates.DEAD);
			System.out.println("[Hero died] "+theHero.getHeroClass()+" is destroied");
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HearthstonePackage.CARD__CARD_HAS_ABILITIES:
				return ((InternalEList<?>)getCardHasAbilities()).basicRemove(otherEnd, msgs);
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
			case HearthstonePackage.CARD__CARD_NAME:
				return getCardName();
			case HearthstonePackage.CARD__CARD_COST:
				return getCardCost();
			case HearthstonePackage.CARD__CARD_LIFE:
				return getCardLife();
			case HearthstonePackage.CARD__CARD_POWER:
				return getCardPower();
			case HearthstonePackage.CARD__CARD_QUALITY:
				return getCardQuality();
			case HearthstonePackage.CARD__CARD_NUMBER_LIMIT:
				return getCardNumberLimit();
			case HearthstonePackage.CARD__CARD_RACE:
				return getCardRace();
			case HearthstonePackage.CARD__CARD_STATES:
				return getCardStates();
			case HearthstonePackage.CARD__CARD_CLASS:
				return getCardClass();
			case HearthstonePackage.CARD__CARD_HAS_ABILITIES:
				return getCardHasAbilities();
			case HearthstonePackage.CARD__CARD_SN:
				return getCardSN();
			case HearthstonePackage.CARD__CARD_ABILITY_DESC:
				return getCardAbilityDesc();
			case HearthstonePackage.CARD__CARD_DECK_SN:
				return getCardDeckSN();
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
			case HearthstonePackage.CARD__CARD_NAME:
				setCardName((String)newValue);
				return;
			case HearthstonePackage.CARD__CARD_COST:
				setCardCost((String)newValue);
				return;
			case HearthstonePackage.CARD__CARD_LIFE:
				setCardLife((Integer)newValue);
				return;
			case HearthstonePackage.CARD__CARD_POWER:
				setCardPower((Integer)newValue);
				return;
			case HearthstonePackage.CARD__CARD_QUALITY:
				setCardQuality((CardQuality)newValue);
				return;
			case HearthstonePackage.CARD__CARD_NUMBER_LIMIT:
				setCardNumberLimit((Integer)newValue);
				return;
			case HearthstonePackage.CARD__CARD_RACE:
				setCardRace((String)newValue);
				return;
			case HearthstonePackage.CARD__CARD_STATES:
				setCardStates((CardStates)newValue);
				return;
			case HearthstonePackage.CARD__CARD_CLASS:
				setCardClass((String)newValue);
				return;
			case HearthstonePackage.CARD__CARD_HAS_ABILITIES:
				getCardHasAbilities().clear();
				getCardHasAbilities().addAll((Collection<? extends Ability>)newValue);
				return;
			case HearthstonePackage.CARD__CARD_SN:
				setCardSN((Integer)newValue);
				return;
			case HearthstonePackage.CARD__CARD_ABILITY_DESC:
				setCardAbilityDesc((String)newValue);
				return;
			case HearthstonePackage.CARD__CARD_DECK_SN:
				setCardDeckSN((Integer)newValue);
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
			case HearthstonePackage.CARD__CARD_NAME:
				setCardName(CARD_NAME_EDEFAULT);
				return;
			case HearthstonePackage.CARD__CARD_COST:
				setCardCost(CARD_COST_EDEFAULT);
				return;
			case HearthstonePackage.CARD__CARD_LIFE:
				setCardLife(CARD_LIFE_EDEFAULT);
				return;
			case HearthstonePackage.CARD__CARD_POWER:
				setCardPower(CARD_POWER_EDEFAULT);
				return;
			case HearthstonePackage.CARD__CARD_QUALITY:
				setCardQuality(CARD_QUALITY_EDEFAULT);
				return;
			case HearthstonePackage.CARD__CARD_NUMBER_LIMIT:
				setCardNumberLimit(CARD_NUMBER_LIMIT_EDEFAULT);
				return;
			case HearthstonePackage.CARD__CARD_RACE:
				setCardRace(CARD_RACE_EDEFAULT);
				return;
			case HearthstonePackage.CARD__CARD_STATES:
				setCardStates(CARD_STATES_EDEFAULT);
				return;
			case HearthstonePackage.CARD__CARD_CLASS:
				setCardClass(CARD_CLASS_EDEFAULT);
				return;
			case HearthstonePackage.CARD__CARD_HAS_ABILITIES:
				getCardHasAbilities().clear();
				return;
			case HearthstonePackage.CARD__CARD_SN:
				setCardSN(CARD_SN_EDEFAULT);
				return;
			case HearthstonePackage.CARD__CARD_ABILITY_DESC:
				setCardAbilityDesc(CARD_ABILITY_DESC_EDEFAULT);
				return;
			case HearthstonePackage.CARD__CARD_DECK_SN:
				setCardDeckSN(CARD_DECK_SN_EDEFAULT);
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
			case HearthstonePackage.CARD__CARD_NAME:
				return CARD_NAME_EDEFAULT == null ? cardName != null : !CARD_NAME_EDEFAULT.equals(cardName);
			case HearthstonePackage.CARD__CARD_COST:
				return CARD_COST_EDEFAULT == null ? cardCost != null : !CARD_COST_EDEFAULT.equals(cardCost);
			case HearthstonePackage.CARD__CARD_LIFE:
				return cardLife != CARD_LIFE_EDEFAULT;
			case HearthstonePackage.CARD__CARD_POWER:
				return cardPower != CARD_POWER_EDEFAULT;
			case HearthstonePackage.CARD__CARD_QUALITY:
				return cardQuality != CARD_QUALITY_EDEFAULT;
			case HearthstonePackage.CARD__CARD_NUMBER_LIMIT:
				return cardNumberLimit != CARD_NUMBER_LIMIT_EDEFAULT;
			case HearthstonePackage.CARD__CARD_RACE:
				return CARD_RACE_EDEFAULT == null ? cardRace != null : !CARD_RACE_EDEFAULT.equals(cardRace);
			case HearthstonePackage.CARD__CARD_STATES:
				return cardStates != CARD_STATES_EDEFAULT;
			case HearthstonePackage.CARD__CARD_CLASS:
				return CARD_CLASS_EDEFAULT == null ? cardClass != null : !CARD_CLASS_EDEFAULT.equals(cardClass);
			case HearthstonePackage.CARD__CARD_HAS_ABILITIES:
				return cardHasAbilities != null && !cardHasAbilities.isEmpty();
			case HearthstonePackage.CARD__CARD_SN:
				return cardSN != CARD_SN_EDEFAULT;
			case HearthstonePackage.CARD__CARD_ABILITY_DESC:
				return CARD_ABILITY_DESC_EDEFAULT == null ? cardAbilityDesc != null : !CARD_ABILITY_DESC_EDEFAULT.equals(cardAbilityDesc);
			case HearthstonePackage.CARD__CARD_DECK_SN:
				return cardDeckSN != CARD_DECK_SN_EDEFAULT;
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
			case HearthstonePackage.CARD___UPDATE_CARD_STATES__INT:
				return UpdateCardStates((Integer)arguments.get(0));
			case HearthstonePackage.CARD___INTERACT_ANOTHER_CARD__CARD:
				InteractAnotherCard((Card)arguments.get(0));
				return null;
			case HearthstonePackage.CARD___SHOW_CARD:
				ShowCard();
				return null;
			case HearthstonePackage.CARD___INTERACT_OPPO_HERO__HERO:
				InteractOppoHero((Hero)arguments.get(0));
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
		result.append(" (CardName: ");
		result.append(cardName);
		result.append(", CardCost: ");
		result.append(cardCost);
		result.append(", CardLife: ");
		result.append(cardLife);
		result.append(", CardPower: ");
		result.append(cardPower);
		result.append(", CardQuality: ");
		result.append(cardQuality);
		result.append(", CardNumberLimit: ");
		result.append(cardNumberLimit);
		result.append(", CardRace: ");
		result.append(cardRace);
		result.append(", CardStates: ");
		result.append(cardStates);
		result.append(", CardClass: ");
		result.append(cardClass);
		result.append(", CardSN: ");
		result.append(cardSN);
		result.append(", CardAbilityDesc: ");
		result.append(cardAbilityDesc);
		result.append(", CardDeckSN: ");
		result.append(cardDeckSN);
		result.append(')');
		return result.toString();
	}

} //CardImpl
