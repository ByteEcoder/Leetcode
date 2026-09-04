class Solution {
    int n;
    public int firstStableIndex(int[] nums, int k) {
        n=nums.length;
        int instable=Integer.MAX_VALUE;
        int idx=-1;
        for(int a=0;a<n;a++)
        {
            int max= maxi(0,a,nums);
            int min= mini(a,n,nums);
            instable=max-min;
            idx=a;
            if(instable<=k)
                return idx;
            if(idx==n-1 && instable>k)
                return -1;
        }
        return idx;
    }

    public int maxi(int i, int j,int[] nums)
    {
        int f=nums[i];
        while(i<=j)
        {
           f=Math.max(nums[i],f);
           i++; 
        }
        return f;
    }
    public int mini(int i,int j, int[] nums)
    {
        int g=nums[i];
        while(i<j)
        {
            g=Math.min(g, nums[i]);
            i++;
        }
        return g;
    }
}