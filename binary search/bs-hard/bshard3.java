// search in a row wise and column wise sorted matrix
// Time Complexity: O(n+m)
// Space Complexity: O(1)

import java.util.*;

class bshard3 {
    public static boolean searchElement(int [][]MATRIX, int target) {
        // Write your code here.
        int n=MATRIX.length;
        int m=MATRIX[0].length;
        int row=0, col=m-1;
        while(row<n && col>=0){
            if(MATRIX[row][col]==target) return true;
            else if(MATRIX[row][col]<target) row++;
            else col--;
        } return false;
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
        int target=sc.nextInt();
        System.out.println(searchElement(arr, target));
        sc.close();
    }
}