package Record.SampleManagement;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
public class AllService  implements ServiceInfer{
	private int Playercount;
	private int Gamecount;
	private int GamePlayerCount;
	@Autowired
	private Game game;
	@Autowired
	private Player player;

	ArrayList<Player> addplayer=new ArrayList<Player>();
	ArrayList<Game> addgame=new ArrayList<Game>();

	public void AddPlayer(Player input)
	{
		Playercount=input.getCount();
		addplayer.add(input);
		Playercount=Playercount+1;
		input.setCount(Playercount);

		System.out.println("hey"+input);

		System.out.println("Added Player");
	}

	public void AddGame( Game input)
	{  Gamecount=input.getCount();
	addgame.add(input);
	Gamecount=Gamecount+1;
	input.setCount(Gamecount);
	System.out.println("Added Game");
	}
	
	public void AddPlayerToGame(Game game, Player player)
	{

		game.setPlayerobj(player);
		GamePlayerCount=game.getNoPlayers();
		GamePlayerCount=GamePlayerCount+1;
		game.setNoPlayers(GamePlayerCount);
		System.out.println("Added Player to Game");
	}

	public void DeletePlayer( Player input)
	{
		Playercount=input.getCount();
		addplayer.remove(input);
		Playercount=Playercount-1;
		input.setCount(Playercount);
		System.out.println(" DeletePlayer");
	}

	public void DeleteGame(Game input)
	{ Gamecount=input.getCount();
	addgame.remove(input);
	Gamecount=Gamecount-1;
	input.setCount(Gamecount);
	System.out.println(" DeleteGame");
	}
	
	public ArrayList<Game> retrieveGames()

	{
		System.out.println("Retrieve Games");
		return addgame;
	}

	
	public ArrayList<Player>retrievePlayer()  
	{
		game.setCount(1);
		game.setName("rugbee");
		game.setNoPlayers(1);
		player.setName("chandana");
		player.setId("732362");
		addgame.add(game);
		player.setGames(addgame);
		player.setCount(1);
		addplayer.add(player);

		System.out.println("Retrieve Player");
		return addplayer;
	}
	

}
