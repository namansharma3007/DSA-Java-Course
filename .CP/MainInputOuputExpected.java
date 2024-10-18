import java.io.*;
import java.util.*;

public class MainInputOuputExpected {
    // Change this boolean to true for file I/O, false for console I/O
    private static final boolean USE_FILE_IO = true; 

    public static final FastReader fr = USE_FILE_IO ? new FastReader("input.txt") : new FastReader();
    public static final FastWriter fw = USE_FILE_IO ? new FastWriter("output.txt") : new FastWriter();

    final static int mod = (int) 1e9 + 7;

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
        // Write your logic here
    }

    private static void checkOutput() throws IOException {
        BufferedReader outputReader = new BufferedReader(new FileReader("output.txt"));
        BufferedReader expectedReader = new BufferedReader(new FileReader("expected.txt"));
        
        String outputLine, expectedLine;
        
        int lineNum = 1;
        
        boolean allPassed = true;

        while ((outputLine = outputReader.readLine()) != null && (expectedLine = expectedReader.readLine()) != null) {
            if (!outputLine.trim().equals(expectedLine.trim())) {
                System.out.println("Test case -> " + lineNum);
                System.out.println("Expected: " + expectedLine);
                System.out.println("Found: " + outputLine);
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
}