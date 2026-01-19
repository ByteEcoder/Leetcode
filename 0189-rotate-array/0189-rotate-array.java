class Solution {
    public void rotate(int[] nums, int k) {
       
        k = k % nums.length;

        int[] res=new int[nums.length];
        
        int key=0;
        for(int i=nums.length-k;i<nums.length;i++)
        {
            res[key]=nums[i];
            key++;
        }

        for(int j=0;j<nums.length-k;j++)
        {
            res[key]=nums[j];
            key++;
        }
        
        for(int l=0;l<nums.length;l++)
        {
            nums[l]=res[l];
        }

    }
}