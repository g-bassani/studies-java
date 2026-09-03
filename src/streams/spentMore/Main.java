package streams.spentMore;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Order> orderList = new ArrayList<>();

        System.out.print("Enter the number of orders: ");
        int amount = sc.nextInt();

        for (int i = 0; i < amount; i++) {
            System.out.printf("Order #%d\n", i + 1);
            System.out.print("Customer name: ");
            sc.nextLine();
            String customerName = sc.nextLine();
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Value: ");
            double value = sc.nextDouble();

            orderList.add(new Order(customerName, productName, value));
        }

        Optional<Order> spentMore = orderList.stream().max(Comparator.comparing(Order::getValue));

        spentMore.ifPresent(order -> System.out.printf("The customer who spent more is %s, spent %.2f on the %s\n", order.getCustomerName(), order.getValue(), order.getProduct()));

        sc.close();
    }
}
