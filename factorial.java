class Main {
    public static void main(String[] args) {
        factorial(4);
    }
    public static void factorial(int n) {
        System.out.println(helper(n, 1));
    }

    private static int helper(int n, int i) {
        if (n == 1) return i;
        return helper(n - 1, i * n);
    }
}