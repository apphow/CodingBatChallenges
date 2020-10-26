package arrayone;
import java.util.Arrays;


//     Given an array of ints length 3, figure out
//     which is larger between the first and last
//     elements in the array, and set all the other
//     elements to be that value. Return the changed array.
//
//        maxEnd3({1, 2, 3}) → {3, 3, 3}
//        maxEnd3({11, 5, 9}) → {11, 11, 11}
//        maxEnd3({2, 11, 3}) → {3, 3, 3}

public class MaxEnd3 {

    public static int[] maxEnd3(int[] nums) {
        int largest = Math.max(nums[0], nums[nums.length -1]);
        nums[0] = largest;
        nums[1] = largest;
        nums[2] = largest;
        System.out.println(Arrays.toString(nums));
        return nums;

    }

    public static void main(String[] args) {
        int[] one = {1, 2, 3};
        int[] two = {11, 5, 9};
        int[] three = {2, 11, 3};
        maxEnd3(one);
        maxEnd3(two);
        maxEnd3(three);

    }
}
