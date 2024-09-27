package TwoPointer;

import java.util.Arrays;

public class removeDuplicate {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 7, 1, 3, 5, 9, 8};
        int[] numss = threeSum(nums, 8);
        Arrays.stream(numss).forEach(System.out::println);
    }

    public static int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{nums[left], nums[right]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] threeSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int curr = 0;
        while (left < right) {
            int sum = nums[left] + nums[right] + nums[curr];
            if (sum == target) {
                return new int[]{nums[left], nums[right], nums[curr]};
            }
            if (left >= right) {
                curr = curr + 1;
                left = curr + 1;
                right = nums.length - 1;
                continue;
            } else if (sum < target) {
                left++;
            } else
                right--;
        }
        return new int[]{-1, -1};
    }

}
