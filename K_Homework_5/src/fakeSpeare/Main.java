package fakeSpeare;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instantiate a pizzaOrder, perform operations based on the requirements.
		PizzaOrder order = new PizzaOrder();
		System.out.println(order);
		
		// Add pizzas to the cart
		order.addPizzaToCart(PizzaType.HAWAIIAN);
		order.addPizzaToCart(PizzaType.MARGHERITA);
		order.addPizzaToCart(PizzaType.SUPREME);
		order.addPizzaToCart(PizzaType.VEGETARIAN);
		// Print the pizza order cart
		order.printPizzaOrderCart(0);
		
		// Add toppings(BLACK_OLIVE and BELL_PEPPER) to the first pizza
		order.addNewToppingToPizza(1, Toppings.BLACK_OLIVE);
		order.addNewToppingToPizza(1, Toppings.BELL_PEPPER);
		
		//Print the toppings of each pizza
		order.printListOfToppingsByPizzaOrderID(1);
		order.printListOfToppingsByPizzaOrderID(2);
		order.printListOfToppingsByPizzaOrderID(3);
		order.printListOfToppingsByPizzaOrderID(4);

		// Remove topping(Black_Olive) from the first pizza
		order.removeToppingFromPizza(1, Toppings.BLACK_OLIVE);
		
		//cook the pizzas using the microwave cooking strategy
		ICookingStrategy strategy = new MicrowaveCookingStrategy();
		strategy.cook(order.getPizzaByOrderID(1));
		strategy.cook(order.getPizzaByOrderID(2));
		strategy.cook(order.getPizzaByOrderID(3));
		strategy.cook(order.getPizzaByOrderID(4));
		//See if there are any uncooked pizzas
		if(true ==order.isThereAnyUncookedPizza()) {
			System.out.println("There are uncooked pizzas in the cart");
		}
		else {
			System.out.println("All pizzas are cooked");
		}
		
		
		//Print the pizza order cart, after modifying the toppings
		System.out.println("After modifying toppings");
		order.printPizzaOrderCart(1);
		
		//Checkout the order
		try {
			order.checkout();
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


