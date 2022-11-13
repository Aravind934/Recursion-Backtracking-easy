import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        rotaedBS(arr, 8);
        rotaedBS(arr, 2);
    }
    public static void rotaedBS(int[] arr, int n) {
        System.out.print(helper(arr, n, 0, arr.length - 1) + "\n");
    }

    private static int helper(int[] arr, int n, int start, int end) {
        if (start > end) return -1;
        int mid = (start + end) / 2;
        if (arr[mid] == n) return mid;
        if (arr[start] <= arr[mid]) {
            if (n >= arr[start] && n <= arr[mid]) return helper(arr, n, start, mid - 1);
            return helper(arr, n, mid + 1, end);
        }
        if (n >= arr[mid] && n <= arr[end]) return helper(arr, n, mid + 1, end);
        return helper(arr, n, start, mid - 1);
    }
}