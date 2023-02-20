package processor;

import java.util.Scanner;

public class Engine {

    Scanner scanner = new Scanner(System.in);
    int choice;

    public void run() {

        choice = prompt();

        while (choice != 0){

            if (choice == 1) {
                Addition.add();
            } else if (choice == 2) {
                ScalarMultiply.scalarMultiply();
            } else if (choice == 3) {
                MatrixMultiply.matrixMultiply();
            } else if (choice == 4) {
                Transpose.transpose();
            } else if (choice == 5) {
                Determinant.output();
            } else if (choice == 6) {
                Inverse.output();
            }

            choice = prompt();
        }
    }

    public int prompt() {
        System.out.println("1. Add Matrices");
        System.out.println("2. Multiply matrix by a constant");
        System.out.println("3. Multiply matrices");
        System.out.println("4. Transpose matrix");
        System.out.println("5. Calculate a determinant");
        System.out.println("6. Inverse Matrix");
        System.out.println("0. Exit");
        System.out.print("Your choice: ");
        return scanner.nextInt();
    }
}
