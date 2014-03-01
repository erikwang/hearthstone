/**
 */
package hearthstone.util;

import hearthstone.*;
import hearthstone.Ability;
import hearthstone.Card;
import hearthstone.Deck;
import hearthstone.EGame;
import hearthstone.EGameBoard;
import hearthstone.EGameDeck;
import hearthstone.EGamePlayerHand;
import hearthstone.HearthstonePackage;
import hearthstone.Player;
import hearthstone.PlayerBoard;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hearthstone.HearthstonePackage
 * @generated
 */
public class HearthstoneAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HearthstonePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HearthstoneAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HearthstonePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HearthstoneSwitch<Adapter> modelSwitch =
		new HearthstoneSwitch<Adapter>() {
			@Override
			public Adapter caseCard(Card object) {
				return createCardAdapter();
			}
			@Override
			public Adapter caseDeck(Deck object) {
				return createDeckAdapter();
			}
			@Override
			public Adapter caseAbility(Ability object) {
				return createAbilityAdapter();
			}
			@Override
			public Adapter caseEGamePlayerHand(EGamePlayerHand object) {
				return createEGamePlayerHandAdapter();
			}
			@Override
			public Adapter caseEGameBoard(EGameBoard object) {
				return createEGameBoardAdapter();
			}
			@Override
			public Adapter caseEGameDeck(EGameDeck object) {
				return createEGameDeckAdapter();
			}
			@Override
			public Adapter caseEGame(EGame object) {
				return createEGameAdapter();
			}
			@Override
			public Adapter casePlayer(Player object) {
				return createPlayerAdapter();
			}
			@Override
			public Adapter casePlayerBoard(PlayerBoard object) {
				return createPlayerBoardAdapter();
			}
			@Override
			public Adapter caseHero(Hero object) {
				return createHeroAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link hearthstone.Card <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hearthstone.Card
	 * @generated
	 */
	public Adapter createCardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hearthstone.Deck <em>Deck</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hearthstone.Deck
	 * @generated
	 */
	public Adapter createDeckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hearthstone.Ability <em>Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hearthstone.Ability
	 * @generated
	 */
	public Adapter createAbilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hearthstone.EGamePlayerHand <em>EGame Player Hand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hearthstone.EGamePlayerHand
	 * @generated
	 */
	public Adapter createEGamePlayerHandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hearthstone.EGameBoard <em>EGame Board</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hearthstone.EGameBoard
	 * @generated
	 */
	public Adapter createEGameBoardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hearthstone.EGameDeck <em>EGame Deck</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hearthstone.EGameDeck
	 * @generated
	 */
	public Adapter createEGameDeckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hearthstone.EGame <em>EGame</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hearthstone.EGame
	 * @generated
	 */
	public Adapter createEGameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hearthstone.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hearthstone.Player
	 * @generated
	 */
	public Adapter createPlayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hearthstone.PlayerBoard <em>Player Board</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hearthstone.PlayerBoard
	 * @generated
	 */
	public Adapter createPlayerBoardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hearthstone.Hero <em>Hero</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hearthstone.Hero
	 * @generated
	 */
	public Adapter createHeroAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //HearthstoneAdapterFactory
