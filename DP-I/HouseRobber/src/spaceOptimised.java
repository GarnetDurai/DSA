public class spaceOptimised {
    public static void main(String[]args){
        int a[] = {2, 1, 4, 9};
        int n = a.length;
        int prev = a[0];
        if(n == 1){
            System.out.print(a[0]);
            return;
        }
        int prev1 = Math.max(a[0], a[1]);
        for(int i=2; i<n; i++){
            int curr =Math.max(a[i] + prev, prev1);
            prev = prev1;
            prev1 = curr;
        }
        System.out.print(prev1);

    }
}
