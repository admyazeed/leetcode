class Solution {
    public String longestCommonPrefix(String[] strs) {
        CharSequence lcp = new StringBuilder(strs[0]);

        for (String str : strs){
            int subStrLength = 0;
            int i = 0;
            while (i<Math.min(lcp.length(),str.length()) && 
                    lcp.charAt(i) == str.charAt(i))
            {
                subStrLength++;
                i++;
            }
            lcp = lcp.subSequence(0, subStrLength);
        }

        return lcp.toString();
    }
}