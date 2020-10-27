package warmup2;
// Given a non-empty string like "Code" return a string
// like "CCoCodCode"

// stringSplosion("Code") -> "CCoCodCode"
// stringSplosion("abc") -> "aababc"
// stringSplosion("ab") -> "aab"
public class StringSplosion {
    public static String stringSplosion(String str) {
        String newStr = "";
        for(int i = 0; i< str.length(); i++) {

            newStr += str.substring(0, i+1);
        }
        System.out.println(newStr);
        return newStr;
    }

    public static void main(String[] args) {
        stringSplosion("Code");
        stringSplosion("abc");
        stringSplosion("ab");
        stringSplosion("x");
        stringSplosion("fade");
        stringSplosion("There");
        stringSplosion("Kitten");
        stringSplosion("Bye");
        stringSplosion("Good");
        stringSplosion("Bad");

    }
}
