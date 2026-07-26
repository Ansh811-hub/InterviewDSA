package Arrays;
import java.util.Scanner;
import java.util.*;

public class Arrayrotatebyoneplace {
    void rotatebyone(int[] nums) {

        int temp = nums[nums.length - 1];
        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }

        nums[0] = temp;
        System.out.println("Array after rotation:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrayrotatebyoneplace obj = new Arrayrotatebyoneplace();
        obj.rotatebyone(arr);
        sc.close();
    }
}