package Record.SampleManagement;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
	@Autowired
	private AllService service;
	
	@PostMapping("/addPlayer/{input}")
	public void AddPlayer(@RequestBody Player input)
	{
		service.AddPlayer(input);
	}

	@PostMapping("/addGame/{Game}")
	public void AddGame( @RequestBody Game input)
	{
		service.AddGame(input);
	}
	

	
	@PostMapping("/addPlayerGame/{Game}/{Player}")
	public void AddPlayerToGame(@RequestBody Game game,@RequestBody Player player)
	{
		service.AddPlayerToGame(game, player);
	}
	
	@PostMapping("/DeletePlayer/{Player}")
	public void DeletePlayer(@RequestBody Player input)
	{
		service.DeletePlayer(input);
	}
	
	@PostMapping("/DeleteGame/{Game}")
	public void DeleteGame(@RequestBody Game input)
	{
		service.DeleteGame(input);
	}
	
	@GetMapping("/retrieveGames")
	public ArrayList<Game> retrieveGames()
	{
		return service.retrieveGames();
	}
	@GetMapping("/retrievePlayer")
	public ArrayList<Player>retrievePlayer()
	{
		return service.retrievePlayer();
	}
}
