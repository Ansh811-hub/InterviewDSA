package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesis {
    public boolean valid(String s){
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top =  stack.pop();

                if((ch == ')' && top != '(') ||
                (ch == '}' && top != '{' ||
                        (ch == ']' && top != '['))){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ValidParanthesis vp = new ValidParanthesis();
        String s = sc.next();
        boolean p = vp.valid(s);
        System.out.println(p);
    }
}
