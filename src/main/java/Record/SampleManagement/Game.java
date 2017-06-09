package Record.SampleManagement;

import org.springframework.beans.factory.annotation.Autowired;

public class Game {
	private String name;
	 private int noPlayers;
	 private int count ;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Autowired
	 private Player playerobj;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoPlayers() {
		return noPlayers;
	}
	public void setNoPlayers(int noPlayers) {
		this.noPlayers = noPlayers;
	}
	public Player getPlayerobj() {
		return playerobj;
	}
	public void setPlayerobj(Player playerobj) {
		this.playerobj = playerobj;
	}
	

}
