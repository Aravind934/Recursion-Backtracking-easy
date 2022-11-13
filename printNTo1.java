class Main {
    public static void main(String[] args) {
        printNTo1(10);
    }
    public static void printNTo1(int n) {
        helper(1, n);
    }

    private static void helper(int i, int n) {
        if (i < n) helper(i + 1, n);
        System.out.print(i + "\n");
    }
}