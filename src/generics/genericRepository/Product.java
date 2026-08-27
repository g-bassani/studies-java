package generics.genericRepository;

public class Product {

    private String name;
    private Integer stockAmount;

    public Product(String name, Integer stockAmount) {
        this.name = name;
        this.stockAmount = stockAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(Integer stockAmount) {
        this.stockAmount = stockAmount;
    }

    @Override
    public String toString() {
        return name + ": " + stockAmount + " in stock";
    }
}
