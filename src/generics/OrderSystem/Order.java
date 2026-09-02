package generics.OrderSystem;

import java.util.ArrayList;
import java.util.List;

public class Order<T> {

    private final int orderNumber;

    private final List<T> dishes = new ArrayList<>();

    public Order(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Order<T> addDishes(T dish) {
        if (dish == null) {
            throw new IllegalArgumentException("Empty dish");
        }

        dishes.add(dish);
        return this;
    }

    public String orderStatus() {
        if (dishes.isEmpty()) {
            return "No dishes yet";
        }

        StringBuilder sb = new StringBuilder();
        for (T d : dishes) {
            sb.append(d).append("\n");
        }

        return sb.toString();
    }
}
