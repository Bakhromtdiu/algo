package TwoPointer;

import java.util.Arrays;

public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Arrays.stream(twoSum(new int[]{3, 7, 6, 15}, 9))
                .forEach(System.out::println);
    }
}
