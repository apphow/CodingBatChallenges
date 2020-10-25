package arrayone;

import java.util.Arrays;

public class MakePi {

//    Return an int array length 3 containing the first 3
//    digits of pi, {3, 1, 4}.
//
//    makePi() → [3, 1, 4]

    public static int[] makePi() {
        int[] pi = {3, 1, 4};

        System.out.println(Arrays.toString(pi));
            return pi;
    }

    public static void main(String[] args) {
        makePi();
    }
}
