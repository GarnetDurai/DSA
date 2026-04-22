
/*
->can go directly down, here up
->can go left/right diagonal
Am going from bottom to up
so actions are reversed
can do either way
 */
public class recursion {
   static int helper(int a[][], int n, int j) {
       if(j < 0)return Integer.MAX_VALUE;
       if(j == a[0].length)return Integer.MAX_VALUE;
        if(n == 0)return a[0][j];
        int up = helper(a, n-1, j);
        int ld = helper(a, n-1, j-1);
        int rd = helper(a, n-1, j+1);

        return a[n][j] + Math.min(up, Math.min(ld, rd));
    }

    public static void main(String[]args){
        int a[][] = {{-19,57},{-40,-5}};
        int n = a.length;
        int m = a[0].length;
        int min = Integer.MAX_VALUE;
        for(int j=0; j<m; j++){
            min = Math.min(min, helper(a, n-1, j));
        }
        System.out.print(min);

}
    }

