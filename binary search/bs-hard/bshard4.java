// find peak element in a 2D matrix
// Time Complexity: O(n*log(m))
// Space Complexity: O(1)

import java.util.*;

class bshard4 {
    public static int maxelm(int[][] mat, int n, int m, int col) {
        int max=-1, index=-1;
        for(int i=0;i<n;i++){
            if(mat[i][col]>max){
                max=mat[i][col];
                index=i;
            }
        } return index;
    }
    public static int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int low=0, high=m-1;
        while(low<=high){
            int mid=(low+high)/2;
            int row=maxelm(mat,n,m,mid);
            int left=mid-1>=0?mat[row][mid-1]:-1;
            int right=mid+1<m?mat[row][mid+1]:-1;
            if(mat[row][mid]>left && mat[row][mid]>right) return new int[] {row,mid};
            else if(mat[row][mid]>left) low=mid+1;
            else high=mid-1;
        } return new int[] {-1,-1};
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
        int res[]=findPeakGrid(arr);
        System.out.println(res[0]+" "+res[1]);
        sc.close();
    }
}