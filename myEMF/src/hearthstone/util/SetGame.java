package hearthstone.util;

import java.util.ArrayList;
import java.util.List;

import hearthstone.Deck;
import hearthstone.Game;
import hearthstone.GameBoard;
import hearthstone.GameDeck;
import hearthstone.GamePlayerHand;
import hearthstone.GameState;
import hearthstone.HearthstoneFactory;
import hearthstone.Hero;
import hearthstone.HeroClass;
import hearthstone.Player;
import hearthstone.PlayerBoard;


public class SetGame {
	HearthstoneFactory cf = HearthstoneFactory.eINSTANCE;

	public Game SetNewGame(String _id, Game theGame){
		theGame.setGameID(_id);
		SetPlayer(theGame);
		SetBoard(theGame);
		SetPlayerDeck(theGame);
		SetPlayerHand(theGame);
		return theGame;
	}
	
	public void SetPlayerDeck(Game _theGame){
		SetCards sc = new SetCards();
		try {
			sc.GetCardsFromDb();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		GameDeck gplayerDeck1 = cf.createGameDeck();
		GameDeck gplayerDeck2 = cf.createGameDeck();
		
		Hero playerHero1 = cf.createHero();
		Hero playerHero2 = cf.createHero();
				
		playerHero1.setHeroHealth(30);
		playerHero1.setHeroClass(HeroClass.MAGE);
		playerHero1.setHeroAbility("Fire blaster - deal 1 damage");
		playerHero1.setHeroDesc("Her Fire Polybraster will tear your apart");
		
		
		playerHero2.setHeroHealth(30);
		playerHero2.setHeroClass(HeroClass.PALADIN);
		playerHero2.setHeroAbility("Call of duty - summon a 1/1 recurit");
		playerHero2.setHeroDesc("Fight with honer and dignity");
		
		gplayerDeck1.setDeckHasHero(playerHero1);
		gplayerDeck2.setDeckHasHero(playerHero2);
		
		
		System.out.println("["+_theGame.getGameID()+ "] <Heros> are set to players");
		
		try {
			gplayerDeck1 = sc.getRandomDeck();
			gplayerDeck2 = sc.getRandomDeck();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		gplayerDeck1.setDeckOwner(_theGame.getGameHasTwoPlayers().get(0).getName());
		gplayerDeck2.setDeckOwner(_theGame.getGameHasTwoPlayers().get(1).getName());
		
		_theGame.getGameHasTwoPlayers().get(0).setPlayerHasDeck(gplayerDeck1);
		_theGame.getGameHasTwoPlayers().get(1).setPlayerHasDeck(gplayerDeck2);
		
		_theGame.getGameHasTwoPlayers().get(0).getPlayerHasDeck().setGameStartDeckCards("player 1 game start deck");
		_theGame.getGameHasTwoPlayers().get(1).getPlayerHasDeck().setGameStartDeckCards("player 2 game start deck");
		
		_theGame.getGameHasTwoPlayers().get(0).getPlayerHasDeck().setDeckHasHero(playerHero1);
		_theGame.getGameHasTwoPlayers().get(1).getPlayerHasDeck().setDeckHasHero(playerHero2);
		
		System.out.println("["+_theGame.getGameID()+ "] Player in Game <Decks> are ready");
		//_theGame.getGameHasTwoPlayers().get(0).ge
		
	}
	
	public void SetBoard(Game _theGame){
		GameBoard theGameBoard = cf.createGameBoard();
		theGameBoard.setBoardSN(2014);
		System.out.println("["+_theGame.getGameID()+ "] Game <board> is ready");
		PlayerBoard pb1 = cf.createPlayerBoard();
		PlayerBoard pb2= cf.createPlayerBoard();
		
		pb1.setBoardOwner("Player1");
		pb2.setBoardOwner("Player2");
		//theGameBoard.getGameBoardHasTwoPlayerBoard().add(pb1);
		//theGameBoard.getGameBoardHasTwoPlayerBoard().add(pb2);
		System.out.println("["+_theGame.getGameID()+ "] 2 of player game boards add to game <board>");
		
		_theGame.getGameHasTwoPlayers().get(0).setPlayerHasOwnBoard(pb1);
		_theGame.getGameHasTwoPlayers().get(1).setPlayerHasOwnBoard(pb2);
		System.out.println("["+_theGame.getGameID()+ "] 2 of player game boards add to <player>");
		
		_theGame.setGameHasBoard(theGameBoard);
		//_theGame.getGameHasBoard().getGameBoardHasTwoPlayerBoard().add(pb1);
		//_theGame.getGameHasBoard().getGameBoardHasTwoPlayerBoard().add(pb2);
	}
	
	/*public void SetPlayerBoard(Game _theGame){
		PlayerBoard pb1 = cf.createPlayerBoard();
		PlayerBoard pb2= cf.createPlayerBoard();
		_theGame.getGameHasBoard().getGameBoardHasTwoPlayerBoard().add(pb1);
		_theGame.getGameHasBoard().getGameBoardHasTwoPlayerBoard().add(pb2);
		System.out.println("["+_theGame.getGameID()+ "] 2 of player game boards add to game <board>");
		_theGame.getGameHasTwoPlayers().get(0).setPlayerHasOwnBoard(pb1);
		_theGame.getGameHasTwoPlayers().get(1).setPlayerHasOwnBoard(pb2);
		System.out.println("["+_theGame.getGameID()+ "] 2 of player game boards add to <player>");
	}*/
	
	public void SetPlayerHand(Game _theGame){
		GamePlayerHand gph1 = cf.createGamePlayerHand();
		GamePlayerHand gph2 = cf.createGamePlayerHand();
		gph1.setHandOwner(_theGame.getGameHasTwoPlayers().get(0).getName());
		gph2.setHandOwner(_theGame.getGameHasTwoPlayers().get(1).getName());
		_theGame.getGameHasTwoPlayers().get(0).setCardsInHand(gph1);
		_theGame.getGameHasTwoPlayers().get(1).setCardsInHand(gph2);
		System.out.println("["+_theGame.getGameID()+ "] 2 of player <hand>s to player");
	}
	
	
	public void SetPlayer(Game _theGame){
		List<Player> players = new ArrayList<Player>();
		SetPlayers sp = new SetPlayers();
		try {
			sp.GetPlayerFromDb();
			players = sp.getRandomPlayer();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		_theGame.getGameHasTwoPlayers().addAll(players);
		System.out.println("["+_theGame.getGameID()+ "] <player>s are ready");
	}

	
	public void ShowGame(Game _theGame){
		System.out.println("[Game report] Game ID: "+_theGame.getGameID());
		System.out.println("[Game report] Players: "+_theGame.getGameHasTwoPlayers().get(0).getName()+" VS "+_theGame.getGameHasTwoPlayers().get(1).getName());
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
