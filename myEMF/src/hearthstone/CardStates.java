/**
 */
package hearthstone;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Card States</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see hearthstone.HearthstonePackage#getCardStates()
 * @model
 * @generated
 */
public enum CardStates implements Enumerator {
	/**
	 * The '<em><b>In Deck</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_DECK_VALUE
	 * @generated
	 * @ordered
	 */
	IN_DECK(1, "InDeck", "InDeck"),

	/**
	 * The '<em><b>In Player Hand</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_PLAYER_HAND_VALUE
	 * @generated
	 * @ordered
	 */
	IN_PLAYER_HAND(2, "InPlayerHand", "InPlayerHand"),

	/**
	 * The '<em><b>Sleep</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLEEP_VALUE
	 * @generated
	 * @ordered
	 */
	SLEEP(3, "Sleep", "Sleep"),

	/**
	 * The '<em><b>Ready For Action</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READY_FOR_ACTION_VALUE
	 * @generated
	 * @ordered
	 */
	READY_FOR_ACTION(4, "ReadyForAction", "ReadyForAction"),

	/**
	 * The '<em><b>Dead</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEAD_VALUE
	 * @generated
	 * @ordered
	 */
	DEAD(6, "Dead", "Dead"),

	/**
	 * The '<em><b>Acted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTED_VALUE
	 * @generated
	 * @ordered
	 */
	ACTED(0, "Acted", "Acted");

	/**
	 * The '<em><b>In Deck</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>In Deck</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN_DECK
	 * @model name="InDeck"
	 * @generated
	 * @ordered
	 */
	public static final int IN_DECK_VALUE = 1;

	/**
	 * The '<em><b>In Player Hand</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>In Player Hand</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN_PLAYER_HAND
	 * @model name="InPlayerHand"
	 * @generated
	 * @ordered
	 */
	public static final int IN_PLAYER_HAND_VALUE = 2;

	/**
	 * The '<em><b>Sleep</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sleep</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SLEEP
	 * @model name="Sleep"
	 * @generated
	 * @ordered
	 */
	public static final int SLEEP_VALUE = 3;

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
	public static final int READY_FOR_ACTION_VALUE = 4;

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
	public static final int DEAD_VALUE = 6;

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
	public static final int ACTED_VALUE = 0;

	/**
	 * An array of all the '<em><b>Card States</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CardStates[] VALUES_ARRAY =
		new CardStates[] {
			IN_DECK,
			IN_PLAYER_HAND,
			SLEEP,
			READY_FOR_ACTION,
			DEAD,
			ACTED,
		};

	/**
	 * A public read-only list of all the '<em><b>Card States</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CardStates> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Card States</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CardStates get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CardStates result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Card States</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CardStates getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CardStates result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Card States</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CardStates get(int value) {
		switch (value) {
			case IN_DECK_VALUE: return IN_DECK;
			case IN_PLAYER_HAND_VALUE: return IN_PLAYER_HAND;
			case SLEEP_VALUE: return SLEEP;
			case READY_FOR_ACTION_VALUE: return READY_FOR_ACTION;
			case DEAD_VALUE: return DEAD;
			case ACTED_VALUE: return ACTED;
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
	private CardStates(int value, String name, String literal) {
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
	
} //CardStates
