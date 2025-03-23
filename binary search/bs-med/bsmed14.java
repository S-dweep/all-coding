// kth element of two sorted arrays
// Time Complexity: O(nlog(min(n1,n2))) ->> max(0,k-m),min(k,n) iterations
// Space Complexity: O(1)
import java.util.*;

class bsmed14 {
    public static int kthElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m, int k) {
        // Write your coder here
        if (n > m) return kthElement(arr2, arr1, m, n, k);
        int left = k;
        int low = Math.max(0, k - m), high = Math.min(k, n);
        while (low <= high) {
            int mid1 = (low + high) >> 1;
            int mid2 = left - mid1;
            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;
            if (mid1 < n) r1 = arr1.get(mid1);
            if (mid2 < m) r2 = arr2.get(mid2);
            if (mid1 - 1 >= 0) l1 = arr1.get(mid1 - 1);
            if (mid2 - 1 >= 0) l2 = arr2.get(mid2 - 1);
            if (l1 <= r2 && l2 <= r1) {
                return Math.max(l1, l2);
            }
            else if (l1 > r2) high = mid1 - 1;
            else low = mid1 + 1;
        }
        return 0;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        for(int i=0;i<n1;i++){
            a.add(sc.nextInt());
        }
        for(int i=0;i<n2;i++){
            b.add(sc.nextInt());
        }
        int k=sc.nextInt();
        System.out.println(kthElement(a,b,n1,n2,k));
        sc.close();
    }
}