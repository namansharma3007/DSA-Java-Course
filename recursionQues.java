public class recursionQues {
    public static void main(String[] args) {
        // func(5); 
        // funcReverseCount(5);   
        // System.out.println(sumOfDigits(1345));

        System.out.println(product(55));
        
    }
    static void func(int n){
        if(n == 0){
            return;
        }

        func(n-1);
        System.out.println(n);
    }

    static void funcReverseCount(int n){
        if(n == 0){
            return;
        }

        System.out.println(n);
        func(n-1);
    }

    static int sumOfDigits(int n){
        if(n == 0){
            return 0;
        }

        return (n%10) + sumOfDigits(n/10);
    }


    static int product(int n){
        if(n%10 == n){
            return n;
        }

        return (n%10) * product(n/10);
    }
}
