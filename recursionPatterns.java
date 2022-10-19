public class recursionPatterns {
    public static void main(String[] args) {
        // starPattern(4);
        // starPattern2(5, 0);
        starPattern3(5, 0);
    }


    // *****
    // ****
    // ***
    // **
    // *
    static void starPattern(int lines){
        if(lines == 0){
            System.out.print("*");
            return;
        }

        for (int i = lines; i >=0; i--) {
            System.out.print("*");
        }
        System.out.println();
        starPattern(lines-1);
    }

    // OR

    


    static void starPattern2(int row, int col){
        if(row == 0){
            return;
        }
        if(col < row){
            System.out.print("*");
            starPattern2(row, col+1);
        } else {
            System.out.println();
            starPattern2(row-1, 0);
        }
    }

// *
// **
// ***
// ****
// *****
    static void starPattern3(int row, int col){
        if(row == 0){
            return;
        }
        if(col < row){
            starPattern3(row, col+1);
            System.out.print("*");
        } else {
            starPattern3(row-1, 0);
            System.out.println();
        }
    }
    
}
