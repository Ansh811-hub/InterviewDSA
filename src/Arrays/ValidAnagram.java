package Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ValidAnagram {
    public static void valid(String str, String str2){

        if(str.length() != str2.length()){
            System.out.println("Not an anagram");
            return;
        }

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            list.add(str.charAt(i) - 'a');
        }
        for(int i = 0; i < str2.length(); i++){
            int value = str2.charAt(i)-'a';

            if(list.contains(value)){
                list.remove(Integer.valueOf(value));
            }
        }
        if(list.isEmpty()){
            System.out.println(str + " is an anagram");
        }else{
            System.out.println(str + " is not an anagram");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        System.out.println("Enter String 2");
        String str2 = sc.nextLine();
        valid(str,str2);
    }
}
