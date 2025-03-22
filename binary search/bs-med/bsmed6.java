// capacity to ship packages within D days
// Time Complexity: O(nlog(sum(arr[])-max(arr[])+1))
// Space Complexity: O(1)
import java.util.*;

class bsmed6 {
    public static boolean findDays(int[] weights, int n, int cap, int d) {
        int days=1, load=0;
        for(int i=0;i<n;i++){
            if((load+weights[i])>cap){
                days++;
                load=weights[i];
            } else load+=weights[i];
        } return days>d;
    }
    public static int leastWeightCapacity(int[] weights, int d) {
        // Write your code here.
        int n=weights.length;
        int low=Integer.MIN_VALUE, high=0;
        for(int i=0;i<n;i++){
            high+=weights[i];
            low=Math.max(low,weights[i]);
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(findDays(weights,n,mid,d)) low=mid+1;
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
        int d=sc.nextInt();
        System.out.println(leastWeightCapacity(arr, d));
        sc.close();
    }
}