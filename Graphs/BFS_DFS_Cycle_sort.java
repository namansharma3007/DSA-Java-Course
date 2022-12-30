package Graphs;

import java.util.*;

import javax.swing.text.html.BlockView;

public class BFS_DFS_Cycle_sort {
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


    public static void bfs(ArrayList<Edge> [] graph){
        boolean [] visited = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if(!visited[i]){
                bfsUtil(graph, visited);
            }
        }
    }

    public static void bfsUtil(ArrayList<Edge> [] graph, boolean [] visited){ 
        Queue<Integer> q = new LinkedList<>();

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


    // this is main BFS function
    public static void BFS(ArrayList<Edge> [] graph){ // O(N) = O(V+E)
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

    public static void dfs(ArrayList<Edge> [] graph){
        boolean visited [] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            dfsUtil(graph, i, visited);
        }
    }


    public static void dfsUtil(ArrayList<Edge> [] graph, int current, boolean [] visited){
        // O(V+E)
        // visit
        System.out.print(current + " ");
        visited[current] = true;
        for (int i = 0; i < graph[current].size(); i++) {
            Edge e = graph[current].get(i);
            if(!visited[e.dest]){
                DFS(graph, e.dest, visited);
            }
        }
    }
    // this is main DFS function
    public static void DFS(ArrayList<Edge> [] graph, int current, boolean [] visited){
        // O(V+E)
        // visit
        System.out.print(current + " ");
        visited[current] = true;
        for (int i = 0; i < graph[current].size(); i++) {
            Edge e = graph[current].get(i);
            if(!visited[e.dest]){
                DFS(graph, e.dest, visited);
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

    //https://practice.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean [] vis = new boolean[V];
        
        for(int i = 0; i < V; i++){
            if(!vis[i]){
                if(dfs(i, adj, vis, -1)){
                    return true;
                }
            }
        }
    return false;
    }
    public boolean dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean [] vis, int parent){
        vis[v] = true;
        
        for(Integer neighbour: adj.get(v)){
            if(!vis[neighbour]){
                if(dfs(neighbour, adj, vis, v)){
                    return true;
                } 
            }else if(parent != neighbour){
                    return true;
                }
        }
        return false;
    }


    // https://practice.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1
     // Function to detect cycle in a directed graph.
     public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[V];
        boolean recS[] = new boolean[V];
        
        for(int i=0;i<V;i++){
            if(!vis[i]){
                if(dfs(i, adj, vis, recS)) return true;
            }
        }
        return false;
    }
    
    public boolean dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean [] vis, boolean [] recS){
        vis[v] = true;
        recS[v] = true;
        
        for(Integer neighbour: adj.get(v)){
            if(!vis[neighbour]){
                if(dfs(neighbour, adj, vis, recS))
                    return true;
            } else if(recS[neighbour]){
                return true;
            }
        }
        recS[v] = false;
        return false;
    }

    // topologocal sort
    // https://practice.geeksforgeeks.org/problems/topological-sort/1
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        boolean vis[] = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<V;i++){
            if(!vis[i]){
                dfs(adj, i, stack, vis);
            }
        }
        int ans[] = new int[V];
        int i=0;
        while(!stack.isEmpty()){
            ans[i++] = stack.pop();
        }
        
        return ans;
        
    }
    
    static void dfs(ArrayList<ArrayList<Integer>> adj, int v, Stack<Integer> stack, boolean [] vis){
        vis[v] = true;
        for(int neighbour: adj.get(v)){
            if(!vis[neighbour]){
                dfs(adj, neighbour, stack, vis);
            }
        }
        stack.push(v);
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
