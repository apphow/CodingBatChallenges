package arrayone;

//        Given an array of ints length 3,
//        return the sum of all the elements.

//         sum3([1, 2, 3]) → 6
//         sum3([5, 11, 2]) → 18
//         sum3([7, 0, 0]) → 7
public class Sum3 {
    public static int sum3(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            count += nums[i];
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        //int[] one = {1, 2, 3};
        //int[] two = {5, 11, 2};
        int[] three = {7, 0, 0};
        int[] four = {1, 2, 1};
        int[] five = {1, 1, 1};
        int[] six = {2, 7, 2};
        sum3(new int[] {1, 2, 3});
        sum3(new int[] {5, 11, 2});
        sum3(three);
        sum3(four);
        sum3(five);
        sum3(six);

    }
}
