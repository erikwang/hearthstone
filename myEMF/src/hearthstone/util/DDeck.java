package hearthstone.util;

import hearthstone.Card;

import java.util.*;

public class DDeck {
	List<Card> ddeck;
	String nameOfDeck;
	
	public List<Card> getDdeck() {
		return ddeck;
	}
	public void setDdeck(List<Card> ddeck) {
		this.ddeck = ddeck;
	}
	public String getNameOfDeck() {
		return nameOfDeck;
	}
	public void setNameOfDeck(String nameOfDeck) {
		this.nameOfDeck = nameOfDeck;
	}
}
