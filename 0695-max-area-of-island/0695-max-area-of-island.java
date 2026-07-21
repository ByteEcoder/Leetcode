class Solution {
    int n,m;
    public int maxAreaOfIsland(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        boolean visit[][]=new boolean[n][m];
        int ar=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1 && !visit[i][j])
                    {
                        ar=Math.max(ar,area(grid,i,j,visit));
                    }
            }
        }
        return ar;
    }
    public int area(int[][] grid, int i, int j, boolean[][] visit)
    {
        if(i<0 || i>n-1 || j<0 || j>m-1 || grid[i][j]==0 || visit[i][j]==true)
            return 0;

        visit[i][j]=true;

        return 1+area(grid,i,j-1,visit)+area(grid,i,j+1,visit)+
        area(grid,i-1,j,visit)+area(grid,i+1,j,visit);
    }
}
