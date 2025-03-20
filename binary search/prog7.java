// count occurences of an element in a sorted array
// Time Complexity: O(logn)
// Space Complexity: O(1)
import java.util.*;

class prog7 {
    public static int firstocc(int[] arr, int n, int k){
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=k){
                ans=mid;
                high=mid-1;
            } else low=mid+1;
        }
        return ans;
    }
    public static int lastocc(int[] arr, int n, int k){
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>k){
                ans=mid;
                high=mid-1;
            } else low=mid+1;
        }
        return ans;
    }

    public static int[] firstAndLastPosition(int[] arr, int n, int k) {
        // Write your code here.
        int first=firstocc(arr,n,k);
        if(first==n || arr[first]!=k) return new int[] {-1,-1};
        int last=lastocc(arr,n,k);
        return new int[] {first,last-1};
    }
    public static int count(int arr[], int n, int x) {
        //Your code goes here
        int res[]=firstAndLastPosition(arr,n,x);
        if(res[0]==-1) return 0;
        return (res[1]-res[0]+1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.err.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to find its occurence");
        int x = sc.nextInt();
        int total = count(arr, n, x);
        System.out.println(total);
        sc.close();
    }
}