class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[]s1=new char[26];
        char[]t2=new char[26];
        for(char c:s.toCharArray()){
            s1[c-'a']++;
        }
        for(char c:t.toCharArray()){
            t2[c-'a']++;
        }
        return Arrays.equals(s1,t2);
    }
}
