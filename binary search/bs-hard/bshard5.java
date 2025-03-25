// find median of a row sorted matrix - m*n is odd
// Time Complexity: O(log(10^9)*m*log(n))
// Space Complexity: O(1)

import java.util.*;

class bshard5 {
    public static int upperBound(int row[], int n, int x) {
        int low=0, high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(row[mid]>x){
                ans=mid;
                high=mid-1;
            } else low=mid+1;
        } return ans;
    }
    public static int countSmaller(int matrix[][], int m, int n, int x) {
        int count=0;
        for(int i=0;i<m;i++){
            count+=upperBound(matrix[i],n,x);
        } return count;
    }
    public static int findMedian(int matrix[][], int m, int n) {
        // Write your code here
        int low=Integer.MAX_VALUE, high=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            low=Math.min(low,matrix[i][0]);
            high=Math.max(high,matrix[i][n-1]);
        }
        int target=(m*n)/2;
        while(low<=high){
            int mid=(low+high)/2;
            int smallereqs=countSmaller(matrix,m,n,mid);
            if(smallereqs<=target) low=mid+1;
            else high=mid-1;
        } return low;
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
        System.out.println(findMedian(arr,n,m));
        sc.close();
    }
}