package fakeSpeare;

public class BrickOvenCookingStrategy implements ICookingStrategy {

	
	// Method is called to cook pizza using the brick oven strategy
	// Increases the cooking price of the pizza by 10.00 and sets the cooking strategy to this BrickOvenStrategy
	@Override
	public boolean cook(AbstractPizza pizza) {
		pizza.setCookingPrice(pizza.getCookingPrice() + 10.00);
		pizza.setTotalPrice(pizza.getTotalPrice() + pizza.getCookingPrice());
		pizza.setCookingStrategy(this);
		return true;
	}

}
