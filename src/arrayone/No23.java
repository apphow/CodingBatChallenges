package arrayone;

// Given an int array length 2, return true if it
// does not contain a 2 or 3

//  no23([4, 5]) → true
//  no23([4, 2]) → false
//  no23([3, 5]) → false
public class No23 {

    public static boolean no23(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 2 || nums[i] ==3) {
                System.out.println(false);
                return false;
            }
        }
        System.out.println(true);
        return true;
    }

    public static void main(String[] args) {
        no23(new int[] {4, 5});
        no23(new int[] {4, 2});
        no23(new int[] {3, 5});
        no23(new int[] {1, 9});
        no23(new int[] {2, 9});
        no23(new int[] {1, 3});
        no23(new int[] {1, 1});
        no23(new int[] {2, 2});
        no23(new int[] {3, 3});
        no23(new int[] {7, 8});
        no23(new int[] {8, 7});

    }
}
