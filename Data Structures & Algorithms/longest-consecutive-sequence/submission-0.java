class Solution {
    public int longestConsecutive(int[] nums) {
     HashSet<Integer>set=new HashSet<>();
     for(int n:nums){
        set.add(n);
     }   
     if(nums.length==0){
        return 0;
     }
     int longest=0;
     for(int num:set){
        if(!set.contains(num-1)){
            int currC=1;
            int currN=num;
            while(set.contains(currN+1)){
                currN+=1;
                currC+=1;
            }
            longest=Math.max(currC,longest);
        }
     }
     return longest;
    }
}
