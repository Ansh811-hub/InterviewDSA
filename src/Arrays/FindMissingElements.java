package Arrays;
import java.util.*;
import java.util.Scanner;

public class FindMissingElements {
    public static void missing(int[] nums){
        List<Integer> numbers = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i<nums.length-1; i++){
            if(nums[i] + 1 != nums[i+1]){
                for(int j = nums[i] + 1; j<nums[i+1]; j++){
                    numbers.add(j);
                }
            }else{
                continue;
            }
        }
        System.out.println(numbers);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = in.nextInt();
        int [] nums = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i<n; i++){
            nums[i] = in.nextInt();
        }
        missing(nums);
    }
}
