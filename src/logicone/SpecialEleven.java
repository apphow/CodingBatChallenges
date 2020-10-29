package logicone;

// We'll say a number is special if it is a multiple of 11 or if
// it is one more than a multiple of 11. Return true if the
// given non-negative number is special. Use the % "mod"
// operator -- see Introduction to Mod
//
//        specialEleven(22) → true
//        specialEleven(23) → true
//        specialEleven(24) → false
public class SpecialEleven {

    public static boolean specialEleven(int n) {
        if(n % 11 == 0 || n % 11 == 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Should return true: " + specialEleven(22));
        System.out.println("Should return true: " + specialEleven(23));
        System.out.println("Should return false: " +specialEleven(24));
        System.out.println("Should return false: " + specialEleven(21));
        System.out.println("Should return true: " + specialEleven(11));
        System.out.println("Should return true: " + specialEleven(12));
        System.out.println("Should return false: " + specialEleven(10));
        System.out.println("Should return false: " + specialEleven(9));
        System.out.println("Should return false: " + specialEleven(8));
        System.out.println("Should return true: " + specialEleven(0));
        System.out.println("Should return true: " + specialEleven(1));
        System.out.println("Should return false: " + specialEleven(2));
        System.out.println("Should return true: " + specialEleven(121));
        System.out.println("Should return true: " + specialEleven(122));
        System.out.println("Should return false: " + specialEleven(123));
        System.out.println("Should return false: " + specialEleven(46));
        System.out.println("Should return false: " + specialEleven(49));
        System.out.println("Should return false: " + specialEleven(52));
        System.out.println("Should return false: " + specialEleven(54));
        System.out.println("Should return true: " + specialEleven(55));







    }
}
