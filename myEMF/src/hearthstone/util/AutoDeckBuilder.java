package hearthstone.util;

import hearthstone.GamePool;
import hearthstone.HearthstoneFactory;



public class AutoDeckBuilder {
	
	static HearthstoneFactory cf = HearthstoneFactory.eINSTANCE;
	static GamePool gp = cf.createGamePool();

	public static void main(String[] args) {;
	System.out.println("> Welcome to Sirius' Hearth Stone emulator - v1.0");
	System.out.println("> Loading card information from DB...");
	gp.Initialize();
	}	
		
}
