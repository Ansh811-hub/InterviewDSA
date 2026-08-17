package Strings.EASY;
import java.util.Scanner;

public class CheckPalindrone {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        valid(s);
    }
    public static boolean valid(String s){

                // 1. Remove non-alphanumeric characters and convert to lowercase
                String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

                // 2. Check if the cleaned string equals its reverse
                return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
            }
        }
