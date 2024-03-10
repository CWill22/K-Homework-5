package fakeSpeare;

public enum PizzaType {
	HAWAIIAN,
	MARGHERITA,
	SUPREME,
	VEGETARIAN;
	
	private double toppingPrice;

	PizzaType(double toppingPrice) {
		this.toppingPrice = toppingPrice;
	}

	PizzaType() {
		// TODO Auto-generated constructor stub
	}
	
	

}
