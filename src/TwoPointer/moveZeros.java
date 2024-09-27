package TwoPointer;

import java.util.Arrays;

public class moveZeros {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
         moveZeroes(nums);
        Arrays.stream(nums).forEach(System.out::println);

    }
   public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int L = 0;
        int R = 1;

        while (R < n) {
            if (nums[L] != 0) {
                R++;
                L++;
            } else if (nums[R] == 0) {
                R++;
            } else {
                int temp = nums[R];
                nums[R] = nums[L];
                nums[L] = temp;
            }
        }
    }

}
