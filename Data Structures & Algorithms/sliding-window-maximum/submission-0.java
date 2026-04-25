class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
     int[] res=new int [nums.length-k+1];
     PriorityQueue<Integer>pq=new PriorityQueue<Integer>((a,b)->b-a);
     for(int i=0;i<k;i++){
        pq.add(nums[i]);
     }
     res[0]=pq.peek();
     int c=1;
     for(int i=k;i<nums.length;i++){
        pq.add(nums[i]);
        pq.remove(nums[i-k]);
        res[c]=pq.peek();
        c++;
     }
return res;
        
    }
}
