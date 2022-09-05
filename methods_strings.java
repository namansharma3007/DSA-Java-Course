import java.util.Arrays;

public class methods_strings {
    public static void main(String[] args) {
        String name = "Naman Sharma is a programmer";
        System.out.println(Arrays.toString(name.toCharArray()));
        
        System.out.println(name.indexOf('a'));

        System.out.println("    naman   ".strip());

        System.out.println(Arrays.toString(name.split(" ")));


    }
}
