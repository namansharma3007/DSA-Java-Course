package UnionFind;

// DSU - Disjoint Set Union

/*
 * disjoint sets: sets whose intersection is null
 * mainly 2 operations:
 *      - combine 2 given sets
 *      - to tell if two members belong to same set or not
 */

public class Main_basicCode {
    
    int [] parent;
    int [] element;

    Main_basicCode(int n){
        this.parent = new int[n];
        this.element = new int[n];
        for (int i = 0; i < n; i++) {
            element[i] = i;
            parent[i] = i;
        }
    }
    int find(int x){
        if(x == parent[x]){
            return x;
        }
        return find(parent[x]);
    }

    void union(int x, int y){
        int x_parent = find(x);
        int y_parent = find(y);

        if(x_parent != y_parent){
            this.parent[x_parent] = y_parent;
        }
    }

    
    public static void main(String[] args) {
        
    }
}
