package Strings.EASY;

import java.util.Scanner;

public class RemoveAllSpacesFromaString {
    public static void valid(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                continue;
            }else{
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        valid(s);
    }
}
