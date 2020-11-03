package string2;

// Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
//
//        countCode("aaacodebbb") → 1
//        countCode("codexxcode") → 2
//        countCode("cozexxcope") → 2
public class CountCode {

    public static int countCode(String str) {
        int count = 0;
        for(int i = 0; i < str.length() -3; i++) {
            if(str.substring(i, i+ 2).equals("co") && str.charAt(i + 3) == 'e'){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        countCode("aaacodebbb"); // → 1	1	OK
        countCode("codexxcode"); // → 2	2	OK
        countCode("cozexxcope"); // → 2	2	OK
        countCode("cozfxxcope"); // → 1	1	OK
        countCode("xxcozeyycop"); // → 1	1	OK
        countCode("cozcop"); // → 0	0	OK
        countCode("abcxyz"); // → 0	0	OK
        countCode("code"); // → 1	1	OK
        countCode("ode"); // → 0	0	OK
        countCode("c"); // → 0	0	OK
        countCode(""); // → 0	0	OK
        countCode("AAcodeBBcoleCCccoreDD"); // → 3	3	OK
        countCode("AAcodeBBcoleCCccorfDD"); // → 2	2	OK
        countCode("coAcodeBcoleccoreDD"); // → 3	3	OK
    }
}
