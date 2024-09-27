package TwoPointer;

import java.util.Arrays;

public class sumOfThree {
    public static boolean threeSum(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int curr = 0;
        while (curr < nums.length - 2) {
            if (left >= right) {
                ++curr;
                left = curr + 1;
                right = nums.length - 1;
                continue;
            }
            if (nums[left] + nums[right] + nums[curr] == target) {
                return true;
            } else if (nums[left] + nums[right] + nums[curr] < target) {
                left++;
            } else {
                right--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(findSumOfThree(new int[]{-1, 0, 1, 2, -1, -4}, 0));
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}, 0));
    }

    public static boolean findSumOfThree(int[] nums, int target) {
        if (nums.length == 3 && nums[0] + nums[1] + nums[2] != target) {
            return false;
        }
        Arrays.sort(nums);
        int curr = 0, left = 1, right = nums.length - 1;
        while (curr < nums.length - 2) {
            if (right <= left) {
                curr++;
                left = curr + 1;
                right = nums.length - 1;
                continue;
            }

            if (nums[curr] + nums[left] + nums[right] == target) return true;

            else if (nums[curr] + nums[left] + nums[right] > target) {
                right--;
            } else {
                left++;
            }
        }

        // Replace this placeholder return statement with your code
        return false;
    }
}
