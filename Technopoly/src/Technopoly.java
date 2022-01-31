import java.util.ArrayList;
import java.util.Scanner;
public class Technopoly {

//Variables
private static ArrayList<Player> players;
private static Tile board[];
private static Property properties[];
private static Scanner in;
	
	public static void main(String[] args) {
	
	//Calls the initializeData method
	initializeData();	
	
	//Calls registerPlayers method
	registerPlayers(players, in);
	
	//Calls playerTurn method 
	playerTurn(players, board, properties, in);
	
	
		

	}
	
	public static void initializeData() {
		
		/**
		 * This method will do the following:
		 * -initialize the Scanner in
		 * - Initialize the players array list
		 * - Initialize the board array
		 * - initialize the properties array
		 * 
		 * - fill the board array with data of type Tile 
		 * - fill the properties array with data of type Property 
		 */
	}
	
	public static void registerPlayers(ArrayList<Player> players, Scanner in) {
		
		/**
		 * This method will ask the players for the following: 
		 * - The number of players 
		 * - The names of the players 
		 * 
		 * These user inputs will then be used to set the size of the player array list,
		 * and set the names for each player registered
		 */
		
	}
	
	public static void playerTurn(ArrayList<Player> players, Tile board[], Property properties[], Scanner in ) {
		
		/**
		 * This method will cycle through the players giving them their turns
		 * The method will give each player a list of options to choose from when it is their turn
		 * 
		 * The list is as follows:
		 * - Roll Dice (will call rollDice method when selected)
		 * - Display all players balances (will call displayAllPlayersBalances method when selected)
		 * - Display owned tiles available for upgrade (will call displayOwnedTilesAvailableForUpgrade method when selected)
		 * - Display all player owned tiles (will call displayAllPlayersOwnedTiles method when selected)
		 * - Leave Game (will call leaveGame method when selected)
		 * 
		 * The players turn will then end after they select the roll dice method and it will be the next users turn
		 * 
		 * will also check if a player has negative balance and will remove them from the game if they do,
		 * until there is one player left who will be the winner 
		 */
	}
	
	public static void rollDice(ArrayList<Player> players, Tile board[], Property properties[], Scanner in ) {
	
		/**
		 * The dice are rolled and a a random number is generated to represent the dice roll total
		 * This number is added to the players current position to calculate their new updated position on the board
		 * 
		 * A range of actions can happen to the player dependent on which tile they move to at this point such as:
		 * - Nothing 
		 * - If its a property tile they may either have to pay rent if the property is owned 
		 *   or be given the option to invest in the tile if its available (will call the investResearchPointsToOwnTile method if selected)
		 * - If it's a chance tile they can have either 0, 50 or 100 RP added to their balance
		 * - If its a server crash tile they will lose 200 RP
		 * - If its a cyber attack tile the will miss their next turn 
		 * - If they pass the go tile they gain 200 RP
		 * 
		 *    The players turn will then end
		 */
	}
	
	public static void displayAllPlayersBalances(ArrayList<Player> players, Tile board[], Property properties[], Scanner in ) {
		/**
		 * The system gets and prints all player's current balances from the player array list 
		 * The player is then returned to the turn option menu
		 */
	}
	
	public static void displayOwnedTilesAvailableForUpgrade(ArrayList<Player> players, Tile board[], Property properties[], Scanner in ) {
		
		/**
		 * This method checks a players owned tiles to see which ones are not upgraded yet,
		 * then displays the ones available for upgrade 
		 * The player can then choose which tile they wish to upgrade if possible,
		 * or they can exit to the turn options menu
		 */
		
	}
	
	public static void investResearchPointsToOwnTile(ArrayList<Player> players, Tile board[], Property properties[], Scanner in) {
		/**
		 * The player decides to invest in a tile 
		 * - The cost of the tile is deducted from the players balance if they have enough
		 * - The property is added to the player's property array list
		 */
	}
	
	public static void displayallPlayersOwnedTiles(ArrayList<Player> players, Tile board[], Property properties[], Scanner in) {
		
		/**
		 * This method gets the data from every players property array list,
		 * converts the data to type string and prints it in a list format
		 */
		
	}
	
	public static void leaveGame(ArrayList<Player> players, Tile board[], Property properties[], Scanner in) {
		
		/**
		 * -The player is removed from the player array list 
		 * -All of the players properties are made available again on the board
		 */
	}

}
