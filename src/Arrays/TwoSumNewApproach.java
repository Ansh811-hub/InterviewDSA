package Arrays;

import java.util.Scanner;

public class TwoSumNewApproach {
    public static int[] sum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("ENTER TARGET");
        int target = sc.nextInt();

        int[] ans = sum(arr, target);

        System.out.println(ans[0] + " " + ans[1]);
    }
}
