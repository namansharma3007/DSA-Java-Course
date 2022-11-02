import java.util.*;

// for duplicates: when you find a duplicate element, only add it in the newly created subset of previous step
// because of above points duplicates ahve to be together: Solution-> sort the array

public class iterativeSubsets {
    public static void main(String[] args) {

        int [] arr = {1,2,3};
        // List<List<Integer>>  ans = subset(arr);
        // System.out.println(ans);

        int [] arr2 = {1,2,2};
        List<List<Integer>> result = subsetDuplicate(arr2);
        System.out.println(result);
    }

    static List<List<Integer>> subset(int [] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num: arr){
            int n = outer.size();
            for(int i=0; i< n; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
        
    }
    static List<List<Integer>> subsetDuplicate(int [] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;

        for(int i=0;i<arr.length;i++){
            start = 0;
            // if my current and previous element is same , s = e+1;
            if(i > 0 && arr[i] == arr[i-1]){
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for(int j=start;j<n;j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
                }
            
        }
        return outer;
        
    }
}
