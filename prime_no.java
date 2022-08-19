import java.util.Scanner;

public class prime_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=true;
        if (n == 0 || n == 1) {
            System.out.println("not prime");
        } else {
            for (int i = 2; i <= n/2; i++) {
                if (n % i == 0) {
                    System.out.println("not prime");
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("prime");
            }
        } 
    }
}
