package logicone;
// You are driving a little too fast, and a police officer stops you.
// Write code to compute the result, encoded as an int value: 0=no
// ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the
// result is 0. If speed is between 61 and 80 inclusive, the result
// is 1. If speed is 81 or more, the result is 2. Unless it is your
// birthday -- on that day, your speed can be 5 higher in all cases.
//
//        caughtSpeeding(60, false) → 0
//        caughtSpeeding(65, false) → 1
//        caughtSpeeding(65, true) → 0
public class CaughtSpeeding {

    public static int caughtSpeeding(int speed, boolean isBirthday) {

        if((speed <= 60 && !isBirthday) || (speed <= 65 && isBirthday)) {
            System.out.println(0);
            return 0;
        }if((speed >= 61 && speed <= 80 && !isBirthday) || (speed >= 66 && speed <= 85 && isBirthday)) {
            System.out.println(1);
            return 1;
        } if((speed >= 81 && !isBirthday) || (speed >= 86 && isBirthday)) {
            System.out.println(2);
            return 2;
        }
        System.out.println(-1);
        return -1;
    }

    public static void main(String[] args) {
        caughtSpeeding(60, false);
        caughtSpeeding(65, false);
        caughtSpeeding(65, true);
        caughtSpeeding(80, false);
        caughtSpeeding(85, false);
        caughtSpeeding(85, true);
        caughtSpeeding(70, false);
        caughtSpeeding(75, false);
        caughtSpeeding(75, true);
        caughtSpeeding(40, false);
        caughtSpeeding(40, true);
        caughtSpeeding(90, false);
    }
}
