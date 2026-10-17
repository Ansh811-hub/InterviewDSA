package Heaps;

import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Scanner;

public class KthSmallestElement{
    public int kthSmallest(int[] nums, int k) {
        // Max heap
        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < nums.length; i++) {
            pq.offer(nums[i]);

            if (pq.size() > k) {
                pq.poll();   // remove largest
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the kth smallest element of the array");
        int p = sc.nextInt();
        KthSmallestElement k = new KthSmallestElement();
        System.out.println(k.kthSmallest(arr, p));
    }
}