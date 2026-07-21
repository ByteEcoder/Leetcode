class Solution {
    int n, m;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        n = heights.length;
        m = heights[0].length;
        List<List<Integer>> res = new ArrayList<>();
        String visit[][] = new String[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                visit[i][j] = "";
            }
        }

        for (int i = 0; i < n; i++) {
            dfs(heights, i, 0, visit, "P");
            dfs(heights, i, m - 1, visit, "A");
        }
        for (int j = 0; j < m; j++) {
            dfs(heights, 0, j, visit, "P");
            dfs(heights, n - 1, j, visit, "A");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visit[i][j].length() > 1)
                    res.add(Arrays.asList(i, j));
            }
        }
        return res;
    }

    public void dfs(int[][] heights, int i, int j, String[][] visit, String ocean) {

        if (i < 0 || j < 0 || i > n - 1 || j > m - 1)
            return;
        if (visit[i][j] != null && visit[i][j].contains(ocean))
            return;
        if (visit[i][j] != null && visit[i][j].length() > 1)
            return;
        visit[i][j] += ocean;

        if (j + 1 < m && heights[i][j] <= heights[i][j + 1])
            dfs(heights, i, j + 1, visit, ocean);
        if (i + 1 < n && heights[i][j] <= heights[i + 1][j])
            dfs(heights, i + 1, j, visit, ocean);
        if (j - 1 >= 0 && heights[i][j] <= heights[i][j - 1])
            dfs(heights, i, j - 1, visit, ocean);
        if (i - 1 >= 0 && heights[i][j] <= heights[i - 1][j])
            dfs(heights, i - 1, j, visit, ocean);

    }
}