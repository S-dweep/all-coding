// search in rotated sorted array without duplicates
// Time Complexity: O(logn)
// Space Complexity: O(1)
import java.util.*;

class prog8 {
    public static int search(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        int low=0, high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr.get(mid)==k) return mid;
            else if(arr.get(low)<=arr.get(mid)){
                if(arr.get(low)<=k && k<=arr.get(mid)) high=mid-1;
                else low=mid+1;
            } else{
                if(arr.get(mid)<=k && k<=arr.get(high)) low=mid+1;
                else high=mid-1;
            }
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
        System.out.println("Enter the element to be searched");
        int x = sc.nextInt();
        System.out.println(search(arr, n, x));
        sc.close();
    }
}