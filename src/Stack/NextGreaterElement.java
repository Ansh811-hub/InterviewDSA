package Stack;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
    public static int greater(int [] nums){

        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int [] ans = new int[n];

        for(int i = nums.length-1;i>=0;i--){
            while(st.size() > 0 && st.peek() <= nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]  = -1;
            }else{
                ans[i] = st.peek();
            }
            st.push(nums[i]);
        }
        for(int i = 0;i<n;i++){
            System.out.println(ans[i]);
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = input.nextInt();
        System.out.println("Enter the elements in the array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        greater(arr);
    }
}
