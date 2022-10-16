public class recursionQues {
    public static void main(String[] args) {
        // func(5); 
        // funcReverseCount(5);   
        // System.out.println(sumOfDigits(1345));

        // System.out.println(product(55));
        // func3(5);

        // reverseNo(345);
        // System.out.println(sum);
        // System.out.println(rev2(7684));
        System.out.println(palindrome(564));
        
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

    static void func3(int n){
        if(n == 0){
            return;
        }

        System.out.println(n);
        //func3(n--); // infinit lop
        func3(--n);
    }

    // reverse a no
    static int sum = 0;
    static void reverseNo(int n ){
        // if(n%10 == n){
        //     return n+"";
        // }

        // return (n%10)+""+reverseNo(n/10);

        /* Above method is also correct */
        if(n == 0){
            return;
        }
        int remainder = n%10;
        sum = sum*10 + remainder;
        reverseNo(n/10);
    }

    static int rev2(int n){
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }
    private static int helper(int n, int digits){
        if(n%10 == n){
            return n;
        }
        int remainder = n % 10;
        return remainder * (int)Math.pow(10,digits-1) + helper(n/10, digits-1);        
    }

    static boolean palindrome(int n){
        return n == rev2(n);
    }
}
