package TwoPointer;

public class isValidPalindrome {
    public static boolean isValidPalindrome(String s) {
        int left_Pointer = 0;
        int right_Pointer = s.length() - 1;
        while (left_Pointer < right_Pointer) {
            if (s.charAt(left_Pointer) != s.charAt(right_Pointer)) {
                return helper(s,left_Pointer+1,right_Pointer) || helper(s,left_Pointer,right_Pointer-1);
            }
            left_Pointer++;
            right_Pointer--;
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
        System.out.println(isValidPalindrome("abcccddba"));
    }
}
