package arrayone;
// Given an int array length 2, return true if it
// contains a 2 or a 3

// has23([2, 5]) -> true
// has23([4, 3]) -> true
// has23([4, 5]) -> false
public class Has23 {
    public static boolean has23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 || nums[i] == 3) {
                System.out.println(true);
                return true;
            }
        }
        System.out.println(false);
            return false;
        }

    public static void main(String[] args) {
        has23(new int[]{2, 5});
        has23(new int[]{4, 3});
        has23(new int[]{4, 5});
        has23(new int[]{2, 2});
        has23(new int[]{3, 2});
        has23(new int[]{3, 3});
        has23(new int[]{7, 7});
        has23(new int[]{3, 9});
        has23(new int[]{9, 5});
    }
    }
