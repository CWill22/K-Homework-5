package fakeSpeare;

public class ConventionalOvenCookingStrategy implements ICookingStrategy {

	// This class is a concrete strategy for cooking a pizza in a conventional oven.
	// It increases the cooking price of the pizza by 8.00 and sets the cooking strategy to this ConventionalOvenCookingStrategy
	@Override
	public boolean cook(AbstractPizza pizza) {
		pizza.setCookingPrice(pizza.getCookingPrice() + 8.00);
		pizza.setCookingStrategy(this);
		return true;
	}

}
