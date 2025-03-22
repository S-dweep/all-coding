// upper bound 
// Time Complexity: O(logn)
// Space Complexity: O(1)
import java.util.*;
class prog3{
    public static int upperBound(int []arr, int n, int x) {
        int ans=n;
        int low=0, high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>x){
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
        System.out.println("Enter the element to find the upper bound");
        int x=sc.nextInt();
        int res=upperBound(arr,n,x);
        System.out.println("The upper bound of the element is: "+res);
        sc.close();
    }   
}