package matrices.matrixAddition;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Input example:
        // 3 4       -> rows, columns
        //10 8 15 12 -> row 1
        //21 11 23 8 -> row 2
        //14 5 13 19 -> row 3

        System.out.println("Enter the matrix dimensions: ");
        int row = sc.nextInt();
        int column = sc.nextInt();

        Integer[][] matrix1 = new Integer[row][column];
        Integer[][] matrix2 = new Integer[row][column];

        System.out.println("Enter the values of the first matrix: ");

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the values of the second matrix: ");

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Sum of the matrices: ");
        Integer[][] sum = new Integer[row][column];

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                System.out.print(sum[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
