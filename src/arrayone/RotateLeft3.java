package arrayone;
//     Given an array of ints length 3, return an array with
//        the elements "rotated left" so {1, 2, 3}
//        yields {2, 3, 1}.
//
//        rotateLeft3([1, 2, 3]) → [2, 3, 1]
//        rotateLeft3([5, 11, 9]) → [11, 9, 5]
//        rotateLeft3([7, 0, 0]) → [0, 0, 7]

import java.util.Arrays;

public class RotateLeft3 {

    public static int[] rotateLeft3(int[] nums) {
        int first = nums[0];
        for(int i = 1; i < nums.length; i++)
            nums[i - 1] = nums[i];
        nums[nums.length -1] = first;
        System.out.println(Arrays.toString(nums));
        return nums;
        }
        // int[] news = {nums[1], nums[2], nums[0]};
        // return news;

    public static void main(String[] args) {
        int[] one = {1, 2, 3};
        int[] two = {5, 11, 9};
        int[] three = {7, 0, 0};
        int[] four = {1, 2, 1};
        int[] five = {0, 0, 1};
        rotateLeft3(one);
        rotateLeft3(two);
        rotateLeft3(three);
        rotateLeft3(four);
        rotateLeft3(five);
    }
    }

