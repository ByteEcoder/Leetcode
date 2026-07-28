class Solution {
    int n,m;
    public boolean containsCycle(char[][] grid) {
        n=grid.length;
        m=grid[0].length;
        boolean visit[][]=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                if(!visit[i][j] && bfs(i,j,-1,-1,grid[i][j],visit,grid))
                {
                        return true;
                }
            }
        }
        return false;
    }

    public boolean bfs(int i, int j,int px,int py,char ch,boolean[][] visit,char[][] grid)
    {

        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{i,j,px,py});
        visit[i][j]=true;

        while(!q.isEmpty())
        {
            int node[]=q.poll();
            int r=node[0];
            int c=node[1];
            int p1=node[2];
            int p2=node[3];

            if(r-1>=0 && grid[r-1][c]==ch)
            {
                if(!visit[r-1][c])
                    {
                        q.add(new int[]{r-1,c,r,c});
                        visit[r-1][c]=true;
                    }

                else if(p1!=r-1 || p2!=c)
                    return true;
            }
            if(c-1>=0 && grid[r][c-1]==ch)
            {
                if(!visit[r][c-1])
                    {
                        q.add(new int[]{r,c-1,r,c});
                        visit[r][c-1]=true;
                    }

                else if(p1!=r || p2!=c-1)
                    return true;
            }
            if(r+1<n && grid[r+1][c]==ch)
            {
                if(!visit[r+1][c])
                    {
                        q.add(new int[]{r+1,c,r,c});
                        visit[r+1][c]=true;
                    }

                else if(p1!=r+1 || p2!=c)
                    return true;
            }
            if(c+1<m && grid[r][c+1]==ch)
            {
                if(!visit[r][c+1])
                    {
                        q.add(new int[]{r,c+1,r,c});
                        visit[r][c+1]=true;
                    }

                else if(p1!=r || p2!=c+1)
                    return true;
            }


          
        }
        return false;
    }
}