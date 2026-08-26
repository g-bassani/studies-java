package matrices.matrixTranspose;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Hardcoded

        int[][] a = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] b = {
                {3, 5},
                {5, 3},
                {8, 6}

        };

        //Matrix transpose

        int[][] aTranspose = new int[a[0].length][a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                aTranspose [j][i] = a[i][j];

            }
        }

        for (int i = 0; i < aTranspose.length; i++) {
            for (int j = 0; j < aTranspose[i].length; j++) {
                System.out.print(aTranspose[i][j] + " ");
            }
            System.out.println();

        }

        int[][] bTranspose = new int[b[0].length][b.length];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                bTranspose[j][i] = b[i][j];

            }
        }

        System.out.println();
        for (int i = 0; i < bTranspose.length; i++) {
            for (int j = 0; j < bTranspose[i].length; j++) {
                System.out.print(bTranspose[i][j] + " ");
            }
            System.out.println();

        }
    }
}
