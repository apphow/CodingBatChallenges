package logictwo;
// Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19
// inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens. Write a separate helper
// "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule.
// In this way, you avoid repeating the teen code 3 times (i.e. "decomposition"). Define the helper below
// and at the same indent level as the main noTeenSum().
//
//        noTeenSum(1, 2, 3) → 6
//        noTeenSum(2, 13, 1) → 3
//        noTeenSum(2, 1, 14) → 3
public class NoTeenSum {
    public static int noTeenSum(int a, int b, int c) {
        System.out.println(isTeen(a) + isTeen(b) + isTeen(c));
        return isTeen(a) + isTeen(b) + isTeen(c);
    }

    public static int isTeen(int t) {
        if((t >= 13 && t < 15) || (t > 16 && t <= 19)) {
    return 0;
        }
        return t;
    }

    public static void main(String[] args) {
        noTeenSum(1, 2, 3);// → 6	6	OK
        noTeenSum(2, 13, 1);// → 3	3	OK
        noTeenSum(2, 1, 14);// → 3	3	OK
        noTeenSum(2, 1, 15);// → 18	18	OK
        noTeenSum(2, 1, 16);// → 19	19	OK
        noTeenSum(2, 1, 17);// → 3	3	OK
        noTeenSum(17, 1, 2);// → 3	3	OK
        noTeenSum(2, 15, 2);// → 19	19	OK
        noTeenSum(16, 17, 18);// → 16	16	OK
        noTeenSum(17, 18, 19);// → 0	0	OK
        noTeenSum(15, 16, 1);// → 32	32	OK
        noTeenSum(15, 15, 19);// → 30	30	OK
        noTeenSum(15, 19, 16);// → 31	31	OK
        noTeenSum(5, 17, 18);// → 5	5	OK
        noTeenSum(17, 18, 16);// → 16	16	OK
        noTeenSum(17, 19, 18);// → 0	0	OK
    }
}
