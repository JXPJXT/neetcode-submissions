class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new  int [26];
        int left=0;
        int maxR=0;
        int maxW=0;
        for(int right=0;right<s.length();right++){
            char rightChar=s.charAt(right);
            count[rightChar-'A']++;
            maxR=Math.max(maxR,count[rightChar-'A']);
            while((right-left+1)-maxR>k){
                char leftChar=s.charAt(left);
                count[leftChar-'A']--;
                left++;
            }
            maxW=Math.max(maxW,right-left+1);

        }
        return maxW;
    }
}
