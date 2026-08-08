package Strings;
import java.util.Scanner;

public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        int num = Integer.parseInt(num1);
        int numm = Integer.parseInt(num2);
        int q = num*numm;
        String s = String.valueOf(q);
        return s;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer string: ");
        String s1 = input.nextLine();
        System.out.println("Enter a integer string: ");
        String s2 = input.nextLine();
        MultiplyStrings m = new MultiplyStrings();
        System.out.println(m.multiply(s1,s2));
    }
}
