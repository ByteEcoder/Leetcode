class Solution {
    public int[] leftRightDifference(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int[] prefix=new int[nums.length];
        int[] suffix=new int[nums.length];

        while(i<nums.length-1&&j>0)
        {
            prefix[i+1]=prefix[i]+nums[i];

            suffix[j-1]=suffix[j]+nums[j];
            i++;
            j--;
        }

        for(int k=0;k<nums.length;k++)
        {
            nums[k]=Math.abs(prefix[k]-suffix[k]);
        }

        return nums;
    }
}