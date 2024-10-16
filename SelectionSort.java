import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr ={5,6,2,7,9};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            // find the maximum item in the remaining array ans swap with the correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr, maxIndex, last);
        }
    }
    //1,2,3,4,5,6,9

    static int getMaxIndex(int [] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }

        return max;
    }

    static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}