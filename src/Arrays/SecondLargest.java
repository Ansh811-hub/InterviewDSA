package Arrays;

import java.util.Scanner;

public class SecondLargest {
    public void largest2(int [] nums){
        int lar = nums[0];
        for(int i=0;i<nums.length;i++){
            if(lar<nums[i]){
                lar = nums[i];
            }
        }
        int q = lar;
        int p = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i] != q && p<nums[i]){
                p = nums[i];
            }
        }
        System.out.println(p);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        SecondLargest l = new SecondLargest();
        l.largest2(nums);
    }
}
