package Record.SampleManagement;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service {
	private int Playercount;
	private int Gamecount;
	 private int GamePlayerCount;
	
	ArrayList<Player> addplayer=new ArrayList<Player>();
	ArrayList<Game> addgame=new ArrayList<Game>();
	
	@PostMapping("/addPlayer/{player}")
	public void AddPlayer(@RequestBody Player input)
	{
     	Playercount=input.getCount();
		addplayer.add(input);
		Playercount=Playercount+1;
		input.setCount(Playercount);

		System.out.println("Added Player");
	}
	@PostMapping("/addGame/{Game}")
	public void AddGame( @RequestBody Game input)
	{  Gamecount=input.getCount();
	addgame.add(input);
	Gamecount=Gamecount+1;
	input.setCount(Gamecount);
	System.out.println("Added Game");
	}
	@PostMapping("/addPlayerGame/{Game}/{Player}")
	public void AddPlayerToGame(@RequestBody Game game,@RequestBody Player player)
	{
		
		game.setPlayerobj(player);

		GamePlayerCount=game.getNoPlayers();
		GamePlayerCount=GamePlayerCount+1;
		game.setNoPlayers(GamePlayerCount);
		System.out.println("Added Player to Game");
	}
	@PostMapping("/DeletePlayer/{Player}")
	public void DeletePlayer(@RequestBody Player input)
	{
		Playercount=input.getCount();
		addplayer.remove(input);
		Playercount=Playercount-1;
		input.setCount(Playercount);
		System.out.println(" DeletePlayer");
	}
	@PostMapping("/DeleteGame/{Game}")
	public void DeleteGame(@RequestBody Game input)
	{ Gamecount=input.getCount();
	addgame.remove(input);
	Gamecount=Gamecount-1;
	input.setCount(Gamecount);
	System.out.println(" DeleteGame");
	}
	@GetMapping("/retrieveGames")
	public ArrayList<Game> retrieveGames()

	{
		System.out.println("Retrieve Games");
		return addgame;
	}
	@GetMapping("/retrievePlayer")
	public ArrayList<Player>retrievePlayer()
	{
		/* Game g=new Game();
         g.setCount(1);
         g.setName("rugbee");
         g.setNoPlayers(1);*/
         Player p=new Player();
         p.setName("chandana");
         p.setId("732362");
       /*  addgame.add(g);*/
         p.setGames(addgame);
         p.setCount(1);
         addplayer.add(p);
         
		System.out.println("Retrieve Player");
		return addplayer;
	}
}
