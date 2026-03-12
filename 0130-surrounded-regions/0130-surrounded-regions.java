class Solution {
    int n,m;
    public void solve(char[][] board) {
        n=board.length;
        m=board[0].length;

        boolean visit[][]=new boolean[n][m];


        for(int i=0;i<n;i++)
        {
            dfs(visit,board,i,m-1);
            dfs(visit,board,i,0);
        }

        for(int j=0;j<m;j++)
        {
            dfs(visit,board,n-1,j);
            dfs(visit,board,0,j);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(board[i][j]=='O')
                    board[i][j]='X';
                else if(board[i][j]=='$')
                    board[i][j]='O';
            }
        }
    }
    public void dfs(boolean[][] visit,char[][] board,int i,int j)
    {
        if(i<0 || j<0 || i>=n || j>=m || visit[i][j] || board[i][j]=='X')
            return;

        if(board[i][j]=='O')
            {
                board[i][j]='$';
            }
        visit[i][j]=true;

        dfs(visit,board,i+1,j);
        dfs(visit,board,i,j+1);
        dfs(visit,board,i-1,j);
        dfs(visit,board,i,j-1);
    }
}