// find nth root of a number m using binary search
// Time Complexity: O(log(n+m))
// Space Complexity: O(1)
import java.util.*;

class bsmed2 {
    public static int calc(int mid, int n, int m) {
        long ans=1;
        for(int i=1;i<=n;i++){
            ans*=mid;
            if(ans>m) return 2;
        } if(ans==m) return 1;
        return 0;
    }
    public static int NthRoot(int n, int m) {
        // Write your code here.
        int low=1, high=m;
        while(low<=high){
            int mid=(low+high)/2;
            if(calc(mid,n,m)==1) return mid;
            else if(calc(mid,n,m)==0) low=mid+1;
            else high=mid-1;
        } return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(NthRoot(n, m));
        sc.close();
    }
}