/**
 */
package hearthstone;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hearthstone.Player#getName <em>Name</em>}</li>
 *   <li>{@link hearthstone.Player#getTotalWins <em>Total Wins</em>}</li>
 *   <li>{@link hearthstone.Player#getPlayerHasDeck <em>Player Has Deck</em>}</li>
 *   <li>{@link hearthstone.Player#getCardsInHand <em>Cards In Hand</em>}</li>
 *   <li>{@link hearthstone.Player#getPlayerHasOwnBoard <em>Player Has Own Board</em>}</li>
 *   <li>{@link hearthstone.Player#getPlayerID <em>Player ID</em>}</li>
 *   <li>{@link hearthstone.Player#getLastLogin <em>Last Login</em>}</li>
 *   <li>{@link hearthstone.Player#getPlayerLevel <em>Player Level</em>}</li>
 *   <li>{@link hearthstone.Player#getPlayerHasGameStartDeck <em>Player Has Game Start Deck</em>}</li>
 *   <li>{@link hearthstone.Player#getPlayerHasDeckSet <em>Player Has Deck Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see hearthstone.HearthstonePackage#getPlayer()
 * @model
 * @generated
 */
public interface Player extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hearthstone.HearthstonePackage#getPlayer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hearthstone.Player#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Total Wins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Wins</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Wins</em>' attribute.
	 * @see #setTotalWins(int)
	 * @see hearthstone.HearthstonePackage#getPlayer_TotalWins()
	 * @model
	 * @generated
	 */
	int getTotalWins();

	/**
	 * Sets the value of the '{@link hearthstone.Player#getTotalWins <em>Total Wins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Wins</em>' attribute.
	 * @see #getTotalWins()
	 * @generated
	 */
	void setTotalWins(int value);

	/**
	 * Returns the value of the '<em><b>Player Has Deck</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Player Has Deck</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player Has Deck</em>' containment reference.
	 * @see #setPlayerHasDeck(GameDeck)
	 * @see hearthstone.HearthstonePackage#getPlayer_PlayerHasDeck()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GameDeck getPlayerHasDeck();

	/**
	 * Sets the value of the '{@link hearthstone.Player#getPlayerHasDeck <em>Player Has Deck</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player Has Deck</em>' containment reference.
	 * @see #getPlayerHasDeck()
	 * @generated
	 */
	void setPlayerHasDeck(GameDeck value);

	/**
	 * Returns the value of the '<em><b>Cards In Hand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cards In Hand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cards In Hand</em>' containment reference.
	 * @see #setCardsInHand(GamePlayerHand)
	 * @see hearthstone.HearthstonePackage#getPlayer_CardsInHand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GamePlayerHand getCardsInHand();

	/**
	 * Sets the value of the '{@link hearthstone.Player#getCardsInHand <em>Cards In Hand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cards In Hand</em>' containment reference.
	 * @see #getCardsInHand()
	 * @generated
	 */
	void setCardsInHand(GamePlayerHand value);

	/**
	 * Returns the value of the '<em><b>Player Has Own Board</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Player Has Own Board</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player Has Own Board</em>' containment reference.
	 * @see #setPlayerHasOwnBoard(PlayerBoard)
	 * @see hearthstone.HearthstonePackage#getPlayer_PlayerHasOwnBoard()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PlayerBoard getPlayerHasOwnBoard();

	/**
	 * Sets the value of the '{@link hearthstone.Player#getPlayerHasOwnBoard <em>Player Has Own Board</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player Has Own Board</em>' containment reference.
	 * @see #getPlayerHasOwnBoard()
	 * @generated
	 */
	void setPlayerHasOwnBoard(PlayerBoard value);

	/**
	 * Returns the value of the '<em><b>Player ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Player ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player ID</em>' attribute.
	 * @see #setPlayerID(int)
	 * @see hearthstone.HearthstonePackage#getPlayer_PlayerID()
	 * @model
	 * @generated
	 */
	int getPlayerID();

	/**
	 * Sets the value of the '{@link hearthstone.Player#getPlayerID <em>Player ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player ID</em>' attribute.
	 * @see #getPlayerID()
	 * @generated
	 */
	void setPlayerID(int value);

	/**
	 * Returns the value of the '<em><b>Last Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Login</em>' attribute.
	 * @see #setLastLogin(Date)
	 * @see hearthstone.HearthstonePackage#getPlayer_LastLogin()
	 * @model
	 * @generated
	 */
	Date getLastLogin();

	/**
	 * Sets the value of the '{@link hearthstone.Player#getLastLogin <em>Last Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Login</em>' attribute.
	 * @see #getLastLogin()
	 * @generated
	 */
	void setLastLogin(Date value);

	/**
	 * Returns the value of the '<em><b>Player Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Player Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player Level</em>' attribute.
	 * @see #setPlayerLevel(int)
	 * @see hearthstone.HearthstonePackage#getPlayer_PlayerLevel()
	 * @model
	 * @generated
	 */
	int getPlayerLevel();

	/**
	 * Sets the value of the '{@link hearthstone.Player#getPlayerLevel <em>Player Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player Level</em>' attribute.
	 * @see #getPlayerLevel()
	 * @generated
	 */
	void setPlayerLevel(int value);

	/**
	 * Returns the value of the '<em><b>Player Has Game Start Deck</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Player Has Game Start Deck</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player Has Game Start Deck</em>' containment reference.
	 * @see #setPlayerHasGameStartDeck(Deck)
	 * @see hearthstone.HearthstonePackage#getPlayer_PlayerHasGameStartDeck()
	 * @model containment="true"
	 * @generated
	 */
	Deck getPlayerHasGameStartDeck();

	/**
	 * Sets the value of the '{@link hearthstone.Player#getPlayerHasGameStartDeck <em>Player Has Game Start Deck</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player Has Game Start Deck</em>' containment reference.
	 * @see #getPlayerHasGameStartDeck()
	 * @generated
	 */
	void setPlayerHasGameStartDeck(Deck value);

	/**
	 * Returns the value of the '<em><b>Player Has Deck Set</b></em>' containment reference list.
	 * The list contents are of type {@link hearthstone.Deck}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Player Has Deck Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player Has Deck Set</em>' containment reference list.
	 * @see hearthstone.HearthstonePackage#getPlayer_PlayerHasDeckSet()
	 * @model containment="true" upper="9"
	 * @generated
	 */
	EList<Deck> getPlayerHasDeckSet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void PlayCard(int _cardindex);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean OperateCard(Card _card);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean ClickNextTurnBtn();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" upper="5"
	 * @generated NOT
	 */
	boolean DrawCard();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void OperateCard();

} // Player
