public class tabulation {
    public static void main(String[]args){
        int a[][] = {{-19,57},{-40,-5}};
        int n = a.length;
        int m = a[0].length;
        int min = Integer.MAX_VALUE;
        int dp[][] = new int[n][m];
        for(int j=0; j<m;j++){
            dp[0][j] = a[0][j];
        }
        for(int i=1; i<n; i++) {
            for (int j = 0; j < m; j++) {
                int down = a[i][j] + dp[i - 1][j];
                int ld = Integer.MAX_VALUE;
                if (j + 1 < m) ld = a[i][j] + dp[i - 1][j + 1];
                int rd = Integer.MAX_VALUE;
                if (j - 1 >= 0) rd = a[i][j] + dp[i - 1][j - 1];
                dp[i][j] = Math.min(down, Math.min(ld, rd));
            }
        }
        for(int j=0; j<m; j++){
            min = Math.min(min, dp[n-1][j]);
        }
        System.out.print(min);
    }
}
