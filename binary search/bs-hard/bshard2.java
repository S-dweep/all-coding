// search in a 2D matrix where each row is sorted
// Time Complexity: O(log(n*m))
// Space Complexity: O(1)
import java.util.*;

class bshard2 {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        int n=mat.size();
        int m=mat.get(0).size();
        int low=0, high=(n*m)-1;
        while(low<=high){
            int mid=(low+high)/2;
            int r=mid/m;
            int c=mid%m;
            if(mat.get(r).get(c)==target) return true;
            else if(mat.get(r).get(c)<target) low=mid+1;
            else high=mid-1;
        } return false;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int j=0;j<m;j++){
                temp.add(sc.nextInt());
            }
            arr.add(temp);
        }
        int target=sc.nextInt();
        System.out.println(searchMatrix(arr, target));
        sc.close();
    }
}