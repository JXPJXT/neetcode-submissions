class Solution {
    public boolean isAnagram(String s, String t) {
        int[] ar1=new int[26];
        int[] ar2=new int[26];
        for(char c1:s.toCharArray()){
            ar1[c1-'a']++;
        }
        for(char c2:t.toCharArray()){
            ar2[c2-'a']++;
        }
        return Arrays.equals(ar1,ar2);
    }
}
