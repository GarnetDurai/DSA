public class recursion {
    public static int helper(int a[][], int last, int n){
        if(n == 0){
            int max = 0;
            for(int i=0; i<3; i++){
                if(i != last){
                    max = Math.max(a[n][i], max);
                }
            }
            return max;
        }
        int max = 0;
        for(int j = 0; j <3; j++){
            if(last != j)
            max = Math.max(a[n][j] + helper(a, j, n-1), max);
        }
        return max;
    }
    public static void main(String[]args){
        int a[][] = {{70, 40, 10}, {180, 20, 5}, {200, 60, 30}};
        int n = a.length;
        int m = a[0].length;
       System.out.print(helper(a, 3, n-1));

    }
}
