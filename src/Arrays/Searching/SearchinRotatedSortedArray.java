package Arrays.Searching;

public class SearchinRotatedSortedArray {
    public int search(int[] nums, int tar) {

        int st = 0;
        int end = nums.length-1;

        while(st <= end){
            int mid = st + (end-st)/2;
            if(nums[mid] == tar){
                return mid;
            }
            if(nums[st]<=nums[mid]){
                if(nums[st] <= tar && tar <=nums[mid]){
                    end = mid - 1;
                }else{
                    st = mid + 1;
                }
            }else{
                if(nums[mid] <= tar && tar <=nums[end]){
                    end = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        SearchinRotatedSortedArray s = new SearchinRotatedSortedArray();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(s.search(arr,9));
    }
}
