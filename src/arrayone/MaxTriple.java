package arrayone;

// Given an array of ints of odd length, look at the
// first, last, and middle values in the array and
// return the largest. The array length will be a
// least 1.
//
// maxTriple([1, 2, 3]) → 3
// maxTriple([1, 5, 3]) → 5
// maxTriple([5, 2, 3]) → 5

public class MaxTriple {

    public static int maxTriple(int[] nums) {
        int first = nums[0];
        int middle = nums[nums.length / 2];
        int last = nums[nums.length - 1];
        System.out.println(Math.max(Math.max(first, middle), last));
        return Math.max(Math.max(first, middle), last);
    }

    public static void main(String[] args) {
        maxTriple(new int[] {1, 2, 3});
        maxTriple(new int[] {1, 5, 3});
        maxTriple(new int[] {5, 2, 3});
        maxTriple(new int[] {1, 2, 3, 1, 1});
        maxTriple(new int[] {1, 7, 3, 1, 5});
        maxTriple(new int[] {5,1,3,7,1});

        maxTriple(new int[] {5,1,7,3,7,8,1});
        maxTriple(new int[] {5,1,7,3,7,8,9});
        maxTriple(new int[] {2,2,5,1,1,});

    }
}
