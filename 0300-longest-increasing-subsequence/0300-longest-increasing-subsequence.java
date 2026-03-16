class Solution {
    int n;
    public int lengthOfLIS(int[] nums) {
        n=nums.length;
        int[][] dp=new int[n][n];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        
       return check(nums, dp,0,-1);

    }
    public int check(int[] nums,int[][] dp, int i,int p)
    {
        if(i>=n)
            return 0;
        if(p>=0 && dp[i][p]!=-1)
            return dp[i][p];

        int pick=0;
        
        if(p==-1 || nums[p]<nums[i])
        {
            pick=1+check(nums,dp,i+1,i);
        }
        int np=check(nums,dp,i+1,p);
        int res=Math.max(pick,np);
        if(p!=-1)
        {
            dp[i][p]=Math.max(pick,np);
        }

        return res;
    }
}