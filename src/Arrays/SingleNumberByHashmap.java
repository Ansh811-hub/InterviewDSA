package Arrays;
import java.util.*;

public class SingleNumberByHashmap {
    public int singleNumber(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find frequency = 1
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        SingleNumberByHashmap s = new SingleNumberByHashmap();
        System.out.println(s.singleNumber(nums));
    }
}
