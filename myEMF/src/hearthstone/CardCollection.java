/**
 */
package hearthstone;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hearthstone.CardCollection#getCollectionHasCards <em>Collection Has Cards</em>}</li>
 *   <li>{@link hearthstone.CardCollection#getCollectionID <em>Collection ID</em>}</li>
 *   <li>{@link hearthstone.CardCollection#getCollectionOwner <em>Collection Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see hearthstone.HearthstonePackage#getCardCollection()
 * @model
 * @generated
 */
public interface CardCollection extends EObject {
	/**
	 * Returns the value of the '<em><b>Collection Has Cards</b></em>' containment reference list.
	 * The list contents are of type {@link hearthstone.Card}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Has Cards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Has Cards</em>' containment reference list.
	 * @see hearthstone.HearthstonePackage#getCardCollection_CollectionHasCards()
	 * @model containment="true"
	 * @generated
	 */
	EList<Card> getCollectionHasCards();

	/**
	 * Returns the value of the '<em><b>Collection ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection ID</em>' attribute.
	 * @see #setCollectionID(int)
	 * @see hearthstone.HearthstonePackage#getCardCollection_CollectionID()
	 * @model
	 * @generated
	 */
	int getCollectionID();

	/**
	 * Sets the value of the '{@link hearthstone.CardCollection#getCollectionID <em>Collection ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection ID</em>' attribute.
	 * @see #getCollectionID()
	 * @generated
	 */
	void setCollectionID(int value);

	/**
	 * Returns the value of the '<em><b>Collection Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Owner</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Owner</em>' attribute.
	 * @see #setCollectionOwner(int)
	 * @see hearthstone.HearthstonePackage#getCardCollection_CollectionOwner()
	 * @model
	 * @generated
	 */
	int getCollectionOwner();

	/**
	 * Sets the value of the '{@link hearthstone.CardCollection#getCollectionOwner <em>Collection Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Owner</em>' attribute.
	 * @see #getCollectionOwner()
	 * @generated
	 */
	void setCollectionOwner(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ShowCollection();

} // CardCollection
