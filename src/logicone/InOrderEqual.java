package logicone;

public class InOrderEqual {
    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (!equalOk && c > b && b > a) {
            System.out.println(true);
            return true;
        }
        if (equalOk && c >= b && b >= a) {
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }

    public static void main(String[] args) {
        inOrderEqual(2, 5, 11, false);
        inOrderEqual(5, 7, 6, false);
        inOrderEqual(5, 5, 7, true);
        inOrderEqual(5, 5, 7, false);
        inOrderEqual(2, 5, 4, false);
        inOrderEqual(3, 4, 3, false);
        inOrderEqual(3, 4,4, false);
        inOrderEqual(3, 4, 3, true);
        inOrderEqual(3, 4, 4, true);
        inOrderEqual(1, 5, 5, true);
        inOrderEqual(5, 5, 5, true);
        inOrderEqual(2, 2, 1, true);
        inOrderEqual(9, 2, 2, true);
        inOrderEqual(0, 1, 0, true);
    }
}