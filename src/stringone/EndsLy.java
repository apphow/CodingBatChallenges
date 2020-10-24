package stringone;

//    Given a string, return true if it ends in "ly".
//
//
//        endsLy("oddly") → true
//        endsLy("y") → false
//        endsLy("oddy") → false
public class EndsLy {

    public static boolean endsLy(String str) {
        if(str.length() < 2) {
            System.out.println(false);
            return false;
        }
        String lastTwo = str.substring(str.length() -2);
        if(lastTwo.equals("ly")) {
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }

    public static void main(String[] args) {
        endsLy("oddly");
        endsLy("y");
        endsLy("oddy");
    }


}
