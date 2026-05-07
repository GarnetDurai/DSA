import java.util.*;
public class revTop {
    // Reverse Topo sort -> Not in loop -> Eventually end safe
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            int outDegree[] = new int[n];
            ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
            for(int i=0; i<n; i++){
                adj.add(new ArrayList<>());
            }
            for(int i=0; i<m; i++){
                int u = sc.nextInt();
                int v = sc.nextInt();
                outDegree[u]++;
                adj.get(v).add(u);//reverse graph
            }
            List<Integer>l = new ArrayList<>();
            Queue<Integer>q = new LinkedList<>();
            for(int i=0 ;i<n; i++){
                if(outDegree[i] == 0)q.offer(i);
            }
            while(!q.isEmpty()){
                int u = q.poll();
                l.add(u);
                for(int v : adj.get(u)){
                    outDegree[v]--;
                    if(outDegree[v] == 0)q.offer(v);
                }

            }
            Collections.sort(l);
            if(l.size() == 0){
                System.out.print("No safe employees found");
                return;
            }
            for(int val : l)System.out.print(val + " ");


        }
    }

