import java.util.*;
public class recursiveWay {
    public static int helper(int n){
        if(n == 0)return 0;
        if(n == 1)return 1;
        return helper(n-1) + helper(n-2);
    }
    public static void main(String[]args) {
        int n = 5;
        System.out.print(helper(n));
    }
}
