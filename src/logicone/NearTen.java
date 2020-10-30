package logicone;
// Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod
//
//        nearTen(12) → true
//        nearTen(17) → false
//        nearTen(19) → true
public class NearTen {

    public static boolean nearTen(int num) {
        if(num % 10 <= 2 || num % 10 >= 8) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("true: " + nearTen(12));
        System.out.println("false: " + nearTen(17));
        System.out.println("true: " + nearTen(19));
        System.out.println("true: " + nearTen(31));
        System.out.println("false: " + nearTen(6));
        System.out.println("true: " + nearTen(10));
        System.out.println("true: " + nearTen(11));
        System.out.println("true: " + nearTen(21));
        System.out.println("true: " + nearTen(22));
        System.out.println("false: " + nearTen(23));
        System.out.println("false: " + nearTen(54));
        System.out.println("false: " + nearTen(155));
        System.out.println("true: " + nearTen(158));
        System.out.println("false: " + nearTen(3));
        System.out.println("true: " + nearTen(1));
    }
}
