import java.util.*;
public class mergeArr {
        public static double median(int[] arr1, int[] arr2) {
            List<Integer>l = new ArrayList<>();
            int i=0;
            int j=0;
            while(i < arr1.length && j < arr2.length){
                if(arr1[i] < arr2[j]){
                    l.add(arr1[i++]);
                }else{
                    l.add(arr2[j++]);
                }
            }
            while(i < arr1.length)l.add(arr1[i++]);
            while(j < arr2.length)l.add(arr2[j++]);
            int n = l.size();
            if(n%2 == 0){
                int x = l.get(n/2);
                int y = l.get((n/2)-1);
                double ans = (double)(((double)x+(double)y)/2);
                return ans;
            }else{
                int x = l.get(n/2);
                return x;
            }
        }
        public static void main(String[]args){
            int a[] = {2, 4, 6};
            int b[] = {1, 3, 5};
            System.out.print(median(a,b));
        }


}
