package streams.spentMore;

public class Order {

    private String customerName;
    private String product;
    private double value;

    public Order(String customerName, String product, double value) {
        this.customerName = customerName;
        this.product = product;
        this.value = value;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setClientName(String clientName) {
        this.customerName = clientName;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
