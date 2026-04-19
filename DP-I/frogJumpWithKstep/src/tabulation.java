public class tabulation {
    public static void main(String[]args){
            int a[] = {10, 5, 20, 0, 15};
            int n = a.length;
            int k = 2;
            int dp[] = new int[n];
            dp[0] = 0;
            if(n>1)
            dp[1] = Math.abs(a[0] - a[1]);
            for(int i=2; i<n; i++){
                int min = Integer.MAX_VALUE;
                for(int j=1; j<=k; j++){
                    if(i-j >= 0){
                        int jump = dp[i-j] + Math.abs(a[i] - a[i-j]);
                        min = Math.min(jump, min);
                    }
                }
                dp[i] = min;
            }
            System.out.print(dp[n-1]);
    }
}
