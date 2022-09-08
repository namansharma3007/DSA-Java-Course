public class Recursion {
    public static void main(String[] args) {
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
