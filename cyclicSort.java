import java.util.Arrays;

// when given nos. from range 1, N => use Cyclic Sort => nos are needed to be in series

public class cyclicSort {
    public static void main(String[] args) {
        int [] arr = {3,5,2,1,4};
        sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void sort(int [] arr){
        for (int i = 0; i < arr.length;) {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            } else {
                i++;
            }
            // just add a search statement according to questions need: normally a for loop will be used
        }
    }
    static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
