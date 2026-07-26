package BackTracking;
import java.util.*;
import java.util.Scanner;

class BackTracking {
    public static void print(String str, String perm){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currchar = str.charAt(i);
            String newstr = str.substring(0,i) + str.substring(i+1);
            print(newstr, perm+currchar);
        }
    }
    public static void  main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str = sc.nextLine();
        print(str,"");
    }
}
