public class infinitArray_BS {
    static int infinitArrBinarySearch(int [] arr, int target,int start, int end){

        while (start <= end) {
            
            int mid = start + (end - start) / 2;
            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;
            else
                return mid;
        }

        return -1;
    }

    static int ans(int [] arr, int target){
        // first find the ange
        // first start witha box of size 2
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int temp = end+1;
            // double the bo value
            // end = previous end + sizeOfBox * 2
            end = end + (end - start + 1)*2;
            start = temp;
        }
        return infinitArrBinarySearch(arr, target, start, end);
    }
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        int target = 14;
        System.out.println(ans(arr,target));
    }
}
