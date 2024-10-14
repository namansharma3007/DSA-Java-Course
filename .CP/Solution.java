import java.io.*;
import java.util.*;

public class Solution {
    public static final FastReader fr = new FastReader();
    public static final FastWriter fw = new FastWriter();

    // Fast input class for efficient reading of input
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

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
        int t = fr.nextInt();
        for (int i = 1; i <= t; i++) {
            solve(i);
        }
        fr.close();
        fw.close();
    }

    private static void solve(int test_case) throws IOException {

    }
}