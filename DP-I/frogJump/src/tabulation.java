public class tabulation {
    public static void main(String[]args){
        int a[] = {2, 1, 3, 5, 4};
        int n = a.length;
        int dp[] = new int[n];
        for(int i=1; i<n; i++){
            int fs = dp[i-1] + Math.abs(a[i] - a[i-1]);
            int ss = Integer.MAX_VALUE;
            if(i - 2 >= 0)
                ss = dp[i-2] + Math.abs(a[i] - a[i-2]);
            dp[i] = Math.min(fs,ss);
        }
        System.out.print(dp[n-1]);
    }
}
