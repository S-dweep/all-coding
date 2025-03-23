// aggressive cows
// Time Complexity: O(nlogn) + O(nlog(max(arr[])-min(arr[])))
// Space Complexity: O(1)
import java.util.*;

class bsmed8 {
    public static boolean checkCows(int []stalls, int dist, int k){
        int count=1, last=stalls[0];
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-last>=dist){
                count++;
                last=stalls[i];
            }
        } return count>=k;
    }
    public static int aggressiveCows(int []stalls, int k) {
        //    Write your code here.
        Arrays.sort(stalls);
        int mini=Integer.MAX_VALUE, maxi=Integer.MIN_VALUE;
        for(int i=0;i<stalls.length;i++){
            mini=Math.min(mini,stalls[i]);
            maxi=Math.max(maxi,stalls[i]);
        }
        int low=1, high=maxi-mini;
        while(low<=high){
            int mid=(low+high)/2;
            if(checkCows(stalls,mid,k)) low=mid+1;
            else high=mid-1;
        } return high;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(aggressiveCows(arr,k));
        sc.close();
    }
}