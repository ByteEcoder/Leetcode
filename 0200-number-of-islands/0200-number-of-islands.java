class Solution {
    int m;
    int n;
    public int numIslands(char[][] grid) {
       m=grid.length;
       n=grid[0].length;

       boolean visit[][]=new boolean[m][n];
       int count=0;
       for(int i=0;i<m;i++)
       {
        for(int j=0;j<n;j++)
        {
            if(grid[i][j] == '1' && !visit[i][j])
            {
                dfs(i,j,grid,visit);
                count++;
            }
        }
       }
        return count;
    }

    void dfs(int row, int col,char[][] grid,boolean visit[][])
    {
        if(row<0||row>=m||col<0||col>=n||grid[row][col]!='1'||visit[row][col])
        {
            return;
        }

        visit[row][col]=true;

        dfs(row+1,col,grid,visit);
        dfs(row,col+1,grid,visit);
        dfs(row-1,col,grid,visit);
        dfs(row,col-1,grid,visit);

    }
}