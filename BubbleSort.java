import java.util.Arrays;

// Sinking sort
// Exchange sort
// In place sorting algorithms
public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {3,4,5,7,1,2};
        int [] arr2 = {1,2,3,4,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr2));
        
    }

    static void bubble(int [] arr){
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smalller than the previous item
                if(arr[j] < arr[j-1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a paricular value of i, it means array is sorted break the program
            if(!swapped){ // !false == true
                break;
            }
        }
    }
}
