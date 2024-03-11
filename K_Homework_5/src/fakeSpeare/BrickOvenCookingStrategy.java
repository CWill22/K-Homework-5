package fakeSpeare;

public class BrickOvenCookingStrategy implements ICookingStrategy {

	@Override
	public boolean cook(AbstractPizza pizza) {
		pizza.setCookingPrice(pizza.getCookingPrice() + 10.00);
		pizza.setCookingStrategy(this);
		return true;
	}

}
