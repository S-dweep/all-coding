// median of two sorted arrays of different sizes
// Time Complexity: O(nlog(min(n1,n2)))
// Space Complexity: O(1)
import java.util.*;

class bsmed13 {
    public static double median(int[] a, int[] b) {
    	// Write your code here.
        int n1=a.length;
        int n2=b.length;
        if(n1>n2) return median(b,a);
        int n=n1+n2;
        int left=(n1+n2+1)/2;
        int low=0, high=n1;
        while(low<=high){
            int mid1=(low+high)/2;
            int mid2=left-mid1;
            int l1=Integer.MIN_VALUE, l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE, r2=Integer.MAX_VALUE;
            if(mid1<n1) r1=a[mid1];
            if(mid2<n2) r2=b[mid2];
            if(mid1-1>=0) l1=a[mid1-1];
            if(mid2-1>=0) l2=b[mid2-1];
            if(l1<=r2 && l2<=r1){
                if(n%2!=0) return Math.max(l1,l2);
                else return (double)((Math.max(l1,l2)+Math.min(r1,r2))/2.0);
            } else if(l1>r2) high=mid1-1;
            else low=mid1+1;
        } return 0;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int []a=new int[n1];
        int []b=new int[n2];
        for(int i=0;i<n1;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n2;i++){
            b[i]=sc.nextInt();
        }
        System.out.println(median(a,b));
        sc.close();
    }
}