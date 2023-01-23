package processor;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int an = scanner.nextInt();
        int am = scanner.nextInt();
        double[][] a = new double[an][am];

        for (int i = 0; i < an; i++) {
            for (int j = 0; j < am; j++) {
                a[i][j] = scanner.nextDouble();
            }
        }

        int bn = scanner.nextInt();
        int bm = scanner.nextInt();
        double[][] b = new double[bn][bm];

        for (int i = 0; i < bn; i++) {
            for (int j = 0; j < bm; j++) {
                b[i][j] = scanner.nextDouble();
            }
        }

        if (an != bn || am != bm) {
            System.out.println("ERROR");
        } else {
            double[][] c = new double[an][am];

            for (int i = 0; i < an; i++) {
                for (int j = 0; j < am; j++) {
                    c[i][j] = a[i][j] + b[i][j];
                }
            }

            for (int i = 0; i < an; i++) {
                for (int j = 0; j < am; j++) {
                    System.out.print((int) c[i][j] + " ");
                }
                System.out.print('\n');
            }
        }
    }
}
