package SlidingWindow;

public class minSubArrayLen {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int R = 0;
        int L = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        while (R < n) {
            sum += nums[R];
            while (sum >= target) {
                min = Math.min(min, R - L + 1);
                sum -= nums[L];
                L--;
            }
            R++;
        }
        return min;
    }

}
