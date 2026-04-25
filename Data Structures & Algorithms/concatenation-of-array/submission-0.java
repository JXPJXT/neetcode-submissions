class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int n=nums.length;
        int n2=2*n;
        int ans[]=new int[n2];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
        }
}