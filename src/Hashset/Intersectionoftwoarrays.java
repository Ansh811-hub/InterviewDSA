package Hashset;

import java.util.HashSet;
import java.util.Scanner;

public class Intersectionoftwoarrays {
        public int[] intersection(int[] nums1, int[] nums2) {

            HashSet<Integer> set = new HashSet<>();
            HashSet<Integer> result = new HashSet<>();

            for (int i = 0; i < nums1.length; i++) {
                set.add(nums1[i]);
            }

            for (int i = 0; i < nums2.length; i++) {
                if (set.contains(nums2[i])) {
                    result.add(nums2[i]);
                }
            }

            int[] ans = new int[result.size()];
            int i = 0;

            for (int num : result) {
                ans[i++] = num;
            }
            return ans;
        }

public void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of elements in the array");
    int n = in.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = in.nextInt();
    }
    System.out.println("Enter the number of elements in the array2");
    int n2 = in.nextInt();
    int[] arr2 = new int[n2];
    for (int i = 0; i < n2; i++) {
        arr2[i] = in.nextInt();
    }
    Intersectionoftwoarrays intersectionoftwoarrays = new Intersectionoftwoarrays();
    int[] intersection = intersectionoftwoarrays.intersection(arr, arr2);
    for (int i = 0; i < intersection.length; i++) {
        System.out.print(intersection[i] + " ");
    }
}
}