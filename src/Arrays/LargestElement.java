package Arrays;
import java.util.Scanner;

public class LargestElement {
    public void largestElement(int[] nums) {
        int large = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (large < nums[i]) {
                large = nums[i];
            }
        }
        System.out.println(large);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        LargestElement l = new LargestElement();
        l.largestElement(arr);
    }
}
