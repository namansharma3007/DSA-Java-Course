package BinarySearch;

public class NumberOftimesArrayIsRotated {
    static int numberOfrotations(int [] arr, int n){
        int start = 0, end = n-1;
        int ans = Integer.MAX_VALUE;
        int index = -1;
        while(start <= end){
            int mid = start + (end - start)/2;

            // this section is just an optimization code the code will work even without it
            if(arr[start] <= arr[end]){
                if(arr[start] < ans){
                    ans = arr[start];
                    index = start;
                }
                break;
            }

            if(arr[mid] >= arr[start]){
                if(arr[start] < ans){
                    ans = arr[start];
                    index = start;
                }
                start = mid+1;
            } else {
                if(arr[mid] < ans){
                    ans = arr[mid];
                    index = mid;
                }
                end = mid-1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        
    }
}
