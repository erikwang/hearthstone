/**
 */
package hearthstone.impl;

import hearthstone.Card;
import hearthstone.CardCollection;
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
 * An implementation of the model object '<em><b>Card Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hearthstone.impl.CardCollectionImpl#getCollectionHasCards <em>Collection Has Cards</em>}</li>
 *   <li>{@link hearthstone.impl.CardCollectionImpl#getCollectionOwner <em>Collection Owner</em>}</li>
 *   <li>{@link hearthstone.impl.CardCollectionImpl#getCollectionID <em>Collection ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CardCollectionImpl extends MinimalEObjectImpl.Container implements CardCollection {
	/**
	 * The cached value of the '{@link #getCollectionHasCards() <em>Collection Has Cards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionHasCards()
	 * @generated
	 * @ordered
	 */
	protected EList<Card> collectionHasCards;

	/**
	 * The default value of the '{@link #getCollectionOwner() <em>Collection Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionOwner()
	 * @generated
	 * @ordered
	 */
	protected static final int COLLECTION_OWNER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCollectionOwner() <em>Collection Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionOwner()
	 * @generated
	 * @ordered
	 */
	protected int collectionOwner = COLLECTION_OWNER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCollectionID() <em>Collection ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionID()
	 * @generated
	 * @ordered
	 */
	protected static final int COLLECTION_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCollectionID() <em>Collection ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionID()
	 * @generated
	 * @ordered
	 */
	protected int collectionID = COLLECTION_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HearthstonePackage.Literals.CARD_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Card> getCollectionHasCards() {
		if (collectionHasCards == null) {
			collectionHasCards = new EObjectContainmentEList<Card>(Card.class, this, HearthstonePackage.CARD_COLLECTION__COLLECTION_HAS_CARDS);
		}
		return collectionHasCards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCollectionID() {
		return collectionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionID(int newCollectionID) {
		int oldCollectionID = collectionID;
		collectionID = newCollectionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.CARD_COLLECTION__COLLECTION_ID, oldCollectionID, collectionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCollectionOwner() {
		return collectionOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionOwner(int newCollectionOwner) {
		int oldCollectionOwner = collectionOwner;
		collectionOwner = newCollectionOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.CARD_COLLECTION__COLLECTION_OWNER, oldCollectionOwner, collectionOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ShowCollection() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HearthstonePackage.CARD_COLLECTION__COLLECTION_HAS_CARDS:
				return ((InternalEList<?>)getCollectionHasCards()).basicRemove(otherEnd, msgs);
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
			case HearthstonePackage.CARD_COLLECTION__COLLECTION_HAS_CARDS:
				return getCollectionHasCards();
			case HearthstonePackage.CARD_COLLECTION__COLLECTION_OWNER:
				return getCollectionOwner();
			case HearthstonePackage.CARD_COLLECTION__COLLECTION_ID:
				return getCollectionID();
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
			case HearthstonePackage.CARD_COLLECTION__COLLECTION_HAS_CARDS:
				getCollectionHasCards().clear();
				getCollectionHasCards().addAll((Collection<? extends Card>)newValue);
				return;
			case HearthstonePackage.CARD_COLLECTION__COLLECTION_OWNER:
				setCollectionOwner((Integer)newValue);
				return;
			case HearthstonePackage.CARD_COLLECTION__COLLECTION_ID:
				setCollectionID((Integer)newValue);
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
			case HearthstonePackage.CARD_COLLECTION__COLLECTION_HAS_CARDS:
				getCollectionHasCards().clear();
				return;
			case HearthstonePackage.CARD_COLLECTION__COLLECTION_OWNER:
				setCollectionOwner(COLLECTION_OWNER_EDEFAULT);
				return;
			case HearthstonePackage.CARD_COLLECTION__COLLECTION_ID:
				setCollectionID(COLLECTION_ID_EDEFAULT);
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
			case HearthstonePackage.CARD_COLLECTION__COLLECTION_HAS_CARDS:
				return collectionHasCards != null && !collectionHasCards.isEmpty();
			case HearthstonePackage.CARD_COLLECTION__COLLECTION_OWNER:
				return collectionOwner != COLLECTION_OWNER_EDEFAULT;
			case HearthstonePackage.CARD_COLLECTION__COLLECTION_ID:
				return collectionID != COLLECTION_ID_EDEFAULT;
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
			case HearthstonePackage.CARD_COLLECTION___SHOW_COLLECTION:
				ShowCollection();
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
		result.append(" (CollectionOwner: ");
		result.append(collectionOwner);
		result.append(", CollectionID: ");
		result.append(collectionID);
		result.append(')');
		return result.toString();
	}

} //CardCollectionImpl
