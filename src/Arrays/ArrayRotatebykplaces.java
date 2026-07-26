package Arrays;
import java.util.Scanner;

public class ArrayRotatebykplaces {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        for (int j = 0; j < k; j++) {
            int temp = arr[n - 1];

            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
        }
        System.out.println("Original Array");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = input.nextInt();
        int[] nums = new int[n];
        System.out.println("enetr rotation k");
        int p = input.nextInt();

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
        ArrayRotatebykplaces obj = new ArrayRotatebykplaces();
        obj.rotate(nums, p);
    }
}
