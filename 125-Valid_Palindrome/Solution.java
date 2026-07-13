class Solution {
    public boolean isPalindrome(String s) {
        int j = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            if (i > j) {
                break;
            }
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                continue;
            }
            while (j > i && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            j--;
        }
        return true;

    }
}