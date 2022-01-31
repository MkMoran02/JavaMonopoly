
public enum TileType { PROPERTY(0), CHANCE(1), SERVER_CRASH(2), CYBER_ATTACK(3), NOTHING(4);
	private String type[] = {"Property", "Chance", "Server Crash", "Cyber Attack", "Does Nothing"};
	
	private int index;
	
	private TileType(int num) {
		index = num;
	}
	
	/**
	 * A method that changes the enums to a string format
	 */
	
	public String toString() {
		return type[index];
	}

}
