package arrayone;

// Given 2 int arrays, a and b, return a new array length
// 2 containing, as much as will fit, the elements from
// a followed by the elements from b. The arrays may be
// any length, including 0, but there will be 2 or more
// elements available between the 2 arrays.

import java.util.Arrays;

//  make2([4, 5], [1, 2, 3]) → [4, 5]
//  make2([4], [1, 2, 3]) → [4, 1]
//  make2([], [1, 2]) → [1, 2]
public class MakeTwo {

    public static int[] make2(int[] a, int[] b) {
        if (a.length == 0) {
            System.out.println(Arrays.toString(new int[]{b[0], b[1]}));
            return new int[]{b[0], b[1]};
        }
        if (a.length == 1) {
            System.out.println(Arrays.toString(new int[]{a[0], b[0]}));
            return new int[]{a[0], b[0]};
        }
        if (a.length > -2) {
            System.out.println(Arrays.toString(new int[]{a[0], a[1]}));
            return new int[]{a[0], a[1]};
        }
        return null;
    }

    public static void main(String[] args) {
        make2(new int[]{4, 5}, new int[]{1, 2, 3});
        make2(new int[]{4}, new int[]{1, 2, 3});
        make2(new int[]{}, new int[]{1, 2});
        make2(new int[]{1, 2}, new int[]{});
        make2(new int[]{3}, new int[]{1, 2, 3});
        make2(new int[]{3}, new int[]{1});
        make2(new int[]{3, 1, 4}, new int[]{});
        make2(new int[]{1}, new int[]{1});
        make2(new int[]{1, 2, 3}, new int[]{7, 8});
        make2(new int[]{7, 8}, new int[]{1, 2, 3});
        make2(new int[]{7}, new int[]{1, 2, 3});
        make2(new int[]{5, 4}, new int[]{2, 3, 7});



    }
}
