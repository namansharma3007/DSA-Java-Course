import java.util.*;

public class mazeProblem {
    public static void main(String[] args) {
        // System.out.println(count(3,3));

        // path("",3,3);
        // ArrayList<String> result = pathRet("",3,3);
        // System.out.println(result);

        // System.out.println(pathDiagonalRet("", 3,3));

        boolean [][] maze = {
                        {true,true,true},
                        {true,false,true},
                        {true,true,true}
                        };
        pathObstacles("", maze, 0, 0);

    }

    static int count(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }

        int left = count(r-1,c);
        int right = count(r, c-1);

        return left + right;
    }

    static void path(String p,int row, int col){
        if(row == 1 && col == 1){
            System.out.println(p);
            return;
        }

        if(row > 1){
            path(p + "D", row-1, col);
        }

        if(col > 1){
            path(p + "R", row, col-1);
        }
    }

    static ArrayList<String> pathRet(String p,int row, int col){
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        
        if(row > 1){
            ans.addAll(pathRet(p + "D", row-1, col));
        }

        if(col > 1){
            ans.addAll(pathRet(p + "R", row, col-1));
        }

        return ans;
    }

    static ArrayList<String> pathDiagonalRet(String p,int row, int col){
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        
        if(row > 1){
            ans.addAll(pathDiagonalRet(p + "V", row-1, col));
        }

        if(col > 1){
            ans.addAll(pathDiagonalRet(p + "H", row, col-1));
        }
        if(row > 1 && col > 1){
            ans.addAll(pathDiagonalRet(p + "D", row-1, col-1));
        }

        return ans;
    }


    static void pathObstacles(String p,boolean [][] maze, int row, int col){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(p);
            return;
        }

        if(!maze[row][col]){
            return;
        }

        if(row < maze.length - 1){
            pathObstacles(p + "D",maze, row+1, col);
        }

        if(col < maze[0].length - 1){
            pathObstacles(p + "R",maze,  row, col+1);
        }
    }
}
