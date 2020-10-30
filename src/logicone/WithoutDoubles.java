package logicone;
// Return the sum of two 6-sided dice rolls,
// each in the range 1..6. However, if
// noDoubles is true, if the two dice
// show the same value, increment one
// die to the next value, wrapping around
// to 1 if its value was 6.
//
//        withoutDoubles(2, 3, true) → 5
//        withoutDoubles(3, 3, true) → 7
//        withoutDoubles(3, 3, false) → 6

public class WithoutDoubles {

    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if(noDoubles && die1 == die2) {
            die1++;
        }if(die1 == 7) {
            die1 = 1;
        }
        System.out.println(die1 + die2);
        return die1 + die2;
    }

    public static void main(String[] args) {
        withoutDoubles(2, 3, true);
        withoutDoubles(3, 3, true);
        withoutDoubles(3, 3, false);
        withoutDoubles(2, 3, false);
        withoutDoubles(5, 4, true);
        withoutDoubles(5, 4, false);
        withoutDoubles(5, 5, true);
        withoutDoubles(5, 5, false);
        withoutDoubles(6, 6, true);
        withoutDoubles(6, 6, false);
        withoutDoubles(1, 6, true);
        withoutDoubles(6, 1, false);
    }
}
