package BinarySearch;

public class FindNthRoot {
    public static int NthRoot(int n, int m) {
        int start = 1, end = m;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int val = power(mid, n, m);
            if(val == 1){
                return mid;
            } else if(val == 0){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }

    public static int power(int base, int exponent, int check) {
        long ans = 1;
        for(int i=1;i<=exponent;i++){
            ans*=base;
            if(ans > check) return 2;
        }
        if(ans == check) return 1;
        return 0;
    }
}
