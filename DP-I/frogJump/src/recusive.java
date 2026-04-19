public class recusive {
    public static int helper(int a[], int n){
        if(n == 0)return 0;
        int fs = helper(a, n-1) + Math.abs(a[n] - a[n-1]);
        int ss = Integer.MAX_VALUE;
        if(n-2 >= 0)
            ss = helper(a, n-2) + Math.abs(a[n] - a[n-2]);
        return Math.min(fs, ss);
    }
    public static void main(String[]args) {
        int a[] = {7, 5, 1, 2, 6};
        int n = a.length;
        System.out.print(helper(a, n - 1));
    }
}
