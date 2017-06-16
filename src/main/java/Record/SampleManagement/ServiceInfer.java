package Record.SampleManagement;

import java.util.ArrayList;

public interface ServiceInfer {
	public void AddPlayer(Player input);
	public void AddGame( Game input);
	public void AddPlayerToGame(Game game, Player player);
	public void DeletePlayer( Player input);
	public void DeleteGame(Game input);
	public ArrayList<Game> retrieveGames();
	public ArrayList<Player>retrievePlayer();
	

}
