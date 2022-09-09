public class Solution {
    Map<Character, Integer> convertValue;
    public Solution() {
        convertValue = new HashMap<>();
        convertValue.put('I', 1);
        convertValue.put('V', 5);
        convertValue.put('X', 10);
        convertValue.put('L', 50);
        convertValue.put('C', 100);
        convertValue.put('D', 500);
        convertValue.put('M', 1000);
    }

    public int romanToInt(String s) {
        int answer = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (convertValue.get(s.charAt(i)) >= convertValue.get(s.charAt(i + 1))) {
                answer = answer + convertValue.get(s.charAt(i));
            } else {
                answer = answer - convertValue.get(s.charAt(i));
            }
        }
        answer = answer + convertValue.get(s.charAt(s.length() - 1));
        return answer;
    }
}
