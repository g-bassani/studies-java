package generics.LootChest;

import java.util.List;
import java.util.Random;

public class LootChest<T> {

    private static final Random random = new Random();
    private final List<T> items;
    private boolean chestStatus = true;

    public LootChest(List<T> items) {
        if (items.isEmpty()) {
            throw new IllegalArgumentException("Empty list");
        }
        this.items = items;
    }

    public boolean isChestStatus() {
        return chestStatus;
    }

    public List<T> getItems() {
        return items;
    }

    public T openChest() {
        if (!chestStatus) {
            throw new IllegalArgumentException("Already opened");
        }

        chestStatus = false;
        return items.get(random.nextInt(items.size()));
    }
}
