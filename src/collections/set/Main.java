package collections.set;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Set<Student> studentSet = new HashSet<>();

        System.out.print("How many students for course A: ");
        int amount = sc.nextInt();
        for (int i = 1; i <= amount; i++) {
            System.out.print("Id: ");
            int id = sc.nextInt();

            // Duplicate students are not added

            studentSet.add(new Student(id));
        }

        System.out.print("How many students are in course B: ");
        amount = sc.nextInt();
        for (int i = 1; i <= amount; i++) {
            System.out.print("Id: ");
            int id = sc.nextInt();

            studentSet.add(new Student(id));
        }

        System.out.print("How many students are in course C: ");
        amount = sc.nextInt();
        for (int i = 1; i <= amount; i++) {
            System.out.print("Id: ");
            int id = sc.nextInt();

            studentSet.add(new Student(id));
        }

        System.out.println();
        System.out.println("Total students at the institution: " + studentSet.size());

    }
}
