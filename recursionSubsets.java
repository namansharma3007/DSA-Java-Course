import java.util.*;

public class recursionSubsets {

    // taking some elements and removing some elements
    public static void main(String[] args) {
        // subSequence("", "abc");

        ArrayList<String> ans = subSequenceArrayList("","abcd");
        // ans.remove(ans.size()-1);
        
        System.out.println(ans);
    }

    static void subSequence(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subSequence(p + ch, up.substring(1));
        subSequence(p , up.substring(1));
    } 

    static ArrayList<String> subSequenceArrayList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subSequenceArrayList(p + ch, up.substring(1));
        ArrayList<String> right = subSequenceArrayList(p , up.substring(1));

        left.addAll(right);
        return left;



    } 

}
