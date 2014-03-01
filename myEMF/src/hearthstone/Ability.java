/**
 */
package hearthstone;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hearthstone.Ability#getAbilityID <em>Ability ID</em>}</li>
 *   <li>{@link hearthstone.Ability#getAbilityType <em>Ability Type</em>}</li>
 *   <li>{@link hearthstone.Ability#getAbilityAffect <em>Ability Affect</em>}</li>
 *   <li>{@link hearthstone.Ability#getCardHasAbility <em>Card Has Ability</em>}</li>
 * </ul>
 * </p>
 *
 * @see hearthstone.HearthstonePackage#getAbility()
 * @model
 * @generated
 */
public interface Ability extends EObject {
	/**
	 * Returns the value of the '<em><b>Ability ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ability ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ability ID</em>' attribute.
	 * @see #setAbilityID(int)
	 * @see hearthstone.HearthstonePackage#getAbility_AbilityID()
	 * @model
	 * @generated
	 */
	int getAbilityID();

	/**
	 * Sets the value of the '{@link hearthstone.Ability#getAbilityID <em>Ability ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ability ID</em>' attribute.
	 * @see #getAbilityID()
	 * @generated
	 */
	void setAbilityID(int value);

	/**
	 * Returns the value of the '<em><b>Ability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ability Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ability Type</em>' attribute.
	 * @see #setAbilityType(String)
	 * @see hearthstone.HearthstonePackage#getAbility_AbilityType()
	 * @model
	 * @generated
	 */
	String getAbilityType();

	/**
	 * Sets the value of the '{@link hearthstone.Ability#getAbilityType <em>Ability Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ability Type</em>' attribute.
	 * @see #getAbilityType()
	 * @generated
	 */
	void setAbilityType(String value);

	/**
	 * Returns the value of the '<em><b>Ability Affect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ability Affect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ability Affect</em>' attribute.
	 * @see #setAbilityAffect(String)
	 * @see hearthstone.HearthstonePackage#getAbility_AbilityAffect()
	 * @model
	 * @generated
	 */
	String getAbilityAffect();

	/**
	 * Sets the value of the '{@link hearthstone.Ability#getAbilityAffect <em>Ability Affect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ability Affect</em>' attribute.
	 * @see #getAbilityAffect()
	 * @generated
	 */
	void setAbilityAffect(String value);

	/**
	 * Returns the value of the '<em><b>Card Has Ability</b></em>' containment reference list.
	 * The list contents are of type {@link hearthstone.Card}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card Has Ability</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Has Ability</em>' containment reference list.
	 * @see hearthstone.HearthstonePackage#getAbility_CardHasAbility()
	 * @model containment="true" upper="5"
	 * @generated
	 */
	EList<Card> getCardHasAbility();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean Charge();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean IncreaseAttribute();

} // Ability
