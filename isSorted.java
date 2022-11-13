class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,3};
        isSorted(arr);
    }
    public static void isSorted(int[] arr) {
        System.out.println(helper(arr,0));
    }

    private static boolean helper(int[] arr,int i) {
        if(arr.length-1 ==i) return true;
        if(arr[i]>arr[i+1]) return false;
        return helper(arr,i+1);
    }
}