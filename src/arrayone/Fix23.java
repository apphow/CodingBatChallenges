package arrayone;

import java.util.Arrays;

//  Given an int array length 3, if there is a 2 in
//  the array immediately followed by a 3, set the 3
//  element to 0. Return the changed array.
//
//  fix23([1, 2, 3]) → [1, 2, 0]
//  fix23([2, 3, 5]) → [2, 0, 5]
//  fix23([1, 2, 1]) → [1, 2, 1]
public class Fix23 {

    public static int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3)
                nums[i + 1] = 0;
            }
        System.out.println(Arrays.toString(nums));
            return nums;
    }

    public static void main(String[] args) {
        fix23(new int[]{1, 2, 3});
        fix23(new int[]{2, 3, 5});
        fix23(new int[]{1, 2, 1});
        fix23(new int[]{3, 2, 1});
        fix23(new int[]{2, 2, 3});
        fix23(new int[]{2, 3, 3});

    }
}
