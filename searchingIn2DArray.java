import java.util.Arrays;

public class searchingIn2DArray {
    public static void main(String[] args) {
        int [][] arr={
            {23,5,63},
            {2,56,13,4,96},
            {5,89,1,35,45},
            {56,8,69,8}
        };
        int [] ans =searchTarget(arr, 5);
        // System.out.println(Arrays.toString(ans));
        System.out.println(searchTargetMax(arr));
        
    }

    static int [] searchTarget(int [][] arr,int target){
            if(arr.length == 0) return new int[]{-1,-1};
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if(target == arr[i][j]) return new int[]{i,j};
                }
            }
            return new int[]{-1,-1};
    }

    //max value
    static int searchTargetMax(int [][] arr){
            if(arr.length == 0) return Integer.MIN_VALUE;
            int max = Integer.MIN_VALUE;
            for (int[] element : arr) {
                for (int value: element) {
                    if(max < value) max = value;
                }
            }
            return max;
    }
}
