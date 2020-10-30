package logicone;
//  You have a green lottery ticket, with ints
//  a, b, and c on it. If the numbers are all
//  different from each other, the result is 0.
//  If all of the numbers are the same, the
//  result is 20. If two of the numbers are
//  the same, the result is 10.
//
//        greenTicket(1, 2, 3) → 0
//        greenTicket(2, 2, 2) → 20
//        greenTicket(1, 1, 2) → 10
public class GreenTicket {
    public static int greenTicket(int a, int b, int c) {
        if(a == b && b == c) {
            System.out.println(20);
            return 20;
        }
        if(a == b || a == c || b == c) {
            System.out.println(10);
            return 10;
        }
        System.out.println(0);
        return 0;
    }

    public static void main(String[] args) {
        greenTicket(1, 2, 3);
        greenTicket(2, 2, 2);
        greenTicket(1, 1, 2);
        greenTicket(2, 1, 1);
        greenTicket(1, 2, 1);
        greenTicket(3, 2, 1);
        greenTicket(0, 0, 0);
        greenTicket(2, 0, 0);
        greenTicket(0, 9, 10);
        greenTicket(0, 10, 0);
        greenTicket(9, 9, 9);
        greenTicket(9, 0, 9);
    }
}
