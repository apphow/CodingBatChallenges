package stringone;

//      Given a string and an int n, return a string
//      made of the first and last n chars from the
//      string. The string length will be at least n.
//
//
//        nTwice("Hello", 2) → "Helo"
//        nTwice("Chocolate", 3) → "Choate"
//        nTwice("Chocolate", 1) → "Ce"

public class NTwice {

    public static String nTwice(String str, int n) {
        String first = str.substring(0, n);
        String last = str.substring(str.length() -n);
        System.out.println(first + last);
        return first + last;
    }

    public static void main(String[] args) {
        nTwice("Hello", 2);
        nTwice("Chocolate", 3);
        nTwice("Colcolate", 1);
    }

}
