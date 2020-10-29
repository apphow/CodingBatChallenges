package logicone;

public class In1To10 {

    public static boolean in1To10(int n, boolean outsideMode) {
        if(outsideMode) {
            if (n <= 1 || n >= 10) {
                return true;
            } else {
                return false;
            }
        }
            if (n >= 1 && n <= 10) {
                return true;
            }

            return false;
        }

    public static void main(String[] args) {
        System.out.println("Should return true: " + in1To10(5, false));
        System.out.println("Should return false: " + in1To10(11, false));
        System.out.println("Should return true: " + in1To10(11, true));
        System.out.println("Should return true: " + in1To10(10, false));
        System.out.println("Should return true: " + in1To10(10, true));
        System.out.println("Should return true: " + in1To10(9, false));
        System.out.println("Should return false: " + in1To10(9, true));
        System.out.println("Should return true: " + in1To10(1, false));
        System.out.println("Should return true: " + in1To10(1, true));
        System.out.println("Should return false: " + in1To10(0, false));
        System.out.println("Should return true: " + in1To10(0, true));
        System.out.println("Should return false: " + in1To10(-1, false));
        System.out.println("Should return true: " + in1To10(-1, true));
        System.out.println("Should return false: " + in1To10(99, false));
        System.out.println("Should return true: " + in1To10(-99, true));
    }
}
