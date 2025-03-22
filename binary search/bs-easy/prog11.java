// find how many times the array is rotated
// Input: arr = [11, 12, 15, 18, 2, 5, 6, 8]
// Output: 4
// Time Complexity: O(logn)
// Space Complexity: O(1)
import java.util.*;

class prog11 {
    public static int findKRotation(int []arr){
        // Write your code here.
        int n=arr.length;
        int low=0, high=n-1;
        int mini=Integer.MAX_VALUE;
        int index=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[high]){
                if(arr[low]<mini){
                    mini=arr[low];
                    index=low;
                }
                break;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<mini){
                    mini=arr[low];
                    index=low;
                }
                low=mid+1;
            } else{
                if(arr[mid]<mini){
                    mini=arr[mid];
                    index=mid;
                }
                high=mid-1;
            }
        } return index;
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
        System.out.println(findKRotation(arr));
        sc.close();
    }
}