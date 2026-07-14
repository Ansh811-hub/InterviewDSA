package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void search(int[] nums, int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int target = sc.nextInt();
        search(arr,target);

//        LinearSearch obj = new LinearSearch();
//        obj.search(arr,n);

    }
}
