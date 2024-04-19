package Dijkstra_Algorithm;

import java.util.*;

class Pair {
    int distance, node;

    public Pair(int distance, int node) {
        this.distance = distance;
        this.node = node;
    }
}

public class Dijkstra {
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> x.distance - y.distance);

        int[] dist = new int[V];
        
        for(int i=0;i<V;i++){
            dist[i] = (int)(1e9);
        }
        dist[S] = 0;

        pq.offer(new Pair(0, S));

        while(!pq.isEmpty()){
            int distance = pq.peek().distance;
            int node = pq.peek().node;
            pq.poll();

            for(int i=0;i<adj.get(node).size();i++){
                int adjNode = adj.get(node).get(i).get(0);
                int edgeWeight = adj.get(node).get(i).get(1);

                if(distance + edgeWeight < dist[adjNode]){
                    dist[adjNode] = distance + edgeWeight;
                    pq.offer(new Pair(dist[adjNode], adjNode));
                }
            }
        }
        return dist;
    }
}
