// kth missing element in sorted array
// Time Complexity: O(logn)
// Space Complexity: O(1)
import java.util.*;

class bsmed7 {
    public static int missingK(int[] vec, int n, int k) {
        // Write your code here.
        int low=0, high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            int missing=vec[mid]-(mid+1);
            if(missing<k) low=mid+1;
            else high=mid-1;
        } return k+high+1;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(missingK(arr,n,k));
        sc.close();
    }
}