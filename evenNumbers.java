import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3};
        evenNumbers(arr);
    }
    public static void evenNumbers(int[] arr) {
        System.out.println(helper(arr, 0));
    }

    private static List helper(int[] arr, int i) {
        List < Integer > list = new ArrayList < > ();
        List < Integer > temp = new ArrayList < > ();
        if (i < arr.length) {
            temp = helper(arr, i + 1);
            if (arr[i] % 2 == 0) list.add(arr[i]);
        }
        list.addAll(temp);
        return list;
    }
}