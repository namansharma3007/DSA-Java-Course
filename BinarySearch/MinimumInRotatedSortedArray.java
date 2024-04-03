package BinarySearch;

public class MinimumInRotatedSortedArray {
    static int minimumNumberUniqueArray(int [] arr, int n){
        int start = 0, end = n-1;
        int min = Integer.MAX_VALUE;
        while(start <= end){
            int mid = start + (end - start)/2;

            // this section is just an optimization code the code will work even without it
            if(arr[start] <= arr[end]){
                min = Math.min(min, arr[start]);
                break;
            }

            if(arr[mid] >= arr[start]){
                min = Math.min(min, arr[start]);
                start = mid+1;
            } else {
                min = Math.min(min, arr[mid]);
                end = mid-1;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int [] arr = {7,8,9,10,1,2,3,4,5,6};
        int ans = minimumNumberUniqueArray(arr, arr.length);
        System.out.println(ans);
    }
}
