package matrices.matrixSearchNeighbors;

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
        // 8         -> search

        m = sc.nextInt();
        n = sc.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

        int x = sc.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == x) {
                    System.out.println("Position " + i + "," + j + ":");

                    if (j - 1 >= 0) {
                        System.out.println("Left: " + matrix[i][j -1]);
                    }

                    if ((j + 1) < n) {
                        System.out.println("Right: " + matrix[i][j + 1]);
                    }

                    if ((i - 1) >= 0) {
                        System.out.println("Up: " + matrix[i - 1][j]);
                    }

                    if ((i + 1) < m) {
                        System.out.println("Down: " + matrix[i + 1][j]);
                    }

                    System.out.println();
                }
            }
        }

        sc.close();
    }
}
