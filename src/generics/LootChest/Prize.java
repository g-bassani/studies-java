package generics.LootChest;

public class Prize {

    private String name;
    private double value;

    public Prize(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return name + " | "
                + String.format("%.2f", value);
    }
}
