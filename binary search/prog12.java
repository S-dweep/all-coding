// search single element in a sorted rotated array
// Time Complexity: O(logn)
// Space Complexity: O(1)
import java.util.*;

class prog12 {
    public static int singleNonDuplicate(ArrayList<Integer> arr)
    {
        //    Write your code here.
        int n = arr.size(); // Size of the array.
        // Edge cases:
        if (n == 1)
            return arr.get(0);
        if (!arr.get(0).equals(arr.get(1)))
            return arr.get(0);
        if (!arr.get(n - 1).equals(arr.get(n - 2)))
            return arr.get(n - 1);
        int low = 1, high = n - 2;
        while (low <= high) {
            int mid = (low + high) / 2;
            // If arr[mid] is the single element:
            if (!arr.get(mid).equals(arr.get(mid + 1)) && !arr.get(mid).equals(arr.get(mid - 1))) {
                return arr.get(mid);
            }
            // We are in the left:
            if ((mid % 2 == 1 && arr.get(mid).equals(arr.get(mid - 1)))
                    || (mid % 2 == 0 && arr.get(mid).equals(arr.get(mid + 1)))) {
                // Eliminate the left half:
                low = mid + 1;
            }
            // We are in the right:
            else {
                // Eliminate the right half:
                high = mid - 1;
            }
        }
        // Dummy return statement:
        return -1;
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
        System.out.println(singleNonDuplicate(arr));
        sc.close();
    }
}