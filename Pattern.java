public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        // pattern1(n);
        // pattern2(n);
        // pattern3(n);
        pattern4(n);
    }

    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // when 1 row is printed, we need to print a new line
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int row = n; row >= 1; row--) {
            for (int col = row; col >= 1; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
