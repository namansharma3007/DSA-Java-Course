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
    public static int findSingleNo(int[] num) {
        int no = 0;
        for (int i = 0; i < num.length; i++) {
            no+=num[i];
        }
        return no%3;
    }

    private static int magicNo(int n) {

        int ans = 0;

        int base = 5;
        while(n > 0){
            int last = n & 1;
            n = n>>1;
            ans+=last * base;
            base*=5;
        }

        return ans;
    }
    public static int noOfBitsInBinaryRepresentation(int i) {
        return (int)(Math.log(i)/Math.log(2))+1;
    }
    public static int sumInAnyRowInPascalsTriangle(int i){
        return 1 << (i-1);
    }
    public static boolean powerOfTwo(int n) {
        if(n==0) return false;
        return (n&(n-1)) == 0;
    }

    public static int aRaiseToPowerb(int a, int power){

        int ans = 1;
        while (power > 0) {
            if ((power&1) == 1) {
                ans*=a;
            }

            a*=a;
            power = power >> 1;
        }
        return ans;
    }
    private static int countSetBit(int n) {
        System.out.println(Integer.toBinaryString(n)+'\n');

        int count = 0;
        // while (n > 0) {
        //     count++;
        //     n-=(n&(-n));
        //     // System.out.println(Integer.toBinaryString(n));
        // }

        while (n > 0) {
            count++;
            n = n & (n-1);
            // System.out.println(Integer.toBinaryString(n));
        }
        return count;
    }

    public static int xorRange(int index){
            if(index%4 == 0) return index;
            if(index%4 == 1) return 1;
            if(index%4 == 2) return index+1;
            if(index%4 == 3) return 0;

            return -1;
    }

    public static int rangeXOR(int a, int b){

        return xorRange(b)^xorRange(a-1);
    }
    public static void main(String[] args) {       
        // System.out.println(oddEven(45));

        // int [] arr = {1,2,3,4,5,2,3,4,5,6,7,6};

        // System.out.println(appearingOnce(arr));

        // System.out.println(ithBit(1,5));
        // int no = 9;
        // setIthBitTo1(1, no);
        // System.out.println(no);
        // int [] num = {1,1,1,2,3,3,3,4,4,4,5,5,5};
        // System.out.println(findSingleNo(num));

        // System.out.println(magicNo(6));

        // System.out.println(noOfBitsInBinaryRepresentation(5));

        //  System.out.println(sumInAnyRowInPascalsTriangle(2));

        // System.out.println(powerOfTwo(16));

        // System.out.println(aRaiseToPowerb(3,3));
        // System.out.println(countSetBit(45));


        // Q: Find XOR of no from 0-8?

        // xorRange(8);

        System.out.println(rangeXOR(3,9));
        


    }

}
