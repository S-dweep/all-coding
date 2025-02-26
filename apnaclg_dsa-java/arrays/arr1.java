import java.util.*;
class arr1{
    public static int linearSearch(int arr[], int n, int x){
        for(int i=0;i<n;i++){
            if(arr[i]==x) return i;
        } return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter element to search: ");
        int x=sc.nextInt();
        int res=linearSearch(arr,n,x);
        if(res==-1) System.out.println("not found");
        else System.out.println("found at position "+(res+1));
    }
}