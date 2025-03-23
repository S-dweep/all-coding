// split array largest sum
// Time Complexity: O(nlog(sum(arr[])-min(arr[])+1))
// Space Complexity: O(1)
import java.util.*;

class bsmed10 {
    public static boolean countSub(int []a, int n, int value, int k) {
        int count=1, sum=0;
        for(int i=0;i<n;i++){
            if(sum+a[i]<=value) sum+=a[i];
            else{
                count++;
                sum=a[i];
            }
        } return count>k;
    }
    public static int largestSubarraySumMinimized(int []a, int k) {
        // Write Your Code Here
        int n=a.length;
        if(k>n) return -1;
        int low=Integer.MIN_VALUE, high=0;
        for(int i=0;i<n;i++){
            low=Math.max(low,a[i]);
            high+=a[i];
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(countSub(a,n,mid,k)) low=mid+1;
            else high=mid-1;
        } return low;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(largestSubarraySumMinimized(arr,k));
        sc.close();
    }
}