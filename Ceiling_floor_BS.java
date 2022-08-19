public class Ceiling_floor_BS {

    //smallest no >=target
    static int ceilingNo(int[] arr, int target) {

        // if target element is greater than the greatest no in the array
        if(target > arr[arr.length - 1]) return -1;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            
            int mid = start + (end - start) / 2;
            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;
            else
                return mid;
        }

        return start;
    }
    //greatest no <= target
    static int floorNo(int[] arr, int target) {

        // if target element is smaller than the smallest no in the array
        if(target < arr[0]) return -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            
            int mid = start + (end - start) / 2;
            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;
            else
                return mid;
        }

        return end;
    }

    static int ceilingChar(char [] arr, char target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            
            int mid = start + (end - start) / 2;
            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;
            else
                return mid;
        }

        return start;
    }
    
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        int target = 1;
        System.out.println(arr[ceilingNo(arr,target)]);
        // System.out.println(arr[floorNo(arr,target)]);
        System.out.println(floorNo(arr, target));
    }
}

