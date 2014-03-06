/**
 */
package hearthstone.tests;

import hearthstone.Card;
import hearthstone.HearthstoneFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link hearthstone.Card#PlayCard() <em>Play Card</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class CardTest extends TestCase {

	/**
	 * The fixture for this Card test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Card fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CardTest.class);
	}

	/**
	 * Constructs a new Card test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Card test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Card fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Card test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Card getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HearthstoneFactory.eINSTANCE.createCard());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link hearthstone.Card#PlayCard() <em>Play Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hearthstone.Card#PlayCard()
	 * @generated
	 */
	public void testPlayCard() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //CardTest
