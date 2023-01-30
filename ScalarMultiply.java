package processor;

import java.util.Scanner;

public class ScalarMultiply {

    private static Scanner scanner = new Scanner(System.in);

    public static void scalarMultiply() {

        System.out.print("Enter size of matrix: ");
        int an = scanner.nextInt();
        int am = scanner.nextInt();
        double[][] a = new double[an][am];
        System.out.println("Enter matrix:");

        for (int i = 0; i < an; i++) {
            for (int j = 0; j < am; j++) {
                a[i][j] = scanner.nextDouble();
            }
        }

        System.out.print("Enter constant: ");
        double x = scanner.nextDouble();

        for (int i = 0; i < an; i++) {
            for (int j = 0; j < am; j++) {
                a[i][j] *= x;
            }
        }

        System.out.println("The result is:");
        for (int i = 0; i < an; i++) {
            for (int j = 0; j < am; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print('\n');
        }

    }
}
