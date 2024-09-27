package TwoPointer;

public class LongestValidPalindrome {
    static int isValid(String s, int L, int R) {

        if (L > R) {
            return 0;
        }
        if (s == null) {
            return 0;
        }
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }

        return R - L - 1;
    }

    public static String longestPalindrome(String s) {
        int max = 0;
        int len = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            len = Math.max(isValid(s, i, i), isValid(s, i, i + 1));
            if (len > max) {
                max = len;
                start = i - (len - 1) / 2;
            }
        }
        return s.substring(start, start + max);
    }

    public static void main(String[] args) {
        String s = "abbaa";
        System.out.println(longestPalindrome(s));
    }
}
