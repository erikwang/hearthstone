/**
 */
package hearthstone.tests;

import hearthstone.Deck;
import hearthstone.HearthstoneFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Deck</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link hearthstone.Deck#Hello() <em>Hello</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class DeckTest extends TestCase {

	/**
	 * The fixture for this Deck test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Deck fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DeckTest.class);
	}

	/**
	 * Constructs a new Deck test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeckTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Deck test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Deck fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Deck test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Deck getFixture() {
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
		setFixture(HearthstoneFactory.eINSTANCE.createDeck());
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
	 * Tests the '{@link hearthstone.Deck#Hello() <em>Hello</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hearthstone.Deck#Hello()
	 * @generated
	 */
	public void testHello() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //DeckTest
