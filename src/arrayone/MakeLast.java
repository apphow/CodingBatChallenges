package arrayone;

import java.util.Arrays;

//Given an int array, return a new array with
// double the length where its last element is
// the same as the original array, and all the
// other elements are 0. The original array will
// be length 1 or more. Note: by default, a new
// int array contains all 0's.
//
//  makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
//  makeLast([1, 2]) → [0, 0, 0, 2]
//  makeLast([3]) → [0, 3]
public class MakeLast {
    public static int[] makeLast(int[] nums) {
        int last = nums[nums.length -1];
        int[] newArr = new int[nums.length * 2];
        newArr[newArr.length -1] = last;
        System.out.println(Arrays.toString(newArr));
        return newArr;
    }

    public static void main(String[] args) {
        makeLast(new int[]{4, 5, 6});
        makeLast(new int[]{1, 2});
        makeLast(new int[]{3});
        makeLast(new int[]{0});
        makeLast(new int[]{7, 7, 7});
        makeLast(new int[]{3, 1, 4});
        makeLast(new int[]{1, 2, 3, 4});
        makeLast(new int[]{1, 2, 3, 0 });
        makeLast(new int[]{2, 4});



    }
}
