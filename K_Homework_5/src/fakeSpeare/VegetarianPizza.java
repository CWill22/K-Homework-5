package fakeSpeare;

// Subclass of Abstractpizza
public class VegetarianPizza extends AbstractPizza{

    // Default constructor for creating a new Vegetarian pizza
    public VegetarianPizza(){
        super();
        // Adding default toppings for a Vegetarian pizza
        this.toppingList.add(Toppings.TOMATO);
        this.toppingList.add(Toppings.CHEESE);
        this.toppingList.add(Toppings.BELL_PEPPER);
        this.toppingList.add(Toppings.BLACK_OLIVE);
        this.toppingList.add(Toppings.MUSHROOM);
        this.priceWithoutToppings = 1.5;
    }

    // Copy constructor for creating a copy of an existing Vegetarian pizza
    public VegetarianPizza(VegetarianPizza pizza){
        super();
        this.toppingList.addAll(pizza.getToppingList());
        this.priceWithoutToppings = pizza.getPriceWithoutToppings();
    }

    // Method to calculate the total price of the pizza with toppings
    @Override
    protected double addTopingsToPrice(double priceWithoutToppings){
        double totalPrice = priceWithoutToppings;
        // Adding the price of each topping to the total price
        for(Toppings topping : toppingList){
            totalPrice += topping.getToppingPrice();
        }
        this.totalPrice = totalPrice;
        return totalPrice;
    }

    // Method to update the toal price of the pizza
    @Override
    public double updatePizzaPrice(){
        // Calls the method to calculate the total price with toppings
        return addTopingsToPrice(priceWithoutToppings);
    }

    // Method to generate a string representation of the Vegetarian pizza
    @Override
    public String toString(){
        // Returns a string containing all the attributes of the Vegetarian pizza
        return "VegetarianPizza{" +
                "toppingList=" + toppingList +
                ", priceWithoutToppings=" + priceWithoutToppings +
                ", totalPrice=" + totalPrice +
                ", pizzaOrderID=" + pizzaOrderID +
                ", cookingStrategy=" + cookingStrategy +
                ", cookingPrice=" + cookingPrice +
                '}';
    }

}
