package SlidingWindow;

public class MaximumSumArraySizeK {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int sol = minSubArrayLen(3, arr);
        System.out.println(sol);
    }

    static int minSubArrayLen(int s, int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (i >= s - 1) {
                maxSum = Math.max(maxSum, currentSum);
                currentSum -= nums[i - s + 1];
            }
        }
        return maxSum;
    }
}
