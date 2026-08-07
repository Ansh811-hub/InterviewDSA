package Arrays;

import java.util.Scanner;

public class PeakIndexinaMountainArray {
    public static void peakIndexInMountainArray(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        peakIndexInMountainArray(arr);
    }
}
