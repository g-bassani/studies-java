package generics.LootChest;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        try {
            List<Prize> prizes = List.of(new Prize
                    ("Wireless Mouse", 89.90), new Prize
                    ("Mechanical Keyboard", 249.90), new Prize
                    ("Bluetooth Speaker", 179.90), new Prize
                    ("Smartwatch", 399.90), new Prize
                    ("Gaming Headset", 299.90), new Prize
                    ("Portable SSD", 449.90), new Prize
                    ("Smartphone", 1299.90));

            LootChest<Prize> lootChest = new LootChest<>(prizes);
            System.out.println(lootChest.openChest());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
