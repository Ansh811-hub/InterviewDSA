package Strings.MEDIUM;

import java.util.HashMap;
import java.util.Scanner;

public class RemoveDuplicateLettersFromString {
    public static String removeDuplicateLetters(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i),i);
            }else{
                continue;
            }
        }
        // Step 2: Build the string using your map logic
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the current index 'i' matches the stored index, it's the first time seeing it
            if (i == map.get(c)) {
                sb.append(c);
            }
        }
        return sb.toString(); // Return the final string
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        System.out.println(removeDuplicateLetters(str));
    }
}
