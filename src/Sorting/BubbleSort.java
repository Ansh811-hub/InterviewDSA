package Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void bubble(int [] nums){
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length - i - 1; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for(int j = 0; j < nums.length; j++){
            System.out.print(nums[j] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter details");
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int [] array = new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        bubble(array);
    }
}
