package fakeSpeare;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instantiate a pizzaOrder, perform operations based on the requirements.
		PizzaOrder order = new PizzaOrder();
		System.out.println(order);
		order.addPizzaToCart(PizzaType.HAWAIIAN);
		order.addPizzaToCart(PizzaType.MARGHERITA);
		order.addPizzaToCart(PizzaType.SUPREME);
		order.addPizzaToCart(PizzaType.VEGETARIAN);
		order.printPizzaOrderCart(0);
		
		order.addNewToppingToPizza(1, Toppings.BLACK_OLIVE);
		order.addNewToppingToPizza(1, Toppings.BELL_PEPPER);
		
		order.printListOfToppingsByPizzaOrderID(1);
		if(true ==order.isThereAnyUncookedPizza()) {
			System.out.println("There are uncooked pizzas in the cart");
		}
		
		order.removeToppingFromPizza(1, Toppings.BLACK_OLIVE);
		order.printListOfToppingsByPizzaOrderID(1);
		ICookingStrategy strategy = new MicrowaveCookingStrategy();
		if (false == order.isThereAnyUncookedPizza()) {
			System.out.println("All pizzas are cooked");
		}
		System.out.println("After modifying toppings");
		order.printPizzaOrderCart(1);
		PizzaOrder pizzaOrderInstance = new PizzaOrder();
		try {
			pizzaOrderInstance.checkout();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*  Adds pizzas to the cart, selects cooking strategies for the pizzas in the cart,
		prints pizza order cart. Calls checkout to calculate the bill, throws exception if
		triggered.
		*/
		// TODO
		
				}
}


