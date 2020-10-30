package logicone;

//  Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers,
//  such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10
//  gives the right digit.)
//
//        shareDigit(12, 23) → true
//        shareDigit(12, 43) → false
//        shareDigit(12, 44) → false
public class ShareDigit {

    public static boolean shareDigit(int a, int b) {
        int aend = a % 10;
        int abig = a / 10;
        int bend = b % 10;
        int bbig = b / 10;

        if((aend == bend || aend == bbig) || (abig == bend || abig == bbig)) {
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }

    public static void main(String[] args) {
        shareDigit(12, 23);
        shareDigit(12, 43);
        shareDigit(12, 44);
        shareDigit(23, 12);
        shareDigit(23, 39);
        shareDigit(23, 19);
        shareDigit(30, 90);
        shareDigit(30, 91);
        shareDigit(55, 55);
        shareDigit(55, 44);

    }
}
