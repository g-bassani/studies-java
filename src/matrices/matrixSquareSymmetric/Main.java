package matrices.matrixSquareSymmetric;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int m, n;

        // Input example:
        // 3 4       -> rows, columns
        //10 8 15 12 -> row 1
        //21 11 23 8 -> row 2
        //14 5 13 19 -> row 3

        m = sc.nextInt();
        n = sc.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        if (matrix.length == matrix[0].length) {
            System.out.println("It's a square");

            int[][] matrixTranspose = new int[matrix[0].length][matrix.length];

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrixTranspose[j][i] = matrix[i][j];
                }
            }

            //Check if the transpose is the same as the matrix

            if (Arrays.deepEquals(matrix, matrixTranspose)) {
                System.out.println("It's symmetric");
            } else {
                System.out.println("Not symmetric");
            }
        } else {
            System.out.println("It's not a square");
        }

        sc.close();
    }
}
