package arrayone;

public class SameFirstLast {

//
//    Given an array of ints, return true if the array
//    is length 1 or more, and the first element and
//    the last element are equal.

//    sameFirstLast([1, 2, 3]) → false
//    sameFirstLast([1, 2, 3, 1]) → true
//    sameFirstLast([1, 2, 1]) → true

    public static boolean sameFirstLast(int[] nums) {
        if(nums.length > 0 && nums[0] == nums[nums.length -1]){
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }

    public static void main(String[] args) {

        //int[] one = {1, 2, 3};
        //int[] two = {1, 2, 3, 1};
        int[] three = {1, 2, 1};
        int[] four = {7};
        int[] five = {};
        int[] six = {1, 2, 3, 4, 5, 1};
        int[] seven = {1, 2, 3, 4, 5, 13};
        int[] eight = {13, 2, 3, 4, 5, 13};
        int[] nine = {7, 7};
        sameFirstLast(new int[] {1, 2, 3});
        sameFirstLast(new int[] {1, 2, 3, 1});
        sameFirstLast(three);
        sameFirstLast(four);
        sameFirstLast(five);
        sameFirstLast(six);
        sameFirstLast(seven);
        sameFirstLast(eight);
        sameFirstLast(nine);

    }
}
