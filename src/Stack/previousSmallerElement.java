package Stack;

import java.util.Scanner;
import java.util.Stack;

public class previousSmallerElement {
    public static int[] smaller(int [] nums){
        int n = nums.length;
        int [] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i<nums.length; i++) {
            while (!st.isEmpty() && st.peek() > nums[i]) {
                st.pop();
            }
            if(st.isEmpty()) {
                ans[i] = -1;
            }else{
                ans[i] = st.peek();
            }
            st.push(nums[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] p = smaller(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(p[i] + " ");
        }
    }
}
