public class recursive {
    public static int helper(int i, int j){
        if(i == 0 && j == 0)return 1;
        if(i < 0 || j < 0)return 0;
        return helper(i-1, j) + helper(i, j-1);
    }
    public static void main(String[]args){
        int n = 3;
        int m = 7;
        System.out.print(helper(n-1, m-1));
    }
}
