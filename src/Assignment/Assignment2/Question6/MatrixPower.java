package Assignment.Assignment2.Question6;

import java.util.Scanner;

public class MatrixPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get matrix dimension from user input
        System.out.print("Enter matrix size: "); // get matrix dimension from user input
        int dim = scanner.nextInt();

        // NOTE!
        // So if user input 3 for the matrix size,
        // then there will be a total of 3 rows in the matrix (numbered 1 to 3)
        // and each row will have 3 columns (numbered 1 to 3)

        // Create matrices to store A, Ak-1, and the result
        double[][] a = new double[dim][dim]; // A > store original matrix
        double[][] b = new double[dim][dim]; // Ak-1 > for calculation
        double[][] c = new double[dim][dim]; // final result matric

        // NOTE!
        // Both array 'a' and array 'c' holds the actual matrix
        // Array 'b' will do calculation for An

        // Get elements of matrix A from user
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.print("a[" + (i + 1) + "][" + (j + 1) + "] = ");
                a[i][j] = scanner.nextDouble();
            }
        }

        // Get the power n from user
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        // Calculate An iteratively
        for (int k = 1; k <= n; k++) {
            if (k == 1) {
                // Initialize b with A for the first iteration
                for (int i = 0; i < dim; i++) {
                    for (int j = 0; j < dim; j++) {
                        b[i][j] = a[i][j];
                    }
                }
            } else {
                // Perform matrix multiplication C = BA
                for (int i = 0; i < dim; i++) {
                    for (int j = 0; j < dim; j++) {
                        c[i][j] = 0;
                        for (int p = 0; p < dim; p++) {
                            c[i][j] += b[i][p] * a[p][j];
                        }
                    }
                }

                // Copy the result back to b for the next iteration
                for (int i = 0; i < dim; i++) {
                    for (int j = 0; j < dim; j++) {
                        b[i][j] = c[i][j];
                    }
                }
            }
        }

        // 

        // Print the final result (An)
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.printf("%.1f \t", c[i][j]); // Format output with one decimal place
            }
            System.out.println();
        }
    }
}
