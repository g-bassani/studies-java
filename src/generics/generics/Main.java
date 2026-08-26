package generics.generics;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter repository type(E: employee / P: product / A: administrator): ");
            char type = sc.next().toUpperCase().charAt(0);
            sc.nextLine();
            System.out.print("Repository name: ");
            String repositoryName = sc.nextLine();
            System.out.print("How many registers? ");
            int amount = sc.nextInt();
            System.out.println();

            if (type == 'E') {
                Repository<Employee> repository = new Repository<>(repositoryName);

                for (int i = 1; i <= amount; i++) {

                    System.out.printf("Employee #%d:\n", i);
                    System.out.print("Name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("Id: ");
                    int id = sc.nextInt();

                    repository.addRegister(new Employee(name, id));
                }

                System.out.println();
                System.out.println(repository);

            } else if (type == 'P') {
                Repository<Product> repository = new Repository<>(repositoryName);

                for (int i = 1; i <= amount; i++) {

                    System.out.printf("Product #%d:\n", i);
                    System.out.print("Name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("Stock amount: ");
                    int stockAmount = sc.nextInt();

                    repository.addRegister(new Product(name, stockAmount));
                }

                System.out.println();
                System.out.println(repository);

            } else if (type == 'A') {
                Repository<Administrator> repository = new Repository<>(repositoryName);
                sc.nextLine();

                for (int i = 1; i <= amount; i++) {

                    System.out.printf("Administrator #%d:\n", i);
                    System.out.print("Business name: ");
                    String businessName = sc.nextLine();

                    repository.addRegister(new Administrator(businessName));
                }

                System.out.println();
                System.out.println(repository);

            } else {
                throw new IllegalArgumentException("Invalid type");
            }


        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
