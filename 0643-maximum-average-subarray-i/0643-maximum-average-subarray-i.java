class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg=0;
        double sum=0;

        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }

        avg=sum/k;

        for(int r=k;r<nums.length;r++)
        {
            sum+=nums[r]-nums[r-k];
            avg=Math.max(avg,sum/k);
        }

        return avg;

    }
}