import java.util.*;
class Main {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n) {
        helper(n, 0, 0);
    }

    private static void helper(int n, int i, int j) {
        if (i < n) {
            if (j <= i) {
                System.out.print("*");
                helper(n, i, j + 1);
            }
            System.out.print("\n");
            if (j > i) helper(n, i + 1, 0);
        }
    }
}