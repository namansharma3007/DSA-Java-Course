
public class Pattern {
    public static void main(String[] args) {
        int n = 4;
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern28(n);
        pattern30(n);
        pattern17(n);
        pattern31(n);
    }

        // * * * * 
        // * * * *
        // * * * *
        // * * * *
    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    // * 
    // * *
    // * * *
    // * * * *
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


    // * * * * 
    // * * *
    // * *
    // *
    static void pattern3(int n){
        for (int row = n; row >= 1; row--) {
            for (int col = row; col >= 1; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    // 1 
    // 1 2
    // 1 2 3
    // 1 2 3 4
    static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    
    // * 
    // * *
    // * * *
    // * * * *
    // * * *
    // * *
    // *

    static void pattern5(int n){
        // for (int row = 1; row <= n; row++) {
        //     for (int col = 1; col <= row; col++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for (int row = n - 1; row >= 1; row--) {
        //     for (int col = row; col >= 1; col--) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        for (int row = 1; row <= 2*n; row++) {
            int totalColsInRow = row > n ? 2*n - row : row;
            for (int col = 1; col <= totalColsInRow ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //      * 
    //     * *
    //    * * *
    //   * * * *
    //    * * *
    //     * *
    //      *
  
    static void pattern28(int n){
        for (int row = 1; row <= 2* n; row++) {
            int totalColumns = row > n ? 2*n - row : row;

            int totalSpaces = n - totalColumns;
            for (int s = 1; s <= totalSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColumns; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    //      1
    //     212
    //    32123
    //   4321234
    static void pattern30(int n){
        for (int row = 1; row <= n; row++) {
            
            for (int spaces = 0; spaces < n - row; spaces++) {
                System.out.print(" ");
            }
            for (int col = row; col >=1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
            
        }
    }


//      1
//     212
//    32123
//   4321234
//    32123
//     212
//      1
  
    static void pattern17(int n){
        for (int row = 1; row <= 2*n; row++) {

            int c = row > n ? 2*n - row: row;

            for (int s = 1; s <= n - c; s++) {
                System.out.print(" ");
            }
            for (int col = c; col >=1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col);
            }
            System.out.println();
            
        }
    }
    

    // 444444444
    // 433333334
    // 432222234
    // 432111234
    // 432101234
    // 432111234
    // 432222234
    // 433333334
    // 444444444
    static void pattern31(int n){
        int originalN = n;
        n = 2*n;
        for (int rows = 0; rows <= n ; rows++) {
            for (int cols = 0; cols <= n; cols++) {
                int atEveryIndex = originalN - Math.min(Math.min(rows,cols), Math.min(n - rows,n - cols));
                System.out.print(atEveryIndex);
            }
            System.out.println();
        }
    }
    
}
