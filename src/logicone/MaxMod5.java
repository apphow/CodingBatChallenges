package logicone;
// Given two int values, return whichever
// value is larger. However if the two
// values have the same remainder when
// divided by 5, then the return the
// smaller value. However, in all cases,
// if the two values are the same, return
// 0. Note: the % "mod" operator computes
// the remainder, e.g. 7 % 5 is 2.
//
//        maxMod5(2, 3) → 3
//        maxMod5(6, 2) → 6
//        maxMod5(3, 2) → 3

public class MaxMod5 {
    public static int maxMod5(int a, int b) {

            if(a % 5 == b % 5) {
                if(a < b) {
                    return a;
                } if(b < a) {
                    return b;
                }
            }
            if (a == b) {
                return 0;
            }
            if( a > b ) {
                return a;
            }
            return b;
        }

    public static void main(String[] args) {
        System.out.println("2, 3 should return 3: " + maxMod5(2, 3));
        System.out.println("6, 2 should return 6: " + maxMod5(6, 2));
        System.out.println("3, 2 should return 3: " + maxMod5(3, 2));
        System.out.println("8, 12, should return 12: " + maxMod5(8, 12));
        System.out.println("7, 12, should return 7: " + maxMod5(7, 12));
        System.out.println("11, 6, should return 6: " + maxMod5(11, 6));
        System.out.println("2, 7 should return 2: " + maxMod5(2, 7));
        System.out.println("7, 7 should return 0: " + maxMod5(7, 7));
        System.out.println("9, 1 should return 9: " + maxMod5(9, 1));
        System.out.println("9, 14 should return 9: " + maxMod5(9, 14));
        System.out.println("1, 2 should return 2: " + maxMod5(1, 2));
    }
}
