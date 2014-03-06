/**
 */
package hearthstone;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Game State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see hearthstone.HearthstonePackage#getGameState()
 * @model
 * @generated
 */
public enum GameState implements Enumerator {
	/**
	 * The '<em><b>Created</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATED_VALUE
	 * @generated
	 * @ordered
	 */
	CREATED(0, "Created", "Created"),

	/**
	 * The '<em><b>Playing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAYING_VALUE
	 * @generated
	 * @ordered
	 */
	PLAYING(1, "Playing", "Playing"),

	/**
	 * The '<em><b>Over</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVER_VALUE
	 * @generated
	 * @ordered
	 */
	OVER(2, "Over", "Over"),

	/**
	 * The '<em><b>Halt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALT_VALUE
	 * @generated
	 * @ordered
	 */
	HALT(3, "Halt", "Halt");

	/**
	 * The '<em><b>Created</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Created</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CREATED
	 * @model name="Created"
	 * @generated
	 * @ordered
	 */
	public static final int CREATED_VALUE = 0;

	/**
	 * The '<em><b>Playing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Playing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLAYING
	 * @model name="Playing"
	 * @generated
	 * @ordered
	 */
	public static final int PLAYING_VALUE = 1;

	/**
	 * The '<em><b>Over</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Over</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OVER
	 * @model name="Over"
	 * @generated
	 * @ordered
	 */
	public static final int OVER_VALUE = 2;

	/**
	 * The '<em><b>Halt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Halt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HALT
	 * @model name="Halt"
	 * @generated
	 * @ordered
	 */
	public static final int HALT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Game State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GameState[] VALUES_ARRAY =
		new GameState[] {
			CREATED,
			PLAYING,
			OVER,
			HALT,
		};

	/**
	 * A public read-only list of all the '<em><b>Game State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GameState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Game State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GameState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GameState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Game State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GameState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GameState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Game State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GameState get(int value) {
		switch (value) {
			case CREATED_VALUE: return CREATED;
			case PLAYING_VALUE: return PLAYING;
			case OVER_VALUE: return OVER;
			case HALT_VALUE: return HALT;
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
	private GameState(int value, String name, String literal) {
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
	
} //GameState
