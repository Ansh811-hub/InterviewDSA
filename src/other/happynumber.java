import java.util.Scanner;

public class happynumber {

    public static boolean isHappy(int n) {
        int sum = 0;
        int q = 0;
        int p = 0;
        while (n != 1) {
            sum = 0;
            int temp = n;
            while (temp > 0) {
                p = temp % 10;
                sum += p * p;
                temp = temp / 10;
            }
            if (sum == 1) {
                return true;
            }
            n = sum;
        }
        return true;
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(happynumber.isHappy(n));
    }
