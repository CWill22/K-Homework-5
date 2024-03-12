package fakeSpeare;

public class MicrowaveCookingStrategy implements ICookingStrategy {

	// This class is a concrete strategy for cooking a pizza in a microwave.
	// It increases the cooking price of the pizza by 1.0 and sets the cooking strategy to this MicrowaveCookingStrategy
	@Override
	public boolean cook(AbstractPizza pizza) {
		pizza.setCookingPrice(pizza.getCookingPrice() + 1.00);
		pizza.setCookingStrategy(this);
		return true;
	}

}
