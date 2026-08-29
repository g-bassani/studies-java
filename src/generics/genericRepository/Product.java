package generics.genericRepository;

public class Product {

    private String name;
    private int stockAmount;

    public Product(String name, int stockAmount) {
        this.name = name;
        this.stockAmount = stockAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    @Override
    public String toString() {
        return name + ": " + stockAmount + " in stock";
    }
}
