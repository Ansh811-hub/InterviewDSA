package Arrays.SortColors;
import java.util.Scanner;

public class approach3 {
    public void sortColors(int[] nums) {

        int index = 0;

        for (int num : nums)
            if (num == 0)
                nums[index++] = 0;

        for (int num : nums)
            if (num == 1)
                nums[index++] = 1;

        while (index < nums.length)
            nums[index++] = 2;

        for (int j = 0; j < nums.length; j++) {
            System.out.println(j + " " + nums[j]);
        }
    }

    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sortColors(arr);
    }
}
