import java.util.ArrayList;

public class Mathematics {
    public static void main(String[] args) {
        // System.out.println(isPrime(6));

        int n = 40;
        boolean[] prime = new boolean[n + 1];
        // sievePrime(n, prime);

        // System.out.println(squareRoot(6));
        // System.out.println(squareRootDecimal(40, 3));
        // System.out.println(newtonRapsonMethod(40));
        // factors1(20);
        // factors3(20);
        // System.out.println(gcd(40,9));
        System.out.println(lcm(90,9));
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

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid * mid == n) {
                return mid;
            }

            if (mid * mid > n) {
                end = mid - 1;
            }

            else {
                start = mid + 1;
                root = mid;
            }
        }
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += incr;
            }

            root -= incr;
            incr /= 10;
        }

        return root;
    }

    // Newton Rapson Method
    // root = (X + (n/x))/2 : x = guess we are making
    // O(log(n)F(N)) : F(N) = cost of calculating f(N)/f`(N)
    static double newtonRapsonMethod(double n) {

        double x = n;
        double root;
        while (true) {
            root = 0.5 * (x + (n / x));
            if (Math.abs(root - x) < 0.5) {
                break;
            }

            x = root;
        }

        return root;
    }

    // Factors of a number
    static void factors1(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // O(sqrt(n))
    static void factors2(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i){
                    System.out.print(i + " ");
                }
                else{
                    System.out.print(i + " " + n / i + " ");
                }
            }
        }
    }
    // both time and space will be sqrt(n)
    static void factors3(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i){
                    System.out.print(i + " ");
                }
                else{
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size() - 1; i >=0; i--) {
            System.out.print(list.get(i)+" ");
        }
    }

    // euclid's algorithm to find HCF/GCD
    static int gcd(int a, int b){
        if(a == 0) {
            return b;
        }
        return gcd(b%a, a);
    }

    static int lcm(int a, int b){
        return a*b/gcd(a,b);
    }
}