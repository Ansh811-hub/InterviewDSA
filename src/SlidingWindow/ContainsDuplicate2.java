package SlidingWindow;

public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                int a = Math.abs(i-j);
                if(nums[i] == nums[j] && a <= k){
                    return true;
                }
            }
        }
        return false;
    }
}
