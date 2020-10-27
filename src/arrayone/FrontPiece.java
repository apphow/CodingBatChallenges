package arrayone;

import java.util.Arrays;

// Given an int array of any length, return a new array
// of its first 2 elements. If the array is smaller than
// length 2, use whatever elements are present.
//
// frontPiece([1, 2, 3]) → [1, 2]
// frontPiece([1, 2]) → [1, 2]
// frontPiece([1]) → [1]
public class FrontPiece {

    public static int[] frontPiece(int[] nums) {
        if(nums.length < 2) {
            System.out.println(Arrays.toString(nums));
            return nums;
        }
        System.out.println(Arrays.toString(new int[] {nums[0], nums[1]}));
        return new int[] {nums[0], nums[1]};
    }

    public static void main(String[] args) {
        frontPiece(new int[] {1, 2, 3});
        frontPiece(new int[] {1, 2});
        frontPiece(new int[] {1});
        frontPiece(new int[] {});
        frontPiece(new int[] {6, 5, 0});
        frontPiece(new int[] {6, 5});
        frontPiece(new int[] {3, 1, 4, 1, 5});
        frontPiece(new int[] {6});


    }
}
