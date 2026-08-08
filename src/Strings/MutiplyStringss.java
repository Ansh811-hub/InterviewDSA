package Strings;

import java.util.Scanner;

public class MutiplyStringss {
        public static String multiply(String num1, String num2) {

            int num = 0;
            int numm = 0;

            for (int i = 0; i < num1.length(); i++) {
                num = num * 10 + (num1.charAt(i) - '0');
            }

            for (int i = 0; i < num2.length(); i++) {
                numm = numm * 10 + (num2.charAt(i) - '0');
            }

            int p = num*numm;
            String s = "";

            while (p > 0) {
                int digit = p % 10;
                s = (char)('0' + digit) + s;
                p = p / 10;
            }

            return s;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a integer string: ");
            String s = sc.nextLine();
            System.out.println("Enter a integer string: ");
            String s1 = sc.nextLine();
            multiply(s,s1);
        }
    }

