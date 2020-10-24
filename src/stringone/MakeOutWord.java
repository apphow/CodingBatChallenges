package stringone;

//Given an "out" string length 4, such as "<<>>", and a word,
//        return a new string where the word is in the middle
//        of the out string, e.g. "<<word>>". Note: use
//        str.substring(i, j) to extract the String starting
//        at index i and going up to but not including index j.
//
//        makeOutWord("<<>>", "Yay") → "<<Yay>>"
//        makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
//        makeOutWord("[[]]", "word") → "[[word]]"

public class MakeOutWord {

    public static String makeOutWord(String out, String word) {
        String parsed = out.substring(0, 2);
        String parsed2 = out.substring(2);

        return parsed + word + parsed2;
    }

    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>", "Yay"));
        System.out.println(makeOutWord("<<>>", "WooHoo"));
        System.out.println(makeOutWord("[[]]", "word"));
    }
}
