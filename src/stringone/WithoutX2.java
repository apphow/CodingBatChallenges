package stringone;

public class WithoutX2 {

//    Given a string, if the first or last chars are 'x',
//    return the string without those 'x' chars, and
//    otherwise return the string unchanged.
//
//    withoutX("xHix") → "Hi"
//    withoutX("xHi") → "Hi"
//    withoutX("Hxix") → "Hxi"
//    withoutX2("xHi") → "Hi"
//    withoutX2("Hxi") → "Hi"
//    withoutX2("Hi") → "Hi"
//    withoutX2("xxHi") → "Hi"
//    withoutX2("Hix") → "Hix"
//    withoutX2("xaxb") → "axb"
//    withoutX2("xx") → ""	""
//    withoutX2("x") → ""	""
//    withoutX2("") → ""	""
//    withoutX2("Hello") → "Hello"
//    withoutX2("Hexllo") → "Hexllo"
//    withoutX2("xHxllo") → "Hxllo"

    public static String withoutX2(String str) {
        if(str.length() == 1 && str.substring(0, 1).equals("x")) {
            return "";
        }
        if(str.length() >= 2) {
            if (str.substring(0, 1).equals("x") && str.substring(1, 2).equals("x")) {
                return str.substring(2);
            }
            if (str.substring(0, 1).equals("x") && !str.substring(1, 2).equals("x")) {
                return str.substring(1);
            }
            if (str.substring(1, 2).equals("x") && !str.substring(0, 1).equals("x")) {
                return str.substring(0, 1) + str.substring(2);
            }
        }
        return str;
    }


    public static void main(String[] args) {
        System.out.println(withoutX2("xHi"));
        System.out.println(withoutX2("Hxi"));
        System.out.println(withoutX2("Hi"));
        System.out.println(withoutX2("xxHi"));
        System.out.println(withoutX2("Hix"));
        System.out.println(withoutX2("xaxb"));
        System.out.println(withoutX2("XX"));
        System.out.println(withoutX2("x"));
        System.out.println(withoutX2(""));
        System.out.println(withoutX2("Hello"));
        System.out.println(withoutX2("Hexllo"));
        System.out.println(withoutX2("xHxllo"));

    }
}
