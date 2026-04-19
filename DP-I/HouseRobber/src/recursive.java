public class recursive {
    public static int helper(int a[], int n){
        if(n == 0)return a[n];
        if(n < 0)return 0;
        return (Math.max(a[n] + helper(a, n-2), helper(a, n-1)));
    }
    public static void main(String[]args){
        int a[] = {1, 2, 4};
        int n = a.length;
        System.out.print(helper(a, n-1));
    }
}
