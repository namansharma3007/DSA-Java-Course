public class recursionArrays {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,6,8,4};
        System.out.println(checkIfSorted(arr));
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
}
