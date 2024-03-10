package fakeSpeare;
//Concrete class for Margherita Pizza
public class MargheritaPizza extends AbstractPizza {
    //constructor to initialize the Margherita Pizza with default toppings and price
    public MargheritaPizza(){
        super();
        this.toppingList.add(Toppings.TOMATO);
        this.toppingList.add(Toppings.CHEESE);
        this.priceWithoutToppings = 2.5;
    }
    //copy constructor prevents memory leaks
    public MargheritaPizza(MargheritaPizza pizza){
        super();
        this.toppingList.addAll(pizza.getToppingList());
        this.priceWithoutToppings = pizza.getPriceWithoutToppings();
    }
    //implementation of abstract method to calculate the total of toppings
    @Override
    protected double addTopingsToPrice(double priceWithoutToppings){
        double totalPrice = priceWithoutToppings;
        for(Toppings topping : toppingList){
            totalPrice += topping.getPrice();
        }
        this.totalPrice = totalPrice;
        return totalPrice;
    }
    //updates the price of the pizza
    @Override
    public double updatePizzaPrice(){
        return addTopingsToPrice(priceWithoutToppings);
    }
    @Override
    public String toString(){
        return "MargheritaPizza{" +
                "toppingList=" + toppingList +
                ", priceWithoutToppings=" + priceWithoutToppings +
                ", totalPrice=" + totalPrice +
                ", pizzaOrderID=" + pizzaOrderID +
                ", cookingStrategy=" + cookingStrategy +
                ", cookingPrice=" + cookingPrice +
                '}';
    }
}
