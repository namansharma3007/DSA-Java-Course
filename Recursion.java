public class Recursion {
    public static void main(String[] args) {
        // print a series of no: 1 2 3 4 5
        // printNo(1);
        int [] arr = {5,6,7,8,9,11,15,68,96};
        int target = 11;
        System.out.println(binarySearch(arr, target, 0, arr.length - 1));

        // find the fibonacci no at a partiular index
        // System.out.println(fibonacci(6));
    }

    static void printNo(int n) {
        if (n == 5) {
            System.out.println(5);
            return;
        }
        System.out.println(n);
        // if you are calling a function again and again, you can treat it as a separate
        // call
        // this is tail recursion
        // this is the last function call
        printNo(n + 1);
    }

    // recurrence relation
    static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        // this is not tail recursion because it is adding and returning value
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static int binarySearch(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;

        if(arr[m] == target){
            return m;
        }
        if(target < arr[m]){
            return binarySearch(arr, target, s, m-1);
        }

        return binarySearch(arr, target, m+1, e);
    }
}