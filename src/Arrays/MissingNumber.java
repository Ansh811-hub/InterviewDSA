package Arrays;
import java.util.Scanner;

public class MissingNumber {
    public static int number(int[] nums){
        int n = nums.length;
        int p = n*(n+1)/2;
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
        }
        return p - sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int [] nums = new int[n];
        System.out.println("Enter the elements in the array");
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
       int t = number(nums);
        System.out.println(t);
    }
}
