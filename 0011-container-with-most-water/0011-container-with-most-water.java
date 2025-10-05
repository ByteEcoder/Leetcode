class Solution {
    public int maxArea(int[] height) {
        
        int l=0;
        int lmax=0,rmax=0;
        int r=height.length-1;
        int ar=0;

        while (l<r)
        {
                ar = Math.max(ar,(Math.min(height[l],height[r])* (r-l)));
                if (height[l] < height[r]) {
                    l++;
                } else {
                    r--;
                }
        }
        return ar;
    }
}