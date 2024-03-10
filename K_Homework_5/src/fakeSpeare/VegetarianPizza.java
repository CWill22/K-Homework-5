package fakeSpeare;

public class VegetarianPizza extends AbstractPizza{
    public VegetarianPizza(){
        super();
        this.toppingList.add(Toppings.TOMATO);
        this.toppingList.add(Toppings.CHEESE);
        this.toppingList.add(Toppings.BELL_PEPPER);
        this.toppingList.add(Toppings.BLACK_OLIVE);
        this.toppingList.add(Toppings.MUSHROOM);
        this.priceWithoutToppings = 1.5;
    }
    public VegetarianPizza(VegetarianPizza pizza){
        super();
        this.toppingList.addAll(pizza.getToppingList());
        this.priceWithoutToppings = pizza.getPriceWithoutToppings();
    }
    @Override
    protected double addTopingsToPrice(double priceWithoutToppings){
        double totalPrice = priceWithoutToppings;
        for(Toppings topping : toppingList){
            totalPrice += topping.getPrice();
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
