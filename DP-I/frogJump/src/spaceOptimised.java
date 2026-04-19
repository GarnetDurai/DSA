public class spaceOptimised {
    public static void main(String[] args) {
        int a[] = {7, 5, 1, 2, 6};
        int n = a.length;
        int prev = 0; //n-2
        int prev1 = Math.abs(a[0] - a[1]);// n-1
        for (int i = 2; i < n; i++) {
            int fs = prev1 + Math.abs(a[i] - a[i - 1]);
            int ss = Integer.MAX_VALUE;
            if (i - 2 >= 0)
                ss = prev + Math.abs(a[i] - a[i - 2]);
            int curr = Math.min(fs, ss);
            prev = prev1;
            prev1 = curr;
        }
        System.out.print(prev1);
    }
}
