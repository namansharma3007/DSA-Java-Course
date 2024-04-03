package BinarySearch;

public class MinimumInRotatedSortedArray {
    static int minimumNumberUniqueArray(int [] arr, int n){
        int start = 0, end = n-1;
        int min = -1;
        while(start <= end){
            int mid = start + (end + start)/2;

            if(arr[mid] >= arr[start]){
                min = arr[start];
                start = mid+1;
            } else {
                end = mid;
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
