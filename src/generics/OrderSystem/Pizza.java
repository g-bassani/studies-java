package generics.OrderSystem;

public class Pizza {

    //Example dish type

    private String flavor;
    private int slices;

    public Pizza(String flavor, int slices) {
        this.flavor = flavor;
        this.slices = slices;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getSlices() {
        return slices;
    }

    public void setSlices(int slices) {
        this.slices = slices;
    }

    public String toString() {
        return "flavor: " + flavor + ", slices: " + slices;
    }
}
