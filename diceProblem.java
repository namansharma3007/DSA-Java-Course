import java.util.*;

public class diceProblem {
    // whenever we are following taking something and leaving something: it's -> Processed and Unprocessed
    public static void main(String[] args) {
        // dice("", 4);

        System.out.println(diceRet("", 4));
    }
    static void dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p+i, target-i);
        }
    }
    static ArrayList<String> diceRet(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(diceRet(p+i, target-i));
        }

        return list;
    }




    static void diceface(String p, int target, int face){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= face && i <= target; i++) {
            diceface(p+i, target-i, face);
        }
    }


    static ArrayList<String> diceFaceRet(String p, int target, int face){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <= face && i <= target; i++) {
            list.addAll(diceFaceRet(p+i, target-i, face));
        }

        return list;
    }

}
