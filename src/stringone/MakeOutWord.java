package stringone;

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
