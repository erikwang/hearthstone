/**
 */
package hearthstone.impl;

import hearthstone.GameBoard;
import hearthstone.HearthstonePackage;
import hearthstone.PlayerBoard;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Board</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hearthstone.impl.GameBoardImpl#getGameBoardHasTwoPlayerBoard <em>Game Board Has Two Player Board</em>}</li>
 *   <li>{@link hearthstone.impl.GameBoardImpl#getBoardSN <em>Board SN</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GameBoardImpl extends MinimalEObjectImpl.Container implements GameBoard {
	/**
	 * The cached value of the '{@link #getGameBoardHasTwoPlayerBoard() <em>Game Board Has Two Player Board</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameBoardHasTwoPlayerBoard()
	 * @generated
	 * @ordered
	 */
	protected EList<PlayerBoard> gameBoardHasTwoPlayerBoard;

	/**
	 * The default value of the '{@link #getBoardSN() <em>Board SN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardSN()
	 * @generated
	 * @ordered
	 */
	protected static final int BOARD_SN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBoardSN() <em>Board SN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardSN()
	 * @generated
	 * @ordered
	 */
	protected int boardSN = BOARD_SN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameBoardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HearthstonePackage.Literals.GAME_BOARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlayerBoard> getGameBoardHasTwoPlayerBoard() {
		if (gameBoardHasTwoPlayerBoard == null) {
			gameBoardHasTwoPlayerBoard = new EObjectContainmentEList<PlayerBoard>(PlayerBoard.class, this, HearthstonePackage.GAME_BOARD__GAME_BOARD_HAS_TWO_PLAYER_BOARD);
		}
		return gameBoardHasTwoPlayerBoard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBoardSN() {
		return boardSN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoardSN(int newBoardSN) {
		int oldBoardSN = boardSN;
		boardSN = newBoardSN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.GAME_BOARD__BOARD_SN, oldBoardSN, boardSN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void ShowGameBoard(int pindex) {
		
		switch (pindex){
		case 1:
			if(this.getGameBoardHasTwoPlayerBoard().get(0).getDeckHasCards().size() > 0){
				System.out.println("- Show Game board for Player 1, cards on board: "+this.getGameBoardHasTwoPlayerBoard().get(0).getDeckHasCards().size()+" cards on board");				
				this.getGameBoardHasTwoPlayerBoard().get(0).ShowCardsInDeck();
			}else{
				System.out.println("- No cards on player1's board");
			}
			break;
			
		case 2:
			if(this.getGameBoardHasTwoPlayerBoard().get(1).getDeckHasCards().size() > 0){
				System.out.println("- Show Game board for Player 2, cards on board: "+this.getGameBoardHasTwoPlayerBoard().get(1).getDeckHasCards().size()+" cards on board");				
				this.getGameBoardHasTwoPlayerBoard().get(1).ShowCardsInDeck();
			}else{
				System.out.println("- No cards on player2's board");
			}
			break;
		
		default:
			if(this.getGameBoardHasTwoPlayerBoard().get(0).getDeckHasCards().size() > 0){
				System.out.println("- Show Game board for Player 1, cards on board: "+this.getGameBoardHasTwoPlayerBoard().get(0).getDeckHasCards().size()+" cards on board");				
				this.getGameBoardHasTwoPlayerBoard().get(0).ShowCardsInDeck();
			}else{
				System.out.println("- No cards on player1's board");
			}
			
			if(this.getGameBoardHasTwoPlayerBoard().get(1).getDeckHasCards().size() > 0){
				System.out.println("- Show Game board for Player 2, cards on board: "+this.getGameBoardHasTwoPlayerBoard().get(1).getDeckHasCards().size()+" cards on board");				
				this.getGameBoardHasTwoPlayerBoard().get(1).ShowCardsInDeck();
			}else{
				System.out.println("- No cards on player2's board");
			}
			break;		
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HearthstonePackage.GAME_BOARD__GAME_BOARD_HAS_TWO_PLAYER_BOARD:
				return ((InternalEList<?>)getGameBoardHasTwoPlayerBoard()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HearthstonePackage.GAME_BOARD__GAME_BOARD_HAS_TWO_PLAYER_BOARD:
				return getGameBoardHasTwoPlayerBoard();
			case HearthstonePackage.GAME_BOARD__BOARD_SN:
				return getBoardSN();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HearthstonePackage.GAME_BOARD__GAME_BOARD_HAS_TWO_PLAYER_BOARD:
				getGameBoardHasTwoPlayerBoard().clear();
				getGameBoardHasTwoPlayerBoard().addAll((Collection<? extends PlayerBoard>)newValue);
				return;
			case HearthstonePackage.GAME_BOARD__BOARD_SN:
				setBoardSN((Integer)newValue);
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
			case HearthstonePackage.GAME_BOARD__GAME_BOARD_HAS_TWO_PLAYER_BOARD:
				getGameBoardHasTwoPlayerBoard().clear();
				return;
			case HearthstonePackage.GAME_BOARD__BOARD_SN:
				setBoardSN(BOARD_SN_EDEFAULT);
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
			case HearthstonePackage.GAME_BOARD__GAME_BOARD_HAS_TWO_PLAYER_BOARD:
				return gameBoardHasTwoPlayerBoard != null && !gameBoardHasTwoPlayerBoard.isEmpty();
			case HearthstonePackage.GAME_BOARD__BOARD_SN:
				return boardSN != BOARD_SN_EDEFAULT;
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
			case HearthstonePackage.GAME_BOARD___SHOW_GAME_BOARD__INT:
				ShowGameBoard((Integer)arguments.get(0));
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
		result.append(" (BoardSN: ");
		result.append(boardSN);
		result.append(')');
		return result.toString();
	}

} //GameBoardImpl
