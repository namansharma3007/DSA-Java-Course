import java.util.ArrayList;

public class recursionArrays {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,6,8,4};
        // System.out.println(checkIfSorted(arr));
        // System.out.println(searchItem(arr, 4, 0));
        int [] arr2 = {1,2,3,5,6,2,1,4,7,8};
        // System.out.println(results);
        // System.out.println(findAllIndex2(arr2, 2, 0,new ArrayList<>()));
        // System.out.println(findAllIndex3(arr2,2,0));

        int arr3 [] = {5,6,1,2,3,4};
        System.out.println(rotatedBinarySearch(arr3, 0, arr3.length - 1, 2));
        
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
    static ArrayList<Integer> findAllIndex3(int [] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length) return list;

        // this will contain answer for that function call only
        if(arr[index] == target) list.add(index);

        ArrayList<Integer> ansFromBelowCalls = findAllIndex3(arr, target, index+1);

        list.addAll(ansFromBelowCalls);
        return list;
    }


    // rotated binary search

    static int rotatedBinarySearch(int [] arr,int start, int end, int target){
        if(start > end) return -1;

        int mid = start + (end - start)/2;


        if(arr[mid] == target) return mid;

        if(arr[start] < arr[mid]) {
            if(target >= arr[start] && target <= arr[mid]){
                return rotatedBinarySearch(arr, start, mid-1, target);
            } else{
                return rotatedBinarySearch(arr, mid+1, end, target);
            }
        }

        if(target >= arr[mid] && target<= arr[end]){
            return rotatedBinarySearch(arr, mid+1, end, target);
        } 
        return rotatedBinarySearch(arr, start, mid-1, target);
    }

    
}
