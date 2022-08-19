public class rotationCount {
    public static void main(String[] args) {
        int [] nums = {4,5,6,7,0,1,2};
        System.out.println(countRotations(nums));
    }

    static int countRotations(int [] arr){
        int pivot = findPivot(arr);
        return pivot + 1;
    }

     // will not work for duplicate values

     static int findPivot(int [] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if(mid < end && arr[mid] > arr[mid+1])
                return mid;
            if(mid > start && arr[mid] < arr[mid-1])
                return mid-1;
            if(arr[mid] <=  arr[start])
                end = mid-1;
            else 
                start = mid + 1;

        }
        return -1;
    }

    // with dulicates
    static int findPivotWithDuplicates(int [] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if(mid < end && arr[mid] > arr[mid+1])
                return mid;
            if(mid > start && arr[mid] < arr[mid-1])
                return mid-1;
            
            // if elements at middle, start, end are equal skip the dulicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
            // skip the duplicates
            //NOTE: what if these elements at start ans end were pivot
            // check if start is pivot
            if(arr[start] > arr[start+1]) {
                return start;
            }
                start++;

            // if end is pivot
            if(arr[end] < arr[end-1]){
                return end - 1;
            }
                end--;
            }
            // left side os sorted, so pivo should be in the right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid+1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }
    static int search(int [] arr, int target){
        int pivot = findPivot(arr);

        // if you dont find a pivot, it means the array is not rotated
        if(pivot == -1){
            // just do normal binary search
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        // if pivit is found, yu have found 2 asc sorted arrays
        if(arr[pivot] == target) return pivot;
        if(target >= arr[0]) return binarySearch(arr, target, 0, pivot-1);
        
        return binarySearch(arr, target, pivot+1, arr.length - 1);
        
    }

    static int binarySearch(int [] arr, int target, int start, int end){
       
        while (start <= end) {
            
            int mid = start + (end - start) / 2;
            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;
            else
                return mid;
        }

        return -1;
        }
}
