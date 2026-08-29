package Strings.MEDIUM;

import java.util.Scanner;

public class CountTotalNumberofWords {
    public static void valid(String s) {
        int count = 1;
        for (int i = 0; i < s.length()-1; i++) {
            char c = s.charAt(i);
            char p = s.charAt(i+1);
            if(c == ' ' && p != ' '){
                count++;
            }else{
                continue;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        valid(s);
    }

}
