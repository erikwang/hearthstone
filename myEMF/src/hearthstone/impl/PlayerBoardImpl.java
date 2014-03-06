/**
 */
package hearthstone.impl;

import hearthstone.HearthstonePackage;
import hearthstone.PlayerBoard;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Player Board</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hearthstone.impl.PlayerBoardImpl#getBoardOwner <em>Board Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlayerBoardImpl extends DeckImpl implements PlayerBoard {
	/**
	 * The default value of the '{@link #getBoardOwner() <em>Board Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardOwner()
	 * @generated
	 * @ordered
	 */
	protected static final String BOARD_OWNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoardOwner() <em>Board Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardOwner()
	 * @generated
	 * @ordered
	 */
	protected String boardOwner = BOARD_OWNER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerBoardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HearthstonePackage.Literals.PLAYER_BOARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBoardOwner() {
		return boardOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoardOwner(String newBoardOwner) {
		String oldBoardOwner = boardOwner;
		boardOwner = newBoardOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.PLAYER_BOARD__BOARD_OWNER, oldBoardOwner, boardOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void ShowPlayerBoard() {
		if(this.getDeckHasCards().size() > 0){
			System.out.println("- Show Game board for Player, cards on board: "+this.getDeckHasCards().size()+" cards on board");				
			this.ShowCardsInDeck();
		}else{
			System.out.println("- No cards on player's board");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HearthstonePackage.PLAYER_BOARD__BOARD_OWNER:
				return getBoardOwner();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HearthstonePackage.PLAYER_BOARD__BOARD_OWNER:
				setBoardOwner((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HearthstonePackage.PLAYER_BOARD__BOARD_OWNER:
				setBoardOwner(BOARD_OWNER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HearthstonePackage.PLAYER_BOARD__BOARD_OWNER:
				return BOARD_OWNER_EDEFAULT == null ? boardOwner != null : !BOARD_OWNER_EDEFAULT.equals(boardOwner);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HearthstonePackage.PLAYER_BOARD___SHOW_PLAYER_BOARD:
				ShowPlayerBoard();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (BoardOwner: ");
		result.append(boardOwner);
		result.append(')');
		return result.toString();
	}

} //PlayerBoardImpl
