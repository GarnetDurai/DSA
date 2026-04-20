public class recursion {
    public static int helper(int a[], int n){
        if(n == 0)return a[0];
        if(n < 0)return 0;
        return Math.max(a[n] + helper(a, n-2), helper(a, n-1));
    }
    public static void main(String[]args){
        int a[] = {1, 5, 2, 1, 6};
        int n = a.length;
        int a1[] = new int[n-1]; // 0 -> n-1
        for(int i=0; i<n-1; i++){
            a1[i] = a[i];
        }
        int a2[] = new int[n-1]; // 1 -> n
        for(int i=1; i<n; i++){
            a2[i-1] = a[i];
        }

        int includeF = helper(a1, n-2);
        int excludeF = helper(a2, n-2);

        System.out.print(Math.max(includeF, excludeF));

    }
}
