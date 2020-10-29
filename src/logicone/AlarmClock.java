package logicone;

/**
 * Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean
 * indicating if we are on vacation, return a string of the form "7:00" indicating
 * when the alarm clock should ring. Weekdays, the alarm should be "7:00"
 * and on the weekend it should be "10:00". Unless we are on vacation -- then on
 * weekdays it should be "10:00" and weekends it should be "off".
 *
 * alarmClock(1, false) → "7:00"
 * alarmClock(5, false) → "7:00"
 * alarmClock(0, false) → "10:00"
 */
public class AlarmClock {
    public static String alarmClock(int day, boolean vacation) {
        int Mon = 1, Tue = 2, Wed = 3, Thu = 4, Fri = 5, Sat = 6, Sun = 0;
        if ((day == 1 || day == 2 || day == 3 || day == 4 || day == 5) && !vacation) {
            System.out.println("7:00");
            return "7:00";
        }
        if ((day == 1 || day == 2 || day == 3 || day == 4 || day == 5) && vacation) {
            System.out.println("10:00");
            return "10:00";
        }
        if ((day == 6 || day == 0) && !vacation) {
            System.out.println("10:00");
            return "10:00";
        }
        System.out.println("off");
        return "off";
    }

    public static void main(String[] args) {
        alarmClock(1, false);
        alarmClock(5, false);
        alarmClock(0, false);
        alarmClock(6, false);
        alarmClock(0, true);
        alarmClock(6, true);
        alarmClock(1, true);
        alarmClock(3, true);
        alarmClock(5, true);
    }
}
