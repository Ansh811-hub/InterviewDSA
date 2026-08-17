package Strings.EASY;

import java.util.Scanner;

public class FindTheLastOccurenceOfGivenCh {
    public static void valid(String s, char ch) {
        int count = 0;
        for (int i = s.length() - 1; i <= 0; i++) {
            if (s.charAt(i) == ch)
                count++;
        }
        System.out.println(count);
    }
        public static void main(String [] args){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a string");
            String s = input.nextLine();
            valid(s,'a');
        }
}
