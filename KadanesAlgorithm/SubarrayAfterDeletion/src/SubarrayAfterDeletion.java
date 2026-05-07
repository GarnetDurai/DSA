//o(n^2)
import java.util.*;
public class SubarrayAfterDeletion {
    public static int findMax(int a[]){
        int max = Integer.MIN_VALUE;
        for(int x : a){
            int curr = 0;
            for(int val : a){
                if(val == x)continue;
                if(curr < 0)curr = 0;
                curr += val;
                max = Math.max(curr, max);
            }
        }
        return max;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a[] = {1, -2, 3, 4, -2, 3};
        System.out.print(findMax(a));
    }
}
