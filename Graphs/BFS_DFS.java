package Graphs;

import java.util.*;

import javax.swing.text.html.BlockView;

public class BFS_DFS {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph []){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));
    }

    public static void bfs(ArrayList<Edge> [] graph){ // O(N) = O(V+E)
        Queue<Integer> q = new LinkedList<>();
        boolean [] visited = new boolean[graph.length];

        // source = 0
        q.add(0);

        while(!q.isEmpty()){
            int current = q.remove();

            if(!visited[current]) { // visit current
                System.out.print(current+" ");
                visited[current] = true;
                for (int i = 0; i < graph[current].size(); i++) {
                    Edge e = graph[current].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge> [] graph, int current, boolean [] visited){
        // O(V+E)
        // visit
        System.out.print(current + " ");
        visited[current] = true;
        for (int i = 0; i < graph[current].size(); i++) {
            Edge e = graph[current].get(i);
            if(!visited[e.dest]){
                dfs(graph, e.dest, visited);
            }
        }
    }

    public static boolean hasPath(ArrayList<Edge> graph [], int src, int dst, boolean [] visited){ // O(V+E)
        if(src == dst){
            return true;
        }
        visited[src] = true;
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            // e.dest = neighbour
            if(!visited[e.dest] && hasPath(graph, e.dest, dst, visited)){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int V = 7;

        ArrayList<Edge> graph [] = new ArrayList[V];
        createGraph(graph);
        // bfs(graph);
        // dfs(graph, 0, new boolean[V]);
        System.out.println(hasPath(graph, 3, 5, new boolean[V]));
    }
}
