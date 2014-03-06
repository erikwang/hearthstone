/**
 */
package hearthstone.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>HearthStone</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class HearthStoneAllTests extends TestSuite {

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
		TestSuite suite = new HearthStoneAllTests("HearthStone Tests");
		suite.addTest(HearthstoneTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HearthStoneAllTests(String name) {
		super(name);
	}

} //HearthStoneAllTests
