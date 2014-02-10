/**
 */
package hearthstone;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Class</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see hearthstone.HearthstonePackage#getClass()
 * @model
 * @generated
 */
public enum Class implements Enumerator {
	/**
	 * The '<em><b>Mage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAGE_VALUE
	 * @generated
	 * @ordered
	 */
	MAGE(0, "Mage", "Mage"),

	/**
	 * The '<em><b>Priest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIEST_VALUE
	 * @generated
	 * @ordered
	 */
	PRIEST(1, "Priest", "Priest"),

	/**
	 * The '<em><b>Paladin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PALADIN_VALUE
	 * @generated
	 * @ordered
	 */
	PALADIN(2, "Paladin", "Paladin"),

	/**
	 * The '<em><b>Warlock</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WARLOCK_VALUE
	 * @generated
	 * @ordered
	 */
	WARLOCK(3, "Warlock", "Warlock"),

	/**
	 * The '<em><b>Hunter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HUNTER_VALUE
	 * @generated
	 * @ordered
	 */
	HUNTER(4, "Hunter", "Hunter"),

	/**
	 * The '<em><b>Rogue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROGUE_VALUE
	 * @generated
	 * @ordered
	 */
	ROGUE(5, "Rogue", "Rogue"),

	/**
	 * The '<em><b>Druid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRUID_VALUE
	 * @generated
	 * @ordered
	 */
	DRUID(6, "Druid", "Druid"),

	/**
	 * The '<em><b>Warrior</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WARRIOR_VALUE
	 * @generated
	 * @ordered
	 */
	WARRIOR(7, "Warrior", "Warrior"),

	/**
	 * The '<em><b>Shaman</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHAMAN_VALUE
	 * @generated
	 * @ordered
	 */
	SHAMAN(8, "Shaman", "Shaman");

	/**
	 * The '<em><b>Mage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mage</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAGE
	 * @model name="Mage"
	 * @generated
	 * @ordered
	 */
	public static final int MAGE_VALUE = 0;

	/**
	 * The '<em><b>Priest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Priest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIEST
	 * @model name="Priest"
	 * @generated
	 * @ordered
	 */
	public static final int PRIEST_VALUE = 1;

	/**
	 * The '<em><b>Paladin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Paladin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PALADIN
	 * @model name="Paladin"
	 * @generated
	 * @ordered
	 */
	public static final int PALADIN_VALUE = 2;

	/**
	 * The '<em><b>Warlock</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Warlock</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WARLOCK
	 * @model name="Warlock"
	 * @generated
	 * @ordered
	 */
	public static final int WARLOCK_VALUE = 3;

	/**
	 * The '<em><b>Hunter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hunter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HUNTER
	 * @model name="Hunter"
	 * @generated
	 * @ordered
	 */
	public static final int HUNTER_VALUE = 4;

	/**
	 * The '<em><b>Rogue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rogue</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROGUE
	 * @model name="Rogue"
	 * @generated
	 * @ordered
	 */
	public static final int ROGUE_VALUE = 5;

	/**
	 * The '<em><b>Druid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Druid</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRUID
	 * @model name="Druid"
	 * @generated
	 * @ordered
	 */
	public static final int DRUID_VALUE = 6;

	/**
	 * The '<em><b>Warrior</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Warrior</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WARRIOR
	 * @model name="Warrior"
	 * @generated
	 * @ordered
	 */
	public static final int WARRIOR_VALUE = 7;

	/**
	 * The '<em><b>Shaman</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Shaman</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHAMAN
	 * @model name="Shaman"
	 * @generated
	 * @ordered
	 */
	public static final int SHAMAN_VALUE = 8;

	/**
	 * An array of all the '<em><b>Class</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Class[] VALUES_ARRAY =
		new Class[] {
			MAGE,
			PRIEST,
			PALADIN,
			WARLOCK,
			HUNTER,
			ROGUE,
			DRUID,
			WARRIOR,
			SHAMAN,
		};

	/**
	 * A public read-only list of all the '<em><b>Class</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Class> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Class</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Class get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Class result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Class</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Class getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Class result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Class</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Class get(int value) {
		switch (value) {
			case MAGE_VALUE: return MAGE;
			case PRIEST_VALUE: return PRIEST;
			case PALADIN_VALUE: return PALADIN;
			case WARLOCK_VALUE: return WARLOCK;
			case HUNTER_VALUE: return HUNTER;
			case ROGUE_VALUE: return ROGUE;
			case DRUID_VALUE: return DRUID;
			case WARRIOR_VALUE: return WARRIOR;
			case SHAMAN_VALUE: return SHAMAN;
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
	private Class(int value, String name, String literal) {
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
	
} //Class
