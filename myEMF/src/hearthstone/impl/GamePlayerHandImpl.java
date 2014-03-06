/**
 */
package hearthstone.impl;

import hearthstone.Card;
import hearthstone.GamePlayerHand;
import hearthstone.HearthstonePackage;
import hearthstone.Player;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Player Hand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hearthstone.impl.GamePlayerHandImpl#getCardsInHand <em>Cards In Hand</em>}</li>
 *   <li>{@link hearthstone.impl.GamePlayerHandImpl#getHandOwner <em>Hand Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GamePlayerHandImpl extends GameDeckImpl implements GamePlayerHand {
	/**
	 * The cached value of the '{@link #getCardsInHand() <em>Cards In Hand</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardsInHand()
	 * @generated
	 * @ordered
	 */
	protected EList<Card> cardsInHand;

	/**
	 * The default value of the '{@link #getHandOwner() <em>Hand Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandOwner()
	 * @generated
	 * @ordered
	 */
	protected static final String HAND_OWNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandOwner() <em>Hand Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandOwner()
	 * @generated
	 * @ordered
	 */
	protected String handOwner = HAND_OWNER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GamePlayerHandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HearthstonePackage.Literals.GAME_PLAYER_HAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Card> getCardsInHand() {
		if (cardsInHand == null) {
			cardsInHand = new EObjectContainmentEList<Card>(Card.class, this, HearthstonePackage.GAME_PLAYER_HAND__CARDS_IN_HAND);
		}
		return cardsInHand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHandOwner() {
		return handOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandOwner(String newHandOwner) {
		String oldHandOwner = handOwner;
		handOwner = newHandOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HearthstonePackage.GAME_PLAYER_HAND__HAND_OWNER, oldHandOwner, handOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void ShowGameHand() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		System.out.println("[Hands report] For player "+this.getHandOwner());
		if (this.getCardsInHand().size() == 0){
			System.out.println("[Hands report] Current there is no card in hand.");
		}else{
			for(int t = 0; t<this.getCardsInHand().size(); t++){
				System.out.println("[Hands report] "+this.getCardsInHand().get(t));
			}	
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * remove a card from game deck, and add it to player hand
	 * This method was moved to Player, following code will no longer be used
	 */
	public boolean DrawCard(Player _player) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		if(_player.getPlayerHasDeck().getDeckHasCards().size() > 0){
			System.out.println("Cards in deck left "+_player.getPlayerHasDeck().getDeckHasCards().size()+" A card of ["+_player.getPlayerHasDeck().getDeckHasCards().get(0).getCardName()+"] has drew to hand");
			_player.getCardsInHand().getCardsInHand().add(_player.getPlayerHasDeck().getDeckHasCards().get(0));
			//_player.getPlayerHasDeck().getDeckHasCards().remove(0); // don't need this
			return true;	
		}else{
			System.out.println("No more cards in the deck");
			return false;
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
			case HearthstonePackage.GAME_PLAYER_HAND__CARDS_IN_HAND:
				return ((InternalEList<?>)getCardsInHand()).basicRemove(otherEnd, msgs);
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
			case HearthstonePackage.GAME_PLAYER_HAND__CARDS_IN_HAND:
				return getCardsInHand();
			case HearthstonePackage.GAME_PLAYER_HAND__HAND_OWNER:
				return getHandOwner();
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
			case HearthstonePackage.GAME_PLAYER_HAND__CARDS_IN_HAND:
				getCardsInHand().clear();
				getCardsInHand().addAll((Collection<? extends Card>)newValue);
				return;
			case HearthstonePackage.GAME_PLAYER_HAND__HAND_OWNER:
				setHandOwner((String)newValue);
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
			case HearthstonePackage.GAME_PLAYER_HAND__CARDS_IN_HAND:
				getCardsInHand().clear();
				return;
			case HearthstonePackage.GAME_PLAYER_HAND__HAND_OWNER:
				setHandOwner(HAND_OWNER_EDEFAULT);
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
			case HearthstonePackage.GAME_PLAYER_HAND__CARDS_IN_HAND:
				return cardsInHand != null && !cardsInHand.isEmpty();
			case HearthstonePackage.GAME_PLAYER_HAND__HAND_OWNER:
				return HAND_OWNER_EDEFAULT == null ? handOwner != null : !HAND_OWNER_EDEFAULT.equals(handOwner);
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
			case HearthstonePackage.GAME_PLAYER_HAND___SHOW_GAME_HAND:
				ShowGameHand();
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
		result.append(" (HandOwner: ");
		result.append(handOwner);
		result.append(')');
		return result.toString();
	}

} //GamePlayerHandImpl
