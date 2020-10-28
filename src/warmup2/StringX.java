package warmup2;

// Given a string, return a version where
// all the "x" have been removed. Except
// an "x" at the very start or end should
// not be removed.
//
// stringX("xxHxix") → "xHix"
// stringX("abxxxcd") → "abcd"
//  stringX("xabxxxcdx") → "xabcdx"
public class StringX {

    public static String stringX(String str) {
        String temp = "";
        for(int i = 0; i < str.length(); i++) {
            if(!(i > 0 && i < str.length() -1 && str.charAt(i) == 'x')) {
                temp+= str.charAt(i);
            }
        }
        System.out.println(temp);
        return temp;

    }

    public static void main(String[] args) {
        stringX("xxHxix");
        stringX("abxxxcd");
        stringX("xabxxxcdx");
        stringX("xKittenx");
        stringX("Hello");
        stringX("xx");
        stringX("x");
        stringX("");
    }

}
