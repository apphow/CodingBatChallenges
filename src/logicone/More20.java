package logicone;


import java.sql.SQLOutput;

// Return true if the given non-negative number
// is 1 or 2 more than a multiple of 20. See also:
// Introduction to Mod
//
//        more20(20) → false
//        more20(21) → true
//        more20(22) → true
public class More20 {

    public static boolean more20(int n) {
        if(n % 20 == 1 || n % 20 == 2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Should return false: " +more20(20));
        System.out.println("Should return true: " + more20(21));
        System.out.println("Should return true: " + more20(22));
        System.out.println("Should return false: " +more20(23));
        System.out.println("Should return false: " +more20(25));
        System.out.println("Should return false: " +more20(30));
        System.out.println("Should return false: " +more20(31));
        System.out.println("Should return false: " +more20(59));
        System.out.println("Should return false: " +more20(60));
        System.out.println("Should return true: " + more20(61));
        System.out.println("Should return true: " + more20(62));
        System.out.println("Should return false: " +more20(1020));
        System.out.println("Should return true: " + more20(1021));
        System.out.println("Should return false: " +more20(1000));
        System.out.println("Should return true: " + more20(1001));
        System.out.println("Should return false: " +more20(50));
        System.out.println("Should return false: " +more20(55));
        System.out.println("Should return false: " +more20(40));
        System.out.println("Should return true: " + more20(41));
        System.out.println("Should return false: " +more20(39));
        System.out.println("Should return true: " + more20(42));


    }
}
