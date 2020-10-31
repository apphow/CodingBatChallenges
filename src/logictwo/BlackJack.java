package logictwo;
//Given 2 int values greater than 0, return whichever
// value is nearest to 21 without going over. Return 0
// if they both go over.
//
//        blackjack(19, 21) → 21
//        blackjack(21, 19) → 21
//        blackjack(19, 22) → 19
public class BlackJack {

public static int blackjack(int a, int b) {
    if(a > 21) a =0;
    if(b > 21) b =0;
    if(a > b) {
        System.out.println(a);
        return a;
    }
    System.out.println(b);
    return b;
}

//   if(a > 21 && b <=21) {
//     return b;
//   }if(b > 21 && a <=21) {
//     return a;
//   }
//   if(a > 21 && b > 21) {
//     return 0;
//   }
//     if(21-a < 21-b) {
//       return a;
//     }

//     return b;

// }

    public static void main(String[] args) {
        blackjack(19, 21);// → 21	21	OK
        blackjack(21, 19);// → 21	21	OK
        blackjack(19, 22);// → 19	19	OK
        blackjack(22, 19);// → 19	19	OK
        blackjack(22, 50);// → 0	0	OK
        blackjack(22, 22);// → 0	0	OK
        blackjack(33, 1);// → 1	1	OK
        blackjack(1, 2);// → 2	2	OK
        blackjack(34, 33);// → 0	0	OK
        blackjack(17, 19);// → 19	19	OK
        blackjack(18, 17);// → 18	18	OK
        blackjack(16, 23);// → 16	16	OK
        blackjack(3, 4);// → 4	4	OK
        blackjack(3, 2);// → 3	3	OK
        blackjack(21, 20);// → 21	21	OK
    }
}
