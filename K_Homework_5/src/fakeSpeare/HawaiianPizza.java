package fakeSpeare;

public class HawaiianPizza extends AbstractPizza{
    public HawaiianPizza(){
        super();
        this.toppingList.add(Toppings.CANADIAN_BACON);
        this.toppingList.add(Toppings.CHEESE);
        this.toppingList.add(Toppings.PINEAPPLE);
        this.priceWithoutToppings = 3.0;
    }
    public HawaiianPizza(HawaiianPizza pizza){
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
