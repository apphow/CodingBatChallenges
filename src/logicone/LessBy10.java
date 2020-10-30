package logicone;
// Given three ints, a b c, return true if
// one of them is 10 or more less than one
// of the others.

//        lessBy10(1, 7, 11) → true
//        lessBy10(1, 7, 10) → false
//        lessBy10(11, 1, 7) → true
public class LessBy10 {
    public static boolean lessBy10(int a, int b, int c) {
        if((a + 10 <= c) || (a + 10 <= b) || (b + 10 <= c) || (b + 10 <= a) || (c + 10 <= a) || (c + 10 <= b)) {
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }

    public static void main(String[] args) {
        lessBy10(1, 7, 11);
        lessBy10(1, 7, 10);
        lessBy10(11, 1, 7);
        lessBy10(10, 7, 1);
        lessBy10(-10, 2, 2);
        lessBy10(2, 11, 11);
        lessBy10(3, 3, 30);
        lessBy10(3, 3, 3);
        lessBy10(10, 1, 11);
        lessBy10(10, 11, 1);
        lessBy10(10, 11, 2);
        lessBy10(3, 30, 3);
        lessBy10(2, 2, -8);
        lessBy10(2, 8, 12);





    }
}
