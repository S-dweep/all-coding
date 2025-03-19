
// find floor and ceil of a number in a sorted array
// Floor: greatest element smaller than or equal to x
// Ceil: smallest element greater than or equal to x 
// Time Complexity: O(logn)
// Space Complexity: O(1)
import java.util.*;

class prog5 {
    public static int findfloor(int a[], int n, int x) {
        int low = 0, high = n - 1, ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] <= x) {
                ans = a[mid];
                low = mid + 1;
            } else
                high = mid - 1;
        }
        return ans;
    }

    public static int findceil(int a[], int n, int x) {
        int low = 0, high = n - 1, ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] >= x) {
                ans = a[mid];
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return ans;
    }

    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        // Wriute your code here.
        int f = findfloor(a, n, x);
        int c = findceil(a, n, x);
        return new int[] { f, c };
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.err.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to find floor and ceil");
        int x = sc.nextInt();
        int res[] = getFloorAndCeil(arr, n, x);
        System.out.println(res[0] + " " + res[1]);
        sc.close();
    }
}