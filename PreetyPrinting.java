// object will call toString method

import java.util.ArrayList;

public class PreetyPrinting {
    public static void main(String[] args) {
        float a = 482.56684130f;
        // will round the value as well
        // System.out.printf("Formatted number value is: %.2f",a);
        // System.out.println();
        // System.out.println(Math.PI);

        // System.out.printf("Pi: %.3f",Math.PI);
        // System.out.println();


        // System.out.printf("My name is %s and I study at %s.","Naman","Lovely Professional University");
         
        // System.out.println();

        // System.out.println((char)('a'+4));

        System.out.println("b"+5);
        // this will be converted to Integer that will call toString()
        // this will call toString method

        System.out.println("Naman" + new ArrayList<>());
        // output Naman[]

        System.out.println(new Integer(63) + "" + new ArrayList<>());
        // without this "" it will not work
    }
}
