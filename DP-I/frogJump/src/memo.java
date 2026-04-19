import java.util.*;
public class memo {
    public static int memo[];
        public static int helper(int a[], int n){
            if(memo[n] != -1)return memo[n];

            int fs = helper(a, n-1) + Math.abs(a[n] - a[n-1]);
            int ss = Integer.MAX_VALUE;
            if(n-2 >= 0)
                ss = helper(a, n-2) + Math.abs(a[n] - a[n-2]);
            memo[n] = Math.min(fs, ss);
            return memo[n];
        }
        public static void main(String[]args) {
            int a[] = {2, 1, 3, 5, 4};
            int n = a.length;
            memo = new int[n];
            Arrays.fill(memo, -1);
            memo[0] = 0;
            System.out.print(helper(a, n - 1));
        }
    }

