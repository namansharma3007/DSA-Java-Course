import java.util.*;

public class backTracking {
    public static void main(String[] args) {
        boolean [][] maze = {
            {true,true,true},
            {true,true,true},
            {true,true,true}
            };
            // allPath("", maze, 0, 0);
            // backTrackingPaths("", maze, 0, 0);
            int [][] path = new int[maze.length][maze[0].length];
            backTrackingPathsPrint("", maze, 0, 0, path, 1);
    }
    // STACK OVERFLOW FOR THIS CASE
    static void allPath(String p, boolean [][] maze, int row, int col){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(p);
            return;
        }

        if(!maze[row][col]) {
            return;
        }

        if(row < maze.length - 1){
            allPath( p+ "D", maze, row + 1, col);
        }
        if(col < maze[0].length - 1){
            allPath( p+ "R", maze, row, col + 1);
        }

        if(row > 0){
            allPath( p+ "U", maze, row - 1, col);
        }

        if(col > 0){
            allPath( p+ "L", maze, row, col - 1);
        }

    }
    static void backTrackingPaths(String p, boolean [][] maze, int row, int col){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(p);
            return;
        }

        if(!maze[row][col]) {
            return;
        }

        // I am considering this block in my path
        maze[row][col] = false;

        if(row < maze.length - 1){
            backTrackingPaths( p+ "D", maze, row + 1, col);
        }
        if(col < maze[0].length - 1){
            backTrackingPaths( p+ "R", maze, row, col + 1);
        }

        if(row > 0){
            backTrackingPaths( p+ "U", maze, row - 1, col);
        }

        if(col > 0){
            backTrackingPaths( p+ "L", maze, row, col - 1);
        }

        // this line is where the function will be over
        // so before th function gets removed, also reverse the changes that were made by that function;

        maze[row][col] = true;
    }


    static void backTrackingPathsPrint(String p, boolean [][] maze, int row, int col, int [][]path, int step){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            path[row][col] = step;
            for(int [] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[row][col]) {
            return;
        }
        maze[row][col] = false;

        path[row][col] = step;

        if(row < maze.length - 1){
            backTrackingPathsPrint( p+ "D", maze, row + 1, col, path, step + 1);
        }
        if(col < maze[0].length - 1){
            backTrackingPathsPrint( p+ "R", maze, row, col + 1, path, step + 1);
        }

        if(row > 0){
            backTrackingPathsPrint( p+ "U", maze, row - 1, col, path, step + 1);
        }

        if(col > 0){
            backTrackingPathsPrint( p+ "L", maze, row, col - 1, path, step + 1);
        }

        maze[row][col] = true;
        path[row][col] = 0;
    }
}
