// smallest divisor such that sum of array elements is less than or equal to limit
// Time Complexity: O(nlog(max(arr[])))
// Space Complexity: O(1)
import java.util.*;

class bsmed5 {
    public static boolean sumDiv(int arr[], int n, int d, int limit) {
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.ceil((double)arr[i]/(double)d);
        } return sum>limit;
    }
    public static int smallestDivisor(int arr[], int limit) {
        // Write your coder here
        int n=arr.length;
        int low=1, high=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            high=Math.max(high,arr[i]);
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(sumDiv(arr,n,mid,limit)) low=mid+1;
            else high=mid-1;
        }
        return low;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int limit=sc.nextInt();
        System.out.println(smallestDivisor(arr, limit));
        sc.close();
    }
}