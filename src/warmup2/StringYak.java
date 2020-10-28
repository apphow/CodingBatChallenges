package warmup2;
// Suppose the string "yak" is unlucky.
// Given a string, return a version where
// all the "yak" are removed, but the "a"
// can be any char. The "yak" strings will
// not overlap.
//
// stringYak("yakpak") → "pak"
// stringYak("pakyak") → "pak"
// stringYak("yak123ya") → "123ya"
// stringYak("yik123");
public class StringYak {

    public static String stringYak(String str) {
        String temp = "";
        for(int i = 0; i< str.length(); i++) {
            if(i+2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i = i + 2;
            } else {
                temp += str.charAt(i);
            }
        }
        System.out.println(temp);
        return temp;

    }

    public static void main(String[] args) {
        stringYak("yakpak");
        stringYak("pakyak");
        stringYak("yak123ya");
        stringYak("yak");
        stringYak("yakxxxyak");
        stringYak("HiyakHi");
        stringYak("xxxyakyyyakzzz");
        stringYak("yik123");

    }
}
