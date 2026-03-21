class Solution {
    int m,n;
    public int minPathSum(int[][] grid) {
        m=grid.length;
        n=grid[0].length;
        int[][] dp=new int[m][n];
        for(int[] row:dp)
        {
            Arrays.fill(row,-1);
        }
        return dfs(dp,grid,0,0);
    }

    public int dfs(int[][] dp,int[][] grid,int i, int j)
    {
        if(i==m-1&&j==n-1)
            return grid[i][j];
        if(i<0||i>m-1||j<0||j>n-1)
            return Integer.MAX_VALUE;
        if(dp[i][j]!=-1)
            return dp[i][j];
        
        
        int d = dfs(dp, grid, i + 1, j);
        int r = dfs(dp, grid, i, j + 1);

        dp[i][j] = grid[i][j] + Math.min(d, r);

        return dp[i][j];
    }
}