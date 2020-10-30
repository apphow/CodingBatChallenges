package logicone;
// Given three ints, a b c, return true if b is greater
// than a, and c is greater than b. However, with the
// exception that if "bOk" is true, b does not need
// to be greater than a.
//
//        inOrder(1, 2, 4, false) → true
//        inOrder(1, 2, 1, false) → false
//        inOrder(1, 1, 2, true) → true
public class InOrder {

    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        if(b > a && c > b && !bOk) {
            System.out.println(true);
            return true;
        } if(bOk && c > b) {
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }

    public static void main(String[] args) {
        inOrder(1, 2, 4, false);
        inOrder(1,2,1, false);
        inOrder(1, 1, 2, true);
        inOrder(3, 2, 4, false);
        inOrder(2, 3, 4, false);
        inOrder(3, 2, 4, true);
        inOrder(4, 2, 2, true);
        inOrder(4, 5, 2, true);
        inOrder(2, 4, 6, true);
        inOrder(7, 9, 10, false);
        inOrder(7, 5, 6, true);
        inOrder(7, 5, 4, true);
    }
}
