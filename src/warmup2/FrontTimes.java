package warmup2;
// Given a string and a non-negative int n, we'll
// say that the front of the string is the first 3
// chars, or whatever is there if the string is less
// than length 3. Return n copies of the front;
//
// frontTimes("Chocolate", 2) → "ChoCho"
// frontTimes("Chocolate", 3) → "ChoChoCho"
// frontTimes("Abc", 3) → "AbcAbcAbc"
public class FrontTimes {

    public static String frontTimes(String str, int n) {

        String front3 = str.substring(0, 3);
        String newStr = "";
        for(int i = 0; i < n; i++) {
            newStr += front3;
        }
        System.out.println(newStr);
        return newStr;
    }

    public static void main(String[] args) {
        frontTimes("Chocolate", 2);
        frontTimes("Chocolate", 3);
        frontTimes("Abc", 3);
    }
}
