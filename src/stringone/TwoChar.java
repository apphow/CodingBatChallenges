package stringone;

//      Given a string and an index, return a string
//      length 2 starting at the given index.
//      If the index is too big or too small to
//      define a string length 2, use the first 2 chars. The string length will be at least 2.
//
//
//        twoChar("java", 0) → "ja"
//        twoChar("java", 2) → "va"
//        twoChar("java", 3) → "ja"
public class TwoChar {

    public static String twoChar(String str, int index) {

        if(str.length() <= index + 1 || index < 0) {
            System.out.println(str.substring(0, 2));
            return str.substring(0, 2);
        }
        System.out.println(str.substring(index, index + 2));
        return str.substring(index, index + 2);
    }

    public static void main(String[] args) {
        twoChar("java", 0);
        twoChar("java", 2);
        twoChar("java", 3);
    }
}
