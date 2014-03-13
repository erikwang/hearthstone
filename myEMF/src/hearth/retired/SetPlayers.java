package hearth.retired;


import hearthstone.HearthstoneFactory;
import hearthstone.Player;


import hearthstone.util.Dbconn;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Random;

/*
 * All the methods / logic were moved to Game initialization
 * This class no longer be required
 * */

public class SetPlayers {

	HearthstoneFactory cf = HearthstoneFactory.eINSTANCE;
	//Player playerone = cf.createPlayer();
	//Player playertwo = cf.createPlayer();
	Hashtable<Integer, Player> allplayers = new Hashtable<Integer, Player>();
	Random randomGenerator = new Random();
	
	public void GetPlayerFromDb() throws Exception{
		String sql1 = "SELECT * FROM hearthstone.player";
		Dbconn db;
		db = new Dbconn();
		ResultSet rst1 = null;
		Statement stmt1 = db.createStatement();
		rst1 = stmt1.executeQuery(sql1);
		//ResultSetMetaData rsmd = rst1.getMetaData();
	
		//int numberOfColumns = rsmd.getColumnCount();
		
		/*
		 * 1 - Sn int
		 * 2 - Playername String
		 * 3 - Playerlevel int
		 * 4 - Lastlogin date
		 * 5 - Totalwins int
		 */

		int sn;
		Player tempplayer;
		
		
		for (;rst1.next();){
				//System.out.println(rst1.getString(rsmd.getColumnName(y)));
				tempplayer = cf.createPlayer();
				sn = rst1.getInt(1);
				tempplayer.setPlayerID(sn);
				tempplayer.setPlayerLevel(rst1.getInt(3));
				tempplayer.setName(rst1.getString(2));
				tempplayer.setTotalWins(rst1.getInt(5));
				//System.out.println("Card sn "+sn+"- "+ tempcard.getCardName()+" is loaded");
				allplayers.put(sn,tempplayer);
		}
		rst1.close();
		stmt1.close();
	}
	
	public List<Player> getRandomPlayer() throws Exception{
		//Random randomGenerator = new Random();
		if(allplayers.size() == 0){
			throw new Exception("No player data in database, please check.");
		}
		int playersn = 1 + randomGenerator.nextInt(allplayers.size());
		Player tdplayer = cf.eINSTANCE.createPlayer();
		tdplayer = allplayers.get(playersn);
		
		Player tdplayer2 = cf.eINSTANCE.createPlayer();
		int playersn2 = 1 + randomGenerator.nextInt(allplayers.size());
		while(playersn2 == playersn){
			playersn2 = 1 + randomGenerator.nextInt(allplayers.size());
		}
		tdplayer2 = allplayers.get(playersn2);
		

		List<Player> theplayers = new ArrayList<Player>();
		theplayers.add(tdplayer);
		theplayers.add(tdplayer2);
		return theplayers;
	}
	
	public void showPlayers(List<Player> _players){
		System.out.println("Player one is "+_players.get(0).getName()+" - "+_players.get(0).getTotalWins()+" win(s)");
		System.out.println("Player two is "+_players.get(1).getName()+" - "+_players.get(1).getTotalWins()+" win(s)");
	}

}
