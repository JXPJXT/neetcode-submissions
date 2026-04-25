class Solution {
    public void reverseString(char[] s) {
        int j=0;
        int k=s.length-1;
        while(j<k){
            char temp=s[k];
            s[k]=s[j];
            s[j]=temp;
            j++;
            k--;
        }
    }
}