/**
 */
package hearthstone.impl;

import hearthstone.Card;
import hearthstone.Deck;
import hearthstone.HearthstonePackage;
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
	public void Hello() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
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
				Hello();
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
