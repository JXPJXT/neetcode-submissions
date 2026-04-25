class Solution {
    public int maxArea(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int max=0;
        while(l<r){
            
            int high=Math.min(nums[r],nums[l]);
            int widh=r-l;
            if(widh*high>max){
                max=widh*high;
            }
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
