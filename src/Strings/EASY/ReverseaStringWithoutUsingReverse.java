package Strings.EASY;

import java.util.Scanner;

public class ReverseaStringWithoutUsingReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        for (int i = str.length()-1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }
    }
}
