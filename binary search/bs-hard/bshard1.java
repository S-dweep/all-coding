// find row with max 1s in a sorted matrix
// Time Complexity: O(n*log(m))
// Space Complexity: O(1)
import java.util.*;

class bshard1 {
    public static int lowerb(int arr[], int k){
        int low=0, high=arr.length-1, ans=arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=k){
                ans=mid;
                high=mid-1;
            } else low=mid+1;
        } return ans;
    }
    public static int rowWithMax1s(int arr[][]) {
        // code here
        int max1=0, ind=-1;
        for(int i=0;i<arr.length;i++){
            int count1=arr[i].length-lowerb(arr[i],1);
            if(count1>max1){
                max1=count1;
                ind=i;
            }
        } return ind;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(rowWithMax1s(arr));
        sc.close();
    }
}