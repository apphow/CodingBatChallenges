package logicone;
//  Given three ints, a b c, return true if it is
//  possible to add two of the ints to get the third.

//        twoAsOne(1, 2, 3) → true
//        twoAsOne(3, 1, 2) → true
//        twoAsOne(3, 2, 2) → false

public class TwoAsOne {
    public static boolean twoAsOne(int a, int b, int c) {
        if(a + b == c || b + c == a || a + c == b) {
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }

    public static void main(String[] args) {
        twoAsOne(1, 2, 3);
        twoAsOne(3, 1, 2);
        twoAsOne(3, 2, 2);
        twoAsOne(2, 3, 1);
        twoAsOne(5, 3, 2);
        twoAsOne(5, 3, 3);
        twoAsOne(2, 5, 3);
        twoAsOne(9, 5, 5);
        twoAsOne(9, 4, 5);
        twoAsOne(5, 4, 9);
        twoAsOne(3, 3, 0);
        twoAsOne(3, 3, 2);

    }
}
