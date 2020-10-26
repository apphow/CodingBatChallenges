package arrayone;
// Given an int array, return true if the array
// contains 2 twice, or 3 twice. The array will
// be length 0, 1, or 2.
//
//
//  double23([2, 2]) → true
//  double23([3, 3]) → true
//  double23([2, 3]) → false
public class Double23 {
    public static boolean double23(int[] nums) {
        int count = 0;
        int count3 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                count++;
            }
            if (nums[i] == 3) {
                count3++;
            }
            if (count == 2 || count3 == 2) {
                System.out.println(true);
                return true;
            }
        }

        System.out.println(false);
        return false;

    }

    public static void main(String[] args) {
        double23(new int[]{2, 2});
        double23(new int[]{3, 3});
        double23(new int[]{2, 3});
        double23(new int[]{3, 2});
        double23(new int[]{4, 5});
        double23(new int[]{2});
        double23(new int[]{3});
        double23(new int[]{});
        double23(new int[]{3, 4});



    }
}
