package arrayone;
import java.util.Arrays;

//    Given an array of ints length 3, return a new
//    array with the elements in reverse order,
//    so {1, 2, 3} becomes {3, 2, 1}.

//        reverse3([1, 2, 3]) → [3, 2, 1]
//        reverse3([5, 11, 9]) → [9, 11, 5]
//        reverse3([7, 0, 0]) → [0, 0, 7]

public class ReverseThree {

    public static int[] reverse3(int[] nums) {
       int[] newOne = new int[3];
//       newOne[0]= nums[2];
//       newOne[1] = nums[1];
//       newOne[2] = nums[0];
//        System.out.println(Arrays.toString(newOne));
//       return newOne;

        int first = nums[2];
        int second = nums[1];
        int last = nums[0];
        newOne = new int[]{first, second, last};

        System.out.println(Arrays.toString(newOne));
        return newOne;
    }

    public static void main(String[] args) {
        int[] news = {1, 2, 3};
        reverse3(news);

    }
}
