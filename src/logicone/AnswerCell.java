package logicone;
// Your cell phone rings. Return true if you should answer
// it. Normally you answer, except in the morning you only
// answer if it is your mom calling. In all cases, if you
// are asleep, you do not answer.
//
//        answerCell(false, false, false) → true
//        answerCell(false, false, true) → false
//        answerCell(true, false, false) → false
public class AnswerCell {
    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if(isMorning && isMom && !isAsleep) {
            return true;
        } if (isMorning || isAsleep) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("true: " + answerCell(false, false, false));
        System.out.println("false: " + answerCell(false, false, true));
        System.out.println("false: " + answerCell(true, false, false));
        System.out.println("true: " + answerCell(true, true, false));
        System.out.println("true: " + answerCell(false, true, false));
        System.out.println("false: " + answerCell(true, true, true));
    }
}
