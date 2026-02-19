class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int track=0;
        int l=0;
        int maxlen=0;
        int len=0;
        for(int i=0;i<nums.length;i++)
        {

            if(nums[i]==0)
                track++;
                
            while(track>k )
            {
                if(nums[l]==0)
                    track--;
                l++;
            }
            
            len=i-l+1;
            maxlen=Math.max(maxlen,len); 
        }
        return maxlen;
    }
}