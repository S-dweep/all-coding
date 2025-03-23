// minimize max distance to gas station
// Time Complexity: O(nlog(max(len)))
// Space Complexity: O(1)
import java.util.*;

class bsmed12 {
    public static boolean countstation(int []arr, int n, double dist, int K){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            int nostinbetween=(int)((arr[i+1]-arr[i])/dist);
            if((arr[i+1]-arr[i])==nostinbetween*dist) nostinbetween--;
            count+=nostinbetween;
        } return count>K;
    }
    public static double MinimiseMaxDistance(int []arr, int K){
        // Write your code here.
        int n=arr.length;
        double low=0, high=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            high=Math.max(high,(arr[i+1]-arr[i]));
        }
        double diff=1e-6;
        while(high-low>diff){
            double mid=(low+high)/(2.0);
            if(countstation(arr,n,mid,K)) low=mid;
            else high=mid;
        } return high;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(MinimiseMaxDistance(arr,k));
        sc.close();
    }
}