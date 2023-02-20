package processor;

import java.util.Scanner;

public class Transpose {

    private static Scanner scanner = new Scanner(System.in);

    public static void transpose() {

        System.out.print('\n');
        System.out.println("1. Main diagonal");
        System.out.println("2. Side diagonal");
        System.out.println("3. Vertical line");
        System.out.println("4. Horizontal line");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        System.out.print("Enter matrix size: ");
        int an = scanner.nextInt();
        int am = scanner.nextInt();
        double[][] a = new double[an][am];
        System.out.println("Enter matrix:");

        for (int i = 0; i < an; i++) {
            for (int j = 0; j < am; j++) {
                a[i][j] = scanner.nextDouble();
            }
        }

        double[][] result = new double[an][am];

        if (choice == 1) {
            result = diagonal(an, am, a);
        } else if (choice == 2) {
            result = side(an, am, a);
        } else if (choice == 3) {
            result = vertical(an, am, a);
        } else if (choice == 4) {
            result = horizontal(an, am, a);
        }

        print(an, am, result);
    }

    public static double[][] diagonal(int an, int am, double[][] a) {
        double[][] t = new double[am][an];

        for (int i = 0; i < an; i++) {
            for (int j = 0; j < am; j++) {
                t[j][i] = a[i][j];
            }
        }

        return t;
    }

    public static double[][] side(int an, int am, double[][] a) {
        double[][] t = new double[am][an];

        for (int i = 0; i < an; i++) {
            for (int j = 0; j < am; j++) {
                t[j][i] = a[an - i - 1][am - j - 1];
            }
        }

        return t;
    }

    public static double[][] vertical(int an, int am, double[][] a) {
        double[][] t = new double[an][am];

        for (int i = 0; i < an; i++) {
            for (int j = 0; j < am; j++) {
                t[i][j] = a[i][am - j -1];
            }
        }

        return t;
    }

    public static double[][] horizontal(int an, int am, double[][] a) {
        double[][] t = new double[an][am];

        for (int i = 0; i < an; i++) {
            for (int j = 0; j < am; j++) {
                t[i][j] = a[an - i - 1][j];
            }
        }

        return t;
    }

    public static void print(int tn, int tm, double[][] t) {

        for (int i = 0; i < tn; i++) {
            for (int j = 0; j < tm; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.print('\n');
        }
    }
}
