class Solution {
    int m,n;
    public int longestIncreasingPath(int[][] matrix) {
        m=matrix.length;
        n=matrix[0].length;
        int[][] dp=new int[m][n];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        int max=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                
                max=Math.max(dfs(dp, matrix,i,j,-1), max);
            }
        }
        return max;
        
    }
    
    public int dfs(int[][] dp,int[][] matrix,int i,int j, int prev)
    {
        if(i<0||j<0||i>m-1||j>n-1||matrix[i][j]<=prev)
            return 0;
        
        if(dp[i][j]!=-1)
            return dp[i][j];
        
        prev=matrix[i][j];

            int max = 1;

            max = Math.max(max, 1 + dfs(dp, matrix, i - 1, j,prev));
            max = Math.max(max, 1 + dfs(dp, matrix, i + 1, j,prev));
            max = Math.max(max, 1 + dfs(dp, matrix, i, j - 1,prev));
            max = Math.max(max, 1 + dfs(dp, matrix, i, j + 1,prev));

            dp[i][j] = max;
            return max;
     }
}