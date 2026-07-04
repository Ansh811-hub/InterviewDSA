package Arrays;

import java.util.Scanner;

public class ProductOfArrayExceptSelf {
    public static void self(int[] nums) {
        long mul = 1;
        for (int i = 0; i < nums.length; i++) {
             mul *= nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (mul/nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the number of elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        self(arr);
    }
}
