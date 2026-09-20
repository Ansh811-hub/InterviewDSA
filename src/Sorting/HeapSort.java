package Sorting;

import java.util.Scanner;

public class HeapSort{
    void adjust(int A[], int i, int n) {

        int temp = A[i];
        int j = 2 * i;

        while (j <= n) {

            if (j < n && A[j] < A[j + 1]) {
                j = j + 1;
            }

            if (temp >= A[j]) {
                break;
            }

            A[j / 2] = A[j];
            j = 2 * j;
        }
        A[j / 2] = temp;
    }

    void HSORT(int A[], int n) {

        int temp;

        // Phase-1: Convert unsorted array into a heap
        for (int i = n / 2; i >= 1; i--) {
            adjust(A, i, n);
        }

        // Phase-2: Remove root and put it at sorted position
        for (int i = n; i > 1; i--) {

            // Swap root with last element
            temp = A[1];
            A[1] = A[i];
            A[i] = temp;

            // Recreate heap
            adjust(A, 1, i - 1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        // Index 0 is unused
        int[] A = new int[n + 1];

        System.out.println("Enter the elements of array:");

        for (int i = 1; i <= n; i++) {
            A[i] = sc.nextInt();
        }

        HeapSort obj = new HeapSort();

        obj.HSORT(A, n);

        System.out.println("Sorted array:");

        for (int i = 1; i <= n; i++) {
            System.out.print(A[i] + " ");
        }

        sc.close();
    }
}