//package Arrays;
//
//import java.util.Scanner;
//
//public class UnionOfTwoSortedArray {
//    public void union(int [] nums,int [] nums1){
//
//        int [] nums2 = new int[2*nums1.length];
//        for(int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums1.length; j++) {
//                if (nums[i] == nums1[j]) {
//                    nums2[i] = nums1[j];
//                } else if (nums[i] > nums1[j]) {
//                    nums2[i] = nums1[j];
//                } else if (nums[i] < nums1[j]) {
//                    nums2[i] = nums[i];
//                }
//            }
//        }
//        System.out.println("The two elements in the array are");
//        for(int i = 0; i < nums2.length; i++){
//            System.out.print(nums2[i] + " ");
//        }
//    }
//        public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [] nums = new int[n];
//        int [] nums1 = new int[n];
//        for(int i = 0; i < n; i++){
//            nums[i] = sc.nextInt();
//        }
//        for(int i = 0; i < n; i++){
//            nums1[i] = sc.nextInt();
//        }
//        UnionOfTwoSortedArray u = new UnionOfTwoSortedArray();
//        u.union(nums,nums1);
//        }
//}
