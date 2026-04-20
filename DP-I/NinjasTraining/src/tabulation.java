public class tabulation {
    public static void main(String[]args){
        int a[][] = {{70, 40, 10}, {180, 20, 5}, {200, 60, 30}};
        int n = a.length;
        int dp[][] = new int[n][4];
        dp[0][0] = Math.max(a[0][1], a[0][2]);
        dp[0][1] = Math.max(a[0][0], a[0][2]);
        dp[0][2] = Math.max(a[0][0], a[0][1]);
        dp[0][3] = Math.max(a[0][0], Math.max(a[0][1], a[0][2]));
for(int day = 1; day < n; day++){
    for(int last = 0; last<4; last++){
        dp[day][last] = 0;
        for(int task = 0; task<3; task++){
            if(task != last)
            dp[day][last] = Math.max(dp[day][last], a[day][task] + dp[day-1][task]);
        }
    }

}



System.out.print(dp[n-1][3]);
    }
}
