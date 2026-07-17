package OptimalApproachArray;

import java.util.*;
public class TwoSumOptimal {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need)) {
                return new int[]{
                        map.get(need), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{}; // no solution
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            arr[i] = element;
        }
        System.out.println("Enter the target element");
        int target = sc.nextInt();

        int[] ans = twoSum(arr, target);
        System.out.println(ans[0] + " " + ans[1]);
    }
}

