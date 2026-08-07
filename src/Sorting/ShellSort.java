package Sorting;
import java.util.Arrays;

public class ShellSort {

    public static void shellSort(int[] arr) {
        int n = arr.length;

        // Start with a large gap, then reduce it
        for (int gap = n / 2; gap > 0; gap /= 2) {

            // Perform insertion sort for this gap
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;

                // Shift earlier gap-sorted elements up until
                // the correct location for temp is found
                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }

                // Put temp in its correct location
                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 54, 2, 3};
        System.out.println("Original Array: " + Arrays.toString(arr));
        shellSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}