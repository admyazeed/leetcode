import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> letters = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            if (letters.containsKey(c)) {
                letters.replace(c, letters.get(c) + 1);
            } else {
                letters.put(c, 1);
            }
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (letters.containsKey(c) && letters.get(c) > 0) {
                letters.replace(c, letters.get(c) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}