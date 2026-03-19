class Solution {
    int n, m;

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        n = obstacleGrid.length;
        m = obstacleGrid[0].length;
        int[][] dp=new int[n][m];
        for(int row[]:dp)
            {
                Arrays.fill(row,-1);
            }
        return help(dp,obstacleGrid, 0, 0);

    }

    public int help(int[][] dp,int[][] obstacleGrid, int i, int j) {

        if (i >= n || j >= m || obstacleGrid[i][j] == 1)
            return 0;
        if (i == n - 1 && j == m - 1)
            return 1;
        if(dp[i][j]!=-1)
            return dp[i][j];

        int s = help(dp,obstacleGrid, i + 1, j);
        int d = help(dp,obstacleGrid, i, j + 1);
        return dp[i][j]=s + d;

    }
}