package arrayone;
import java.util.Arrays;

//  Given 2 int arrays, a and b, each length 3,
//  return a new array length 2 containing their
//  middle elements.
//
//  middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
//  middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
//  middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
public class MiddleWay {

    public static int[] middleWay(int[] a, int[] b) {

        int[] newLength = new int[2];
        newLength[0] = a[1];
        newLength[1] = b[1];
        System.out.println(Arrays.toString(newLength));
        return newLength;
    }

    public static void main(String[] args) {
        int[] oneA = {1, 2, 3};
        int[] oneB = {4, 5, 6};
        int[] twoA = {7, 7, 7};
        int[] twoB = {3, 8, 0};
        int[] threeA = {5, 2, 0};
        int[] threeB = {1, 4, 5};

        middleWay(oneA, oneB);
        middleWay(twoA, twoB);
        middleWay(threeA, threeB);
    }
}
