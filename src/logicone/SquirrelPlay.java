package logicone;

// The squirrels in Palo Alto spend most of the day playing.
// In particular, they play if the temperature is between
// 60 and 90 (inclusive). Unless it is summer, then the upper
// limit is 100 instead of 90. Given an int temperature and a
// boolean isSummer, return true if the squirrels play and
// false otherwise.
//
//        squirrelPlay(70, false) → true
//        squirrelPlay(95, false) → false
//        squirrelPlay(95, true) → true
public class SquirrelPlay {

    public static boolean squirrelPlay(int temp, boolean isSummer) {
        if(((temp >= 60 && temp <= 90) && !isSummer) || (temp >= 60 && temp <= 100 && isSummer)) {
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }

    public static void main(String[] args) {
        squirrelPlay(70, false);
        squirrelPlay(95, false);
        squirrelPlay(95, true);
        squirrelPlay(90, false);
        squirrelPlay(90, true);
        squirrelPlay(50, false);
        squirrelPlay(50, true);
        squirrelPlay(100, false);
        squirrelPlay(100, true);
        squirrelPlay(105, true);
        squirrelPlay(59, false);
        squirrelPlay(59, true);
        squirrelPlay(60, false);
    }
}

