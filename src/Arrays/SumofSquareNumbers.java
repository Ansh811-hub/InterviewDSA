package Arrays;

import java.util.Scanner;

public class SumofSquareNumbers {
    public void square(int n){
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += Math.pow(i, 2);
            if (sum == n) {
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        SumofSquareNumbers s = new SumofSquareNumbers();
        s.square(n);
    }
}
