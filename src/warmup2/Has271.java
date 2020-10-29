package warmup2;
// Given an array of ints, return true
// if it contains a 2, 7, 1 pattern: a value,
// followed by the value plus 5, followed by
// the value minus 1. Additionally the 271
// counts even if the "1" differs by 2 or less from the correct value.
//
//  has271([1, 2, 7, 1]) → true
//  has271([1, 2, 8, 1]) → false
//  has271([2, 7, 1]) → true
public class Has271 {
    public static boolean has271(int[] nums) {
        for(int i = 0; i < nums.length-2; i++) {
            int startingValue = nums[i];
            if (nums[i + 1] == (startingValue + 5) && Math.abs(nums[i + 2] - (startingValue -1)) <= 2) {
                System.out.println(true);
                return true;
            }
        }
        System.out.println(false);
            return false;
        }

    public static void main(String[] args) {
        has271(new int[] {1, 2, 7, 1});
        has271(new int[] {1, 2, 8, 1});
        has271(new int[] {2, 7, 1});
        has271(new int[] {3, 8, 2});
        has271(new int[] {2, 7, 3});
        has271(new int[] {2, 7, 4});
        has271(new int[] {2, 7, -1});
        has271(new int[] {2, 7, -2});
        has271(new int[] {4, 5, 3, 8, 0});
        has271(new int[] {2, 7, 5, 10, 4});
        has271(new int[] {2, 7, -2, 4, 9, 3});
        has271(new int[] {2, 7, 5, 10, 1});
        has271(new int[] {2, 7, -2, 4, 10, 2});
        has271(new int[] {1, 1, 4, 9, 0});
        has271(new int[] {1, 1, 4, 9, 4, 9, 2});

    }

}
