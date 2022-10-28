import java.util.Arrays;

public class quickSortRecursion {
    public static void main(String[] args) {
        int [] arr = {10,9,8,8,7};
        quickSort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int [] arr, int row, int col){
        if(row == 0){
            return;
        }
        if(col < row){
            if(arr[col] > arr[col+1]){
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
            quickSort(arr, row, col+1);
        } else {
            quickSort(arr, row-1, 0);
        }
    }
}
