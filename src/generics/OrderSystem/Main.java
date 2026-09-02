package generics.OrderSystem;

public class Main {

    public static void main(String[] args) {

        //Hardcoded
        try {
            Order<Pizza> order = new Order<Pizza>(345);
            order.addDishes(new Pizza("Pepperoni", 3))
                    .addDishes(new Pizza("Margherita", 5))
                    .addDishes(new Pizza("Four Cheese", 2))
                    .addDishes(new Pizza("White Pizza", 1));

            System.out.println(order.orderStatus());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
