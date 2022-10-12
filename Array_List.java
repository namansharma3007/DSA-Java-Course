
import java.util.*;

public class Array_List {
    public static void main(String[] args) {
        //Syntax
        Scanner sc = new Scanner(System.in);
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(45);
        // list.add(52);
        // list.add(95);
        // list.add(96);
        // list.add(8);
        // list.add(56);
        // list.add(10);

        // System.out.println(list);

        // System.out.println(list.contains(8));

        // list.set(0,56);
        
        // System.out.println(list);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialization part
        for (int index = 0; index < 3; index++) {
            list.add(new ArrayList<>());
        }

        //add elements
        for (int i = 0; i < 3; i++) {
            for (int j=0;j< 3;j++){
                list.get(i).add(sc.nextInt());
            }
            
        }
        System.out.println(list);
        sc.close();

    }
}
