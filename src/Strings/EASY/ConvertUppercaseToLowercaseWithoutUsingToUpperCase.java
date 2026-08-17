package Strings.EASY;

public class ConvertUppercaseToLowercaseWithoutUsingToUpperCase {
    public static void main(String[] args) {
        String str = "HELLO WORLD";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // If the character is an uppercase letter, add 32
            if (c >= 'A' && c <= 'Z') {
                result.append((char) (c + 32));
            } else {
                result.append(c);
            }
        }

        System.out.println(result.toString());
    }
}
