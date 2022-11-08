public class backTracking {
    public static void main(String[] args) {
        boolean [][] maze = {
            {true,true,true},
            {true,true,true},
            {true,true,true}
            };
            // allPath("", maze, 0, 0);
            backTrackingPaths("", maze, 0, 0);
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
}
