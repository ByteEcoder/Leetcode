class Solution {
    int n,m;
    public int closedIsland(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        boolean[][] visit=new boolean[n][m];

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
       
        int island=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(!visit[i][j] && grid[i][j]==0)
                {
                    island++;
                    dfs(grid,visit,i,j);
                }
            }
        }

        return island;
    }

    public void dfs(int[][] grid, boolean[][] visit,int i,int j)
    {   
        if(i<0||i>n-1||j<0||j>m-1||visit[i][j]==true||grid[i][j]==1)
            return;

        visit[i][j]=true;
        if(grid[i][j]==0)
       { dfs(grid,visit,i+1,j);
        dfs(grid,visit,i-1,j);
        dfs(grid,visit,i,j+1);
        dfs(grid,visit,i,j-1);}
    }
}