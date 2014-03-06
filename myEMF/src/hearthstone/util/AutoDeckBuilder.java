package hearthstone.util;
import java.util.Date;
import java.util.Scanner;

import hearthstone.Game;
import hearthstone.GameBoard;
import hearthstone.GamePool;
import hearthstone.GameState;
import hearthstone.HearthstoneFactory;
import hearthstone.PlayerBoard;



public class AutoDeckBuilder {
	
	static HearthstoneFactory cf = HearthstoneFactory.eINSTANCE;
	static GamePool gp = cf.createGamePool();
	static Scanner sca = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//myDeck.Hello();
		
	
		SetGame sg = new SetGame();
		SetCards sc = new SetCards();
		Game theGame;
		//theGame.getGameHasBoard(). = gb;
		//GameState gameState = null;
		//GamePool gp = cf.createGamePool();
		
		System.out.println("> Welcome to Sirius' Hearth Stone emulator - v1.0");
		System.out.println("> Loading card information from DB...");
				
		try {
			sc.GetCardsFromDb();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("> Done...");
		
		
		ShowHelp();
		while(true){
		System.out.println("> Please enter your command / ? for help");
		String name = sca.nextLine();
		
		switch(name){
			case "?":
				ShowHelp();
				break;
			
			case "cg":
				theGame = cf.createGame();
				String id = new Date().toString();
				sg.SetNewGame(id, theGame);
				gp.getGamePoolHasGames().add(theGame);
				System.out.println("Complete, a new game is ready, in game pool spot "+gp.getGamePoolHasGames().size());
				break;
			
			case "sagd":
				for(int t=0;t<gp.getGamePoolHasGames().size();t++){
					System.out.println("[Game] "+t+" information:");
					gp.getGamePoolHasGames().get(t).ShowGameInDetail();
					System.out.println("--------------------------");
				}
				break;
			
			case "sag":
				if(gp.getGamePoolHasGames().size() == 0){
					System.out.println("[Show game pool] There is no game in play.");	
				}else{
					for(int t=0;t<gp.getGamePoolHasGames().size();t++){
						System.out.println("[Game] "+t+" information:");
						sg.ShowGame(gp.getGamePoolHasGames().get(t));
						System.out.println("--------------------------");
					}	
				}
				break;
			
			case "sgb":
				theGame = AskInputGameIndex();
				if(theGame == null){
					break;
				}else{
					//System.out.println("> Please enter which player's board: 1 or 2");
					//String strplayer = sca.nextLine();
					System.out.println("[Show Game Board]"+ theGame.getGameHasTwoPlayers().get(0).toString());
					theGame.getGameHasTwoPlayers().get(0).getPlayerHasOwnBoard().ShowPlayerBoard();	
					System.out.println("[Show Game Board]"+ theGame.getGameHasTwoPlayers().get(1).toString());
					theGame.getGameHasTwoPlayers().get(1).getPlayerHasOwnBoard().ShowPlayerBoard();
				}
				break;
				
			case "sgh":
				theGame = AskInputGameIndex();
				if(theGame != null){
					theGame.getGameHasTwoPlayers().get(0).getCardsInHand().ShowGameHand();
					theGame.getGameHasTwoPlayers().get(1).getCardsInHand().ShowGameHand();
				}else{
					//System.out.println("Game index is illegal. Game not exists");
				}
				break;
				
			case "hg":
				theGame = AskInputGameIndex();
				if(theGame != null){	
					theGame.setGameStates(GameState.HALT);;
					System.out.println("[Game has halted] "+ theGame.toString());
				}else{
					System.out.println("Game index is illegal. Game not exists");
				}
				break;
			
			case "eg":
				theGame = AskInputGameIndex();
				if(theGame != null){
					System.out.println("[Current game] you now can operate game"+theGame.toString());
				}
				break;
			case "sc":
				sc.showCardDb();
				break;
			case "dc":
				theGame = AskInputGameIndex();
				if(theGame != null){
					System.out.println("> Please enter which player draw a card: 0-you or 1-opponet");
					String strPlayer = sca.nextLine();
					if(! strPlayer.matches("^[01]$")){
						System.out.println("[Error] Input is not a number either 0 or 1");
						break;
					}else{
						int intPlayer = new Integer(strPlayer).intValue();
						theGame.getGameHasTwoPlayers().get(intPlayer).DrawCard();
						System.out.println("Player "+theGame.getGameHasTwoPlayers().get(intPlayer)+" drew a card");	
					}
					
				}else{
						//No game in the index
				}
				break;
			
			case "pc":
					theGame = AskInputGameIndex();
					if(theGame != null){
						System.out.println("> Please enter which player player a card: 0-you or 1-opponet");
						String strPlayer = sca.nextLine();
						if(! strPlayer.matches("^[01]$")){
							System.out.println("[Error] Input is not a number either 0 or 1");
							break;
						}else{
							int intPlayer = new Integer(strPlayer).intValue();
							theGame.getGameHasTwoPlayers().get(intPlayer).PlayCard(0);
							System.out.println("Player "+theGame.getGameHasTwoPlayers().get(intPlayer)+" has player a card");	
						}
						
					}
			break;

			case "oc":
					theGame = gp.getGamePoolHasGames().get(0);
					System.out.println("operate a card");
					System.out.println("> Please enter the index number of game: 0-"+(gp.getGamePoolHasGames().size()-1)+".");
					String numOfGame1 = sca.nextLine();
					theGame = gp.getGamePoolHasGames().get(new Integer(numOfGame1).intValue());
					theGame.getGameHasTwoPlayers().get(0).getPlayerHasOwnBoard().ShowPlayerBoard();
					System.out.println("> Please select operate which card");
					String indexOfCard = sca.nextLine();
					//theGame.getGameHasTwoPlayers().get(0).getCardsInHand().DrawCard(theGame.getGameHasTwoPlayers().get(0));
					//theGame.getGameHasTwoPlayers().get(0).DrawCard();
			break;
			
			case "sgd":
				theGame = AskInputGameIndex();
				if(theGame != null){
					System.out.println("> Please enter which player player a card: 0-you or 1-opponet");
					String strPlayer = sca.nextLine();
					if(! strPlayer.matches("^[01]")){
						System.out.println("[Error] Input is not a number either 0 or 1");
						break;
					}else{
						int intPlayer = new Integer(strPlayer).intValue();
						theGame.getGameHasTwoPlayers().get(intPlayer).getPlayerHasDeck().ShowGameDeck();
					}
				}
				break;
			
			case "by":
				System.out.println("bye - thank you for use");
				return;
			
			
			default:
				System.out.println("Unknown command, please try again. ? for help");
				
			}
		}
	}
	
