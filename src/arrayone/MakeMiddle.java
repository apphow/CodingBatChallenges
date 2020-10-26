package arrayone;

//  Given an array of ints of even length, return a new
//  array length 2 containing the middle two elements
//  from the original array. The original array will
//  be length 2 or more.
//
//   makeMiddle([1, 2, 3, 4]) → [2, 3]
//   makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
//   makeMiddle([1, 2]) → [1, 2]

import java.util.Arrays;

public class MakeMiddle {

    public static int[] makeMiddle(int[] nums) {
        System.out.println(Arrays.toString(new int[] {nums[nums.length / 2 -1], nums[nums.length/2]}));
        return new int[] {nums[nums.length /2 - 1], nums[nums.length/2]};
    }

    public static void main(String[] args) {
        makeMiddle(new int[]{1, 2, 3, 4});
        makeMiddle(new int[] {7, 1, 2, 3, 4, 9});
        makeMiddle(new int[] {1, 2});
        makeMiddle(new int[] {5, 2, 4, 7});
        makeMiddle(new int[] {9, 0, 4, 3, 9, 1});
    }
}
