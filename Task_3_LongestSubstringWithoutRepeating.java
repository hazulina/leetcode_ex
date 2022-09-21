import java.util.HashSet;
import java.util.Set;

public class Task_3_LongestSubstringWithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        } else {
            Set<Character> characterSet = new HashSet<>();
            int max = 1;
            int startIndex = 0;
            for (int i = 0; i < s.length(); i++) {
                if (!characterSet.contains(s.charAt(i))) {
                    characterSet.add(s.charAt(i));
                } else {
                    if (characterSet.size() > max) {
                        max = characterSet.size();
                    }
                    characterSet.clear();
                    i = startIndex;
                    startIndex++;
                }
            }
            return Math.max(max, characterSet.size());
        }
    }
}
