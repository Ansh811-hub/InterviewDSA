package BinarySearch;


import java.util.Scanner;

public class MaximumCountOfPositiveandNegativeIntegers {
        public int maximumCount(int[] nums) {
            int negative_num = findNegetive(nums);
            int positive_num = nums.length - findPositive(nums);
            return Math.max(negative_num, positive_num);
        }
        private int findNegetive(int[] nums) {
            int lo = 0;
            int hi = nums.length - 1;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;

                if (nums[mid] < 0) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
            return lo;
        }
        private int findPositive(int[] nums) {
            int lo = 0;
            int hi = nums.length - 1;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if (nums[mid] <= 0) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
            return lo;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array: ");
            int n  = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            MaximumCountOfPositiveandNegativeIntegers obj = new MaximumCountOfPositiveandNegativeIntegers();
            obj.maximumCount(arr);
        }
    }
