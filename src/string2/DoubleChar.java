package string2;

// Given a string, return a string where for every char in the original, there are two chars.
//
//        doubleChar("The") → "TThhee"
//        doubleChar("AAbb") → "AAAAbbbb"
//        doubleChar("Hi-There") → "HHii--TThheerree"
public class DoubleChar {

    public static String doubleChar(String str) {
        String newString = "";
        for(int i = 0; i < str.length(); i++){
            newString += str.charAt(i);
            newString += str.charAt(i);
        }
        System.out.println(newString);
        return newString;
    }

    public static void main(String[] args) {
        doubleChar("The"); // → "TThhee"	"TThhee"	OK
        doubleChar("AAbb"); // → "AAAAbbbb"	"AAAAbbbb"	OK
        doubleChar("Hi-There"); // → "HHii--TThheerree"	"HHii--TThheerree"	OK
        doubleChar("Word!"); // → "WWoorrdd!!"	"WWoorrdd!!"	OK
        doubleChar("!!"); // → "!!!!"	"!!!!"	OK
        doubleChar(""); // → ""	""	OK
        doubleChar("a"); // → "aa"	"aa"	OK
        doubleChar("."); // → ".."	".."	OK
        doubleChar("aa"); // → "aaaa"	"aaaa"	OK
    }
}
