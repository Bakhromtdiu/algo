package TwoPointer;

public class isPalindrome {

    public static boolean isPalindrome(String s) {

        int left_pointer = 0, right_pointer = s.length() - 1;
        while (left_pointer < right_pointer) {
            if (s.charAt(left_pointer) != s.charAt(right_pointer))
                return false;
            left_pointer++;
            right_pointer--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("abca"));
    }
}
