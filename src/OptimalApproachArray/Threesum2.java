package OptimalApproachArray;

import java.util.*;

public class Threesum2 {

    public static int[] three(int[] nums) {
        int target = 4;

        for (int i = 0; i < nums.length - 2; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = i + 1; j < nums.length; j++) {
                int need = target - nums[i] - nums[j];
                if (map.containsKey(need)) {
                    return new int[]{i, map.get(need), j};
                }
                map.put(nums[j], j);
            }
        }
        return new int[]{-1, -1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 0, 3, 4};
        int[] ans = three(nums);
        System.out.println(Arrays.toString(ans));
    }
}