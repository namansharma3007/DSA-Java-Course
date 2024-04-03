import java.util.*;

public class Main {
    public int[][] reconstructQueue(int[][] people) {
        int n = people.length;
        int [][] ans = new int[n][2];
        boolean visited[] = new boolean[n];
        Arrays.sort(people, (a, b)-> (a[0]-b[0] == 0 ? a[1]-b[1]:a[0]-b[0]));

        for(int i=0;i<n;i++){
            int count = 0;
            int index = 0;
            while(count != people[i][1]){
                if(!visited[index++]){
                    count++;
                }
            }
            ans[index] = people[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int [][] arr = 
    }
}