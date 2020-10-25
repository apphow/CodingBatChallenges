package arrayone;

import java.util.Arrays;

public class CommonEnd {

//
//    Given 2 arrays of ints, a and b, return true if
//    they have the same first element or they have the
//    same last element. Both arrays will be length 1 or
//    more.
//
//
//    commonEnd([1, 2, 3], [7, 3]) → true
//    commonEnd([1, 2, 3], [7, 3, 2]) → false
//    commonEnd([1, 2, 3], [1, 3]) → true

    public static boolean commonEnd(int[] a, int[] b) {

        if(a[0] == b[0] || a[a.length -1] == b[b.length -1]) {
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }

    public static void main(String[] args) {
        int[] oneA = {1, 2, 3};
        int[] oneB = {7,3};
        int[] twoA = {1, 2, 3};
        int[] twoB = {7, 3, 2};
        int[] threeA = {1, 2, 3};
        int[] threeB = {1, 3};
        int[] fourA = {1, 2, 3};
        int[] fourB = {1};
        int[] fiveA = {1, 2, 3};
        int[] fiveB = {2};
        commonEnd(oneA, oneB);
        commonEnd(twoA, twoB);
        commonEnd(threeA, threeB);
        commonEnd(fourA, fourB);
        commonEnd(fiveA, fiveB);

    }
}
