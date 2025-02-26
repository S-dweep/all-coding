import java.util.*;
class arr2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<mini) mini=arr[i];
            if(arr[i]>maxi) maxi=arr[i];
        } System.out.println("min: "+mini+" max: "+maxi);
    }
}