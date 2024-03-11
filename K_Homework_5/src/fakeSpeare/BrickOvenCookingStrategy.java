package fakeSpeare;

public class BrickOvenCookingStrategy implements ICookingStrategy {

	@Override
	public boolean cook(AbstractPizza pizza) {
		pizza.setCookingPrice(pizza.getCookingPrice() + CookingStyleType.BRICK_OVEN.getAdditionalCost());
		return true;
	}

}
