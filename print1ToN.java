class Main {
    public static void main(String[] args) {
        print1toN(10);
    }
    public static void print1toN(int n) {
        helper(1, n);
    }

    private static void helper(int i, int n) {
        if (i <= n) {
            System.out.print(i + "\n");
            helper(i + 1, n);
        };
    }
}