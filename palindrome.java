class Main {
    public static void main(String[] args) {
        isPalindrome(510015);
    }
    public static void isPalindrome(int n) {
        System.out.println(helper(n, 0, n));
    }

    private static boolean helper(int n, int temp, int processed) {
        if (processed == 0) return n == temp;
        return helper(n, (temp * 10) + (processed % 10), processed / 10);
    }
}