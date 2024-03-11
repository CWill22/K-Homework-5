package fakeSpeare;

public class ConventionalOvenCookingStrategy implements ICookingStrategy {

	@Override
	public boolean cook(AbstractPizza pizza) {
		pizza.setCookingPrice(pizza.getCookingPrice() + CookingStyleType.CONVENTIONAL_OVEN.getAdditionalCost());
		return true;
	}

}
