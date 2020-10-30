package logicone;
// Given 2 ints, a and b, return their sum.
// However, "teen" values in the range 13..19
// inclusive, are extra lucky. So if either
// value is a teen, just return 19.
//
//        teenSum(3, 4) → 7
//        teenSum(10, 13) → 19
//        teenSum(13, 2) → 19
public class TeenSum {
    public static int teenSum(int a, int b){
        if(a >= 13 && a <= 19 || b >= 13 && b <= 19) {
            System.out.println(19);
            return 19;
        }
        System.out.println(a + b);
        return a + b;
    }

    public static void main(String[] args) {
        teenSum(3, 4);
        teenSum(10, 13);
        teenSum(13, 2);
        teenSum(3, 19);
        teenSum(13, 13);
        teenSum(10, 10);
        teenSum(6, 14);
        teenSum(15, 2);
        teenSum(19, 19);
        teenSum(19, 20);
        teenSum(2, 18);
        teenSum(12, 4);
        teenSum(2, 20);
        teenSum(2, 17);
        teenSum(2, 16);
        teenSum(6, 7);

    }
}
