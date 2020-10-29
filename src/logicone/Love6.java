package logicone;

//  The number 6 is a truly great number. Given two int values,
//  a and b, return true if either one is 6. Or if their sum or
//  difference is 6. Note: the function Math.abs(num) computes the
//  absolute value of a number.
//
//        love6(6, 4) → true
//        love6(4, 5) → false
//        love6(1, 5) → true
public class Love6 {

    public static boolean love6(int a, int b) {
        if((a + b == 6) || (Math.abs(a - b) == 6) || (Math.abs(b - a) == 6) || (a == 6 || b == 6)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Should = true: " + love6(6, 4));
        System.out.println("Should = false: " + love6(4, 5));
        System.out.println("Should = true: " + love6(1, 5));
        System.out.println("Should = true: " + love6(1, 6));
        System.out.println("Should = false: " + love6(1, 8));
        System.out.println("Should = true: " + love6(1, 7));
        System.out.println("Should = false: " + love6(7, 5));
        System.out.println("Should = true: " + love6(8, 2));
        System.out.println("Should = true: " + love6(6, 6));
        System.out.println("Should = false: " + love6(-6, 2));
        System.out.println("Should = true: " + love6(-4, -10));
        System.out.println("Should = false: " +love6(-7, 1));
        System.out.println("Should = true: " + love6(7, -1));
        System.out.println("Should = true: " + love6(-6, 12));
        System.out.println("Should = false: " + love6(-2, -4));
        System.out.println("Should = true: " + love6(7, 1));
        System.out.println("Should = false: " + love6(0, 9));
        System.out.println("Should = false: " + love6(8, 3));
        System.out.println("Should = true: "  +love6(3, 3));
        System.out.println("Should = false: " + love6(3, 4));
    }

}
