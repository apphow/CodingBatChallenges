package arrayone;

import java.util.Arrays;

// Given 2 int arrays, each length 2, return a new array
// length 4 containing all their elements.
//
//  plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
//  plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
//  plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
public class PlusTwo {

    public static int[] plusTwo(int[] a, int[] b) {
        System.out.println(Arrays.toString(new int[] {a[0], a[1], b[0], b[1]}));
        return new int[] {a[0], a[1], b[0], b[1]};
    }

    public static void main(String[] args) {
        plusTwo(new int[]{1, 2}, new int[]{3, 4});
        plusTwo(new int[]{4, 4}, new int[]{2, 2});
        plusTwo(new int[]{9, 2}, new int[]{3, 4});
    }
}
