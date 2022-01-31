
public class Tile {
	
	//Variables
	private String tileName;
	private int index;
	private TileType type;


//Constructor
public Tile(String tileName, int index, TileType type) {
	this.tileName = tileName;
	this.index = index;
	this.type = type;
}

//Getters
public String getTileName() {
	return this.tileName;
}
public int getIndex() {
	return this.index;
}
public TileType getType() {
	return this.type;
}
	
}
