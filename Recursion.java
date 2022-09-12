public class Recursion {
    public static void main(String[] args) {
    // print a series of no: 1 2 3 4 5
    //   printNo(1);
    
    // find the fibonacci no at a partiular index
    System.out.println(fibonacci(6));
    }

    static void printNo(int n){
        if(n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        // this is tail recursion
        // this is the last function call
        printNo(n+1);
    }
    // recurrence relation
    static int fibonacci(int n){
        if(n < 2) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
} 