package Arrays;

import java.util.Scanner;

public class ConcatenationofArray {
    public static int [] array(int[] nums){
        int n = nums.length;
        int [] temp  = new int[2*n];
        for(int i = 0; i < n; i++){
            temp[i] = nums[i];
            temp[i+n] = nums[i];
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
      int [] p = array(arr);
        for(int i = 0; i < p.length; i++){
            System.out.print(p[i] + " ");
        }
    }
}
