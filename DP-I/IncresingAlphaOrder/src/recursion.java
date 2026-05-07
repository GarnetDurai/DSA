import java.util.*;
public class recursion {
// You are using Java

        public static int helper(char a[][], int i, int j){
            int area = 1;
            int d[][] = {
                    {-1,-1}, {-1,0}, {-1,1}, {0,1}, {1,1}, {1,0}, {1,-1}, {0,-1}
            };
            for(int ds[] : d){
                int ni = i + ds[0];
                int nj = j + ds[1];
                if(ni >= 0 && nj >= 0 && ni < a.length && nj < a[0].length){
                    if(a[i][j] < a[ni][nj]){
                        area = Math.max(area, 1 + helper(a, ni, nj));
                    }
                }
            }

            return area;

        }
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            char a[][] = new char[n][m];
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    a[i][j] = sc.next().charAt(0);
                }
            }
            char s = sc.next().charAt(0);
            int max = Integer.MIN_VALUE;
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(a[i][j] == s){
                        int val = helper(a, i, j);
                        System.out.println();
                        max = Math.max(val, max);
                    }
                }
            }
            System.out.print(max);
        }
    }

