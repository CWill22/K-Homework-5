package fakeSpeare;

// PIzzaCookingFactory is responsible for creating instances of AbstractPizza
public class PizzaCookingFactory {
/*
	It creates an AbstractPizza instance and
	instantiates it according to the pizzaType parameter. It also sets the pizzaOrderID of the pizza
	using the current orderIDCounter of the pizza. The orderIDCounter will be incremented and
	assigned automatically on every creation of pizza, to assign unique pizza order IDs.
 */
	public AbstractPizza createPizza(PizzaType pizzaType) {
		AbstractPizza pizza = null;
		// create pizza according to pizzaType
		switch (pizzaType) {
		case HAWAIIAN:
			pizza = new HawaiianPizza();
			break;
		case MARGHERITA:
			pizza = new MargheritaPizza();
			break;
		case SUPREME:
			pizza = new SupremePizza();
			break;
		case VEGETARIAN:
			pizza = new VegetarianPizza();
			break;
		}
		// set pizza order ID
		pizza.setPizzaOrderID(AbstractPizza.getOrderIDCounter());
		AbstractPizza.setOrderIDCounter(AbstractPizza.getOrderIDCounter());
		// return the pizza
		return pizza;
		
		
	}

}
