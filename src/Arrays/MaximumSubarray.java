package Arrays;

import java.util.Scanner;

public class MaximumSubarray {
    public int max(int [] nums){
        int currentsum = nums[0];
        int maxsum = nums[0];
        for(int i = 1; i<nums.length; i++){
            currentsum = Math.max(nums[i], currentsum + nums[i]);
            maxsum = Math.max(maxsum,currentsum);
        }
        return maxsum;
    }
    public void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int max = max(nums);
        System.out.println(max);
    }
}
