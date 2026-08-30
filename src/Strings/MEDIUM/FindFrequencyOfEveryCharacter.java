package Strings.MEDIUM;

import java.util.HashMap;
import java.util.Scanner;

public class FindFrequencyOfEveryCharacter {
    public static void chars(String s){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int j=0;j<s.length();j++){
            if(map.containsKey(s.charAt(j))){
                map.put(s.charAt(j), map.get(s.charAt(j))+1);
            }else{
                map.put(s.charAt(j), 1);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        chars(str);
    }
}
