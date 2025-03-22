// find square root of a number
// Time Complexity: O(logn)
// Space Complexity: O(1)
import java.util.*;

class bsmed1 {
    public static int sqrtN(long N) {
        /*
         * Write your code here
         */
        long low = 0, high = N;
        while (low <= high) {
            long mid = (low + high) / 2;
            long val = mid * mid;
            if (val <= N)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return (int) high;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sqrtN(n));
        sc.close();
    }
}