package fakeSpeare;
import java.util.ArrayList;
import java.util.List;

// Abstract class representing a pizza
public abstract class AbstractPizza {
    // List of toppings on the pizza
    protected List<Toppings> toppingList;
    // Price of the pizza without toppings
    protected double priceWithoutToppings;
    // Total price of the pizza
    protected double totalPrice;
    // ID of the pizza order
    protected int pizzaOrderID;
    // Counter for generating unique pizza order IDs
    protected static int orderIDCounter;
    // Strategy for cooking the pizza
    protected ICookingStrategy cookingStrategy;
    // Price for the cooking method
    protected double cookingPrice;

    // Constructor for AbstractPizza
    public AbstractPizza() {
        // Initialize the topping list
        toppingList = new ArrayList<>();
        // Initialize the price without toppings
        priceWithoutToppings = 0;
        // Initialize the total price
        totalPrice = 0.0;
        // Assign a unique pizza order ID
        pizzaOrderID = orderIDCounter++;
        // Initialize the cooking strategy to null
        cookingStrategy = null;
        // Initialize the cooking price
        cookingPrice = 0.0;
    }

    //Geters and Setters

    // Get the list of toppings
    public List<Toppings> getToppingList() {
        return toppingList;
    }

    // Set the list of toppings
    public void setToppingList(List<Toppings> toppingList) {
        this.toppingList = toppingList;
    }

    // Get the price without toppings
    public double getPriceWithoutToppings() {
        return priceWithoutToppings;
    }

    // Set the price without toppings
    public void setPriceWithoutToppings(double priceWithoutToppings) {
        this.priceWithoutToppings = priceWithoutToppings;
    }

    // Get the total price
    public double getTotalPrice() {
        return totalPrice;
    }

    // Set the total price
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    // Get the pizza order ID
    public int getPizzaOrderID() {
        return pizzaOrderID;
    }

    // Set the pizza order ID
    public void setPizzaOrderID(int pizzaOrderID) {
        this.pizzaOrderID = pizzaOrderID;
    }

    // Get the order ID counter
    public static int getOrderIDCounter() {
        return orderIDCounter;
    }

    // Set the order ID counter
    public static void setOrderIDCounter(int orderIDCounter) {
        AbstractPizza.orderIDCounter = orderIDCounter;
    }

    // Get the cooking strategy
    public ICookingStrategy getCookingStrategy() {
        return cookingStrategy;
    }

    // Set the cooking strategy
    public void setCookingStrategy(ICookingStrategy cookingStrategy) {
        this.cookingStrategy = cookingStrategy;
    }

    // Get the cooking price
    public double getCookingPrice() {
        return cookingPrice;
    }

    // Set the cooking price
    public void setCookingPrice(double cookingPrice) {
        this.cookingPrice = cookingPrice;
    }

    // Abstract method to add toppings to the price
    protected abstract double addTopingsToPrice(double priceWithoutToppings);

    // Abstract method to update the pizza price
    public abstract double updatePizzaPrice();
}
