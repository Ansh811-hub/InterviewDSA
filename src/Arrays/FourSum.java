package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FourSum {
    public static List<List<Integer>> foursum(int [] nums, int target){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                for(int k=j+1;k<nums.length-1;k++){
                    for(int l=k+1;l<nums.length;l++){
                        long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];

                        if(sum==target){
                            List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);

                            if(!ans.contains(list))
                                ans.add(list);
                        }
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int []  arr = new int[n];
        System.out.println("enter elements of array");
        for(int a = 0; a < n; a++){
            arr[a] = sc.nextInt();
        }
        System.out.println("Enter the target number");
        int target = sc.nextInt();
        foursum(arr,target);
    }
}
