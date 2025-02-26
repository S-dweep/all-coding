import java.util.*;
class arr3{
    public static boolean ascend(int arr[], int n){
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]) return false;
        } return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(ascend(arr,n)) System.out.println("sorted in ascending order");
        else System.out.println("not sorted in ascending order");
    }
}