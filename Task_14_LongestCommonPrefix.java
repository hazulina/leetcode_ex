import java.util.Arrays;

public class Task_14_LongestCommonPrefix {
  /* We take any word from the list as a key to others. 
  In int array we keep the number of occurrences of key letters in given string array.
  So if there is a common prefix the number of occurrences of key letters will be equal to given string array size.
  */
    public String longestCommonPrefix(String[] strs) {
        char[] key = strs[0].toCharArray();
        int[] prefixCount = new int[key.length];
        StringBuilder answer = new StringBuilder();
        Arrays.fill(prefixCount, 1);
        for (int i = 1; i < strs.length; i++) {
            for (int k = 0; k < key.length && k < strs[i].length(); k++) {
                if (key[k] == strs[i].charAt(k)) {
                    prefixCount[k] += 1;
                }
            }
        }
        for (int l = 0; l < prefixCount.length; l++) {
            if (prefixCount[l] != strs.length) {
                break;
            }
            answer.append(key[l]);
        }
        return answer.toString();
    }
}
