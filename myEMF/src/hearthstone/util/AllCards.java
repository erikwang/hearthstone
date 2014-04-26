package hearthstone.util;

import hearthstone.Card;

import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

public class AllCards {
	Hashtable<Integer, Card> allcards;
	Object[] tlist;
	
	public AllCards(){
		 allcards = new Hashtable<Integer, Card>();
	}
	
	public Hashtable<Integer, Card> getAllcards() {
		return allcards;
	}

	public void setAllcards(Hashtable<Integer, Card> allcards) {
		this.allcards = allcards;
	}
	
	public void put(int index, Card theCard){
		this.allcards.put(index, theCard);
	}
	
	public Card get(int index){
		//
		tlist = allcards.values().toArray();
		return (Card) tlist[index - 1];
	}
	
	public int size(){
		return allcards.size();
	} 
	
	public void showAllcards(){
		System.out.println("[ShowCardFromAC] ");
		Object[] tlist = allcards.values().toArray();
		//for(int t=0;t<tlist.length;t++){
		for (Object tcard : tlist){
			//System.out.println(tlist[t].toString());
			//Card tcard = (Card) tlist[t];
			((Card) tcard).ShowCard();
		}
		System.out.println("[ShowCardFromAC] Total "+tlist.length+" cards.");
	}
	
	public void findCard(String cardname){
		System.out.println("[ShowCardFromLib] card name is: "+cardname+" key for name is: "+cardname.hashCode());
		//int intcardname = new Integer(cardname).intValue();
		int intcardname = cardname.hashCode();
		
		if(this.allcards.get(intcardname) != null){
			this.allcards.get(intcardname).ShowCard();
		}else{
			System.out.println("[ShowCardFromLib] No match.");
		}
	}
}
