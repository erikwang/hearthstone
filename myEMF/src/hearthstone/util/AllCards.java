package hearthstone.util;
import hearthstone.Card;
import hearthstone.Deck;
import hearthstone.impl.DeckImpl;
import hearthstone.impl.HearthstoneFactoryImpl;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.*;


public class AllCards {
	Hashtable<Integer, Card> allcards = new Hashtable<Integer, Card>();
	Card tempcard;
	HearthstoneFactoryImpl cf = new HearthstoneFactoryImpl();
	int NUMOFCARDS = 443;
	List<Card> myDeck = new ArrayList<Card>();
	
	
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
		String quality;
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
				quality = rst1.getString(3);
				ability = rst1.getString(8);
				cardclass = rst1.getString(9);
				tempcard.setCardName(name);
				tempcard.setCardQuality(quality);
				tempcard.setCardAbility(ability);
				tempcard.setCardCost(cost);
				tempcard.setCardClass(cardclass);
				System.out.println("Card sn "+sn+"- "+ tempcard.getCardName()+" is loaded");
				allcards.put(sn, tempcard);
		}
		rst1.close();
		stmt1.close();
	}
	
	public void getRandomDeck(){
		
		//Deck myDeck = cf.createDeck();
		Random randomGenerator = new Random();
		Comparator<Card> comparator = new Comparator<Card>() {
		    public int compare(Card c1, Card c2) {
		    	int cost1, cost2;
		    	if(c1.getCardCost().equals("-")){
		    		cost1 = 0;
		    	}else{
		    		cost1 = new Integer(c1.getCardCost()).intValue();
		    	}
		    	if(c2.getCardCost().equals("-")){
		    		cost2 = 0;
		    	}else{
		    		cost2 = new Integer(c2.getCardCost()).intValue();
		    	}
		    	return (cost1>cost2 ? 1 : (cost1== cost2 ? 0 : -1));		    	
		    }
		};
	
		for(int t=0;t<30;t++){
			int cardsn = randomGenerator.nextInt(NUMOFCARDS);
			Card tdcard = cf.createCard();
			tdcard = allcards.get(cardsn);
			myDeck.add(tdcard);
			//System.out.println("[" + tdcard.getCardCost()+"]["+tdcard.getCardClass()+"]["+tdcard.getCardName()+"]["+tdcard.getCardAbility()+"]");
		}
		Collections.sort(myDeck,comparator);
		//return null;
		showDeck();
	}
	
	public void showDeck(){
		Card dcard = cf.createCard();
		for(int t=0;t<myDeck.size();t++){
			dcard = myDeck.get(t);
			System.out.println("[" + dcard.getCardCost()+"]["+dcard.getCardClass()+"]["+dcard.getCardName()+"]["+dcard.getCardAbility()+"]");
		}
	}

}

