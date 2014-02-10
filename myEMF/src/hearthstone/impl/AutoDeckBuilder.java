package hearthstone.impl;
import hearthstone.Card;
import hearthstone.Deck;
import hearthstone.util.AllCards;
import util.*;

public class AutoDeckBuilder {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeckImpl myDeck = new DeckImpl();
		myDeck.Hello();
		AllCards ac = new AllCards();
		try {
			ac.GetCardsFromDb();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("A random deck is ready for you:");
		ac.getRandomDeck();
	}

}
