package TwoPointer;

public class isValidPalindrome {
    public static boolean isValidPalindrome(String s) {
        int left_pointer = 0, right_pointer = s.length() - 1;
        while (left_pointer < right_pointer) {
            if (s.charAt(left_pointer) != s.charAt(right_pointer)) {
                return helper(s, left_pointer++, right_pointer) || helper(s, left_pointer, right_pointer--);
            }
            left_pointer++;
            right_pointer--;
        }

        return true;
    }

    public static boolean helper(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValidPalindrome("abcddba"));
    }
}
