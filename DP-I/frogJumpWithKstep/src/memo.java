import java.util.*;
public class memo {
    public static int memo[];
    public static int helper(int a[], int n, int k) {
        if (memo[n] != -1) return memo[n];
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= k; i++) {
            if (n - i >= 0) {
                int jump = helper(a, n - i, k) + Math.abs(a[n] - a[n - i]);
                min = Math.min(min, jump);
                memo[n] = min;
            }
        }
        return memo[n];
    }

    public static void main(String[]args){
        int a[] = {10, 5, 20, 0, 15};
        int n = a.length;
        memo = new int[n];
        Arrays.fill(memo, -1);
        memo[0] = 0;
        int k = 2;
        System.out.print(helper(a, n-1, k));
    }
}
