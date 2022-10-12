class bitwiseOperators {
    static boolean oddEven(int no){
        return (no & 1) == 1;

    }

    static int appearingOnce(int [] arr){

        int unique=0;
        for (int i : arr) {
            unique^=i;
        }
        return unique;
    }

    public static void main(String[] args) {       
        // System.out.println(oddEven(45));

        int [] arr = {1,2,3,4,5,2,3,4,5,6,7,6};

        System.out.println(appearingOnce(arr));
    }
}
