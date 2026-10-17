
import java.util.PriorityQueue;

public class SortKSortedArray {
        public void nearlySorted(int[] arr, int k) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();

            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                minHeap.add(arr[i]);
                if (minHeap.size() > k) {
                    arr[index++] = minHeap.poll();
                }
            }
            while (!minHeap.isEmpty()) {
                arr[index++] = minHeap.poll();
            }
        }
    }
void main(){
    Scanner sc = new Scanner(System.in);
    System.out.println();
    System.out.println("Enter the size of the array:");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    System.out.println("enter the k you wnt ");
    int k = sc.nextInt();
    SortKSortedArray s = new SortKSortedArray();
    s.nearlySorted(arr, k);
    for(int i = 0; i < n; i++){
        System.out.print(arr[i] + " ");
    }
}
