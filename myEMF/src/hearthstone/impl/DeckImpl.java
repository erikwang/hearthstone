/**
 */
package hearthstone.impl;

import hearthstone.Card;
import hearthstone.Deck;
import hearthstone.HearthstonePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
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
	 * The cached value of the '{@link #getDeckID() <em>Deck ID</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeckID()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> deckID;

	/**
	 * The cached value of the '{@link #getDeckName() <em>Deck Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeckName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> deckName;

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
	public EList<Integer> getDeckID() {
		if (deckID == null) {
			deckID = new EDataTypeUniqueEList<Integer>(Integer.class, this, HearthstonePackage.DECK__DECK_ID);
		}
		return deckID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDeckName() {
		if (deckName == null) {
			deckName = new EDataTypeUniqueEList<String>(String.class, this, HearthstonePackage.DECK__DECK_NAME);
		}
		return deckName;
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
				getDeckID().clear();
				getDeckID().addAll((Collection<? extends Integer>)newValue);
				return;
			case HearthstonePackage.DECK__DECK_NAME:
				getDeckName().clear();
				getDeckName().addAll((Collection<? extends String>)newValue);
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
				getDeckID().clear();
				return;
			case HearthstonePackage.DECK__DECK_NAME:
				getDeckName().clear();
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
				return deckID != null && !deckID.isEmpty();
			case HearthstonePackage.DECK__DECK_NAME:
				return deckName != null && !deckName.isEmpty();
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
