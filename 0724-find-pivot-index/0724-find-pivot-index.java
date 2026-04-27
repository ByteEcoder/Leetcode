class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int rsum=0;
        int lsum=0;
        int sum=Arrays.stream(nums).sum();
        int i=0;
        while(i<n)
        {
            rsum=sum-lsum-nums[i];
            if(rsum==lsum)
            {
                return i;
            }
            lsum+=nums[i];

            i++;
        }

        return -1;
    }
}