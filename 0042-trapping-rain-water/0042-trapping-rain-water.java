class Solution {
    public int trap(int[] height) {
        

        int[] lmax=new int[height.length];
        int[] rmax=new int[height.length];
        int res=0;
        lmax[0]=height[0];
        rmax[height.length-1]=height[height.length-1];
        int l=1,r=height.length-2;

        while(l<height.length && r>=0)
        {
            lmax[l]=Math.max(lmax[l-1],height[l]);
            rmax[r-1]=Math.max(rmax[r],height[r]);
        }

        for(int i=0;i<height.length;i++)
        {
            res+=Math.min(lmax[i],rmax[i])-height[i];
        }

        return res;
    }
}