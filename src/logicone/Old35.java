package logicone;


// Return true if the given non-negative number is a
// multiple of 3 or 5, but not both. Use the % "mod"
// operator
//
//        old35(3) → true
//        old35(10) → true
//        old35(15) → false
public class Old35 {
    public static boolean old35(int n) {
        if((n % 3 == 0 && n % 5 != 0) || (n % 5 == 0 && n % 3 != 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("true: " + old35(3));
        System.out.println("true: " + old35(10));
        System.out.println("false: " + old35(15));
        System.out.println("true: " + old35(5));
        System.out.println("true: " + old35(9));
        System.out.println("false: " + old35(8));
        System.out.println("false: " + old35(7));
        System.out.println("true: " + old35(6));
        System.out.println("false: " + old35(17));
        System.out.println("true: " + old35(18));
        System.out.println("false: " + old35(29));
        System.out.println("true: " + old35(20));
        System.out.println("true: " + old35(21));
        System.out.println("false: " + old35(22));
        System.out.println("false: " + old35(45));
        System.out.println("true: " + old35(99));
    }


}
