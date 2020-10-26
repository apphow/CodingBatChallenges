package arrayone;

import java.util.Arrays;

//  Given an array of ints, swap the first and last
//  elements in the array. Return the modified array.
//  The array length will be at least 1.
//
//  swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
//  swapEnds([1, 2, 3]) → [3, 2, 1]
//  swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
public class SwapEnds {

    public static int[] swapEnds(int[] nums) {
        int begin = nums[nums.length - 1];
        int last = nums[0];

        nums[0] = begin;
        nums[nums.length -1] = last;
        System.out.println(Arrays.toString(nums));
        return nums;
    }

    public static void main(String[] args) {
        swapEnds(new int[] {1, 2, 3, 4});
        swapEnds(new int[] {1, 2, 3});
        swapEnds(new int[] {8, 6, 7, 9, 5});
    }
}
