class Solution {
    public int compareBitonicSums(int[] nums) {

        long dec = 0;
        long acc = 0;
        int n = nums.length;
        
        int i=1;
        while(i<n)
        {
            if(nums[i]>nums[i-1])
            {
                acc+=nums[i-1];
            }
            if(nums[i]<nums[i-1])
            {
                dec+=nums[i];
            }
            i++;
        }
        if(acc==dec)
            return -1;

        return acc>dec?0:1;
    }
}