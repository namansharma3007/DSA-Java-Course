//https://leetcode.com/problems/split-array-largest-sum/
/*
Given an array nums which consists of non-negative integers and an integer m, you can split the array into m non-empty continuous subarrays.

Write an algorithm to minimize the largest sum among these m subarrays.

Example 1:

Input: nums = [7,2,5,10,8], m = 2
Output: 18
Explanation:
There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8],
where the largest sum among the two subarrays is only 18.
Example 2:

Input: nums = [1,2,3,4,5], m = 2
Output: 9
Example 3:

Input: nums = [1,4,4], m = 3
Output: 4
*/

public class SplitArrayLargestSum {
    static int splitArray(int [] arr, int m){
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]); // in the end of the loop it will contain the max item from the array

            end += arr[i];
        }

        // apply binary search
        while(start < end){
            // try for the middle
            int mid = start +(end-start)/2;

            //calculate how many pieces you can divide this max sum
            int sum = 0;
            int pieces = 1;

            for (int num : arr) {
                if(sum + num > mid){
                    // you cannnot add this in this sub array
                    // say you add this num in new subarray, then sum = num
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if (pieces > m) {
                start = mid+1;
            } else {
                end = mid;
            }
        }

        return end; // here start == end
    }
    public static void main(String[] args) {
        int [] nums = {7,2,5,10,8};
        int m = 2;
        System.out.println(splitArray(nums,m));
    }
}
