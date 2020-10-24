package stringone;

//    Given a string of odd length, return the string
//        length 3 from its middle, so "Candy"
//        yields "and". The string length will be at
//        least 3.
//
//
//        middleThree("Candy") → "and"
//        middleThree("and") → "and"
//        middleThree("solving") → "lvi"

public class MiddleThree {

    public static String middleThree(String str) {
        String middle = str.substring(str.length()/2 -1, str.length()/2 + 2);
        System.out.println(middle);
        return middle;
    }

    public static void main(String[] args) {
        middleThree("Candy");
        middleThree("and");
        middleThree("solving");
    }
}
