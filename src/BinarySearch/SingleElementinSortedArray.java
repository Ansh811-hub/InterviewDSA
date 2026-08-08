package BinarySearch;

import java.util.Scanner;

public class SingleElementinSortedArray {
    public static int element(int[] nums){
        int st = 0;
        int end = nums.length-1;
        while(st<end){
            int mid = (st+end)/2;
            if(nums[mid-1] != nums[mid] && nums[mid] != nums[mid+1]) return nums[mid];
            if(mid%2 == 0){
                if(nums[mid-1] == nums[mid]){
                    end = mid-1;
                }else{
                    st = mid+1;
                }
            }else{
                if(nums[mid+1] == nums[mid]){
                    st = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return st;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the sorted array ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(element(arr));
    }
}
