public class Task_5_LongestPalindromicSubstring {
    private int maxLength = 0;
    private int start = 0;

    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        for (int i = 0; i < s.length(); i++) {
            checkCharPosition(s,i,i);
            checkCharPosition(s,i,i+1);
        }
        return s.substring(start,start+maxLength);
    }
    
    private void checkCharPosition(String input, int left, int right) {
        while (left >= 0 && right < input.length()
                && input.charAt(left) == input.charAt(right)) {
            left--;
            right++;
        }
        int length = right - left - 1;
        if (maxLength < length) {
            maxLength = length;
            start = left + 1;
        }
    }
}
