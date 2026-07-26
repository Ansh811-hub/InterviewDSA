package Arrays.SortColors;
import java.util.*;

public class approach1 {
    public void sort(int [] nums){
        Arrays.sort(nums);
        for(int j=0;j<nums.length;j++){
            System.out.println(j+" "+nums[j]);
        }
    }
    public  void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sort(arr);
    }
}
