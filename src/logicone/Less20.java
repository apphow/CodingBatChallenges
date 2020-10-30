package logicone;
// Return true if the given non-negative number is 1 or 2
// less than a multiple of 20. So for example 38 and 39
// return true, but 40 returns false.
//
//        less20(18) → true
//        less20(19) → true
//        less20(20) → false
public class Less20 {

    public static boolean less20(int n) {

        if(n % 20 == 19 || n % 20 == 18) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("true: " + less20(18));
        System.out.println("true: " + less20(19));
        System.out.println("false: " + less20(20));
        System.out.println("false: " + less20(8));
        System.out.println("false: " + less20(17));
        System.out.println("false: " + less20(23));
        System.out.println("false: " + less20(25));
        System.out.println("false: " + less20(30));
        System.out.println("false: " + less20(31));
        System.out.println("true: " + less20(58));
        System.out.println("true: " + less20(59));
        System.out.println("false: " + less20(60));
        System.out.println("false: " + less20(61));
        System.out.println("false: " + less20(62));
        System.out.println("false: " + less20(1017));
        System.out.println("true: " + less20(1018));
        System.out.println("true: " + less20(1019));
        System.out.println("false: " + less20(1020));
        System.out.println("false: " + less20(1021));
        System.out.println("false: " + less20(1022));
        System.out.println("false: " + less20(1023));
        System.out.println("false: " + less20(37));
    }
}
