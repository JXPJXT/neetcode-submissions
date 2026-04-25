class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[]res=new int[nums.length];
        int suff=1;
        int pref=1;
        for(int i=0;i<nums.length;i++){
            res[i]=suff;
            suff*=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            res[i]*=pref;
            pref*=nums[i];
        }
        return res;
    }
}  
