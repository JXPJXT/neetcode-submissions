
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        Arrays.sort(strs);

        String str = strs[0];
        String str2 = strs[strs.length - 1];

        int minLen = Math.min(str.length(), str2.length());

        for (int i = 0; i < minLen; i++) {
            if (str.charAt(i) != str2.charAt(i)) {
                return str.substring(0, i);
            }
        }

        return str.substring(0, minLen);
    }
}