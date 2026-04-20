import java.util.Arrays;

public class memo {
    public static int memo[][];
    public static int helper(int a[][], int last, int n){
        if(n == 0){
            int max = 0;
            for(int i=0; i<3; i++){
                if(i != last){
                    max = Math.max(a[n][i], max);
                }
            }
            return memo[n][last] = max;
        }
        if(memo[n][last] != -1)return memo[n][last];
        int max = 0;
        for(int j = 0; j <3; j++){
            if(last == j)continue;

            max = Math.max(a[n][j] + helper(a, j, n-1), max);
        }
        memo[n][last] = max;
        return memo[n][last];
    }
    public static void main(String[]args){
        int a[][] = {{70, 40, 10}, {180, 20, 5}, {200, 60, 30}};
        int n = a.length;
        memo = new int[n][4];
        for(int i=0; i<n; i++){
            Arrays.fill(memo[i], -1);
        }
        System.out.print(helper(a, 3, n-1));
    }
}
