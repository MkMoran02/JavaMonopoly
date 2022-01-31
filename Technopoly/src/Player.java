import java.util.ArrayList;
public class Player {
	
	//Variables 
	private String name;
	private double balance;
	private int position;
	private ArrayList<Property> properties; 
	
	//Constructor
	public Player(String name) {
		this.name = name;
		this.balance = 1500;
		this.position = 0;
		properties = new ArrayList<Property>();
	}

	//Getters 
	public String getName() {
		return this.name;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public int getPosition() {
		return this.position;
	}
	
	public ArrayList<Property> getProperties() {
		return properties;
	}
	/**
	 * A method that allows you to set the name individually 
	 * 
	 */
	public void setName(String Name) {
		this.name = Name;
	}
	/**
	 * A method that updates the position of of the player on the board 
	 * Adds the players current position to the total of a dice roll = the players updated position
	 * 
	 */
	public void movePosition(int diceTotal) {
		this.position += diceTotal;
	}

}

