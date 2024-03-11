package fakeSpeare;

public class SupremePizza extends AbstractPizza{
    public SupremePizza(){
        super();
        this.toppingList.add(Toppings.TOMATO);
        this.toppingList.add(Toppings.CHEESE);
        this.toppingList.add(Toppings.BELL_PEPPER);
        this.toppingList.add(Toppings.ITALIAN_SAUSAGE);
        this.toppingList.add(Toppings.PEPPERONI);
        this.toppingList.add(Toppings.BLACK_OLIVE);
        this.toppingList.add(Toppings.MUSHROOM);
        this.priceWithoutToppings = 3.5;
    }
    public SupremePizza(SupremePizza pizza){
        super();
        this.toppingList.addAll(pizza.getToppingList());
        this.priceWithoutToppings = pizza.getPriceWithoutToppings();
    } 
    @Override
    protected double addTopingsToPrice(double priceWithoutToppings){
        double totalPrice = priceWithoutToppings;
        for(Toppings topping : toppingList){
            totalPrice += topping.getToppingPrice();
        }
        this.totalPrice = totalPrice;
        return totalPrice;
    }
    @Override
    public double updatePizzaPrice(){
        return addTopingsToPrice(priceWithoutToppings);
    }
    @Override
    public String toString(){
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
