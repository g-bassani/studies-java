package generics.boundedWildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Integer> integerList = Arrays.asList(6, 12, 24, 48);
        List<Double> doublesList = Arrays.asList(2.0, 4.0 , 8.0, 16.0);
        List<Object> objectList = new ArrayList<>();

        ListManager.printList(integerList);
        ListManager.printList(doublesList);

        // Use bounded wildcards to add different list types to the object list

        ListManager.addNumberList(integerList, objectList);
        ListManager.addNumberList(doublesList, objectList);
        ListManager.printList(objectList);

        // Add the double of integerList and doubleList to objectList in double

        ListManager.doubleList(integerList, objectList);
        ListManager.doubleList(doublesList, objectList);
        ListManager.printList(objectList);
    }
}
