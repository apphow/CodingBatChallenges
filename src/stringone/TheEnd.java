package stringone;

//        Given a string, return a string length 1 from its front,
//        unless front is false, in which case return a string
//        length 1 from its back. The string will be non-empty.
//
//
//        theEnd("Hello", true) → "H"
//        theEnd("Hello", false) → "o"
//        theEnd("oh", true) → "o"
public class TheEnd {

    public static String theEnd(String str, boolean front) {

        if(!front) {
            System.out.println(str.substring(str.length() -1));
            return str.substring(str.length() -1);
        }
        System.out.println(str.substring(0, 1));
        return str.substring(0, 1);
    }

    public static void main(String[] args) {
        theEnd("Hello", true);
        theEnd("Hello", false);
        theEnd("oh", true);
    }
}
