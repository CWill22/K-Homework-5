package fakeSpeare;

public class BrickOvenCookingStrategy implements ICookingStrategy {

	
	// This class is a concrete strategy for cooking a pizza in a brick oven.
	@Override
	public boolean cook(AbstractPizza pizza) {
		pizza.setCookingPrice(pizza.getCookingPrice() + 10.00);
		pizza.setCookingStrategy(this);
		return true;
	}

}
