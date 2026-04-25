class Solution {
    public int maxArea(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        int max=0;
        while(l<r){
            int len=Math.min(nums[l],nums[r]);
            int wid=r-l;
            max=Math.max(max,wid*len);
            if(nums[l]<nums[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }
}
