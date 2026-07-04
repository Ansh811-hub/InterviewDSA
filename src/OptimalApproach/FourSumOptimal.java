package OptimalApproach;

import java.util.Scanner;

public class FourSumOptimal {
public static void optimal(int [] arr, int target){

}
public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements in the array");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements in the array");
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("Enter the target element");
    int target = sc.nextInt();
    optimal(arr,target);
}
}
