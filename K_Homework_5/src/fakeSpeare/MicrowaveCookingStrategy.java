package fakeSpeare;

public class MicrowaveCookingStrategy implements ICookingStrategy {

	// This class is a concrete strategy for cooking a pizza in a microwave.
	@Override
	public boolean cook(AbstractPizza pizza) {
		pizza.setCookingPrice(pizza.getCookingPrice() + 1.00);
		pizza.setTotalPrice(pizza.getTotalPrice() + pizza.getCookingPrice());
		pizza.setCookingStrategy(this);
		return true;
	}

}
