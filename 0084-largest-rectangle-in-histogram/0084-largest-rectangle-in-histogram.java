class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<Integer> s=new Stack<>();
        int max=0;

        for(int i=0;i<=n;i++)
        {
            int curr=(i==n)?0:heights[i];
            while(!s.isEmpty()&&heights[s.peek()]>curr)
            {
                int h=heights[s.pop()];
                int w=s.isEmpty()?i:i-s.peek()-1;
                max=Math.max(max,h*w);

            }
            s.push(i);
        }
        return max;
    }
}