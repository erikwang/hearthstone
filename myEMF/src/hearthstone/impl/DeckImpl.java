/**
 */
package hearthstone.impl;

import hearthstone.Card;
import hearthstone.Deck;
import hearthstone.HearthstonePackage;
import hearthstone.Hero;

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
 * An implementation of the model object '<em><b>Deck</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hearthstone.impl.DeckImpl#getDeckID <em>Deck ID</em>}</li>
 *   <li>{@link hearthstone.impl.DeckImpl#getDeckName <em>Deck Name</em>}</li>
 *   <li>{@link hearthstone.impl.DeckImpl#getDeckHasCards <em>Deck Has Cards</em>}</li>
 *   <li>{@link hearthstone.impl.DeckImpl#getDeckHasHero <em>Deck Has Hero</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeckImpl extends MinimalEObjectImpl.Container implements Deck {
	/**
	 * The default value of the '{@link #getDeckID() <em>Deck ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeckID()
	 * @generated
	 * @ordered
	 */
	protected static final int DECK_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDeckID() <em>Deck ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeckID()
	 * @generated
	 * @ordered
	 */
	protected int deckID = DECK_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeckName() <em>Deck Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeckName()
	 * @generated
	 * @ordered
	 */
	protected static final String DECK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeckName() <em>Deck Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeckName()
	 * @generated
	 * @ordered
	 */
	protected String deckName = DECK_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeckHasCards() <em>Deck Has Cards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeckHasCards()
	 * @generated
	 * @ordered
	 */
	protected EList<Card> deckHasCards;

	/**
	 * The cached value of the '{@link #getDeckHasHero() <em>Deck Has Hero</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeckHasHero()
	 * @generated
	 * @ordered
	 */
	protected Hero deckHasHero;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HearthstonePackage.Literals.DECK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDeckID() {
		return deckID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeckID(int newDeckID) {
		int oldDeckID = deckID;
		deckID = newDeckID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.DECK__DECK_ID, oldDeckID, deckID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeckName() {
		return deckName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeckName(String newDeckName) {
		String oldDeckName = deckName;
		deckName = newDeckName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.DECK__DECK_NAME, oldDeckName, deckName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Card> getDeckHasCards() {
		if (deckHasCards == null) {
			deckHasCards = new EObjectContainmentEList<Card>(Card.class, this, HearthstonePackage.DECK__DECK_HAS_CARDS);
		}
		return deckHasCards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hero getDeckHasHero() {
		return deckHasHero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeckHasHero(Hero newDeckHasHero, NotificationChain msgs) {
		Hero oldDeckHasHero = deckHasHero;
		deckHasHero = newDeckHasHero;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HearthstonePackage.DECK__DECK_HAS_HERO, oldDeckHasHero, newDeckHasHero);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeckHasHero(Hero newDeckHasHero) {
		if (newDeckHasHero != deckHasHero) {
			NotificationChain msgs = null;
			if (deckHasHero != null)
				msgs = ((InternalEObject)deckHasHero).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HearthstonePackage.DECK__DECK_HAS_HERO, null, msgs);
			if (newDeckHasHero != null)
				msgs = ((InternalEObject)newDeckHasHero).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HearthstonePackage.DECK__DECK_HAS_HERO, null, msgs);
			msgs = basicSetDeckHasHero(newDeckHasHero, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.DECK__DECK_HAS_HERO, newDeckHasHero, newDeckHasHero));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public boolean Hello() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		System.out.println("Hello from DECK");
		return true;
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
		this.ShowGameStartDeckCards();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ShowVersion() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void ShowCardsInDeck() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		for(int t=0; t<this.deckHasCards.size();t++){
			System.out.println("{"+this.deckHasCards.get(t).getCardCost()+"}["+this.deckHasCards.get(t).getCardQuality()+"]["+this.deckHasCards.get(t).getCardClass()+"]["+this.deckHasCards.get(t).getCardName()+"]["+this.deckHasCards.get(t).getCardAbilityDesc()+"]");
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
			case HearthstonePackage.DECK__DECK_HAS_CARDS:
				return ((InternalEList<?>)getDeckHasCards()).basicRemove(otherEnd, msgs);
			case HearthstonePackage.DECK__DECK_HAS_HERO:
				return basicSetDeckHasHero(null, msgs);
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
			case HearthstonePackage.DECK__DECK_ID:
				return getDeckID();
			case HearthstonePackage.DECK__DECK_NAME:
				return getDeckName();
			case HearthstonePackage.DECK__DECK_HAS_CARDS:
				return getDeckHasCards();
			case HearthstonePackage.DECK__DECK_HAS_HERO:
				return getDeckHasHero();
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
			case HearthstonePackage.DECK__DECK_ID:
				setDeckID((Integer)newValue);
				return;
			case HearthstonePackage.DECK__DECK_NAME:
				setDeckName((String)newValue);
				return;
			case HearthstonePackage.DECK__DECK_HAS_CARDS:
				getDeckHasCards().clear();
				getDeckHasCards().addAll((Collection<? extends Card>)newValue);
				return;
			case HearthstonePackage.DECK__DECK_HAS_HERO:
				setDeckHasHero((Hero)newValue);
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
			case HearthstonePackage.DECK__DECK_ID:
				setDeckID(DECK_ID_EDEFAULT);
				return;
			case HearthstonePackage.DECK__DECK_NAME:
				setDeckName(DECK_NAME_EDEFAULT);
				return;
			case HearthstonePackage.DECK__DECK_HAS_CARDS:
				getDeckHasCards().clear();
				return;
			case HearthstonePackage.DECK__DECK_HAS_HERO:
				setDeckHasHero((Hero)null);
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
			case HearthstonePackage.DECK__DECK_ID:
				return deckID != DECK_ID_EDEFAULT;
			case HearthstonePackage.DECK__DECK_NAME:
				return DECK_NAME_EDEFAULT == null ? deckName != null : !DECK_NAME_EDEFAULT.equals(deckName);
			case HearthstonePackage.DECK__DECK_HAS_CARDS:
				return deckHasCards != null && !deckHasCards.isEmpty();
			case HearthstonePackage.DECK__DECK_HAS_HERO:
				return deckHasHero != null;
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
			case HearthstonePackage.DECK___HELLO:
				return Hello();
			case HearthstonePackage.DECK___SHOW_VERSION:
				ShowVersion();
				return null;
			case HearthstonePackage.DECK___SHOW_CARDS_IN_DECK:
				ShowCardsInDeck();
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
		result.append(" (DeckID: ");
		result.append(deckID);
		result.append(", DeckName: ");
		result.append(deckName);
		result.append(')');
		return result.toString();
	}

} //DeckImpl
