package logicone;

//  Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number
//  of digits as a. If the sum has more digits than a, just return a without b. (Note: one way to
//  compute the number of digits of a non-negative int n is to convert it to a string with
//  String.valueOf(n) and then check the length of the string.)
//
//        sumLimit(2, 3) → 5
//        sumLimit(8, 3) → 8
//        sumLimit(8, 1) → 9
public class SumLimit {

    public static int sumLimit(int a, int b) {
        String newA = String.valueOf(a);
        String newB = String.valueOf(b);
        String sumA = String.valueOf(a + b);

        if(sumA.length() > newA.length()) {
            System.out.println(a);
            return a;
        }else {
            System.out.println(a + b);
            return a + b;
        }
    }

    public static void main(String[] args) {
        sumLimit(2, 3);
        sumLimit(8, 3);
        sumLimit(8, 1);
        sumLimit(11, 39);
        sumLimit(11, 99);
        sumLimit(0, 0);
        sumLimit(99, 0);
        sumLimit(99, 1);
        sumLimit(123, 1);
        sumLimit(1, 123);
        sumLimit(23, 60);
        sumLimit(23, 80);
        sumLimit(9000, 1);
        sumLimit(90000000, 1);
        sumLimit(9000, 1000);
    }
}
