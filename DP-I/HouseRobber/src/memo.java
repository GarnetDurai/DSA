import java.util.Arrays;

public class memo {
    public static int memo[];
    public static int helper(int a[], int n){
        if(n < 0)return 0;
        if(memo[n] != -1)return memo[n];
        memo[n] = (Math.max(a[n] + helper(a, n-2), helper(a, n-1)));
        return memo[n];
    }
    public static void main(String[]args){
        int a[] = {2, 1, 4, 9};
        int n = a.length;
        memo = new int[n];
        Arrays.fill(memo, -1);
        memo[0] = a[0];
        System.out.print(helper(a, n-1));
    }
}
