package hearthstone.util;
import hearthstone.Card;
import hearthstone.CardQuality;
import hearthstone.Deck;
import hearthstone.EGamePlayerHand;
import hearthstone.HearthstoneFactory;
import hearthstone.impl.DeckImpl;
import hearthstone.impl.HearthstoneFactoryImpl;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.*;

import org.eclipse.emf.common.util.ECollections;


public class AllCards {
	Hashtable<Integer, Card> allcards = new Hashtable<Integer, Card>();
	Card tempcard;
	HearthstoneFactory cf = HearthstoneFactory.eINSTANCE;
	int NUMOFCARDS = 443;
	List<Card> myDeck = new ArrayList<Card>();
	Deck myRealDeck = cf.createDeck();
	
	public Card getACard(int sn){
		return allcards.get(new Integer(sn));
	}
	

	
	
	public void GetCardsFromDb() throws Exception{
		String sql1 = "SELECT * FROM hearthstone.cards";
		Dbconn db;
		db = new Dbconn();
		ResultSet rst1 = null;
		Statement stmt1 = db.createStatement();
		rst1 = stmt1.executeQuery(sql1);
		ResultSetMetaData rsmd = rst1.getMetaData();
		int numberOfColumns = rsmd.getColumnCount();
		
		/*
		 * 1 - Sn int
		 * 2 - Name String
		 * 3 - Quality String
		 * 4 - Cost int (includes null)
		 * 5 - Type String
		 * 6 - Attack int (includes null)
		 * 7 - Health int  (includes null)
		 * 8 - Special String (includes null)
		 * 9 - Class (Mag, Hun, etc.)
		 */

		int sn;
		String name;
		CardQuality quality;
		String cost;
		String type;
		int attack;
		int health;
		String ability;
		String cardclass;
		
		for (;rst1.next();){
				//System.out.println(rst1.getString(rsmd.getColumnName(y)));
				tempcard = cf.createCard();
				sn = rst1.getInt(1);
				name = rst1.getString(2);
				cost = rst1.getString(4);
				quality = CardQuality.get(rst1.getString(3));
				ability = rst1.getString(8);
				cardclass = rst1.getString(9);
				tempcard.setCardSN(sn);
				tempcard.setCardName(name);
				tempcard.setCardQuality(quality);
				tempcard.setCardAbilityDesc(ability);
				tempcard.setCardCost(cost);
				tempcard.setCardClass(cardclass);
				//System.out.println("Card sn "+sn+"- "+ tempcard.getCardName()+" is loaded");
				allcards.put(sn, tempcard);
		}
		
		System.out.println("[ALL CARD] = "+allcards.size());
		rst1.close();
		stmt1.close();
	}
	
	Comparator<Card> comparator = new Comparator<Card>() {
	    public int compare(Card c1, Card c2) { //override 
	    	int cost1, cost2;
	    	if(c1.getCardCost().equals("-")){
	    		cost1 = 0;
	    	}else{
	    		cost1 = new Integer(c1.getCardCost()).intValue();
	    	}
	    	if(c2.getCardCost().equals("-"
	    			+ "")){
	    		cost2 = 0;
	    	}else{
	    		cost2 = new Integer(c2.getCardCost()).intValue();
	    	}
	    	return (cost1>cost2 ? 1 : (cost1== cost2 ? 0 : -1));		// less -1, equal 0, greater 1    	
	    }
	};
	

	
	
	public void getRandomDeck(int _tt){
		myRealDeck.setDeckName("My Deck #"+_tt);
		myRealDeck.getDeckHasCards().clear();
		myDeck.clear();
		Random randomGenerator = new Random();
		
		int ccount = 0;
		while(ccount < 30){
			int cardsn = 1 + randomGenerator.nextInt(NUMOFCARDS);
			Card tdcard = cf.eINSTANCE.createCard();
			tdcard = allcards.get(cardsn);
			//System.out.println("--> Card sn "+cardsn+":"+tdcard.getCardSN()+"- "+ tdcard.getCardName()+" was drew");
			Card thecard = cf.eINSTANCE.createCard();
			//Card thecard = cf.eINSTANCE.create(Card);
			thecard = tdcard;
			
			if(checkDuplicate(thecard)){
						
				
					myDeck.add(tdcard);
					thecard.setCardDeckSN(ccount);
					myRealDeck.getDeckHasCards().add(thecard);
					//myRealDeck.getDeckHasCards().add(ccount,thecard);
					System.out.println(tdcard.getCardName() + " | "+thecard.getCardName());
					ccount++;
			}
		}
		
		Collections.sort(myDeck,comparator);
		ECollections.sort(myRealDeck.getDeckHasCards(),comparator);

		showDeck();
		showRealDeck();
	}
	
	public void showDeck(){
		Card dcard = cf.createCard();
		for(int t=0;t<myDeck.size();t++){
			dcard = myDeck.get(t);
			System.out.println("[" + dcard.getCardCost()+"]["+dcard.getCardQuality()+"]["+dcard.getCardClass()+"]["+dcard.getCardName()+"]["+dcard.getCardAbilityDesc()+"]");
		}
	}
	
	public void showRealDeck(){
		//Card dcard = cf.createCard();
		System.out.println(myRealDeck.getDeckName()+" - RealDeckSize is "+myRealDeck.getDeckHasCards().size());
		for(int t=0;t<myRealDeck.getDeckHasCards().size();t++){
			System.out.println("{" + myRealDeck.getDeckHasCards().get(t).getCardDeckSN()+" "+myRealDeck.getDeckHasCards().get(t).getCardCost()+"}["+myRealDeck.getDeckHasCards().get(t).getCardQuality()+"]["+myRealDeck.getDeckHasCards().get(t).getCardClass()+"]["+myRealDeck.getDeckHasCards().get(t).getCardName()+"]["+myRealDeck.getDeckHasCards().get(t).getCardAbilityDesc()+"]");
		}
		
	}
	
	
	
	// In a deck, one card can only has maximum 2 of the same
	public boolean checkDuplicate(Card _card){
		boolean flag = true;
		int count = 0;
		for(int t=0;t<myRealDeck.getDeckHasCards().size();t++){
			//System.out.println(_card.getCardSN()+"!!!!"+ myRealDeck.getDeckHasCards().get(t).getCardSN());
			if (_card.getCardSN() == myRealDeck.getDeckHasCards().get(t).getCardSN()){
				count++;
				if(count > 2){
					flag = false;
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! find one!!!");
					return flag;	
				}
			}
		}
		return flag;
			
	}

}

