package Strings.MEDIUM;

import java.util.Scanner;

public class RotateString {
    public static boolean rotateString(String s, String k) {
        if(s.length() != k.length()){
            return false;
        }
        StringBuilder sb = new StringBuilder(s);
        sb.append(s);
        sb.append(s);

        return sb.toString().equals(k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        System.out.println("Enter a goal string");
        String k = sc.nextLine();
        System.out.println(rotateString(s, k));
    }
}
