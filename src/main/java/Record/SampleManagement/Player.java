package Record.SampleManagement;

import java.util.ArrayList;

public class Player {

	private String name;
	private int count;
	private String id;
	@SuppressWarnings("rawtypes")
	private ArrayList games = new ArrayList();

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@SuppressWarnings("rawtypes")
	public ArrayList getGames() {
		return games;
	}

	@SuppressWarnings("rawtypes")
	public void setGames(ArrayList games) {
		this.games = games;
	}
}
