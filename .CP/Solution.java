import java.io.*;
import java.util.*;

public class Solution {
    // Flag to determine whether to use file I/O or console I/O
    private static final boolean USE_FILE_IO = filesExist(); 

    public static final FastReader fr = USE_FILE_IO ? new FastReader("input.txt") : new FastReader();
    public static final FastWriter fw = USE_FILE_IO ? new FastWriter("output.txt") : new FastWriter();

    final static int mod = (int) 1e9 + 7;

    // Method to check if input, output, and expected files exist
    private static boolean filesExist() {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");
        File expectedFile = new File("expected.txt");
        return inputFile.exists() && outputFile.exists() && expectedFile.exists();
    }

    // Fast input class for efficient reading of input
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        // Constructor for file-based input
        public FastReader(String file) {
            try {
                br = new BufferedReader(new FileReader(file));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        // Constructor for console input
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        public void close() throws IOException {
            br.close();
        }
    }

    // Fast output class for efficient writing of output
    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter(String file) {
            BufferedWriter tempBw = null; // Temporary variable
            try {
                tempBw = new BufferedWriter(new FileWriter(file));
            } catch (IOException e) {
                e.printStackTrace();
            }
            bw = tempBw; 
        }

        // Constructor for console output
        public FastWriter() {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object obj) throws IOException {
            bw.write(obj.toString());
        }

        public void println(Object obj) throws IOException {
            bw.write(obj.toString());
            bw.write("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }

    private static void checkOutput() throws IOException {
        BufferedReader outputReader = new BufferedReader(new FileReader("output.txt"));
        BufferedReader expectedReader = new BufferedReader(new FileReader("expected.txt"));

        String outputLine, expectedLine;

        int lineNum = 1;
        boolean allPassed = true;

        while ((outputLine = outputReader.readLine()) != null && (expectedLine = expectedReader.readLine()) != null) {
            if (!outputLine.trim().equals(expectedLine.trim())) {
                System.out.println("Test case failed at line: " + lineNum);
                System.out.println("Expected: " + expectedLine);
                System.out.println("Found: " + outputLine);
                System.out.println("--------------------------------------------------------------------------------->");
                allPassed = false;
            }
            lineNum++;
        }

        if (allPassed && (outputReader.readLine() == null) && (expectedReader.readLine() == null)) {
            System.out.println("All test cases passed!");
        } else if (allPassed) {
            System.out.println("Mismatch in the number of lines in output and expected result.");
        }

        outputReader.close();
        expectedReader.close();
    }
    
    @SafeVarargs
    public static final <T extends Number & Comparable<T>> T max(T... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("No numbers provided");
        }
    
        T max = numbers[0];
        for (T num : numbers) {
            if (num.compareTo(max) > 0) {
                max = num;
            }
        }
        return max;
    }
    
    @SafeVarargs
    public static final <T extends Number & Comparable<T>> T min(T... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("No numbers provided");
        }
    
        T min = numbers[0];
        for (T num : numbers) {
            if (num.compareTo(min) < 0) {
                min = num;
            }
        }
        return min;
    }
    
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
    public static boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i)
                    isPrime[j] = false;
            }
        }
        return isPrime;
    }
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    
    public static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    
    public static long lcm(int a, int b) {
        return (a / gcd(a, b)) * (long) b;
    }
    
    public static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
    public static int[][] leetcodeInput(String input) {
        input = input.trim();
        if (input.startsWith("[[") && input.endsWith("]]")) {
            String[] rows = input.substring(2, input.length() - 2).split("\\],\\[");
            int[][] result = new int[rows.length][];
            for (int i = 0; i < rows.length; i++) result[i] = parseRow(rows[i]);
            return result;
        } else if (input.startsWith("[") && input.endsWith("]")) {
            return new int[][] { parseRow(input.substring(1, input.length() - 1)) };
        }
        throw new IllegalArgumentException("Invalid format");
    }
    
    private static int[] parseRow(String row) {
        String[] values = row.trim().split(",");
        int[] result = new int[values.length];
        for (int i = 0; i < values.length; i++) result[i] = Integer.parseInt(values[i].trim());
        return result;
    }
    
    static class Pair<K, V> {
        private K key;
        private V value;
                
        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }
                
        public K getKey() {
            return key;
        }
                
        public V getValue() {
            return value;
        }
            
        public void setKey(K key){
            this.key = key;
        }
            
        public void setValue(V value){
            this.value = value;
        }
    }

    public static void main(String[] args) throws IOException {
        // Number of test cases
        int t = 1;
        t = fr.nextInt();
                
        for (int i = 1; i <= t; i++) {
            solve(i);
        }
        
        fr.close();
        fw.close();

        if (USE_FILE_IO) { 
           checkOutput(); // Compare output.txt with expected.txt only if using file I/O
       }
    }
    

    private static void solve(int test_case) throws IOException {
        
    }
}