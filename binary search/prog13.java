// find peak element in an array
// Time Complexity: O(logn)
// Space Complexity: O(1)
import java.util.*;

class prog13 {
    public static int findPeakElement(ArrayList<Integer> arr) {
        // Write your code here.
        int n=arr.size();
        if(n==1) return 0;
        if(arr.get(0)>arr.get(1)) return 0;
        if(arr.get(n-1)>arr.get(n-2)) return n-1;
        int low=1, high=n-2;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr.get(mid)>arr.get(mid-1) && arr.get(mid)>arr.get(mid+1)) return mid;
            if(arr.get(mid)>arr.get(mid-1)) low=mid+1;
            else high=mid-1;
        } return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the number of elements in the arraylist");
        int n = sc.nextInt();
        System.err.println("Enter the elements of the arraylist");
        for (int i = 0; i < n; i++) {
            int elm = sc.nextInt();
            arr.add(elm);
        }
        System.out.println(findPeakElement(arr));
        sc.close();
    }
}