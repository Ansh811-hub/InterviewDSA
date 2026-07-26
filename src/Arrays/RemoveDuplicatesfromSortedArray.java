package Arrays;

import java.util.Scanner;

public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0 ) return 0;

        int i = 0;
        for(int j = 1; j<nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("enter elements of array");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        RemoveDuplicatesfromSortedArray sol = new RemoveDuplicatesfromSortedArray();
        int p = sol.removeDuplicates(nums);
        System.out.println(p);

    }
}
