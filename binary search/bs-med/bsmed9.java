// book allocation problem
// Time Complexity: O(nlog(sum(arr[])-min(arr[])+1))
// Space Complexity: O(1)
import java.util.*;

class bsmed9 {
    public static boolean calstudent(ArrayList<Integer> arr, int n, int pages, int m) {
        int student=1, countpages=0;
        for(int i=0;i<arr.size();i++){
            if(countpages+arr.get(i)<=pages) countpages+=arr.get(i);
            else{
                student++;
                countpages=arr.get(i);
            }
        } return student>m;
    }
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
        if(m>n) return -1;
        int low=Integer.MIN_VALUE, high=0;
        for(int i=0;i<n;i++){
            low=Math.max(low,arr.get(i));
            high+=arr.get(i);
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(calstudent(arr,n,mid,m)) low=mid+1;
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
        int m=sc.nextInt();
        System.out.println(findPages(arr,n,m));
        sc.close();
    }
}