package Strings.EASY;

public class ConvertLowercaseCharactersToUppercaseWithoutUsingToUpperCase {
    public static void main(String[] args) {
        String str = "hello world";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // If the character is a lowercase letter, subtract 32
            if (c >= 'a' && c <= 'z') {
                result.append((char) (c - 32));
            } else {
                result.append(c); // Keep spaces or symbols as they are
            }
        }
        System.out.println(result.toString());
    }
}
