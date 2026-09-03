package streams.employeeProcessing;

import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert the number of employees: ");
        int amount = sc.nextInt();
        sc.nextLine();

        List<Employee> employeeList = new ArrayList<>();

        for (int i = 1; i <= amount; i++) {
            System.out.printf("Employee #%d:\n", i);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            employeeList.add(new Employee(name, email, salary));
        }

        System.out.print("Enter salary for comparison: ");
        double comparisonSalary = sc.nextDouble();
        System.out.print("Enter a letter for comparison: ");
        char letter = sc.next().toUpperCase().charAt(0);

        Comparator<String> comparator = (o1, o2) -> o1.toUpperCase().compareTo(o2.toUpperCase());

        Stream<String> emails = employeeList.stream().filter(x -> x.getSalary() >= comparisonSalary)
                .map(Employee::getEmail)
                .sorted(comparator);

        double specifLetterSum = employeeList.stream().filter(x -> x.getName().toUpperCase().charAt(0) == letter)
                .map(Employee::getSalary).reduce(0.0, Double::sum);

        System.out.println("Email of people whose salary is more than " + String.format("%.2f", comparisonSalary));
        emails.forEach(System.out::println);
        System.out.println("Sum of salary of people whose name starts with " + letter + ":");
        System.out.printf("%.2f%n", specifLetterSum);

        sc.close();
    }
}
