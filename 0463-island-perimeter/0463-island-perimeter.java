class Solution {
    int n, m;

    public int islandPerimeter(int[][] grid) {
        n = grid.length;
        m = grid[0].length;
        boolean[][] visit = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    return dfs(grid, visit, i, j);
                }
            }
        }
        return 0;
    }

    public int dfs(int[][] grid, boolean[][] visit, int i, int j) {
        if (i < 0 || i > n - 1 || j < 0 || j > m - 1 || grid[i][j] == 0)
            return 1;

        if (visit[i][j] == true)
            return 0;

        visit[i][j] = true;
        int peri = 0;
        return peri = dfs(grid, visit, i + 1, j) + dfs(grid, visit, i - 1, j) + dfs(grid, visit, i, j + 1)
                + dfs(grid, visit, i, j - 1);
    }
}
