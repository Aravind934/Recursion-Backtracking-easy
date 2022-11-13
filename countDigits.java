class Main {
    public static void main(String[] args) {
        countDigits(10067009);
    }
    public static void countDigits(int n) {
        System.out.println(helper(0, n));
    }

    private static int helper(int i, int n) {
        if (n <= 0) return i;
        return helper(i + 1, n / 10);
    }
}