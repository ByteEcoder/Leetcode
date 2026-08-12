class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int num[]= new int[2*n];

        for(int i=0;i<n;i++)
        {
            num[i]=nums[i];
            num[i+n]=nums[i];
        }

        return num;
    }
}