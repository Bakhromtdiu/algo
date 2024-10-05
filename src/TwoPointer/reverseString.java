package TwoPointer;

public class reverseString {
    public static String reverse(String s) {
        s = s.replaceAll("\\s+", " ");
        char[] chars = s.toCharArray();
        //reverse all first
        rev(chars, 0, chars.length - 1);

        int strLeng = chars.length - 1;
        for (int start = 0, end = 0; end <= strLeng; ++end) {
            if (chars[end] == ' ' || end == strLeng) {
                int endIdx = (end == strLeng) ? end : end - 1;
                rev(chars, start, endIdx);
                start = end + 1;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        System.out.println(s);
    }

    public static void rev(char[] c, int start, int end) {
        while (start < end) {
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start++;
            end--;
        }
    }
}
