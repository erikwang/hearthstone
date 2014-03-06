/**
 */
package hearthstone;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hero</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hearthstone.Hero#getHeroClass <em>Hero Class</em>}</li>
 *   <li>{@link hearthstone.Hero#getHeroHealth <em>Hero Health</em>}</li>
 *   <li>{@link hearthstone.Hero#getHeroStates <em>Hero States</em>}</li>
 *   <li>{@link hearthstone.Hero#getHeroAbility <em>Hero Ability</em>}</li>
 *   <li>{@link hearthstone.Hero#getHeroDesc <em>Hero Desc</em>}</li>
 * </ul>
 * </p>
 *
 * @see hearthstone.HearthstonePackage#getHero()
 * @model
 * @generated
 */
public interface Hero extends EObject {
	/**
	 * Returns the value of the '<em><b>Hero Class</b></em>' attribute.
	 * The literals are from the enumeration {@link hearthstone.HeroClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hero Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hero Class</em>' attribute.
	 * @see hearthstone.HeroClass
	 * @see #setHeroClass(HeroClass)
	 * @see hearthstone.HearthstonePackage#getHero_HeroClass()
	 * @model required="true"
	 * @generated
	 */
	HeroClass getHeroClass();

	/**
	 * Sets the value of the '{@link hearthstone.Hero#getHeroClass <em>Hero Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hero Class</em>' attribute.
	 * @see hearthstone.HeroClass
	 * @see #getHeroClass()
	 * @generated
	 */
	void setHeroClass(HeroClass value);

	/**
	 * Returns the value of the '<em><b>Hero Health</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hero Health</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hero Health</em>' attribute.
	 * @see #setHeroHealth(int)
	 * @see hearthstone.HearthstonePackage#getHero_HeroHealth()
	 * @model required="true"
	 * @generated
	 */
	int getHeroHealth();

	/**
	 * Sets the value of the '{@link hearthstone.Hero#getHeroHealth <em>Hero Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hero Health</em>' attribute.
	 * @see #getHeroHealth()
	 * @generated
	 */
	void setHeroHealth(int value);

	/**
	 * Returns the value of the '<em><b>Hero States</b></em>' attribute.
	 * The literals are from the enumeration {@link hearthstone.HeroStates}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hero States</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hero States</em>' attribute.
	 * @see hearthstone.HeroStates
	 * @see #setHeroStates(HeroStates)
	 * @see hearthstone.HearthstonePackage#getHero_HeroStates()
	 * @model
	 * @generated
	 */
	HeroStates getHeroStates();

	/**
	 * Sets the value of the '{@link hearthstone.Hero#getHeroStates <em>Hero States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hero States</em>' attribute.
	 * @see hearthstone.HeroStates
	 * @see #getHeroStates()
	 * @generated
	 */
	void setHeroStates(HeroStates value);

	/**
	 * Returns the value of the '<em><b>Hero Ability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hero Ability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hero Ability</em>' attribute.
	 * @see #setHeroAbility(String)
	 * @see hearthstone.HearthstonePackage#getHero_HeroAbility()
	 * @model
	 * @generated
	 */
	String getHeroAbility();

	/**
	 * Sets the value of the '{@link hearthstone.Hero#getHeroAbility <em>Hero Ability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hero Ability</em>' attribute.
	 * @see #getHeroAbility()
	 * @generated
	 */
	void setHeroAbility(String value);

	/**
	 * Returns the value of the '<em><b>Hero Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hero Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hero Desc</em>' attribute.
	 * @see #setHeroDesc(String)
	 * @see hearthstone.HearthstonePackage#getHero_HeroDesc()
	 * @model
	 * @generated
	 */
	String getHeroDesc();

	/**
	 * Sets the value of the '{@link hearthstone.Hero#getHeroDesc <em>Hero Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hero Desc</em>' attribute.
	 * @see #getHeroDesc()
	 * @generated
	 */
	void setHeroDesc(String value);

} // Hero
