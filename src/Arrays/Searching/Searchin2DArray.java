package Arrays.Searching;

public class Searchin2DArray {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int row = 0;
        int col = n - 1;

        while (row < m && col >= 0) {
            if (matrix[row][col] == target)
                return true;

            if (matrix[row][col] > target)
                col--;
            else
                row++;
        }
        return false;
    }
    public static void main(String[] args) {
        Searchin2DArray search = new Searchin2DArray();
        int[][] arr = new int[][]{
                {1, 3, 5, 7},
        };
        System.out.println(search.searchMatrix(arr, 3));
    }
}
