public class memo {
    static int memo[][];
    public static int helper(int a[][], int i, int j){
        if(i == 0 && j == 0 && a[i][j] == 1)return 0;
        if(i == 0 && j == 0)return 1;
        if(i < 0 || j < 0)return 0;
        if(a[i][j] != 0)return 0;
        if(memo[i][j] != 0)return memo[i][j];
        return memo[i][j] = helper(a, i-1, j) + helper(a, i, j-1);
    }
    public static int uniquePathsWithObstacles(int[][] a) {
        int n = a.length;
        int m = a[0].length;
        memo = new int[n][m];
        return helper(a, n-1, m-1);
    }
    public static void main(String[]args){
        int a[][] = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.print(uniquePathsWithObstacles(a));

    }
}
