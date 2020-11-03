package string2;
//Return the number of times that the string "hi" appears anywhere in the given string.
//
//        countHi("abc hi ho") → 1
//        countHi("ABChi hi") → 2
//        countHi("hihi") → 2
public class CountHi {

    public static int countHi(String str) {
        int count = 0;
        for(int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i) == 'h' && str.charAt(i+1) == 'i') {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        countHi("abc hi ho"); // → 1	1	OK
        countHi("ABChi hi"); // → 2	2	OK
        countHi("hihi"); // → 2	2	OK
        countHi("hiHIhi"); // → 2	2	OK
        countHi(""); // → 0	0	OK
        countHi("h") ; //→ 0	0	OK
        countHi("hi"); // → 1	1	OK
        countHi("Hi is no HI on ahI"); // → 0	0	OK
        countHi("hiho not HOHIhi"); // → 2	2	OK

    }
}
