/**
 */
package hearthstone;

import hearthstone.util.AllCards;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hearthstone.CardLibrary#getCardLibraryHasCards <em>Card Library Has Cards</em>}</li>
 *   <li>{@link hearthstone.CardLibrary#getLibraryVersion <em>Library Version</em>}</li>
 *   <li>{@link hearthstone.CardLibrary#getLibraryType <em>Library Type</em>}</li>
 *   <li>{@link hearthstone.CardLibrary#getAllCardsPool <em>All Cards Pool</em>}</li>
 * </ul>
 * </p>
 *
 * @see hearthstone.HearthstonePackage#getCardLibrary()
 * @model
 * @generated
 */
public interface CardLibrary extends EObject {
	/**
	 * Returns the value of the '<em><b>Card Library Has Cards</b></em>' containment reference list.
	 * The list contents are of type {@link hearthstone.Card}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card Library Has Cards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Library Has Cards</em>' containment reference list.
	 * @see hearthstone.HearthstonePackage#getCardLibrary_CardLibraryHasCards()
	 * @model containment="true"
	 * @generated
	 */
	EList<Card> getCardLibraryHasCards();

	/**
	 * Returns the value of the '<em><b>Library Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library Version</em>' attribute.
	 * @see #setLibraryVersion(String)
	 * @see hearthstone.HearthstonePackage#getCardLibrary_LibraryVersion()
	 * @model
	 * @generated
	 */
	String getLibraryVersion();

	/**
	 * Sets the value of the '{@link hearthstone.CardLibrary#getLibraryVersion <em>Library Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library Version</em>' attribute.
	 * @see #getLibraryVersion()
	 * @generated
	 */
	void setLibraryVersion(String value);

	/**
	 * Returns the value of the '<em><b>Library Type</b></em>' attribute.
	 * The literals are from the enumeration {@link hearthstone.CardLibraryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library Type</em>' attribute.
	 * @see hearthstone.CardLibraryType
	 * @see #setLibraryType(CardLibraryType)
	 * @see hearthstone.HearthstonePackage#getCardLibrary_LibraryType()
	 * @model
	 * @generated
	 */
	CardLibraryType getLibraryType();

	/**
	 * Sets the value of the '{@link hearthstone.CardLibrary#getLibraryType <em>Library Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library Type</em>' attribute.
	 * @see hearthstone.CardLibraryType
	 * @see #getLibraryType()
	 * @generated
	 */
	void setLibraryType(CardLibraryType value);

	/**
	 * Returns the value of the '<em><b>All Cards Pool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Cards Pool</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Cards Pool</em>' attribute.
	 * @see #setAllCardsPool(AllCards)
	 * @see hearthstone.HearthstonePackage#getCardLibrary_AllCardsPool()
	 * @model dataType="hearthstone.AllCards"
	 * @generated
	 */
	AllCards getAllCardsPool();

	/**
	 * Sets the value of the '{@link hearthstone.CardLibrary#getAllCardsPool <em>All Cards Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Cards Pool</em>' attribute.
	 * @see #getAllCardsPool()
	 * @generated
	 */
	void setAllCardsPool(AllCards value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void LoadFromDb();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ShowCardLibrary();

} // CardLibrary
