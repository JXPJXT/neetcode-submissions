class Solution {
    public int climbStairs(int n) {
        Integer [] memo=new Integer[n+1];
        return dp(memo,n);
    }
    static int dp(Integer[] memo,int n){
        if(n<=1){
            return 1;
        }
        if(memo[n]!=null){
            return memo[n];
        }
        memo[n]=dp(memo,n-1)+dp(memo,n-2);
        return memo[n];
    }
}