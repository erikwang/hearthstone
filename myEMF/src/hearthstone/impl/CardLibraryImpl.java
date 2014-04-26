/**
 */
package hearthstone.impl;

import hearthstone.Card;
import hearthstone.CardLibrary;
import hearthstone.CardLibraryType;
import hearthstone.CardQuality;
import hearthstone.HearthstoneFactory;
import hearthstone.HearthstonePackage;
import hearthstone.util.AllCards;
import hearthstone.util.Dbconn;

import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import hearthstone.util.Dbconn;







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
 * An implementation of the model object '<em><b>Card Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hearthstone.impl.CardLibraryImpl#getCardLibraryHasCards <em>Card Library Has Cards</em>}</li>
 *   <li>{@link hearthstone.impl.CardLibraryImpl#getLibraryVersion <em>Library Version</em>}</li>
 *   <li>{@link hearthstone.impl.CardLibraryImpl#getLibraryType <em>Library Type</em>}</li>
 *   <li>{@link hearthstone.impl.CardLibraryImpl#getAllCardsPool <em>All Cards Pool</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CardLibraryImpl extends MinimalEObjectImpl.Container implements CardLibrary {
	

	HearthstoneFactory cf = HearthstoneFactory.eINSTANCE;
	//int NUMOFCARDS = 443; it used to be 443 but after use hashtable, I found 3 cards have the same name
	int NUMOFCARDS = 440;
	//Hashtable<Integer, Card> allcards = new Hashtable<Integer, Card>();
	//gameDeck and Deck
	
	
	/**
	 * The cached value of the '{@link #getCardLibraryHasCards() <em>Card Library Has Cards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardLibraryHasCards()
	 * @generated
	 * @ordered
	 */
	protected EList<Card> cardLibraryHasCards;

	/**
	 * The default value of the '{@link #getLibraryVersion() <em>Library Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBRARY_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLibraryVersion() <em>Library Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryVersion()
	 * @generated
	 * @ordered
	 */
	protected String libraryVersion = LIBRARY_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLibraryType() <em>Library Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryType()
	 * @generated
	 * @ordered
	 */
	protected static final CardLibraryType LIBRARY_TYPE_EDEFAULT = CardLibraryType.STANDARD;

	/**
	 * The cached value of the '{@link #getLibraryType() <em>Library Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryType()
	 * @generated
	 * @ordered
	 */
	protected CardLibraryType libraryType = LIBRARY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllCardsPool() <em>All Cards Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllCardsPool()
	 * @generated
	 * @ordered
	 */
	protected static final AllCards ALL_CARDS_POOL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAllCardsPool() <em>All Cards Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllCardsPool()
	 * @generated
	 * @ordered
	 */
	protected AllCards allCardsPool = ALL_CARDS_POOL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HearthstonePackage.Literals.CARD_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Card> getCardLibraryHasCards() {
		if (cardLibraryHasCards == null) {
			cardLibraryHasCards = new EObjectContainmentEList<Card>(Card.class, this, HearthstonePackage.CARD_LIBRARY__CARD_LIBRARY_HAS_CARDS);
		}
		return cardLibraryHasCards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLibraryVersion() {
		return libraryVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibraryVersion(String newLibraryVersion) {
		String oldLibraryVersion = libraryVersion;
		libraryVersion = newLibraryVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.CARD_LIBRARY__LIBRARY_VERSION, oldLibraryVersion, libraryVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardLibraryType getLibraryType() {
		return libraryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibraryType(CardLibraryType newLibraryType) {
		CardLibraryType oldLibraryType = libraryType;
		libraryType = newLibraryType == null ? LIBRARY_TYPE_EDEFAULT : newLibraryType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.CARD_LIBRARY__LIBRARY_TYPE, oldLibraryType, libraryType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllCards getAllCardsPool() {
		return allCardsPool;
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllCardsPool(AllCards newAllCardsPool) {
		AllCards oldAllCardsPool = allCardsPool;
		allCardsPool = newAllCardsPool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.CARD_LIBRARY__ALL_CARDS_POOL, oldAllCardsPool, allCardsPool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void LoadFromDb() {
		AllCards allcards = new AllCards();
		this.setAllCardsPool(allcards);
		
		//Apr-26 for demo ArrayList List<Card> as container of cards library
		List<Card> lcard = new ArrayList<Card>();

		
		String sql1 = "SELECT * FROM hearthstone.cards";
		Dbconn db;
		int sn;
		String name;
		CardQuality quality;
		String cost;
		String type;
		int attack;
		int health;
		String ability;
		String cardclass;
		try {
			db = new Dbconn();
			ResultSet rst1 = null;
			Statement stmt1 = db.createStatement();
			rst1 = stmt1.executeQuery(sql1);
			/*
			 * 1 - Sn int
			 * 2 - Name String
			 * 3 - Quality String
			 * 4 - Cost int (includes null)
			 * 5 - Type String
			 * 6 - Attack int (includes null)
			 * 7 - Health int  (includes null)
			 * 8 - Special String (includes null)
			 * 9 - Class (Mag, Hun, etc.)
			 */

			for (;rst1.next();){
				Card tempcard = cf.createCard();
				sn = rst1.getInt(1);
				name = rst1.getString(2);
				cost = rst1.getString(4);
				quality = CardQuality.get(rst1.getString(3));
				ability = rst1.getString(8);
				cardclass = rst1.getString(9);
				attack = rst1.getInt(6);
				health = rst1.getInt(7);
				tempcard.setCardSN(sn);
				tempcard.setCardName(name);
				tempcard.setCardQuality(quality);
				tempcard.setCardAbilityDesc(ability);
				tempcard.setCardCost(cost);
				tempcard.setCardClass(cardclass);
				tempcard.setCardLife(health);
				tempcard.setCardPower(attack);
				//System.out.println("Card sn "+sn+"- "+ tempcard.getCardName()+" is loaded");


				//allCardsPool.put(sn, tempcard);
				//Change Keys to Hash integer value / April 5th
				allCardsPool.put(name.hashCode(), tempcard);
				lcard.add(tempcard);
			}
			rst1.close();
			stmt1.close();
		//	allcards.showAllcards();
		//	allcardshash.showAllcards();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Apr-26 for demo ArrayList List<Card> sorting by cost asc
		Collections.sort(lcard,comparator);
		//for(Card ttcard:lcard){
			//System.out.println(ttcard.toString());
		//}
	}
	

	Comparator<Card> comparator = new Comparator<Card>() {
	    public int compare(Card c1, Card c2) { //override 
	    	int cost1, cost2;
	    	if(c1.getCardCost().equals("-")){
	    		cost1 = 0;
	    	}else{
	    		cost1 = new Integer(c1.getCardCost()).intValue();
	    	}
	    	if(c2.getCardCost().equals("-")){
	    		cost2 = 0;
	    	}else{
	    		cost2 = new Integer(c2.getCardCost()).intValue();
	    	}
	    	return (cost1>cost2 ? 1 : (cost1== cost2 ? 0 : -1));		// less -1, equal 0, greater 1    	
	    }
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void ShowCardLibrary() {
		System.out.println("------[Card database report]------");
		System.out.println("Current total has "+this.getAllCardsPool().size()+" cards.");
		
		//for(int t=1;t<this.getAllCardsPool().size()+1;t++){
		//	System.out.println("{"+this.getAllCardsPool().get(t).getCardCost()+"}["+allCardsPool.get(t).getCardQuality()+"]["+allCardsPool.get(t).getCardClass()+"]["+allCardsPool.get(t).getCardName()+"]["+allCardsPool.get(t).getCardAbilityDesc()+"]");
		//}
		this.getAllCardsPool().showAllcards();
		System.out.println("---[End of card database report]---");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HearthstonePackage.CARD_LIBRARY__CARD_LIBRARY_HAS_CARDS:
				return ((InternalEList<?>)getCardLibraryHasCards()).basicRemove(otherEnd, msgs);
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
			case HearthstonePackage.CARD_LIBRARY__CARD_LIBRARY_HAS_CARDS:
				return getCardLibraryHasCards();
			case HearthstonePackage.CARD_LIBRARY__LIBRARY_VERSION:
				return getLibraryVersion();
			case HearthstonePackage.CARD_LIBRARY__LIBRARY_TYPE:
				return getLibraryType();
			case HearthstonePackage.CARD_LIBRARY__ALL_CARDS_POOL:
				return getAllCardsPool();
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
			case HearthstonePackage.CARD_LIBRARY__CARD_LIBRARY_HAS_CARDS:
				getCardLibraryHasCards().clear();
				getCardLibraryHasCards().addAll((Collection<? extends Card>)newValue);
				return;
			case HearthstonePackage.CARD_LIBRARY__LIBRARY_VERSION:
				setLibraryVersion((String)newValue);
				return;
			case HearthstonePackage.CARD_LIBRARY__LIBRARY_TYPE:
				setLibraryType((CardLibraryType)newValue);
				return;
			case HearthstonePackage.CARD_LIBRARY__ALL_CARDS_POOL:
				setAllCardsPool((AllCards)newValue);
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
			case HearthstonePackage.CARD_LIBRARY__CARD_LIBRARY_HAS_CARDS:
				getCardLibraryHasCards().clear();
				return;
			case HearthstonePackage.CARD_LIBRARY__LIBRARY_VERSION:
				setLibraryVersion(LIBRARY_VERSION_EDEFAULT);
				return;
			case HearthstonePackage.CARD_LIBRARY__LIBRARY_TYPE:
				setLibraryType(LIBRARY_TYPE_EDEFAULT);
				return;
			case HearthstonePackage.CARD_LIBRARY__ALL_CARDS_POOL:
				setAllCardsPool(ALL_CARDS_POOL_EDEFAULT);
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
			case HearthstonePackage.CARD_LIBRARY__CARD_LIBRARY_HAS_CARDS:
				return cardLibraryHasCards != null && !cardLibraryHasCards.isEmpty();
			case HearthstonePackage.CARD_LIBRARY__LIBRARY_VERSION:
				return LIBRARY_VERSION_EDEFAULT == null ? libraryVersion != null : !LIBRARY_VERSION_EDEFAULT.equals(libraryVersion);
			case HearthstonePackage.CARD_LIBRARY__LIBRARY_TYPE:
				return libraryType != LIBRARY_TYPE_EDEFAULT;
			case HearthstonePackage.CARD_LIBRARY__ALL_CARDS_POOL:
				return ALL_CARDS_POOL_EDEFAULT == null ? allCardsPool != null : !ALL_CARDS_POOL_EDEFAULT.equals(allCardsPool);
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
			case HearthstonePackage.CARD_LIBRARY___LOAD_FROM_DB:
				LoadFromDb();
				return null;
			case HearthstonePackage.CARD_LIBRARY___SHOW_CARD_LIBRARY:
				ShowCardLibrary();
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
		result.append(" (LibraryVersion: ");
		result.append(libraryVersion);
		result.append(", LibraryType: ");
		result.append(libraryType);
		result.append(", AllCardsPool: ");
		result.append(allCardsPool);
		result.append(')');
		return result.toString();
	}

} //CardLibraryImpl
