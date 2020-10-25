package stringone;

//    Given a string, if the first or last chars are 'x',
//            return the string without those 'x' chars,
//            and otherwise return the string unchanged.
//
//
//        withoutX("xHix") → "Hi"
//        withoutX("xHi") → "Hi"
//        withoutX("Hxix") → "Hxi"
public class withoutX {

    public static String withoutX(String str) {
        int beginning = 0;
        int ending = str.length();
        if(ending > 0 && str.substring(0, 1).equals("x")) {
            // what's faster..using charAt, or substring? if(ending > 0 && str.charAt(0) == 'x') {
            beginning = 1;
        } if(ending > 1 && str.substring(ending - 1).equals("x")) {
            // what's fast? using charAt, or substring? if(ending > 1 && str.charAt(ending) == 'x") {
            ending -= 1;
        }
        System.out.println(str.substring(beginning, ending));
        return str.substring(beginning, ending);
    }

    public static void main(String[] args) {
        withoutX("xHix");
        withoutX("Hi");
        withoutX("Hxi");
    }
}
