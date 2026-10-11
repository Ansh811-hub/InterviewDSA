package Arrays.OptimalApproachArray;

public class threefiboconsecutive {
        public boolean threeFibonacciSum(int n) {
            int a = 0, b = 1;

            while (a <= n) {
                int c = a + b;
                if (a + b + c == n) {
                    return true;
                }
                a = b;
                b = c;
            }
            return false;
        }
    }

