package exceptions.quadraticEquationCalculator;

public class Calculator {

    public static String quadraticFormula(double a, double b, double c) {

        if (a == 0) {
            throw new ArithmeticException("not a quadrantic equation");
        }

        double discriminant = b * b - (4 * a * c);

        if (discriminant < 0) {
            throw new ArithmeticException("discriminant < 0");
        }

        double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        if (discriminant == 0) {
            return "one quadratic root: " + x1;

        }else {
            return "x1: " + String.format("%.2f", x1) + " x2: " + String.format("%.2f", x2);

        }
    }
}
