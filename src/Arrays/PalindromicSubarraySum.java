package Arrays;

public class PalindromicSubarraySum{
    class Solution {
        public long getSum(int[] nums) {
            int n = nums.length;
            long ans = Long.MIN_VALUE;
            if(n == 0){
                return 0;
            }
            if(n == 1){
                return nums[0];
            }
            for(int i = 0; i<n; i++){
                for(int j = n-1; j>=i; j--){
                    if(isPalindrome(nums,i,j)){
                        long sum = 0;
                        for(int k = i; k<=j; k++){
                            sum += nums[k];
                        }
                        ans = Math.max(ans,sum);
                    }
                }
            }
            return ans;
        }
        private boolean isPalindrome(int[] nums, int l, int r) {
            while (l < r) {
                if (nums[l] != nums[r]) {
                    return false;
                }
                l++;
                r--;
            }
            return true;
        }
    }
}
