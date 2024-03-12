package fakeSpeare;

public class HawaiianPizza extends AbstractPizza{
    
    //Default constructor for creating a new Hawiian pizza
    public HawaiianPizza(){
        super();
        // addition of default toppings for the pizza
        this.toppingList.add(Toppings.CANADIAN_BACON);
        this.toppingList.add(Toppings.CHEESE);
        this.toppingList.add(Toppings.PINEAPPLE);
        this.priceWithoutToppings = 3.0;
    }

    // Copy constructor for creating a copy of an existing Hawaiian pizza
    public HawaiianPizza(HawaiianPizza pizza){
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

    // Method to update the total price of the pizza
    @Override
    public double updatePizzaPrice(){
        // Calls the method to calculate the total price with toppings
        return addTopingsToPrice(priceWithoutToppings);
    }

    // Method to generate a string representation of the Hawaiian pizza
    @Override
    public String toString(){
        // Returns a string containing all the attributes of teh Hawaiian Pizza
        return "HawaiianPizza{" +
                "toppingList=" + toppingList +
                ", priceWithoutToppings=" + priceWithoutToppings +
                ", totalPrice=" + totalPrice +
                ", pizzaOrderID=" + pizzaOrderID +
                ", cookingStrategy=" + cookingStrategy +
                ", cookingPrice=" + cookingPrice +
                '}';
    }
}
