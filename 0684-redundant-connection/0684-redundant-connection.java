class Solution {
    class DSU{
        int size[];
        int parent[];
        DSU(int n)
        {
            parent=new int[n];
            size=new int[n];

            for(int i=0;i<n;i++)
            {
                parent[i]=i;
            }
        }

        public int find(int x)
        {
            if(parent[x]!=x)
                parent[x]=find(parent[x]);
            return parent[x];
        }

        public void union(int a , int b)
        {
            int pa=find(a);
            int pb=find(b);
            if(pa==pb)
                return;
            parent[pb]=pa;

        }
    }
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        DSU obj=new DSU(n+1);
        
        for(int r[]: edges)
        {
            int u=r[0];
            int v=r[1];

            if(obj.find(u)==obj.find(v))
                return r;
            
            obj.union(u,v);
        }
        return new int[]{};
    }
}