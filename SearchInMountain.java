public class SearchInMountain {

    static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {
        // weather array is ascendind or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // find the middle element
            // int mid = (start+end)/2;
            // integer has a fixed size: so as to overcome the issue of exceeding this is
            // done
            int mid = start + (end - start) / 2;

            // common statement
            if (arr[mid] == target)
                return mid;

            if (isAsc) {
                if (target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (target > arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }

        }

        return -1;
    }

    static int peakSearch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1])
                end = mid;
            else if (arr[mid] < arr[mid + 1])
                start = mid + 1;

        }

        return end;
    }

    static int result(int [] arr,int target){
        int peak = peakSearch(arr);
        int firstTry = orderAgnosticBinarySearch(arr,target, 0, peak);
        if(firstTry !=0) return firstTry;
        int seconTry = orderAgnosticBinarySearch(arr, target, peak+1, arr.length-1);
        return seconTry;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(result(arr, target));
        
    }
}
