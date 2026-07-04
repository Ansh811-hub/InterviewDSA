package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// this is for no duplicates in the questions
public class ThreeSum {
    public static List<Integer> threeSum(int[] nums, int target) {
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == target){
                        list1.add(nums[i]);
                        list1.add(nums[j]);
                        list1.add(nums[k]);
                    }
                }
            }
        }
        return list1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = in.nextInt();
        int[] nums = new int[n];
        System.out.println("enter the elements of the array");
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println("enter the target of the array");
        int target = in.nextInt();
        List<Integer> l = threeSum(nums,target);
        System.out.println(l);
    }
}
