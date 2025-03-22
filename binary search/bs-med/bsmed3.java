// koko eating bananas
// Time Complexity: O(nlog(max(piles)))
// Space Complexity: O(1)
import java.util.*;

class bsmed3 {
    public static boolean calcHours(int []v, int n, int hours, int h){
        int totalhrs=0;
        for(int i=0;i<n;i++){
            totalhrs+=Math.ceil((double)v[i]/(double)hours);
        } return totalhrs>h;
    }
    public static int minimumRateToEatBananas(int []v, int h) {
        // Write Your Code Here
        int n=v.length;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,v[i]);
        }
        int low=1, high=maxi;
        while(low<=high){
            int mid=(low+high)/2;
            if(calcHours(v,n,mid,h)) low=mid+1;
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
        int h=sc.nextInt();
        System.out.println(minimumRateToEatBananas(arr,h));
        sc.close();
    }
}