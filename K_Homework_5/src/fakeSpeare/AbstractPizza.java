package fakeSpeare;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPizza{
    protected List<Toppings> toppingList;
    protected double priceWithoutToppings;
    protected double totalPrice;
    protected int pizzaOrderID;
    protected static int orderIDCounter;
    protected ICookingStrategy cookingStrategy;
    protected double cookingPrice;
    public AbstractPizza(){
        toppingList = new ArrayList<>();
        priceWithoutToppings = 0;
        totalPrice = 0;
        pizzaOrderID = orderIDCounter++;
        cookingStrategy = null;
        cookingPrice = 0.0;
    }
    public List<Toppings> getToppingList(){
        return toppingList;
    }
    public void setToppingList(List<Toppings> toppingList){
        this.toppingList = toppingList;
    }
    public double getPriceWithoutToppings(){
        return priceWithoutToppings;
    }
    public void setPriceWithoutToppings(double priceWithoutToppings){
        this.priceWithoutToppings = priceWithoutToppings;
    }
    public double getTotalPrice(){
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice){
        this.totalPrice = totalPrice;
    }
    public int getPizzaOrderID(){
        return pizzaOrderID;
    }
    public void setPizzaOrderID(int pizzaOrderID){
        this.pizzaOrderID = pizzaOrderID;
    }
    public static int getOrderIDCounter(){
        return orderIDCounter;
    }
    public static void setOrderIDCounter(int orderIDCounter){
        AbstractPizza.orderIDCounter = orderIDCounter;
    }
    public ICookingStrategy getCookingStrategy(){
        return cookingStrategy;
    }
    public void setCookingStrategy(ICookingStrategy cookingStrategy){
        this.cookingStrategy = cookingStrategy;
    }
    public double getCookingPrice(){
        return cookingPrice;
    }
    public void setCookingPrice(double cookingPrice){
        this.cookingPrice = cookingPrice;
    }
}
