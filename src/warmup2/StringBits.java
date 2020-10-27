package warmup2;
// Given a string, return a new string made of every
// other char starting with the first, so "Hello"
// yields "Hlo".
//
// stringBits("Hello") → "Hlo"
// stringBits("Hi") → "H"
// stringBits("Heeololeo") → "Hello"
public class StringBits {

    public static String stringBits(String str) {
        String newStr = "";
        for(int i = 0; i < str.length(); i = i+2) {
            newStr+= str.charAt(i);
        }
        System.out.println(newStr);
        return newStr;
    }

    public static void main(String[] args) {
        stringBits("Hello");
        stringBits("Hi");
        stringBits("Heeololeo");
        stringBits("HiHiHi");
        stringBits("");
        stringBits("Greetings");
        stringBits("Chocoate");
        stringBits("pi");
        stringBits("Hello Kitten");
        stringBits("hxaxpxpxy");
    }
}
