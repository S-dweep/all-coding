// search insert position
// Given a sorted array of distinct integers and a target value, return the index if the target is found. 
// If not, return the index where it would be if it were inserted in order. 
// Time Complexity: O(logn)
// Space Complexity: O(1)
import java.util.*;
class prog4{
    public static int searchInsert(int [] arr, int m){
        int n=arr.length;
        int ans=n;
        int low=0, high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=m){
                ans=mid;
                high=mid-1;
            } else{
                low=mid+1;
            }
        } return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.err.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to find the index or insert position");
        int x=sc.nextInt();
        int res=searchInsert(arr, x);
        if(arr[res]==x){
            System.out.println("The element is found at index: "+res);
        } else{
            System.out.println("The insert position of the element is: "+res);
        }
        sc.close();
    }   
}