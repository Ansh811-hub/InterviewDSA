package BinarySearch;

import java.util.Scanner;

public class BinarySearch {
    public void search(int []nums, int target){
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                System.out.println(mid);
                break;
            }
            else if(nums[mid] < target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < size; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the target elements of  array");
        int target = input.nextInt();
        BinarySearch bs = new BinarySearch();
        bs.search(arr, target);

    }
}
