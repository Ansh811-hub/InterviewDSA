package Arrays.Searching;
import java.util.Scanner;
public class Searchin2DArray1 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int low = 0;
        int high = m * n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int row = mid / n;
            int col = mid % n;

            if (matrix[row][col] == target)
                return true;
            else if (matrix[row][col] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns:");
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] arr = new int[n][m];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println("Enter the target element:");
        int target = in.nextInt();

        Searchin2DArray1 obj = new Searchin2DArray1();
        boolean found = obj.searchMatrix(arr, target);

        if (found) {
            System.out.println("Target Found");
        }else {
            System.out.println("Target Not Found");
        }
        in.close();
    }
}