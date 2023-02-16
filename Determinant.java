package processor;

import java.util.Scanner;

public class Determinant {

    private static Scanner scanner = new Scanner(System.in);

    public static void solve() {

        System.out.print("Enter matrix size: ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        double[][] a = new double[n][m];
        System.out.println("Enter matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scanner.nextDouble();
            }
        }

        double result = 0;

        if (n == m) {
            if (n == 1) {
                result = a[0][0];
            } else if (n == 2) {
                result = (a[0][0] * a[1][1]) - (a[0][1] * a[1][0]);
            } else if (n == 3) {
                result = solveThreeByThree(a);
            } else {
                result = solveFourUp(a, n);
            }
        }

        System.out.println("The result is:");
        System.out.println(result);
        System.out.print('\n');
    }

    public static double solveThreeByThree(double[][] a) {

        double x = a[0][0] * (a[1][1] * a[2][2] - a[1][2] * a[2][1]);
        double y = a[0][1] * (a[1][0] * a[2][2] - a[1][2] * a[2][0]);
        double z = a[0][2] * (a[1][0] * a[2][1] - a[1][1] * a[2][0]);
        return x - y + z;
    }

    public static double solveFourUp(double[][] a, int n) {

        double det = 0;
        if (n == 3) {
            return solveThreeByThree(a);
        } else {
            for (int i = 0; i < n; i++) {
                double m = a[0][i];
                double[][] x = new double[n - 1][n - 1];

                for (int j = 0; j < n - 1; j++) {
                    int temp = 0;
                    for (int k = 0; k < n - 1; k++) {
                        if (k == i) {
                            temp++;
                        }
                        x[j][k] = a[j + 1][k + temp];
                    }
                }
                det += m * Math.pow(-1, i) * solveFourUp(x, n - 1);
            }
        }
        return det;
    }
}
