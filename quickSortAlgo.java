import java.util.Arrays;

public class quickSortAlgo {
    // pivot: after first pass all the elements < pivot will be on th e LHS of pivot and elements > pivot will be on the RHS of pivot
    public static void main(String[] args) {
        int [] arr = {9,8,7,6,5,4};
        // quickSort(arr,0,arr.length-1);
        // System.out.println(Arrays.toString(arr));

        // quickSort(nums,0,nums.length - 1);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void quickSort(int [] nums, int low, int high){
        if(low >= high) {
            return;
        }

        int s = low;
        int e = high;
        int mid = s+(e-s)/2;
        int pivot = nums[mid];

        while(s <= e){

            // also a reason why if its already sorted it will not swap
            while(nums[s] < pivot){
                s++;
            }
            while(nums[e] > pivot){
                e--;
            }

            if(s <= e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }

        }

        // now my pivot it at correct index, please sort two halves
        quickSort(nums, low, e);
        quickSort(nums, s, high);
    }
}
