package arrayone;
//  Start with 2 int arrays, a and b, each length 2.
//  Consider the sum of the values in each array.
//  Return the array which has the largest sum. In
//  event of a tie, return a.
//

//  biggerTwo([1, 2], [3, 4]) → [3, 4]
//  biggerTwo([3, 4], [1, 2]) → [3, 4]
//  biggerTwo([1, 1], [1, 2]) → [1, 2]

import java.util.Arrays;

public class Bigger2 {

    public static int[] biggerTwo(int[] a, int[] b) {
        int aa = a[0] + a[1];
        int bb = b[0] + b[1];
        if((aa > bb) || (aa == bb)) {
            System.out.println(Arrays.toString(a));
            return a;
        }
        System.out.println(Arrays.toString(b));
        return b;
    }

    public static void main(String[] args) {
        biggerTwo(new int[]{1, 2}, new int[]{3, 4});
        biggerTwo(new int[]{3, 4}, new int[]{1, 2});
        biggerTwo(new int[]{1, 1}, new int[]{1, 2});
    }
}
