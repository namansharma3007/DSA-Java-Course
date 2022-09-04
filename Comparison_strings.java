import java.util.Arrays;

// Strings 
// only for value use .equals() method

public class Comparison_strings {
    public static void main(String[] args) {
        String a = "Naman";
        String b = "Naman";

        // == 
        // System.out.println(a == b);

        // explicitely creating new objects

        String name1 = new String("Varsha");
        String name2 = new String("Varsha");

        // System.out.println(name1 == name2);
        // System.out.println(name1.equals(name2));

        System.out.println(name1.charAt(0));
        System.out.println(Arrays.toString(new int []{1,8,6,1,5}));

        // wrapper class  => depricated
        // but will allow us to access many different functions with the integer value inserted
        Integer num = new Integer(56);
        System.out.println(num.toString());
    }
}
