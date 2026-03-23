class Solution {
    int n,m;
    public int maximalSquare(char[][] matrix) {
        n=matrix.length;
        m=matrix[0].length;

        int dp[][]=new int[n][m];
        for(int row[]:dp)
            {
                Arrays.fill(row,-1);
            }
        int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                max=Math.max(max,dfs(matrix,dp,i,j));
            }
        }
        return max*max;
    }
    public int dfs(char[][] matrix,int[][] dp,int i, int j)
    {
        if(i>n-1||i<0||j<0||j>m-1||matrix[i][j]=='0')
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        
        int r=dfs(matrix,dp,i,j+1);
        int dw=dfs(matrix,dp,i+1,j);
        int di=dfs(matrix,dp,i+1,j+1);
        
        dp[i][j]=1+Math.min(r,Math.min(dw,di));
        return dp[i][j];
    }
}