// painter's partition problem
// Time Complexity: O(nlog(sum(arr[])-min(arr[])+1))
// Space Complexity: O(1)
import java.util.*;

class bsmed11 {
    public static boolean countpainters(ArrayList<Integer> boards, int n, int time, int k){
        int painter=1, count=0;
        for(int i=0;i<boards.size();i++){
            if(count+boards.get(i)<=time) count+=boards.get(i);
            else{
                painter++;
                count=boards.get(i);
            }
        } return painter>k;
    }
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        //    Write your code here.
        int n=boards.size();
        if(k>n) return -1;
        int low=Integer.MIN_VALUE, high=0;
        for(int i=0;i<n;i++){
            low=Math.max(low,boards.get(i));
            high+=boards.get(i);
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(countpainters(boards,n,mid,k)) low=mid+1;
            else high=mid-1;
        } return low;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        int k=sc.nextInt();
        System.out.println(findLargestMinDistance(arr,k));
        sc.close();
    }
}