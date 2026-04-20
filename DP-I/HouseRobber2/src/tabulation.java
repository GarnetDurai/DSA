public class tabulation {
    public static void main(String[]args){
        int a[] = {1, 5};
        int n = a.length;
        int dp[] = new int[n];
        dp[0] = a[0];
        if(n == 1){
            System.out.print(a[0]);
            return;
        }
        if(n == 2){
            System.out.print(Math.max(a[0], a[1]));
            return;
        }
        dp[1] = Math.max(a[0], a[1]);
        for(int i=2; i<n-1; i++){
            dp[i] = Math.max(a[i] + dp[i-2], dp[i-1]);
        }
        int dp1[] = new int[n];
        dp1[1] = a[1];
        dp1[2] = Math.max(a[1], a[2]);
        for(int i=3; i<n; i++){
            dp1[i] = Math.max(a[i] + dp1[i-2], dp1[i-1]);
        }







        for(int val: dp){
            System.out.print(val+" ");
        }
        System.out.println();
        for(int val: dp1){
            System.out.print(val+" ");
        }
        System.out.print(Math.max(dp[n-2], dp1[n-1]));
    }
}
