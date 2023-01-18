package Dynamic_Programming;

public class KdanesAlgo {
    public static void main(String[] args) {
        int [] arr = {-3, -2, -3};
        System.out.println(kdanesAgo(arr));
    }
    public static int kdanesAgo(int[] nums) {
        int sum = 0, max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            max_sum = Math.max(sum, max_sum);
            if(sum < 0){
                sum=0;
            }
        }
        return max_sum;
    }
}
