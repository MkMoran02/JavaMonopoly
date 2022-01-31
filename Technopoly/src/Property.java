import java.util.ArrayList;

public class Property extends Tile {

		
//Variables
private double price;
private double rent;
private double upgradedPrice;
private double upgradedRent; 
private PropertyStatus status;

//Constructor
public Property(String tileName, int index, TileType type, double price, double rent, double upgradedPrice, double upgradedRent, PropertyStatus status) {
	super(tileName, index, type);
	
	this.price = price;
	this.rent = rent;
	this.upgradedPrice = upgradedPrice;
	this.upgradedRent = upgradedRent;
	this.status = status;
	

}

//Getters
public double getPrice() {
	return this.price;
	
}
public double getRent() {
	return this.rent;
}

public double getUpgradedPrice() {
	return this.upgradedPrice;
}
public double getUpgradedRent() {
	return this.upgradedRent;
	
}
public PropertyStatus getStatus() {
	return this.status;
}

}
