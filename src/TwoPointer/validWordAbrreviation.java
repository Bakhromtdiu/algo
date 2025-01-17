package TwoPointer;

public class validWordAbrreviation {

    public static boolean isValid(String word, String abbr) {
        int i = 0, j = 0;

        while (i < word.length() && j < abbr.length()) {
            if (word.charAt(i) == abbr.charAt(j)) {
                ++i;
                ++j;
                continue;
            }
            if (abbr.charAt(j) > '9' || abbr.charAt(j) <= '0') {
                return false;
            }

            int start = j;
            while (j < abbr.length() && abbr.charAt(j) < '9' && abbr.charAt(j) > 0) {
                ++j;
            }
            int num = Integer.parseInt(abbr.substring(start, j));
            i += num;
        }

        return i == word.length() && j == abbr.length();
    }

    public static void main(String[] args) {
        System.out.println(isValid("innovation", "in5ion"));
    }
}
