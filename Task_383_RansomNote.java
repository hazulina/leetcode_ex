import java.util.HashMap;
import java.util.Map;

public class Task_383_RansomNote {
  
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ransomNoteMap = getMapFromString(ransomNote);
        Map<Character, Integer> magazineMap = getMapFromString(magazine);
        for (Map.Entry<Character, Integer> entry : ransomNoteMap.entrySet()) {
            if (!magazineMap.containsKey(entry.getKey()) || entry.getValue() > magazineMap.get(entry.getKey())) {
                return false;
            }
        }
        return true;
    }

    public HashMap<Character, Integer> getMapFromString(String input) {
        HashMap<Character, Integer> answer = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if (!answer.containsKey(input.charAt(i))) {
                answer.put(input.charAt(i), 1);
            } else {
                answer.put(input.charAt(i), answer.get(input.charAt(i)) + 1);
            }
        }
        return answer;
    }   
}
