package Heaps;

import java.util.PriorityQueue;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargestElement {
    public int kthLargest(int[] nums, int k) {

        // Min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            pq.offer(nums[i]);
            if (pq.size() > k) {
                pq.poll();   // remove smallest
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
        System.out.println("Enter the kth largest element of the array");
        int p = sc.nextInt();
        KthLargestElement k = new KthLargestElement();
        System.out.println(k.kthLargest(arr, p));
    }
}