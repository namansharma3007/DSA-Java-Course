package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class PeakElement {

    // unique elements in the array and multiple peeks available as well as single peek
    public static int findPeakElement(ArrayList<Integer> arr) {
        int n = arr.size();
        if(n == 1) return 0;
        
        if(arr.get(0) > arr.get(1)) return 0;
        if(arr.get(n-1) > arr.get(n-2)) return n-1;

        int start = 1;
        int end = n-2;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr.get(mid) > arr.get(mid-1) && arr.get(mid) > arr.get(mid+1)){
                return mid;
            }

            if(arr.get(mid) > arr.get(mid-1)){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 8, 1, 5, 3));
        System.out.println(findPeakElement(arr));
    }
}
