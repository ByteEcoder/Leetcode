class Solution {
    int n,m;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int same=image[sr][sc];
        n=image.length;
        m=image[0].length;
        boolean visit[][]=new boolean[n][m];
        for(int r=0;r<n;r++)
        {
            for(int c=0;c<m;c++)
            {
                dfs(same,sr,sc,color,image,visit);
            }
        }
        return image; 
    }

    public void dfs(int same,int i,int j,int color,int[][] image,boolean visit[][])
    {

        if(i<0||i>n-1||j<0||j>m-1||visit[i][j]==true||image[i][j]!=same)
            return;
        if(!visit[i][j])
        {
            visit[i][j]=true;
            image[i][j]=color;
        }
        dfs(same,i-1,j,color,image,visit);
        dfs(same,i+1,j,color,image,visit);
        dfs(same,i,j-1,color,image,visit);
        dfs(same,i,j+1,color,image,visit);
        
    }


}