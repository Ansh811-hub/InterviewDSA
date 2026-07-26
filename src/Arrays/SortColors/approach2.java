package Arrays.SortColors;

import java.util.Scanner;

public class approach2 {
    public void sortColors(int[] nums) {

        int zero = 0;
        int one = 0;
        int two = 0;

        for (int num : nums) {
            if (num == 0)
                zero++;
            else if (num == 1)
                one++;
            else
                two++;
        }

        int index = 0;

        while (zero-- > 0)
            nums[index++] = 0;

        while (one-- > 0)
            nums[index++] = 1;

        while (two-- > 0)
            nums[index++] = 2;

        for (int num : nums) {
            System.out.print(num+" ");
        }
    }
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sortColors(arr);
        sc.close();
    }

}
