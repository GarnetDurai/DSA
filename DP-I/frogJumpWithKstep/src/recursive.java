public class recursive {
    public static int helper(int a[], int n, int k) {
        if (n == 0) return 0;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= k; i++) {
            if (n - i >= 0) {
                int jump = helper(a, n - i, k) + Math.abs(a[n] - a[n - i]);
                min = Math.min(min, jump);
            }
        }
        return min;
    }

    public static void main(String[]args){
        int a[] = {10, 5, 20, 0, 15};
        int n = a.length;
        int k = 2;
        System.out.print(helper(a, n-1, k));
    }
}
