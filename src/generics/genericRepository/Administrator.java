package generics.genericRepository;

public class Administrator {

    private String businessName;

    public Administrator(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    @Override
    public String toString() {
        return "Administrator: " +
                businessName;
    }
}
