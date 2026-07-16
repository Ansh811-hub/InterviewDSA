package OptimalApproach;

import java.util.Scanner;

public class SumofSquareNumbers {
    public boolean judgeSquareSum(int c) {
        int left = 0;
        int right = (int) Math.sqrt(c);

        while (left <= right) {
            long sum = (long) left * left + (long) right * right;
            if (sum == c) {
                return true;
            } else if (sum < c) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        SumofSquareNumbers s = new SumofSquareNumbers();
        boolean result = s.judgeSquareSum(n);
        System.out.println(result);

    }
}
