import java.util.*;

public class Power {
    final static int mod = (int)1e9 + 7;
    public static long power(long base, long exp) {
        long result = 1;
        base = base % mod;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }
    
}