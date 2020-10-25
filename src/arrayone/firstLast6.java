package arrayone;


//Given an array of ints, return true if 6 appears as
// either the first or last element in the array. The
// array will be length 1 or more.
//
//        firstLast6([1, 2, 6]) → true
//        firstLast6([6, 1, 2, 3]) → true
//        firstLast6([13, 6, 1, 2, 3]) → false
public class firstLast6 {

    public static boolean firstLast6(int[] nums) {

        int first = nums[0];
        int last = nums[nums.length - 1];
        if (first == 6 || last == 6) {
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }

    public static void main(String[] args) {
        int[] one = {1, 2, 6};
        int[] two = {6, 1, 2, 3};
        int[] three = {13, 6, 1, 2, 3};
        int[] four = {12, 6, 1, 2, 6};
        int[] five = {3, 2, 1};
        int[] six = {3, 6, 1};
        int[] seven = {3, 6};
        int[] eight = {6};
        int[] nine = {3};
        int[] ten = {5, 6};
        int[] eleven = {5, 5};
        int[] twelve = {1, 2, 3, 4, 6};
        int[] uhoh = {1, 2, 3, 4};
        firstLast6(one);
        firstLast6(two);
        firstLast6(three);
        firstLast6(four);
        firstLast6(five);
        firstLast6(six);
        firstLast6(seven);
        firstLast6(eight);
        firstLast6(nine);
        firstLast6(ten);
        firstLast6(eleven);
        firstLast6(twelve);
        firstLast6(uhoh);





    }
}