	public static void ShowHelp(){
		System.out.println("Command help:");
		System.out.println("? - this message");
		System.out.println("cg - create a new game");
		System.out.println("sag - show all current game(s)");
		System.out.println("sagd - show all current game(s) in details");
		System.out.println("sgb - show a game's board");
		System.out.println("sgh - show a player's current hand");
		System.out.println("hg - halt a game");
		System.out.println("sc - show card database");
		System.out.println("pc - play a card from your hand to board");
		System.out.println("dc - draw a card");
		System.out.println("oc - operat a card on board to interact with another card on your oppenent's board");
		System.out.println("sgd - show game deck - game 0, player 1");
		System.out.println("by - quit");
	}
	
	
	public static Game AskInputGameIndex(){
		System.out.println("> Please enter the index number of game: 0-"+(gp.getGamePoolHasGames().size()-1)+".");
		String _input = sca.nextLine();
		if(_input.matches("^[0-9]+$")){
			int gameIndex = new Integer(_input).intValue();
			if(gameIndex < gp.getGamePoolHasGames().size()){
				System.out.println("[Game found] Found the game of index="+gameIndex+" of game pool");
				return gp.getGamePoolHasGames().get(gameIndex);
			}else{
				System.out.println("[Can't find a game] No such game in index="+gameIndex+" of game pool");
				return null;
			}
		}else{
			System.out.println("[Input error] Input is not a number");
			return null;
		}
	}

}
