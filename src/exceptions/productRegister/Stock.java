package exceptions.productRegister;

import java.util.ArrayList;
import java.util.List;

public class Stock {

    private String name;
    private int productLimit;
    private final List<Product> products = new ArrayList<>();

    public Stock(String name, int productLimit) {
        this.name = name;
        this.productLimit = productLimit;
    }

    public int getProductLimit() {
        return productLimit;
    }

    public void setProductLimit(int productLimit) {
        this.productLimit = productLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public int totalAmount() {
        int total = 0;
        for (Product p: products) {
            total += p.getAmount();
        }
        return total;
    }

    // Can only add product with name, price, and amount

    public void addProduct(Product product) {
        if (product.getName().isBlank()) {
            throw new ProductException("You can't add a product without a name in stock");
        }

        if (product.getPrice() <= 0) {
            throw new ProductException("You can't add a product without a valid price in stock");
        }

        if (product.getAmount() <= 0) {
            throw new ProductException("You can't add a product without an valid amount in stock");
        }

        // Test the limit of stock

        if (totalAmount() + product.getAmount() > productLimit) {

            throw new StockException("Not enough space in stock");
        }

        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }
}
