package processor;

import java.util.Scanner;

public class MatrixMultiply {

    private static Scanner scanner = new Scanner(System.in);

    public static void matrixMultiply() {

        System.out.print("Enter size of first matrix: ");
        int an = scanner.nextInt();
        int am = scanner.nextInt();
        double[][] a = new double[an][am];
        System.out.println("Enter first matrix:");

        for (int i = 0; i < an; i++) {
            for (int j = 0; j < am; j++) {
                a[i][j] = scanner.nextDouble();
            }
        }

        System.out.print("Enter size of second matrix: ");
        int bm = scanner.nextInt();
        int bk = scanner.nextInt();
        double[][] b = new double[bm][bk];
        System.out.println("Enter second matrix:");

        for (int i = 0; i < bm; i++) {
            for (int j = 0; j < bk; j++) {
                b[i][j] = scanner.nextDouble();
            }
        }

        if (am != bm) {
            System.out.println("The operation cannot be preformed");
        } else {
            double[][] c = new double[an][bk];

            for (int i = 0; i < an; i++) {
                for (int j = 0; j < bk; j++) {
                    double result = 0;
                    for (int k = 0; k < am; k++) {
                        result += a[i][k] * b[k][j];
                    }
                    c[i][j] = result;
                }
            }

            System.out.println("The result is:");
            for (int i = 0; i < an; i++) {
                for (int j = 0; j < bk; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.print('\n');
            }
        }

    }
}
