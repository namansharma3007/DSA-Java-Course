public class recursionArrays {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,6,8,4};
        // System.out.println(checkIfSorted(arr));
        System.out.println(searchItem(arr, 4, 0));

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
}
