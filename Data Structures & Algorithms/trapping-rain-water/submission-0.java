class Solution {
    public int trap(int[] nums) {
        int l=0;
        int sum=0;
        int r=nums.length-1;
        int maxl=0;
        int maxr=0;
        while(l<r){
            if(nums[l]<nums[r]){
                if(maxl<nums[l]){
                    maxl=nums[l];
                }
                else{
                    sum+=maxl-nums[l];
                }
                l++;
            }
            else{
                if(maxr<nums[r]){
                    maxr=nums[r];
                }
                else{
                    sum+=maxr-nums[r];
                }
                r--;
            }
        }
    return sum;
    }
}
