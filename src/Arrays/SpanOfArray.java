package Arrays;

import java.util.Scanner;

public class SpanOfArray {
    public static void span(int[] nums){
        int min = nums[0];
        int max = nums[0];
        int span = 0;
        for(int i = 0; i<nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            } else if (nums[i] > max) {
                max = nums[i];
            }
        }
            span = max-min;
            System.out.println(span);
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the array");
        int [] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("the span of the array is");
        span(arr);
    }
}
