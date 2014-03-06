/**
 */
package hearthstone.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>hearthstone</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class HearthstoneTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new HearthstoneTests("hearthstone Tests");
		suite.addTestSuite(CardTest.class);
		suite.addTestSuite(DeckTest.class);
		suite.addTestSuite(AbilityTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HearthstoneTests(String name) {
		super(name);
	}

} //HearthstoneTests
