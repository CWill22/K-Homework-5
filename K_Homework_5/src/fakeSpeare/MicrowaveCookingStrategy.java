package fakeSpeare;

public class MicrowaveCookingStrategy implements ICookingStrategy {

	@Override
	public boolean cook(AbstractPizza pizza) {
		pizza.setCookingPrice(pizza.getCookingPrice() + 1.00);
		pizza.setCookingStrategy(this);
		return true;
	}

}
