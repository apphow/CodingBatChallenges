package warmup2;
// Given a string and a non-negative int n, return a
// larger string that is n copies of the original string.
//
// stringTimes("Hi", 2) → "HiHi"
// stringTimes("Hi", 3) → "HiHiHi"
// stringTimes("Hi", 1) → "Hi"
public class StringTimes {

    public static String stringTimes(String str, int n) {
        String newStr = "";
        for(int i = 0; i < n; i++){
            newStr += str;
        }
        System.out.println(newStr);
        return newStr;
    }

    public static void main(String[] args) {
        stringTimes("Hi", 2);
        stringTimes("Hi", 3);
        stringTimes("Hi", 1);
        stringTimes("Hi", 0);
        stringTimes("Hi", 5);
        stringTimes("Oh Boy!", 2);
        stringTimes("x", 4);
        stringTimes("", 4);
        stringTimes("code", 2);
        stringTimes("code", 3);

    }

}
