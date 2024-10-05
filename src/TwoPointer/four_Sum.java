package TwoPointer;

import java.util.Arrays;

public class four_Sum {
    public static int[] sum4(int[] nums, int target) {
        Arrays.sort(nums);
        int curr = 0;
        int curr2 = 1;
        int left = 2;
        int right = nums.length - 1;
        while (curr2 < nums.length - 2) {
            if (nums.length == 4 && nums[curr] + nums[curr2] + nums[left] + nums[right] == target) {

                return new int[]{curr, curr2, left, right};

            }
            if (nums[curr] + nums[curr2] + nums[left] + nums[right] == target) {
                return new int[]{nums[curr], nums[curr2],nums[left],nums[right]};
            }
            if (left >= right) {
                curr2++;
                curr++;
                left = curr2 + 1;
                right = nums.length - 1;
            } else if (nums[curr] + nums[curr2] + nums[left] + nums[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{-1, -1, -1, -1};
    }

    public static void main(String[] args) {
        Arrays.stream(sum4(new int[]{1, 0, 2, 0, 2, 5, 4, 3, 4, 1}, 5))
                .forEach(System.out::println);
    }
}
