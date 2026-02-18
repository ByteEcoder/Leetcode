class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int n=nums.length, win=0, ans=n+1, left=0;

        for(int right=0; right<n; right++)
        {
            win+= nums[right];
            while(win>=target)
            {
                ans=Math.min(ans,right-left+1);
                win-=nums[left++];
            }
        }

        return ans==n+1?0:ans;
    }
}