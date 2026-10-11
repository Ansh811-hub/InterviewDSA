package Arrays;

public class threeConsecutivefibonacci {
    public boolean threeFibonacciSum(int n) {
        int[] arr = new int[n];

        if(n == 2){
            return true;
        }
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            if (arr[i] > n) {
                break;
            }
        }
        for(int i = 0; i<arr.length-2; i++){
            if(arr[i] + arr[i+1] + arr[i+2] == n){
                return true;
            }
        }
        return false;
    }
}
