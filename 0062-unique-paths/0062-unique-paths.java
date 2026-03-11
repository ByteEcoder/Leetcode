class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for (int k = 0; k < m; k++) {
            Arrays.fill(dp[k], -1);
        }
        return helper(0, 0, m, n, dp);

    }

    public int helper(int i, int j, int m, int n, int[][] dp) {
        if (i == m - 1 && j == n - 1)
            return 1;
        if (dp[i][j] != -1)
            return dp[i][j];
        int d = 0, r = 0;
        if (i + 1 < m)
            d = helper(i + 1, j, m, n, dp);
        if (j + 1 < n)
            r = helper(i, j + 1, m, n, dp);

        return dp[i][j] = d + r;
    }
}