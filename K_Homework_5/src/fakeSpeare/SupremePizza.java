package fakeSpeare;

// subclass of AbstractPizza
public class SupremePizza extends AbstractPizza{

    // Default constructor for creating a new Supreme pizza
    public SupremePizza(){
        super();
        // Adding default toppings for a Supreme pizza
        this.toppingList.add(Toppings.TOMATO);
        this.toppingList.add(Toppings.CHEESE);
        this.toppingList.add(Toppings.BELL_PEPPER);
        this.toppingList.add(Toppings.ITALIAN_SAUSAGE);
        this.toppingList.add(Toppings.PEPPERONI);
        this.toppingList.add(Toppings.BLACK_OLIVE);
        this.toppingList.add(Toppings.MUSHROOM);
        this.priceWithoutToppings = 3.5;
    }

    // Copy constructor for creating a copy of an existing Supreme pizza
    public SupremePizza(SupremePizza pizza){
        super();
        this.toppingList.addAll(pizza.getToppingList());
        this.priceWithoutToppings = pizza.getPriceWithoutToppings();
    } 

    // Method to calculate the total price of the pizza with toppings
    @Override
    protected double addTopingsToPrice(double priceWithoutToppings){
        double totalPrice = priceWithoutToppings;
        // Adding the price of each topping to the toal price
        for(Toppings topping : toppingList){
            totalPrice += topping.getToppingPrice();
        }
        this.totalPrice = totalPrice;
        return totalPrice;
    }

    // Method to update the total price of the pizza
    @Override
    public double updatePizzaPrice(){
        // calls the method to calculate the total price with toppings
        return addTopingsToPrice(priceWithoutToppings);
    }

    // Method to generate a string representation of the Supreme pizza
    @Override
    public String toString(){
        // Returns a string containing all the attributes of the Supreme pizza
        return "SupremePizza{" +
                "toppingList=" + toppingList +
                ", priceWithoutToppings=" + priceWithoutToppings +
                ", totalPrice=" + totalPrice +
                ", pizzaOrderID=" + pizzaOrderID +
                ", cookingStrategy=" + cookingStrategy +
                ", cookingPrice=" + cookingPrice +
                '}';
    }
}
