package fakeSpeare;
import java.util.ArrayList;
import java.util.List;

public class PizzaOrder {
  private PizzaCookingFactory factory;
  private ICookingStrategy strategy;
  private List<AbstractPizza> orderList;

  //Creates a new pizza order
  public PizzaOrder(){
    factory = new PizzaCookingFactory(); // Instantiate the pizza factory
    orderList = new ArrayList<>(); // Instantiate the list of pizzas in the order
  }

  //Shows the toppings put on a certain pizza when given the ID of the order
  public void printListOfToppingsByPizzaOrderID(int orderID) {
	        for (AbstractPizza pizza : orderList) {
	            if (pizza.getPizzaOrderID() == orderID) {
			// Print toppings for the pizza order
	                System.out.println("Toppings for Pizza Order ID " + orderID + ": " + pizza.getToppingList());
	                return;
	            }
	        }
          //If the ID isn't found, this message pops up
	        System.out.println("No pizza found with order ID " + orderID);
	    }

      //prints the pizzas in the order
	    public void printPizzaOrderCart(int orderID) {
	        for (AbstractPizza pizza : orderList) {
		    // Print each pizza in the order	
	            System.out.println(pizza);
	        }
	    }

      //Finds an order and returns the pizza if the ID is found, returns NULL if unsuccessful
	    public AbstractPizza getPizzaByOrderID(int orderID) {
	        for (AbstractPizza pizza : orderList) {
	            if (pizza.getPizzaOrderID() == orderID) {
			// Return the pizza with the given order ID    
	                return pizza;
	            }
	        }
		// If no pizza is found, return null    
	        return null;
	    }

      //Creates a new pizza of a given pizzaType and adds it to the pizza cart
	    public boolean addPizzaToCart(PizzaType pizzaType) {
	        AbstractPizza pizza;
	        this.factory = new PizzaCookingFactory();
			pizza = factory.createPizza(pizzaType);
			
	        if (pizza != null) {
		    // add the created pizza to the order list	
	            orderList.add(pizza);
	            pizza.updatePizzaPrice();
	            return true;
	        }
	        return false;
	    }

      //takes an order ID, gets the pizza in the order, and adds the given topping if it is not already on the pizza
	    public boolean addNewToppingToPizza(int orderID, Toppings topping) {
	        AbstractPizza pizza = getPizzaByOrderID(orderID);
	        if (pizza != null && !pizza.getToppingList().contains(topping)) {
		    // Add the toppings to the pizza and update its price	
	            pizza.getToppingList().add(topping);
	            pizza.updatePizzaPrice();
	            return true;
	        }
	        return false;
	    }

      ///takes an order ID, gets the pizza in the order, and removes the given topping if it is already on the pizza
	    public boolean removeToppingFromPizza(int orderID, Toppings topping) {
	        AbstractPizza pizza = getPizzaByOrderID(orderID);
	        if (pizza != null && pizza.getToppingList().contains(topping)) {
		    // Remove the toppings from the pizza and update its price	
	            pizza.getToppingList().remove(topping);
	            pizza.updatePizzaPrice();
	            return true;
	        }
	        return false;
	    }

      //Checks the orderList and checks if there are any uncooked pizzas, returns true if there is and returns false if not
	    public boolean isThereAnyUncookedPizza() {
	        for (AbstractPizza pizza : orderList) {
	            if (pizza.getCookingStrategy() == null) {
			// Check if any pizza has no assigned cooking strategy    
	                return true;
	            }
	        }
	        return false;
	    }

      //Uses the getTotalPrice() and getCookingPrice() of a pizza order to calculate the total cost of an order
	    public double checkout() throws Exception {
	        if (isThereAnyUncookedPizza()) {
		    // Throw an exception if there are uncooked pizzas in the order
	            throw new Exception("There are uncooked pizzas in the order.");
	        }
	        double totalBill = 0.0;
	        for (AbstractPizza pizza : orderList) {
		    // Calculate the total bill by adding the total price and cooking price and cooking price of each pizza	
	            totalBill += pizza.getTotalPrice() + pizza.getCookingPrice();
	        }
	        return totalBill;
	    }

      //Uses the given cookingStrategyType to set a pizza given by an orderID to cook with the correct cooking strategy
	    public boolean selectCookingStrategyByPizzaOrderID(int orderID, CookingStyleType cookingStrategyType) {
	        AbstractPizza pizza = getPizzaByOrderID(orderID);
	        if (pizza != null) {
	            switch (cookingStrategyType) {
	                case MICROWAVE:
	                    strategy = new MicrowaveCookingStrategy();
	                    break;
	                case CONVENTIONAL_OVEN:
	                    strategy = new ConventionalOvenCookingStrategy();
	                    break;
	                case BRICK_OVEN:
	                    strategy = new BrickOvenCookingStrategy();
	                    break;
	            }
		    // Set the cooking strategy for the pizza and cook it
	            pizza.setCookingStrategy(strategy);
	            pizza.getCookingStrategy().cook(pizza);
	            return true;
	        }
	        return false;
	    }
	}

