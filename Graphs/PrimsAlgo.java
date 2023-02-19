package Graphs;
import java.util.*;


// Minimum Spanning tree
class Pair implements Comparable<Pair>{
    int wt;
    int v;
    Pair(int v, int wt){
        this.v = v;
        this.wt = wt;
    }
    @Override
    public int compareTo(Pair o) {
        return this.wt-o.wt;
    }

}

public class PrimsAlgo {
    public int spanningTree(int v, ArrayList<ArrayList<ArrayList<Integer>>> adj){
        boolean visited [] = new boolean[v];
        PriorityQueue<Pair> q = new PriorityQueue<>();
        q.add(new Pair(0, 0));
        int ans = 0;

        while(q.size() != 0){
            Pair curr = q.remove();

            int u = curr.v;
            if(visited[u]){
                continue;
            }

            ans+=curr.wt;
            visited[u] = true;
            ArrayList<ArrayList<Integer>> neighbours = adj.get(u);


            for (ArrayList<Integer> list:neighbours) {
                int vertex = list.get(0);
                int wt = list.get(1);
                if(visited[vertex] == false){
                    q.add(new Pair(vertex, wt));
                }
            }
        }
        return ans;
    }
}
