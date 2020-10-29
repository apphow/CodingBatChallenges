package logicone;
//Given 2 ints, a and b, return their sum.
//However, sums in the range 10..19 inclusive,
//are forbidden, so in that case just return 20.
//
//        sortaSum(3, 4) → 7
//        sortaSum(9, 4) → 20
//        sortaSum(10, 11) → 21
public class SortaSum {

    public static int sortaSum(int a, int b) {
        if(a + b >= 10 && a + b <= 20) {
            System.out.println(20);
            return 20;
        }
        System.out.println(a + b);
        return a + b;
    }

    public static void main(String[] args) {
        sortaSum(3, 4);
        sortaSum(9, 4);
        sortaSum(10, 11);
        sortaSum(12, -3);
        sortaSum(-3, 12);
        sortaSum(4, 5);
        sortaSum(4, 6);
        sortaSum(14, 7);
        sortaSum(14, 6);

    }
}
