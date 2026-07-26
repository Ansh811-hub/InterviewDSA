package Arrays;
import java.util.Scanner;

public class ArraySortedorNot {
    public static boolean sorted(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the array");
        int []  nums = new int[n];
        for(int j=0;j<n;j++){
            nums[j] = sc.nextInt();
        }
        boolean p = sorted(nums);
        System.out.println(p);
}
}