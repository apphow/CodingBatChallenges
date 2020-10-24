package stringone;
//        Given a string, return a version without both
//                the first and last char of the string. The string
//                may be any length, including 0.
//
//
//        withouEnd2("Hello") → "ell"
//        withouEnd2("abc") → "b"
//        withouEnd2("ab") → ""
public class WithouEnd2 {

    public static String withouEnd2(String str) {
        if(str.length() < 2) {
            return "";
        }
        System.out.println(str.substring(1, str.length() - 1));
        return str.substring(1, str.length() -1);
    }

    public static void main(String[] args) {
        withouEnd2("Hello");
        withouEnd2("abc");
        withouEnd2("ab");
    }
}
