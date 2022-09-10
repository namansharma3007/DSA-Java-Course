public class Recursion {
    public static void main(String[] args) {
        // print a series of no: 1 2 3 4 5
      printNo(1);
    }

    static void printNo(int n){
        if(n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        printNo(n+1);
    }
}