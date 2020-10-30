package logicone;
// You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs,
// which we'll call ab, bc, and ac. Consider the sum of the numbers in each pair.
// If any pair sums to exactly 10, the result is 10. Otherwise if the ab sum is exactly
// 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0.
//
//        blueTicket(9, 1, 0) → 10
//        blueTicket(9, 2, 0) → 0
//        blueTicket(6, 1, 4) → 10
public class BlueTicket {
    public static int blueTicket(int a, int b, int c) {
        if( a + b == 10 || b + c == 10 || a + c == 10) {
            System.out.println(10);
            return 10;
        } if((b + c  + 10 == a + b) || (a + c + 10 == a + b)) {
            System.out.println(5);
            return 5;
        }
        System.out.println(0);
        return 0;
    }

    public static void main(String[] args) {
        blueTicket(9, 1, 0);
        blueTicket(9, 2, 0);
        blueTicket(6, 1, 4);
        blueTicket(6, 1, 5);
        blueTicket(10, 0, 0);
        blueTicket(15, 0, 5);
        blueTicket(5, 15, 5);
        blueTicket(4, 11, 1);
        blueTicket(13, 2, 3);
        blueTicket(8, 4, 3);
        blueTicket(8, 4, 2);
        blueTicket(8, 4, 1);
    }
}
