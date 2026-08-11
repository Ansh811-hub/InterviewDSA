package Arrays;

import java.util.Scanner;

public class MatrixDiagonalSum {
        public int diagonalSum(int[][] mat) {
            int n = mat.length;
            int sum = 0;

            for (int i = 0; i < n; i++) {
                sum += mat[i][i];              // main diagonal
                sum += mat[i][n - 1 - i];      // secondary diagonal
            }

            // If n is odd, center was counted twice
            if (n % 2 == 1) {
                sum -= mat[n / 2][n / 2];
            }

            return sum;
        }
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[][] mat = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    mat[i][j] = in.nextInt();
                }
            }
            MatrixDiagonalSum obj = new MatrixDiagonalSum();
            System.out.println(obj.diagonalSum(mat));
        }
    }

