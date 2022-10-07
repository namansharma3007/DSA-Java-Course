public class Fibonacci_no {

    static int fibo(int n){
        if (n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

    static int fiboFormula(int n){
        // just for demo use long insted
    //    return (int)((Math.pow(((1 + Math.sqrt(5)) / 2),n) - Math.pow(((1 - Math.sqrt(5)) / 2),n)) / Math.sqrt(5));
       return (int)(Math.pow(((1 + Math.sqrt(5)) / 2),n) / Math.sqrt(5)); // removing the less dominating terms
    }
    public static void main(String[] args) {
        // int no = 5;
        // System.out.println(fibo(no));

        // for(int i=0;i<11;i++){
        //     System.out.println(fiboFormula(i));
        // }
        System.out.println(fiboFormula(50));

    }
}
