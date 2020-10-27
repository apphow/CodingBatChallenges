package arrayone;
// We'll say that a 1 immediately followed by a 3 in
// an array is an "unlucky" 1. Return true if the
// given array contains an unlucky 1 in the first 2 or
// last 2 positions in the array.
//
// unlucky1([1, 3, 4, 5]) → true
// unlucky1([2, 1, 3, 4, 5]) → true
// unlucky1([1, 1, 1]) → false
public class Unlucky1 {

    public static boolean unlucky(int[] nums) {
        if(nums.length == 0 || nums.length == 1) {
            System.out.println(false);
            return false;
        }
             if((nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3)  ||
                     (nums[nums.length -2] == 1 && nums[nums.length -1] == 3)) {
                 System.out.println(true);
                return true;
            }
        System.out.println(false);
            return false;
    }

    public static void main(String[] args) {
        unlucky(new int[] {1, 3, 4, 5});
        unlucky(new int[] {2, 1, 3, 4, 5});
        unlucky(new int[] {1, 1, 1});
        unlucky(new int[] {1, 3, 1});
        unlucky(new int[] {1, 1, 3});
        unlucky(new int[] {1, 2, 3});
        unlucky(new int[] {3, 3, 3});
        unlucky(new int[] {1, 3});
        unlucky(new int[] {1, 4});
        unlucky(new int[] {1});
        unlucky(new int[] {});
        unlucky(new int[] {1, 1, 1, 3, 1});
        unlucky(new int[] {1, 1, 3, 1, 1});
        unlucky(new int[] {1, 1, 1, 1, 3});
        unlucky(new int[] {1, 4, 1, 5});
        unlucky(new int[] {1, 1, 2, 3});
        unlucky(new int[] {2, 3, 2, 1});
        unlucky(new int[] {2, 3, 1, 3});
        unlucky(new int[] {1, 2, 3, 4, 1, 3});



    }
    }


