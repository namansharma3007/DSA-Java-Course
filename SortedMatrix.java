import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int [][] matrix ={{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        System.out.println(Arrays.toString(search(matrix, 15)));
    }
    

    // search in the row provided between the cols provided
    static int[] binarySearch(int [][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart)/2;
            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            }
            if(matrix[row][mid] < target){
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] search(int [][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length; // matrix may be empty

        if(rows == 1){
            return binarySearch(matrix, 0, 0, cols - 1, target);
        } 

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols/2;
        // run the loop till two rows will be remaining
        while(rStart < (rEnd - 1)) { // while this is true more than 2 rows will be remaining
            int mid = rStart + (rEnd - rStart)/2;
            if(matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            }
            if(matrix[mid][cMid] < target){
                rStart = mid;
            } else {
                rEnd = mid;
            }

            // now we have 2 rows
            // check weather the target is in the cols of 3 rows
            if(matrix[rStart][cMid] == target){
                return new int[]{rStart, cMid};
            }
            if(matrix[rStart+1][cMid] == target){
                return new int[]{rStart+1, cMid};
            }

            // search in 1st half
            if(target <= matrix[rStart][cMid - 1]){
                return binarySearch(matrix, rStart, 0, cMid - 1, target);
            }
            // search in 2nd half
            if(target >= matrix[rStart][cMid + 1] && target <=matrix[rStart][cols - 1]){
                return binarySearch(matrix, rStart, cMid+1, cols - 1, target);
            }
            // search in 3rd half
            if(target <= matrix[rStart+1][cMid - 1]){
                return binarySearch(matrix, rStart+1, 0, cMid - 1, target);
            }
            // search in 4th half
            // if(target >= matrix[rStart+1][cMid + 1])
            else {
                return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
            }

        }    

        return new int[]{1, -1};
    }
}
