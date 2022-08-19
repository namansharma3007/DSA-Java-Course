import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 6, 9, 10 };
        swap(arr, 1, 4);

        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    // reverse an array
    static void reverse(int [] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
