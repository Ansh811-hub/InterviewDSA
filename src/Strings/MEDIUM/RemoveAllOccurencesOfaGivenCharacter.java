package Strings.MEDIUM;

import java.util.Scanner;

public class RemoveAllOccurencesOfaGivenCharacter {
    public static String removeAll(String s, char ch) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                continue;
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter string: ");
        String s = input.nextLine();

        System.out.println("Enter character: ");
        char ch = input.next().charAt(0);

        System.out.println(removeAll(s, ch));
    }
}
