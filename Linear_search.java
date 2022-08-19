import java.util.Arrays;

public class Linear_search {
    public static void main(String[] args) {
        int [] nums = {1,2,5,6,36,56,85,31,25,63,13,19};
        // int ans = linearSearch(nums, 31);
        // System.out.println(ans);

        String a="sdkhcbsdk";
        
        // System.out.println(stringSearch(a,'c'));

        System.out.println(Arrays.toString(a.toCharArray()));

        // int value = linearSearch2(nums, 64);
        // System.out.println(value);
    }
    // search in the array
    static int linearSearch(int [] arr,int target){
        if(arr.length == 0) return -1;
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element == target) return i;
        }
        return -1;
    }

    // return the element 
    static int linearSearch2(int [] arr,int target){
        if(arr.length == 0) return Integer.MAX_VALUE;
        for (int element: arr) {
            if(element == target) return element;
        }
        return Integer.MAX_VALUE;
    }

    // searching in a string
    static boolean stringSearch(String str, char target){
        if(str.length() == 0) return false;

        for(char ch: str.toCharArray()){
            if(ch == target) return true;
        }
        return false;
    }
}
