class Main {
    public static void main(String[] args) {
        sumOfNTo1(10);
    }
    public static void sumOfNTo1(int n) {
        System.out.println(helper(1, n, 0));
    }

    private static int helper(int i, int n, int sum) {
        if (i > n) return sum;
        return helper(i + 1, n, sum + i);
    }
}