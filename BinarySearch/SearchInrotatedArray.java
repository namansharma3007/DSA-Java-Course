package BinarySearch;

public class SearchInrotatedArray {
    public static int uniqueArray(int[] arr, int n, int k) {
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == k) {
                return mid;
            }

            if (arr[mid] >= arr[start]) {
                if (arr[start] <= k && k <= arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] <= k && arr[end] >= k) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    public static boolean duplicateArray(int[] arr, int n, int k) {
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == k) {
                return true;
            }
            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                start++;
                end--;
                continue;
            }

            if (arr[mid] >= arr[start]) {
                if (arr[start] <= k && k <= arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] <= k && arr[end] >= k) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 8, 9, 10, 1, 2, 3, 4, 5, 6 };
        int[] arr2 = { 7,8,9,1,2,2,2,3,3,4,5,6};
        int ans = uniqueArray(arr, arr.length, 7);
        boolean val = duplicateArray(arr2, arr2.length, 3);
        System.out.println(val);
    }
}
