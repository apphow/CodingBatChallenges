package warmup2;
// Given an array of ints, return the number of 9's in
// the array.
//
// arrayCount9([1, 2, 9]) → 1
// arrayCount9([1, 9, 9]) → 2
// arrayCount9([1, 9, 9, 3, 9]) → 3

public class ArrayCount9 {
    public static int arrayCount9(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 9) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        arrayCount9(new int[] {1, 2, 9});
        arrayCount9(new int[] {1, 9, 9});
        arrayCount9(new int[] {1, 9, 9, 3, 9});
        arrayCount9(new int[] {1, 2, 3});
        arrayCount9(new int[] {});
        arrayCount9(new int[] {4, 2, 4, 3, 1});
        arrayCount9(new int[] {9, 2, 4, 3, 1});

    }
}
