package Bellman_Ford_Algorithm;

/*
 * only works for directed graphs
 * mainly used for -ve edges; in this scenario dijkstra fails so Bellman_Ford_Algorithm works
 * can detect -ve cycles.
 */

import java.util.*;

public class Main {
    static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> edges, int S) {
        // Write your code here
        int [] dist = new int[V];
        Arrays.fill(dist, (int)1e8);
        dist[S] = 0;
        for(int i=1;i<=V-1;i++){
            for(ArrayList<Integer> e:edges){
                int u = e.get(0);
                int v = e.get(1);
                int w = e.get(2);
                
                if(dist[u] != (int)1e8 && dist[u] + w < dist[v]){
                    dist[v] = dist[u] + w;
                }
            }
        }

        // detecting -ve cycles in graph
        for(ArrayList<Integer> e:edges){
            int u = e.get(0);
            int v = e.get(1);
            int w = e.get(2);
                
            if(dist[u] != (int)1e8 && dist[u] + w < dist[v]){
                return new int[]{-1};
            }
        }
        
        
        return dist;
    }
}