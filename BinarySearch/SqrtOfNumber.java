package BinarySearch;

public class SqrtOfNumber {
    public static int floorSqrt(int n) {
        int low = 1, high = n;
        int ans = 1;
        //Binary search on the answers:
        while (low <= high) {
            long mid = (low + high) / 2;
            long val = mid * mid;
            if (val <= (long)(n)) {
                //eliminate the left half:
                ans = (int)(mid);
                low = (int)(mid + 1);
            } else {
                //eliminate the right half:
                high = (int)(mid - 1);
            }
        }
        // return ans;
        return high;
    }
}
