// Given an array containing both positive and negative integers, we have to find the length of the longest subarray with the sum of all elements equal to zero.

//package Arrays;
//import java.util.*;
//
//public class LengthOfLongestSubarrayWithZeroSum {
//    public void sum(int [] nums){
//        int currentsum = nums[0];
//        int maxsum = nums[0];
//        for(int i = 1; i<nums.length; i++){
//            currentsum = Math.max(nums[i], currentsum + nums[i]);
//            maxsum = Math.max(maxsum,currentsum);
//        }
//        if(maxsum == 0){
//            return i;
//        }
//        return maxsum;
//    }
//}
