package hearth.retired;
import hearthstone.Card;
import hearthstone.CardQuality;
import hearthstone.GameDeck;
import hearthstone.HearthstoneFactory;
import hearthstone.util.Dbconn;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

import org.eclipse.emf.common.util.ECollections;

/*
 * All the methods / logic were moved to GameDeck
 * This class no longer be required
 * */


public class SetCards {
	Hashtable<Integer, Card> allcards = new Hashtable<Integer, Card>();
	Card tempcard;
	HearthstoneFactory cf = HearthstoneFactory.eINSTANCE;
	int NUMOFCARDS = 443;
	List<Card> myDeck = new ArrayList<Card>();
	
	//gameDeck and Deck
	GameDeck myRealDeck = cf.createGameDeck();
	
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
		//ResultSetMetaData rsmd = rst1.getMetaData();
		//int numberOfColumns = rsmd.getColumnCount();
		
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
				tempcard = cf.createCard();
				sn = rst1.getInt(1);
				name = rst1.getString(2);
				cost = rst1.getString(4);
				quality = CardQuality.get(rst1.getString(3));
				ability = rst1.getString(8);
				cardclass = rst1.getString(9);
				attack = rst1.getInt(6);
				health = rst1.getInt(7);
				tempcard.setCardSN(sn);
				tempcard.setCardName(name);
				tempcard.setCardQuality(quality);
				tempcard.setCardAbilityDesc(ability);
				tempcard.setCardCost(cost);
				tempcard.setCardClass(cardclass);
				tempcard.setCardLife(health);
				tempcard.setCardPower(attack);
				//System.out.println("Card sn "+sn+"- "+ tempcard.getCardName()+" is loaded");
				allcards.put(sn, tempcard);
		}
		
		//System.out.println("[ALL CARD] = "+allcards.size());
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
	
	public GameDeck getRandomDeck() throws Exception{
		GameDeck myRealDeck = cf.createGameDeck();
		myDeck.clear(); // since myDeck is not managed by factory, each turn it needs clear
		Random randomGenerator = new Random();
		
		/*if(allcards.size() == 0){
			throw new Exception("No card data in database, please check.");
			//return null;
		}*/
		
		int ccount = 0;
		while(ccount < 30){
			int cardsn = 1 + randomGenerator.nextInt(NUMOFCARDS);
			Card tdcard = cf.eINSTANCE.createCard();
			tdcard = allcards.get(cardsn);
			//System.out.println("--> Card sn "+cardsn+":"+tdcard.getCardSN()+"- "+ tdcard.getCardName()+" was drew");
			Card thecard = cf.eINSTANCE.createCard();
			
			////Card object can't be reference as thecard = tdcard, otherwise it is the same object which will trigger unique exception
			
			thecard.setCardSN(tdcard.getCardSN());
			thecard.setCardDeckSN(ccount);
			thecard.setCardName(tdcard.getCardName());
			thecard.setCardClass(tdcard.getCardClass());
			thecard.setCardAbilityDesc(tdcard.getCardAbilityDesc());
			thecard.setCardLife(tdcard.getCardLife());
			thecard.setCardCost(tdcard.getCardCost());
			thecard.setCardPower(tdcard.getCardPower());
			thecard.setCardQuality(tdcard.getCardQuality());
			thecard.setCardRace(tdcard.getCardRace());
			//thecard.setCardStates();
			
			
			if(checkDuplicate(thecard)){		
					myDeck.add(tdcard);
					//System.out.println("->"+ccount+" "+thecard.getCardDeckSN());
					//System.out.println(tdcard.getCardName() + " | "+thecard.getCardName());
					myRealDeck.getDeckHasCards().add(thecard);
					ccount++;
			}
		}
		
		//Collections.sort(myDeck,comparator);
		//ECollections.sort(myRealDeck.getDeckHasCards(),comparator);

		//showDeck();
		//showRealDeck(myRealDeck);
		return myRealDeck;
	}
	
	
	public void showDeck(){
		Card dcard = cf.createCard();
		for(int t=0;t<myDeck.size();t++){
			dcard = myDeck.get(t);
			System.out.println("[" + dcard.getCardCost()+"]["+dcard.getCardQuality()+"]["+dcard.getCardClass()+"]["+dcard.getCardName()+"]["+dcard.getCardAbilityDesc()+"]");
		}
	}
	
	public void showRealDeck(GameDeck _myRealDeck){
		//Card dcard = cf.createCard();
		System.out.println(_myRealDeck.getDeckName()+" - RealDeckSize is "+_myRealDeck.getDeckHasCards().size());
		for(int t=0;t<_myRealDeck.getDeckHasCards().size();t++){
			System.out.println("{"+_myRealDeck.getDeckHasCards().get(t).getCardCost()+"}["+_myRealDeck.getDeckHasCards().get(t).getCardQuality()+"]["+_myRealDeck.getDeckHasCards().get(t).getCardClass()+"]["+_myRealDeck.getDeckHasCards().get(t).getCardName()+"]["+_myRealDeck.getDeckHasCards().get(t).getCardAbilityDesc()+"]");
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
					return flag;	
				}
			}
		}
		return flag;
	}
	
	public void showCardDb(){
		System.out.println("------[Card database report]------");
		System.out.println("Current total has "+allcards.size()+" cards.");
		for(int t=1;t<allcards.size()+1;t++){
			System.out.println("{"+allcards.get(t).getCardCost()+"}["+allcards.get(t).getCardQuality()+"]["+allcards.get(t).getCardClass()+"]["+allcards.get(t).getCardName()+"]["+allcards.get(t).getCardAbilityDesc()+"]");
		}
		System.out.println("---[End of card database report]---");
		
	}
	
	
}