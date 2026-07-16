package Arrays;
import java.util.Scanner;


public class SumofSquareNumber {
    public void square(int n){
        for (int i = 0; i <= n; i++){
            for (int j = i+1; j <= n; j++){
                if(i*i + j*j == n){
                    System.out.println("true");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        SumofSquareNumber sum = new SumofSquareNumber();
        sum.square(n);
    }
}
