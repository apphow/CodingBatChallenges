package logictwo;
// We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each)
// and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given
// bricks. This is a little harder than it looks and can be done without any loops. See also: Introduction
// to MakeBricks

//        makeBricks(3, 1, 8) → true
//        makeBricks(3, 1, 9) → false
//        makeBricks(3, 2, 10) → true

public class MakeBricks {

    public static boolean makeBricks(int small, int big, int goal) {
//        int maxBigBricks = goal / 5; // maximum number of big bricks needed to reach goal
////          // if goal is 8 8/5 = 1 so 1 big brick is needed
//        int smallBricksNeeded = goal % 5; // remainder needed
//        if(big >= maxBigBricks || small >= smallBricksNeeded) {
//            System.out.println(true);
//            return true;
//        }
//        System.out.println(false);
//        return false;

        if (goal > big * 5 + small) { // wouldn't have enough
            System.out.println(false);
            return false;
        }
        if (goal % 5 <= small) { // check to see if we have enough small bricks
            // since big bricks are 5 inches, whatever
            // remainder will be amount of small bricks
            // we need.
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }


    public static void main(String[] args) {
        makeBricks(3, 1, 8);
        makeBricks(3, 1, 9);
        makeBricks(3, 2, 10);
        makeBricks(3, 2, 8);
        makeBricks(3, 2, 9);
        makeBricks(6, 1, 11);
        makeBricks(6, 0, 11);
        makeBricks(1, 4, 11);
        makeBricks(0, 3, 10);
        makeBricks(1, 4, 12);
        makeBricks(3, 1, 7);
        makeBricks(1, 1, 7);
        makeBricks(2, 1, 7);
        makeBricks(7, 1, 11);
        makeBricks(7, 1, 8);
        makeBricks(7, 1, 13);
        makeBricks(43, 1, 46);
        makeBricks(40, 1, 46);
        makeBricks(40, 2, 47);
        makeBricks(40, 2, 50);
        makeBricks(40, 2, 52);
        makeBricks(22, 2, 33);
        makeBricks(0, 2, 10);
        makeBricks(1000000, 1000, 1000100);
        makeBricks(2, 1000000, 100003);
        makeBricks(20, 0, 19);
        makeBricks(20, 0, 21);
        makeBricks(20, 4, 51);
        makeBricks(20, 4, 39);
    }
}


//        if (goal > big * 5 + small)
//            return false;
//
//        if (goal % 5 <= small)
//            return true;

