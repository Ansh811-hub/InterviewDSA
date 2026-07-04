package Arrays;

import java.util.Arrays;
import java.util.Scanner;

// return sorted index of array not the original one
public class TwoSum {
    public static int twosum(int[] nums, int target) {
        Arrays.sort(nums);

        int i=0;
        int j=nums.length-1;

        while(i<j){
            if(nums[i]+nums[j]==target){
                System.out.println(i+","+j);
                return i;
            }
            else if(nums[i]+nums[j]>target){
                j--;
            } else if (nums[i]+nums[j]<target) {
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter elments of array");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        twosum(arr,target);
    }
}
