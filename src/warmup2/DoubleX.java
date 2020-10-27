package warmup2;

public class DoubleX {
    public static boolean doubleX(String str) {
        int i = str.indexOf("x");
        if(i < 0) {
            System.out.println(false);
            return false;
        }if(i + 1 >= str.length()) {
            System.out.println(false);
            return false;
        }
        if(str.substring(i + 1, i + 2).equals("x")) {
            System.out.println(true);
            return true;
        }
        // String x = str.substring(i);
        // if(x.startsWith("xx")){
        //   return true;
        System.out.println(false);
        return false;
    }

    public static void main(String[] args) {
        doubleX("axxbb");
        doubleX("axaxax");
        doubleX("xxxxx");
        doubleX("xaxxx");
        doubleX("aaaax");
        doubleX("");
        doubleX("abc");
        doubleX("x");
        doubleX("xx");
        doubleX("xax");
        doubleX("xaxx");
    }

}
