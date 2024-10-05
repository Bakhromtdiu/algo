package TwoPointer;

public class isPalindrome {

    public static boolean isPalindrome(String s) {
        int left_Pointer = 0;
        int right_Pointer = s.length() - 1;
        while (left_Pointer < right_Pointer) {
            if (s.charAt(left_Pointer) != s.charAt(right_Pointer))
                return false;
            left_Pointer++;
            right_Pointer--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
    }
}
