public class tabulation {
    public static void main(String[]args){
        int a[] = {2, 1, 4, 9};
        int n = a.length;
        int dp[] = new int[n];
        dp[0] = a[0];
        if(n == 1){
            System.out.print(a[0]);
            return;
        }
        dp[1] = Math.max(a[0], a[1]);
        for(int i=2; i<n; i++){
            dp[i] = Math.max(a[i] + dp[i-2], dp[i-1]);
        }
        System.out.print(dp[n-1]);
    }
}
