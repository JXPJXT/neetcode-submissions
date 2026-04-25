class Solution {
    public int maxProfit(int[] nums) {
        int min=nums[0];
        int profit=0;
        for(int i=1;i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
            }
            else{
                profit=Math.max(profit,nums[i]-min);
            }
        }
        return profit;
    }
}
