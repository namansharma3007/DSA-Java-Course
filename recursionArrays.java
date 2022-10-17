import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

public class recursionArrays {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,6,8,4};
        // System.out.println(checkIfSorted(arr));
        // System.out.println(searchItem(arr, 4, 0));
        int [] arr2 = {1,2,3,5,6,2,1,4,7,8};
        // System.out.println(results);
        System.out.println(findAllIndex2(arr2, 2, 0,new ArrayList<>()));
        
    }

    // find if array is sorted or not
    static boolean checkIfSorted(int [] arr){
        if(arr.length == 1) return true;
        return helperSorted(arr,1);
    }

    static boolean helperSorted(int [] arr, int index){
        if(index == arr.length) return true;

        return (arr[index] > arr[index-1] && helperSorted(arr, index+1));
    }

    // find an item in arr
    static int searchItem(int [] arr,int target,int index){
        if(arr[index] == target) return index;
        if(index == arr.length-1) return -1;

        return searchItem(arr, target, index+1);
    }

    static ArrayList<Integer> results = new ArrayList<>();
    static void findAllIndex(int [] arr, int target, int index){
        if(arr[index] == target) results.add(index);
        if(index == arr.length - 1) return;

        findAllIndex(arr, target, index+1);
    }

    static ArrayList<Integer> findAllIndex2(int [] arr, int target, int index, ArrayList<Integer> list){
        if(arr[index] == target) list.add(index);
        if(index == arr.length - 1) return list;

        return findAllIndex2(arr, target, index+1,list);
    }

    
}
