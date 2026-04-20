import java.util.Arrays;

public class tabulation {
    public static void main(String[]args){
        int n = 3;
        int m = 7;
        int dp[][] = new int[n][m];
        Arrays.fill(dp[0], 1);
        for(int i=0; i<n; i++){
            dp[i][0] = 1;
        }
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        System.out.print(dp[n-1][m-1]);
    }
}
