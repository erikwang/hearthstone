package hearth.retired;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import hearthstone.Game;
import hearthstone.GameBoard;
import hearthstone.GameDeck;
import hearthstone.GamePlayerHand;
import hearthstone.GameRule;
import hearthstone.HearthstoneFactory;
import hearthstone.Hero;
import hearthstone.HeroClass;
import hearthstone.Player;
import hearthstone.PlayerBoard;
/*
 * All the methods / logic were moved to Game initialization
 * This class no longer be required
 * */

public class SetGame {
	HearthstoneFactory cf = HearthstoneFactory.eINSTANCE;

	public Game SetNewGame(String id, Game theGame){
		theGame.setGameID(id);
		SetGameRule(theGame);
		SetPlayer(theGame);

		SetPlayerDeck(theGame);
		SetBoard(theGame);
		SetPlayerHand(theGame);
		return theGame;
	}
	
	private void SetGameRule(Game theGame) {
		// TODO Auto-generated method stub
		GameRule gr = cf.createGameRule();
		theGame.setGameHasGameRule(gr);
	}

	public void SetPlayerDeck(Game theGame){
		SetCards sc = new SetCards();
		try {
			sc.GetCardsFromDb();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		GameDeck gplayerDeck1 = cf.createGameDeck();
		GameDeck gplayerDeck2 = cf.createGameDeck();
		
				
		/*playerHero1.setHeroHealth(30);
		playerHero1.setHeroClass(HeroClass.MAGE);
		playerHero1.setHeroAbility("Fire blaster - deal 1 damage");
		playerHero1.setHeroDesc("Her Fire Polybraster will tear your apart");
		
		
		playerHero2.setHeroHealth(30);
		playerHero2.setHeroClass(HeroClass.PALADIN);
		playerHero2.setHeroAbility("Call of duty - summon a 1/1 recurit");
		playerHero2.setHeroDesc("Fight with honer and dignity");
		*/
		
		//gplayerDeck1.setDeckHasHero(playerHero1);
		//gplayerDeck2.setDeckHasHero(playerHero2);
		
		
		System.out.println("["+theGame.getGameID()+ "] <Heros> are set to players");
		
		try {
			gplayerDeck1 = sc.getRandomDeck();
			gplayerDeck2 = sc.getRandomDeck();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		gplayerDeck1.setDeckOwner(theGame.getGameHasGameRule().getGameHasPlayers().get(0).getName());
		gplayerDeck2.setDeckOwner(theGame.getGameHasGameRule().getGameHasPlayers().get(1).getName());
		
		theGame.getGameHasGameRule().getGameHasPlayers().get(0).setPlayerHasDeck(gplayerDeck1);
		theGame.getGameHasGameRule().getGameHasPlayers().get(1).setPlayerHasDeck(gplayerDeck2);
		
		theGame.getGameHasGameRule().getGameHasPlayers().get(0).getPlayerHasDeck().setGameStartDeckCards("player 1 game start deck");
		theGame.getGameHasGameRule().getGameHasPlayers().get(1).getPlayerHasDeck().setGameStartDeckCards("player 2 game start deck");
		
		
		
		Hero playerHero1 = cf.createHero();
		Hero playerHero2 = cf.createHero();
		
		//Since current we have 9 hero class, but I can't get enumeration's length, so just put 9 here as random seed.
		Random randomGenerator = new Random();
		playerHero1.setHeroClass(HeroClass.get(randomGenerator.nextInt(9)));
		playerHero2.setHeroClass(HeroClass.get(randomGenerator.nextInt(9)));
		
		theGame.getGameHasGameRule().getGameHasPlayers().get(0).getPlayerHasDeck().setDeckHasHero(playerHero1);
		theGame.getGameHasGameRule().getGameHasPlayers().get(1).getPlayerHasDeck().setDeckHasHero(playerHero2);
		System.out.println("["+theGame.getGameID()+ "] Player <heroes> are ready");			
		System.out.println("["+theGame.getGameID()+ "] Player in Game <Decks> are ready");
		//_theGame.getGameHasTwoPlayers().get(0).ge
		
	}
	
	public void SetBoard(Game theGame){
		GameBoard theGameBoard = cf.createGameBoard();
		theGameBoard.setBoardSN(2014);
		System.out.println("["+theGame.getGameID()+ "] Game <board> is ready");
		PlayerBoard pb1 = cf.createPlayerBoard();
		PlayerBoard pb2= cf.createPlayerBoard();
		
		pb1.setBoardOwner("Player1");
		pb2.setBoardOwner("Player2");
		//theGameBoard.getGameBoardHasTwoPlayerBoard().add(pb1);
		//theGameBoard.getGameBoardHasTwoPlayerBoard().add(pb2);
		System.out.println("["+theGame.getGameID()+ "] 2 of player game boards add to game <board>");
		
		pb1.setDeckHasHero(theGame.getGameHasGameRule().getGameHasPlayers().get(0).getPlayerHasDeck().getDeckHasHero());
		pb2.setDeckHasHero(theGame.getGameHasGameRule().getGameHasPlayers().get(1).getPlayerHasDeck().getDeckHasHero());
		
		theGame.getGameHasGameRule().getGameHasPlayers().get(0).setPlayerHasOwnBoard(pb1);
		theGame.getGameHasGameRule().getGameHasPlayers().get(1).setPlayerHasOwnBoard(pb2);
		
		
		System.out.println("["+theGame.getGameID()+ "] 2 of player game boards add to <player>");
		
		theGame.getGameHasGameRule().setGameHasBoard(theGameBoard);
		
	}
	
	public void SetPlayerHand(Game theGame){
		GamePlayerHand gph1 = cf.createGamePlayerHand();
		GamePlayerHand gph2 = cf.createGamePlayerHand();
		gph1.setHandOwner(theGame.getGameHasGameRule().getGameHasPlayers().get(0).getName());
		gph2.setHandOwner(theGame.getGameHasGameRule().getGameHasPlayers().get(1).getName());
		theGame.getGameHasGameRule().getGameHasPlayers().get(0).setPlayerHasHand(gph1);
		theGame.getGameHasGameRule().getGameHasPlayers().get(1).setPlayerHasHand(gph2);
		System.out.println("["+theGame.getGameID()+ "] 2 of player <hand>s to player");
	}
	
	
	public void SetPlayer(Game theGame){
		List<Player> players = new ArrayList<Player>();
		SetPlayers sp = new SetPlayers();
		try {
			sp.GetPlayerFromDb();
			players = sp.getRandomPlayer();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		theGame.getGameHasGameRule().getGameHasPlayers().addAll(players);
		System.out.println("["+theGame.getGameID()+ "] <player>s are ready");
	}

	
	public void ShowGame(Game theGame){
		System.out.println("[Game report] Game ID: "+theGame.getGameID());
		System.out.println("[Game report] Players: "+theGame.getGameHasGameRule().getGameHasPlayers().get(0).getName()+" VS "+theGame.getGameHasGameRule().getGameHasPlayers().get(1).getName());
		System.out.println();
		
	}
	/* move to GameBoard, not longer use.
	public void ShowGameBoard(Game _game){
		System.out.println("[Board report] Game ID: "+_game.getGameID());
		GameBoard gb = cf.createGameBoard();
		gb = _game.getGameHasBoard();
		System.out.println("[Board report] Player "+_game.getGameHasTwoPlayers().get(0).getName()+"'s board: ");
		//Utilites.showPlayerBoard(_game.getGameHasBoard().getGameBoardHasTwoPlayerBoard().get(0));
		Utilites.showPlayerBoard(_game.getGameHasTwoPlayers().get(0).getPlayerHasOwnBoard());
		
		System.out.println("[Board report] Player "+_game.getGameHasTwoPlayers().get(1).getName()+"'s board: ");
		Utilites.showPlayerBoard(_game.getGameHasTwoPlayers().get(1).getPlayerHasOwnBoard());
	}
	*/
	
}
