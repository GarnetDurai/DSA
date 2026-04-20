public class tabulation {
        public static int uniquePathsWithObstacles(int[][] a) {
            int n = a.length;
            int m = a[0].length;
            int dp[][] = new int[n][m];
            if(a[0][0] == 1)return 0;
            int val = 1;
            for(int i=0; i<n; i++){
                if(a[i][0] != 1){
                    dp[i][0] = val;
                }else{
                    val = 0;
                }
            }
            val = 1;
            for(int j=0; j<m; j++){
                if(a[0][j] != 1){
                    dp[0][j] = val;
                }else{
                    val = 0;
                }
            }
            for(int i=1; i<n; i++){
                for(int j=1; j<m; j++){
                    if(a[i][j] != 1)
                        dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
            return dp[n-1][m-1];
        }
        public static void main(String[]args){
            int a[][] = {{0,0,0},{0,1,0},{0,0,0}};
            System.out.print(uniquePathsWithObstacles(a));
        }
    }

