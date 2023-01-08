public class Mathematics {
    public static void main(String[] args) {
        // System.out.println(isPrime(6));

        int n = 40;
        boolean[] prime = new boolean[n + 1];
        // sievePrime(n, prime);

        // System.out.println(squareRoot(6));
        System.out.println(squareRootDecimal(40, 3));
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        int c = 2;
        while (c * c <= n) {
            if (n % c == 0)
                return false;
            c++;
        }
        return true;
    }

    static void sievePrime(int n, boolean[] primes) {

        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }

    // finding square root of a no
    static int squareRoot(int n) {
        int start = 0;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == n)
                return mid;
            else if (mid * mid > n)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    // O(log(n))
    static double squareRootDecimal(int n, int p) {
        int start = 0;
        int end = n;

        double root = 0.0;

        while(start <= end){
            int mid = start + (end - start)/2;

            if (mid * mid == n){
                return mid;
            }
            
            if (mid * mid > n){
                end = mid - 1;
            }
                
            else{
                start = mid + 1;
                root = mid;
            }
        }
        double incr  = 0.1;
        for (int i = 0; i < p; i++) {
            while(root * root <= n){
                root += incr ;
            }

            root -= incr ;
            incr /= 10;
        }

        return root;
    }
}
