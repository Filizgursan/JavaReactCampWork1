package Entities;

public class Game {
	
	private int id;
	private String gameName;
	private int unitPrice;
	
	public Game() {
		
	}
	
	public Game(int id, String gameName, int unitPrice) {
		this.id = id;
		this.gameName = gameName;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

}
