/**
 */
package hearthstone;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Hero States</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see hearthstone.HearthstonePackage#getHeroStates()
 * @model
 * @generated
 */
public enum HeroStates implements Enumerator {
	/**
	 * The '<em><b>Ready For Action</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READY_FOR_ACTION_VALUE
	 * @generated
	 * @ordered
	 */
	READY_FOR_ACTION(1, "ReadyForAction", "ReadyForAction"),

	/**
	 * The '<em><b>Acted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTED_VALUE
	 * @generated
	 * @ordered
	 */
	ACTED(2, "Acted", "Acted"),

	/**
	 * The '<em><b>Dead</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEAD_VALUE
	 * @generated
	 * @ordered
	 */
	DEAD(3, "Dead", "Dead");

	/**
	 * The '<em><b>Ready For Action</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ready For Action</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READY_FOR_ACTION
	 * @model name="ReadyForAction"
	 * @generated
	 * @ordered
	 */
	public static final int READY_FOR_ACTION_VALUE = 1;

	/**
	 * The '<em><b>Acted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Acted</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACTED
	 * @model name="Acted"
	 * @generated
	 * @ordered
	 */
	public static final int ACTED_VALUE = 2;

	/**
	 * The '<em><b>Dead</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dead</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEAD
	 * @model name="Dead"
	 * @generated
	 * @ordered
	 */
	public static final int DEAD_VALUE = 3;

	/**
	 * An array of all the '<em><b>Hero States</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HeroStates[] VALUES_ARRAY =
		new HeroStates[] {
			READY_FOR_ACTION,
			ACTED,
			DEAD,
		};

	/**
	 * A public read-only list of all the '<em><b>Hero States</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HeroStates> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Hero States</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HeroStates get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HeroStates result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hero States</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HeroStates getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HeroStates result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hero States</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HeroStates get(int value) {
		switch (value) {
			case READY_FOR_ACTION_VALUE: return READY_FOR_ACTION;
			case ACTED_VALUE: return ACTED;
			case DEAD_VALUE: return DEAD;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private HeroStates(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //HeroStates
