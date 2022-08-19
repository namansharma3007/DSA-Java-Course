public class Binary_search {

    public static void main(String[] args) {
        // ascending order
        int[] arr = { -18, -14, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 45, 67, 89 };
        // descending order
        int[] arr2 = { 90, 80, 68, 56, 45, 8, 7, 6, 5, 0, -1, -45, -70 };
        int target = 8;
        int index = binarySearch(arr, target);
        System.out.println(index);

        // for descending order
        int index2 = orderAgnosticBinarySearch(arr2, target);
        System.out.println(index2);
    }

    // return index
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element
            // int mid = (start+end)/2;
            // integer has a fixed size: so as to overcome the issue of exceeding this is
            // done
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

    // when we dont know weaher the array is sorted in ascending or descending order
    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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
}
