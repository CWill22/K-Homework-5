package fakeSpeare;

public class ConventionalOvenCookingStrategy implements ICookingStrategy {

	@Override
	public boolean cook(AbstractPizza pizza) {
		pizza.setCookingPrice(pizza.getCookingPrice() + 8.00);
		pizza.setCookingStrategy(this);
		return true;
	}

}
