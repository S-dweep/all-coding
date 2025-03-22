// find minimum in rotated sorted array without duplicates
// Time Complexity: O(logn)
// Space Complexity: O(1)
import java.util.*;

class prog10 {
    public static int findMin(int []arr) {
        // Write your code here.
        int n=arr.length;
        int low=0, high=n-1;
        int mini=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[high]){
                mini=Math.min(mini,arr[low]);
                break;
            }
            if(arr[low]<=arr[mid]){
                mini=Math.min(mini,arr[low]);
                low=mid+1;
            } else{
                mini=Math.min(mini,arr[mid]);
                high=mid-1;
            }
        } return mini;
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
        System.out.println(findMin(arr));
        sc.close();
    }
}