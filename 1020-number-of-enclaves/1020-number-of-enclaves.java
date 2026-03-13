class Solution {
    int n,m;
    public int numEnclaves(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        boolean visit[][]=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            dfs(grid,visit,i,m-1);
            dfs(grid,visit,i,0);
        }
        for(int j=0;j<m;j++)
        {
            dfs(grid,visit,n-1,j);
            dfs(grid,visit,0,j);
        }
        int cells = 0;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(!visit[i][j] && grid[i][j]==1)
                {
                    cells++;
                }
            }
        }

        return cells;

    }
    public void dfs(int[][] grid,boolean[][] visit, int i, int j)
    {
        if(i<0||j<0||i>n-1||j>m-1||visit[i][j]==true||grid[i][j]==0)
         return;
        
        visit[i][j]=true;

        dfs(grid, visit,i+1,j);
        dfs(grid, visit,i-1,j);
        dfs(grid, visit,i,j+1);
        dfs(grid, visit,i,j-1);
    }
}