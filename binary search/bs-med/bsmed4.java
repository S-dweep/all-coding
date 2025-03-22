// minimum days to make m bouquets
// Time Complexity: O(nlog(max(arr[i])-min(arr[i])+1))
// Space Complexity: O(1)
import java.util.*;

class bsmed4 {
    public static boolean possible(int[] arr, int n, int day, int r, int b) {
        int count=0, nofb=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=day) count++;
            else{
                nofb+=(count/r);
                count=0;
            }
        } nofb+=(count/r);
        if(nofb>=b) return true;
        else return false;
    }
    public static int roseGarden(int[] arr, int r, int b) {
        // Write your code here.
        int n=arr.length;
        long val=(long)(r*b);
        if(val>n) return -1;
        int maxi=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,arr[i]);
            mini=Math.min(mini,arr[i]);
        }
        int low=mini, high=maxi;
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(arr,n,mid,r,b)) high=mid-1;
            else low=mid+1;
        } return low;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int r=sc.nextInt();
        int h=sc.nextInt();
        System.out.println(roseGarden(arr, r, h));
        sc.close();
    }
}