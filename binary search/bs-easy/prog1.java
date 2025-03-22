// binary search
// binary search is a fast search algorithm with a time complexity of O(logn).
import java.util.*;
class prog1{
    public static int binarySearch(int arr[],int low,int high,int x){
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        } return -1;
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
        System.out.println("Enter the element to be searched");
        int x=sc.nextInt();
        int res=binarySearch(arr,0,n-1,x);
        if(res==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index "+res);
        }
        sc.close();
    }   
}