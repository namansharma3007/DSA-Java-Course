import java.util.Arrays;

public class mergeSort {
    // divide array into two parts then get both the parts sorted then merge both
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        arr = mSort(arr);
        // int [] ans = mSort(arr); // Now, try printing original array, it would not have been modified
        System.out.println(Arrays.toString(arr));
    }

    static int[] mSort(int [] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;
        int [] left = mSort(Arrays.copyOfRange(arr, 0, mid));
        int [] right = mSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int [] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[k];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // it may be case that one of  the arrays is not complete
        // copy the remaining elements
        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        
        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}
