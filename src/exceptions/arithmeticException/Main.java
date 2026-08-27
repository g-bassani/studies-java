package exceptions.arithmeticException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)) {

            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            System.out.println(Calculator.quadraticFormula(a, b, c));

        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
