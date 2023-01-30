package processor;

import java.util.Scanner;

public class Addition {

    private static Scanner scanner = new Scanner(System.in);

    public static void add() {
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
        int bn = scanner.nextInt();
        int bm = scanner.nextInt();
        double[][] b = new double[bn][bm];
        System.out.println("Enter second matrix:");

        for (int i = 0; i < bn; i++) {
            for (int j = 0; j < bm; j++) {
                b[i][j] = scanner.nextDouble();
            }
        }

        if (an != bn || am != bm) {
            System.out.println("The operation cannot be performed");
        } else {
            double[][] c = new double[an][am];

            for (int i = 0; i < an; i++) {
                for (int j = 0; j < am; j++) {
                    c[i][j] = a[i][j] + b[i][j];
                }
            }

            System.out.println("The result is:");
            for (int i = 0; i < an; i++) {
                for (int j = 0; j < am; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.print('\n');
            }
        }
    }
}
