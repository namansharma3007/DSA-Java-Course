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

    // find ith bit of that no
    static int ithBit(int i,int no){
        return no & (1<<i-1);
    }
    // doubt
    static void setIthBitTo1(int i,int no){
        no = no | (1<<i-1);
    }

    static int rightMostBit(int no){

        return 0;
    }
    private static int findSingleNo(int[] num) {
        int no = 0;
        for (int i = 0; i < num.length; i++) {
            no+=num[i];
        }
        return no%3;
    }
    public static void main(String[] args) {       
        // System.out.println(oddEven(45));

        int [] arr = {1,2,3,4,5,2,3,4,5,6,7,6};

        // System.out.println(appearingOnce(arr));

        // System.out.println(ithBit(1,5));
        int no = 9;
        setIthBitTo1(1, no);
        // System.out.println(no);
        int [] num = {1,1,1,2,3,3,3,4,4,4,5,5,5};
        System.out.println(findSingleNo(num));
    }

}
