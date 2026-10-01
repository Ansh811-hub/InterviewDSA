

import java.util.HashSet;

public class HappyNumber {
    public boolean isHappy(int n) {
        int sum = 0;
        int q = 0;
        int p = 0;

        HashSet<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {
            set.add(n);
            sum = 0;
            q = n;

            while (q > 0) {
                p = q % 10;
                sum += p * p;
                q = q / 10;
            }
            n = sum;
        }
        return n == 1;
    }
}
public void main(String [] args){
    HappyNumber h = new HappyNumber();
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    System.out.println(h.isHappy(n));
}

