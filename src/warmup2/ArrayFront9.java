package warmup2;
// Given an array of ints, return true if one of the
// first 4 elements in the array is a 9. The array
// length may be less than 4.
//
// arrayFront9([1, 2, 9, 3, 4]) → true
// arrayFront9([1, 2, 3, 4, 9]) → false
// arrayFront9([1, 2, 3, 4, 5]) → false
public class ArrayFront9 {

    public static boolean arrayFront9(int[] nums) {
        int i = 0;

        while (i < nums.length && i < 4) {
            if (nums[i] == 9) {
                System.out.println(true);
                return true;
            }
                i++;
            }
            System.out.println(false);
            return false;
        }


    public static void main(String[] args) {
        arrayFront9(new int[] {1, 2, 9, 3, 4});
        arrayFront9(new int[] {1, 2, 3, 4, 9});
        arrayFront9(new int[] {1, 2, 3 ,4 ,5});
        arrayFront9(new int[] {9, 2, 3});
        arrayFront9(new int[] {1, 9, 9});
        arrayFront9(new int[] {1, 2, 3});
        arrayFront9(new int[] {1, 9});
        arrayFront9(new int[] {5, 5});
        arrayFront9(new int[] {2});
        arrayFront9(new int[] {9});
        arrayFront9(new int[] {});
        arrayFront9(new int[] {3, 9, 2, 3, 3});
    }
}
