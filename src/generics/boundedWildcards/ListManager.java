package generics.boundedWildcards;

import java.util.List;

public class ListManager {

    public static void printList(List<?> list) {
        System.out.println(list);
    }

    public static void addNumberList(List<? extends Number> list, List<? super Number> destiny ) {
        destiny.addAll(list);
    }

    public static void doubleList(List<? extends Number> list, List<? super Number> doubledList) {
        for (Number n: list) {
            doubledList.add(n.doubleValue() * 2);
        }
    }
}
