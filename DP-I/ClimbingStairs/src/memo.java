import java.util.*;
public class memo {
    public static int dp[];
    public static int helper(int n){
        if(dp[n] != -1)return dp[n];
        dp[n] = helper(n-1) + helper(n-2);
        return dp[n];
    }
    public static void main(String[]args){
        int n = 10;
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        dp[1] = 1;
        System.out.print(helper(n));
    }
}
