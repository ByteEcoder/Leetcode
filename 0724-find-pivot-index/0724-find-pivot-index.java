class Solution {
    public int pivotIndex(int[] nums) {

        int sum=Arrays.stream(nums).sum();
        int lsum=0,rsum=0;
        for(int i=0;i<nums.length;i++)
        {
           rsum=sum-lsum-nums[i];

           if(rsum==lsum)
            return i;

            lsum+=nums[i];
        }

        return -1;

    }
}