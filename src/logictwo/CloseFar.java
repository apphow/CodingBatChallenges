package logictwo;
//  Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.
//
//        closeFar(1, 2, 10) → true
//        closeFar(1, 2, 3) → false
//        closeFar(4, 1, 3) → true

public class CloseFar {

    public static boolean closeFar(int a, int b, int c) {
        if (Math.abs(a - b) <= 1 && Math.abs(c - b) >= 2 && Math.abs(c - a) >= 2) {
            System.out.println(true);
            return true;
        }
        if (Math.abs(a - c) <= 1 && Math.abs(b - a) >= 2 && Math.abs(b - c) >= 2) {
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }

    public static void main(String[] args) {
        closeFar(1, 2, 10);// → true	true	OK
        closeFar(1, 2, 3);// → false	true	X
        closeFar(4, 1, 3);// → true	true	OK
        closeFar(4, 5, 3);// → false	false	OK
        closeFar(4, 3, 5);// → false	false	OK
        closeFar(-1, 10, 0);// → true	true	OK
        closeFar(0, -1, 10);// → true	true	OK
        closeFar(10, 10, 8);// → true	true	OK
        closeFar(10, 8, 9);// → false	false	OK
        closeFar(8, 9, 10);// → false	true	X
        closeFar(8, 9, 7);// → false	false	OK
        closeFar(8, 6, 9);// → true	true	OK
    }
}
