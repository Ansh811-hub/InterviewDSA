package Strings.EASY;

import java.util.Scanner;

public class FindTheFirstOccurrenceofaGivenCharacter {
    public static void valid(String s,char ch){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ch){
                System.out.println(i);
            }
        }
    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = input.nextLine();
        valid(s,'a');
    }
}
