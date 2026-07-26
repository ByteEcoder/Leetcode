class Solution {
    public int[][] updateMatrix(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        Queue<int[]> q = new LinkedList<>();

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    q.offer(new int[] { i, j });
                } else {
                    mat[i][j] = -1; 
                }
            }
        }

        while (!q.isEmpty()) {

            int[] curr = q.poll();
            int i = curr[0];
            int j = curr[1];

            // Down
            if (i + 1 < n && mat[i + 1][j] == -1) {
                mat[i + 1][j] = mat[i][j] + 1;
                q.offer(new int[] { i + 1, j });
            }

            // Up
            if (i - 1 >= 0 && mat[i - 1][j] == -1) {
                mat[i - 1][j] = mat[i][j] + 1;
                q.offer(new int[] { i - 1, j });
            }

            // Right
            if (j + 1 < m && mat[i][j + 1] == -1) {
                mat[i][j + 1] = mat[i][j] + 1;
                q.offer(new int[] { i, j + 1 });
            }

            // Left
            if (j - 1 >= 0 && mat[i][j - 1] == -1) {
                mat[i][j - 1] = mat[i][j] + 1;
                q.offer(new int[] { i, j - 1 });
            }
        }

        return mat;
    }
}