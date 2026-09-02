package exceptions.productRegister;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        try(Scanner sc = new Scanner(System.in)) {

            System.out.print("How many products? ");
            int quantity = sc.nextInt();
            sc.nextLine();
            System.out.print("Stock name: ");
            String stockName = sc.nextLine();
            System.out.print("Stock limit: ");
            int stockLimit = sc.nextInt();
            sc.nextLine();

            Stock stock = new Stock(stockName, stockLimit);

            for(int i = 1; i <= quantity;i++) {
                System.out.printf("Product #%d:\n", i);
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Amount: ");
                int amount = sc.nextInt();

                stock.addProduct(new Product(name, price, amount));
            }

            for(Product p: stock.getProducts()) {
                System.out.print(p.getName() + " | " + p.getPrice() + " | " + p.getAmount());
            }
        }catch (ProductException | StockException e) {
            System.out.println(e.getMessage());
        }
    }
}
