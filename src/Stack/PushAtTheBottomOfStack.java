package Stack;

import java.util.Scanner;
import java.util.*;

public class PushAtTheBottomOfStack {
    public static void push(int data,Stack<Integer> stack ){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
       int top =  stack.pop();
        push(data,stack);
        stack.push(top);

    }
    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        push(5,stack);

        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }

    }
}
