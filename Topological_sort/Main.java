package Topological_sort;

import java.util.*;

public class Main {


    static int[] topoSortBFS(int V, ArrayList<ArrayList<Integer>> adj) {
        int [] indegree = new int[V];
        
        for(ArrayList<Integer> a:adj){
            for(Integer i:a){
                indegree[i]++;
            }
        }
        
        Queue<Integer> q = new LinkedList<>();
        
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i=0;i<V;i++){
            if(indegree[i] == 0){
                q.offer(i);
            }
        }
        
        while(!q.isEmpty()){
            int n = q.poll();
            
            res.add(n);
            
            for(Integer e:adj.get(n)){
                indegree[e]--;
                if(indegree[e] == 0){
                    q.offer(e);
                }
            }
        }
        
        return res.stream().mapToInt(i->i).toArray();
    }

    static int[] topoSortDFS(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> res = new ArrayList<>();
        
        boolean visited [] = new boolean[V];
        
        for(int i=0;i<V;i++){
            if(!visited[i]){
                dfs(adj, i, visited, res);
            }
        }
        Collections.reverse(res);
        return res.stream().mapToInt(i->i).toArray();
    }
    
    static void dfs(ArrayList<ArrayList<Integer>> adj, int node, boolean [] visited, ArrayList<Integer> res){
        visited[node] = true;
        
        for(Integer n:adj.get(node)){
            if(!visited[n]){
                dfs(adj, n, visited, res);
            }
        }
        res.add(node);
    }
}
