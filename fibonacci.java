class Main {
    public static void main(String[] args) {
        fibonacci(5);
    }
    public static void fibonacci(int n) {
        System.out.println(helper(n));
    }

    private static int helper(int n) {
        if (n <= 1) return n;
        return helper(n - 1) + helper(n - 2);
    }
}