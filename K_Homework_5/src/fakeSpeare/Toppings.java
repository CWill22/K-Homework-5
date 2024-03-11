package fakeSpeare;

public enum Toppings {
	// The price of each topping is added to the base price of the pizza
	TOMATO(1.50),
	CHEESE(2.00),
	PINEAPPLE(2.50),
	BLACK_OLIVE(1.25),
	ITALIAN_SAUSAGE(3.50),
	PEPPERONI(3.00),
	BELL_PEPPER(1.00),
	MUSHROOM(1.50),
	CANADIAN_BACON(4.00);

	
	private double toppingPrice;
	
	// Constructor for Toppings
	Toppings(double toppingPrice) {
		this.toppingPrice = toppingPrice;
		
	}
	
	
	// Getter for toppingPrice
	public double getToppingPrice(){
        return toppingPrice;
    }
	
	
	

	
    
}
