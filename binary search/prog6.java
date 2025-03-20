// first and last occurence of an element in a sorted arraylist
// Time Complexity: O(logn)
// Space Complexity: O(1)
import java.util.*;

class prog6 {
    public static int firstocc(ArrayList<Integer> arr, int n, int k){
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr.get(mid)>=k){
                ans=mid;
                high=mid-1;
            } else low=mid+1;
        }
        return ans;
    }
    public static int lastocc(ArrayList<Integer> arr, int n, int k){
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr.get(mid)>k){
                ans=mid;
                high=mid-1;
            } else low=mid+1;
        }
        return ans;
    }

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        int first=firstocc(arr,n,k);
        if(first==n || arr.get(first)!=k) return new int[] {-1,-1};
        int last=lastocc(arr,n,k);
        return new int[] {first,last-1};
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
        System.out.println("Enter the element to find its first and last occurence");
        int x = sc.nextInt();
        int res[] = firstAndLastPosition(arr, n, x);
        System.out.println(res[0] + " " + res[1]);
        sc.close();
    }
}