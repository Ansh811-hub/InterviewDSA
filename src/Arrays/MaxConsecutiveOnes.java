package Arrays;

import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static void maxConsecutiveOnes(int[] nums) {
        int cnt = 0;
        int maxi = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cnt++;
                maxi = Math.max(maxi, cnt);
            } else {
                cnt = 0;
            }
        }
        System.out.println(maxi);
    }

    public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = in.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println("Max Consecutive ones are : ");
        maxConsecutiveOnes(nums);
    }
}
