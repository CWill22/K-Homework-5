package fakeSpeare;

public class MicrowaveCookingStrategy implements ICookingStrategy {

	@Override
	public boolean cook(AbstractPizza pizza) {
		pizza.setCookingPrice(pizza.getCookingPrice() + CookingStyleType.MICROWAVE.getAdditionalCost());
		return true;
	}

}
