public class max {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 13, 10, 9, 7};
        System.out.println(maxRange(arr,2,6));
    }

    // imagin array is not empty : int max = Integer.MIN_VALUE;
    static int maxRange(int [] arr, int start, int end){

        if(arr == null) return -1;
        int maxVal=arr[0];
        for (int i = start; i < end; i++) {
            if(arr[i]>maxVal) maxVal = arr[i];
        }
        return maxVal;
    }
    static int max(int [] arr){

        if(arr.length == 0) return -1;
        int maxVal=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>maxVal) maxVal = arr[i];
        }
        return maxVal;
    }
}
